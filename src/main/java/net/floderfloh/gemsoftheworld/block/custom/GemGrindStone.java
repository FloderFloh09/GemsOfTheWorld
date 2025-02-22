package net.floderfloh.gemsoftheworld.block.custom;

import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class GemGrindStone extends Block {
    public GemGrindStone(Properties properties) {
        super(properties);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hitResult) {
        ItemStack heldStack = player.getItemInHand(player.getUsedItemHand());

        // Definieren wir verschiedene Item-Kombinationen
        if (!heldStack.isEmpty()) {
            // Basis Items
            if (heldStack.is(ModItems.RUBY.get())) {
                processConversion(world, pos, player, heldStack, ModItems.RUBY_SHARD.get());
                return InteractionResult.SUCCESS;
            }

            // Honigwaben-ähnliche Items
            if (heldStack.is(ModItems.BONDED_SAPPHIRE.get())) {
                processConversion(world, pos, player, heldStack, ModItems.SAPPHIRE.get());
                return InteractionResult.SUCCESS;
            }


        }

        return InteractionResult.PASS;
    }

    private void processConversion(Level world, BlockPos pos, Player player, ItemStack inputStack, Item outputItem) {
        // Sound abspielen
        world.playSound(player, pos, SoundEvents.ANVIL_STEP, SoundSource.BLOCKS, 1f, 1f);

        // Bei größeren Stacks nur ein Item umwandeln
        if (inputStack.getCount() > 1) {
            ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(),
                    new ItemStack(outputItem, 1));
            world.addFreshEntity(itemEntity);
            inputStack.shrink(1);
        }
        // Bei einzelnen Items direkt umwandeln
        else {
            player.setItemInHand(player.getUsedItemHand(),
                    new ItemStack(outputItem, 1));
        }
    }
}
