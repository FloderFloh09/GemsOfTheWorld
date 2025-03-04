package net.floderfloh.gemsoftheworld.item.custom;

import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.game.ClientboundBlockDestructionPacket;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.BrushableBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BrushableBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.InteractionHand;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class ChislingItem extends DiggerItem {
    public static final int ANIMATION_DURATION = 10;
    private static final int USE_DURATION = 200;

    private static final Map<Block, Block> CHISEL_MAP = Map.ofEntries(
            Map.entry(ModBlocks.AMBER_STONE.get(), Blocks.STONE),
            Map.entry(ModBlocks.DEEPSLATE_AMBER.get(), Blocks.DEEPSLATE),
            Map.entry(Blocks.DIRT, ModBlocks.RUBY_BLOCK.get()),
            Map.entry(Blocks.COPPER_BLOCK, Blocks.CHISELED_COPPER),
            Map.entry(Blocks.BOOKSHELF, Blocks.CHISELED_BOOKSHELF),
            Map.entry(Blocks.COBBLED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE),
            Map.entry(Blocks.TUFF, Blocks.CHISELED_TUFF),
            Map.entry(Blocks.SANDSTONE, Blocks.CHISELED_SANDSTONE),
            Map.entry(Blocks.NETHER_BRICKS, Blocks.CHISELED_NETHER_BRICKS),
            Map.entry(Blocks.POLISHED_BLACKSTONE, Blocks.CHISELED_POLISHED_BLACKSTONE),
            Map.entry(Blocks.QUARTZ_BLOCK, Blocks.CHISELED_QUARTZ_BLOCK),
            Map.entry(Blocks.RED_SANDSTONE, Blocks.CHISELED_RED_SANDSTONE),
            Map.entry(Blocks.STONE_BRICKS, Blocks.CHISELED_STONE_BRICKS),
            Map.entry(Blocks.TUFF_BRICKS, Blocks.CHISELED_TUFF_BRICKS),
            Map.entry(Blocks.EXPOSED_COPPER, Blocks.EXPOSED_CHISELED_COPPER),
            Map.entry(Blocks.INFESTED_STONE_BRICKS, Blocks.INFESTED_CHISELED_STONE_BRICKS),
            Map.entry(Blocks.OXIDIZED_COPPER, Blocks.OXIDIZED_CHISELED_COPPER),
            Map.entry(Blocks.WAXED_COPPER_BLOCK, Blocks.WAXED_CHISELED_COPPER),
            Map.entry(Blocks.WAXED_EXPOSED_COPPER, Blocks.WAXED_EXPOSED_CHISELED_COPPER),
            Map.entry(Blocks.WAXED_OXIDIZED_COPPER, Blocks.WAXED_OXIDIZED_CHISELED_COPPER),
            Map.entry(Blocks.WEATHERED_COPPER, Blocks.WEATHERED_CHISELED_COPPER),
            Map.entry(Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_WEATHERED_CHISELED_COPPER),
            Map.entry(ModBlocks.SAPPHIRE_BLOCK.get(), ModBlocks.CHISELED_SAPPHIRE.get())
    );

    private static final List<Item> RANDOM_DROP_ITEMS = List.of(
            ModItems.RUBY_SHARD.get(),
            ModItems.BONDED_DIAMOND.get(),
            Items.IRON_INGOT,
            Items.GOLD_INGOT
    );

    public ChislingItem(Tier pTier, Properties pProperties) {
        super(pTier, BlockTags.MINEABLE_WITH_PICKAXE, pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        if (player != null && this.calculateHitResult(player).getType() == HitResult.Type.BLOCK) {
            player.startUsingItem(pContext.getHand());
        }
        return InteractionResult.CONSUME;
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.BRUSH;
    }

    @Override
    public int getUseDuration(ItemStack pStack, LivingEntity pEntity) {
        return USE_DURATION;
    }

    @Override
    public void onUseTick(Level pLevel, LivingEntity pLivingEntity, ItemStack pStack, int pRemainingUseDuration) {
        if (pRemainingUseDuration >= 0 && pLivingEntity instanceof Player player) {
            HitResult hitresult = this.calculateHitResult(player);
            EquipmentSlot equipmentslot = pStack.equals(player.getItemBySlot(EquipmentSlot.OFFHAND))
                    ? EquipmentSlot.OFFHAND
                    : EquipmentSlot.MAINHAND;

            if (hitresult instanceof BlockHitResult blockhitresult && hitresult.getType() == HitResult.Type.BLOCK) {
                BlockPos blockpos = blockhitresult.getBlockPos();
                BlockState blockstate = pLevel.getBlockState(blockpos);
                Block block = blockstate.getBlock();

                int usedTicks = this.getUseDuration(pStack, pLivingEntity) - pRemainingUseDuration;

                if (!CHISEL_MAP.containsKey(block) && block != Blocks.STONE && block != Blocks.DEEPSLATE) {
                    return;
                }

                // Blockbrech-Animation nur für Stein und Deepslate
                if (!pLevel.isClientSide() && (block == Blocks.STONE || block == Blocks.DEEPSLATE) && player instanceof ServerPlayer serverPlayer) {
                    updateBlockBreakAnimation(serverPlayer, blockpos, usedTicks);
                }

                // Soundeffekte während der Animation
                if (usedTicks < 40 && usedTicks % 10 == 0) {
                    SoundEvent soundEvent = block == Blocks.STONE ? SoundEvents.STONE_BREAK :
                            block == Blocks.DEEPSLATE ? SoundEvents.DEEPSLATE_BREAK :
                                    SoundEvents.GRINDSTONE_USE;

                    pLevel.playSound(player, blockpos, soundEvent, SoundSource.BLOCKS, 0.3F, 0.3F);
                }

                if (usedTicks >= 40) {
                    if (!pLevel.isClientSide()) {
                        if (block == Blocks.STONE || block == Blocks.DEEPSLATE) {
                            // Block zerstören und Partikel spawnen
                            pLevel.setBlock(blockpos, Blocks.AIR.defaultBlockState(), 3);
                            ((ServerLevel) pLevel).sendParticles(
                                    new BlockParticleOption(ParticleTypes.BLOCK, blockstate),
                                    blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5,
                                    20, 0.3, 0.3, 0.3, 0.05
                            );

                            // Zufälliges Item droppen
                            Random random = new Random();
                            if (random.nextFloat() < 0.95F) {
                                Item randomItem = RANDOM_DROP_ITEMS.get(random.nextInt(RANDOM_DROP_ITEMS.size()));
                                pLevel.addFreshEntity(new ItemEntity(pLevel,
                                        blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5,
                                        new ItemStack(randomItem)));
                            }

                            EquipmentSlot slot = pStack.equals(player.getItemBySlot(EquipmentSlot.OFFHAND))
                                    ? EquipmentSlot.OFFHAND
                                    : EquipmentSlot.MAINHAND;
                            pStack.hurtAndBreak(1, pLivingEntity, slot);

                            // Finaler Soundeffekt
                            SoundEvent breakSound = block == Blocks.STONE ? SoundEvents.STONE_BREAK : SoundEvents.DEEPSLATE_BREAK;
                            pLevel.playSound(player, blockpos, breakSound, SoundSource.BLOCKS, 1.0F, 1.0F);
                        }else if (CHISEL_MAP.containsKey(block)) {
                            // Block ersetzen durch den entsprechenden neuen Block
                            Block newBlock = CHISEL_MAP.get(block);
                            pLevel.setBlock(blockpos, newBlock.defaultBlockState(), 3);

                            // Falls Amber gemeißelt wurde, Amber droppen und Advancement vergeben
                            if (block == ModBlocks.AMBER_STONE.get() || block == ModBlocks.DEEPSLATE_AMBER.get()) {
                                dropAmber((ServerLevel) pLevel, blockpos);
                                awardChiselAdvancement((ServerPlayer) player);
                            }

                            EquipmentSlot slot = pStack.equals(player.getItemBySlot(EquipmentSlot.OFFHAND))
                                    ? EquipmentSlot.OFFHAND
                                    : EquipmentSlot.MAINHAND;
                            pStack.hurtAndBreak(1, pLivingEntity, slot);

                            // Finaler Sound für das Meißeln
                            pLevel.playSound(player, blockpos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
                        }
                    }
                    // Nutzung beenden, damit keine weiteren Sounds oder Animationen auftreten
                    pLivingEntity.releaseUsingItem();
                }
            }
        }
    }



    private void updateBlockBreakAnimation(ServerPlayer player, BlockPos pos, int usedTicks) {
        int stage = Math.min(9, (usedTicks * 10) / 40);
        player.connection.send(new ClientboundBlockDestructionPacket(player.getId(), pos, stage));
    }

    private HitResult calculateHitResult(Player pPlayer) {
        return ProjectileUtil.getHitResultOnViewVector(pPlayer,
                entity -> !entity.isSpectator() && entity.isPickable(),
                pPlayer.blockInteractionRange());
    }

    private void dropAmber(ServerLevel level, BlockPos blockpos) {
        Random random = new Random();
        int amberCount = random.nextInt(3) + 1;
        ItemEntity amberDrop = new ItemEntity(level,
                blockpos.getX() + 0.5, blockpos.getY() + 0.5, blockpos.getZ() + 0.5,
                new ItemStack(ModItems.AMBER.get(), amberCount));
        level.addFreshEntity(amberDrop);
    }

    private void awardChiselAdvancement(ServerPlayer player) {
        ResourceLocation advancementID = ResourceLocation.parse("gemsoftheworld:chiseling_amber");
        AdvancementHolder advancementHolder = player.server.getAdvancements().get(advancementID);
        player.getAdvancements().award(advancementHolder, "chiseling_amber");
    }
}




