package net.floderfloh.gemsoftheworld.item.custom;

import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.advancements.AdvancementHolder;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class ChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.ofEntries(
                    Map.entry(ModBlocks.AMBER_STONE.get(), Blocks.STONE),
                    Map.entry(ModBlocks.DEEPSLATE_AMBER.get(), Blocks.DEEPSLATE),
                    Map.entry(Blocks.DIRT, ModBlocks.RUBY_BLOCK.get()),
                    Map.entry(Blocks.COPPER_BLOCK, Blocks.CHISELED_COPPER),
                    Map.entry(Blocks.BOOKSHELF, Blocks.CHISELED_BOOKSHELF),
                    Map.entry(Blocks.COBBLED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE),
                    Map.entry(Blocks.DEEPSLATE, Blocks.CHISELED_DEEPSLATE),
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
                    Map.entry(Blocks.WAXED_WEATHERED_COPPER, Blocks.WAXED_WEATHERED_CHISELED_COPPER)
            );




    public ChiselItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        BlockState clickedState = level.getBlockState(pContext.getClickedPos());
        Block clickedBlock = clickedState.getBlock();
        BlockPos blockpos = pContext.getClickedPos();
        Player player = pContext.getPlayer();
        ItemStack itemstack = pContext.getItemInHand();

        if (!level.isClientSide() && CHISEL_MAP.containsKey(clickedBlock)) {
            // Block ersetzen
            level.setBlockAndUpdate(blockpos, CHISEL_MAP.get(clickedBlock).defaultBlockState());

            // Item beschädigen
            pContext.getItemInHand().hurtAndBreak(1, (ServerLevel) level, (ServerPlayer) player,
                    item -> player.onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

            // Soundeffekt
            level.playSound(null, blockpos, SoundEvents.BARREL_OPEN, SoundSource.BLOCKS);

            // Kriterium trigger
            if (player instanceof ServerPlayer serverPlayer) {
                ResourceLocation advancementID = ResourceLocation.parse("gemsoftheworld:chiseling_amber");
                AdvancementHolder advancementHolder = serverPlayer.server.getAdvancements().get(advancementID);
                if (clickedBlock == ModBlocks.AMBER_STONE.get() || clickedBlock == ModBlocks.DEEPSLATE_AMBER.get()) {
                    Random random = new Random();
                    int amberCount = random.nextInt(3) + 1;
                    ItemEntity amberDrop = new ItemEntity(level,
                            blockpos.getX() + 0.5,
                            blockpos.getY() + 0.5,
                            blockpos.getZ() + 0.5,
                            new ItemStack(ModItems.AMBER.get(), amberCount));
                    level.addFreshEntity(amberDrop);
                    BlockHitResult hitResult = (BlockHitResult) player.pick(5.0D, 0.0F, false);
                    BlockPos pos = hitResult.getBlockPos();
                    BlockState state = level.getBlockState(pos);

                    serverPlayer.getAdvancements().award(advancementHolder, "chiseling_amber");
                    }
                }


            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
    @Override
    public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.gemsoftheworld.chisel"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.gemsoftheworld.chisel.shift_down"));
        }

        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }
}
