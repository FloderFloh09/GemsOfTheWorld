package net.floderfloh.gemsoftheworld.item.custom;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.BuddingAmethystBlock;

import java.util.Random;

public class GemGrowthItem extends Item {
    public GemGrowthItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = level.getBlockState(pos);
        Player player = context.getPlayer();
        ItemStack itemstack = context.getItemInHand();



        if (state.getBlock() instanceof AmethystClusterBlock || state.getBlock() instanceof BuddingAmethystBlock) {
            if (!level.isClientSide()) {
                ServerLevel serverLevel = (ServerLevel) level;
                Random random = new Random();

                if (random.nextInt(3) == 0) { // 1 in 3 Chance
                    if (growAmethyst(serverLevel, pos, state)) {
                        context.getItemInHand().shrink(1);
                        playEffects(serverLevel, pos);
                        CriteriaTriggers.USING_ITEM.trigger((ServerPlayer)player,itemstack);
                        return InteractionResult.SUCCESS;
                    }
                }
                // Spieler-Animations-Logik
                if (context.getPlayer() != null) {
                    context.getPlayer().swing(context.getHand());
                }

                playEffects(serverLevel, pos);
            }
            return InteractionResult.sidedSuccess(level.isClientSide());
        }

        return InteractionResult.PASS;
    }

    private boolean growAmethyst(ServerLevel level, BlockPos pos, BlockState state) {
        if (state.getBlock() instanceof AmethystClusterBlock) {
            Direction facing = state.getValue(AmethystClusterBlock.FACING);
            if (state.is(Blocks.SMALL_AMETHYST_BUD)) {
                return level.setBlock(pos, Blocks.MEDIUM_AMETHYST_BUD.defaultBlockState().setValue(AmethystClusterBlock.FACING, facing), 3);
            } else if (state.is(Blocks.MEDIUM_AMETHYST_BUD)) {
                return level.setBlock(pos, Blocks.LARGE_AMETHYST_BUD.defaultBlockState().setValue(AmethystClusterBlock.FACING, facing), 3);
            } else if (state.is(Blocks.LARGE_AMETHYST_BUD)) {
                return level.setBlock(pos, Blocks.AMETHYST_CLUSTER.defaultBlockState().setValue(AmethystClusterBlock.FACING, facing), 3);
            }
        } else if (state.getBlock() instanceof BuddingAmethystBlock) {
            return growSmallAmethystBud(level, pos);
        }
        return false;
    }

    private boolean growSmallAmethystBud(ServerLevel level, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            BlockPos offsetPos = pos.relative(direction);
            if (level.isEmptyBlock(offsetPos)) {
                level.setBlock(offsetPos, Blocks.SMALL_AMETHYST_BUD.defaultBlockState().setValue(AmethystClusterBlock.FACING, direction), 3);
                return true;
            }
        }
        return false;
    }

    private void playEffects(ServerLevel level, BlockPos pos) {
        level.playSound(null, pos, SoundEvents.BONE_MEAL_USE, SoundSource.BLOCKS, 1.0F, 1.0F);
        level.sendParticles(
                ParticleTypes.HAPPY_VILLAGER,
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5,
                15,  // Anzahl der Partikel
                0.2, // Horizontale Streuung
                0.2, // Vertikale Streuung
                0.2, // Tiefen-Streuung
                0.15 // Geschwindigkeit
        );
    }
}



