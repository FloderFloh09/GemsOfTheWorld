package net.floderfloh.gemsoftheworld.block.custom;

import com.mojang.serialization.MapCodec;
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
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import javax.annotation.Nullable;
import java.util.Properties;

public class GemGrindStone extends HorizontalDirectionalBlock {
    public static final MapCodec<GemGrindStone> CODEC = simpleCodec(GemGrindStone::new);
    public static final VoxelShape SHAPE = Block.box(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);

    public GemGrindStone(Properties pProperties) {
        super(pProperties);
    }

    protected VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }



    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hitResult) {
        ItemStack heldStack = player.getItemInHand(player.getUsedItemHand());

        // Basis Items
        if (heldStack.is(ModItems.RUBY.get())) {
            processSingleOutputConversion(world, pos, player, heldStack, ModItems.RUBY_SHARD.get());
            return InteractionResult.SUCCESS;
        }

        // Item mit zwei Ausgaben
        if (heldStack.is(ModItems.BONDED_SAPPHIRE.get())) {
            processDualOutputConversion(world, pos, player, heldStack);
            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }

    private void processSingleOutputConversion(Level world, BlockPos pos, Player player,
                                               ItemStack inputStack, Item outputItem) {
        world.playSound(player, pos, SoundEvents.GRINDSTONE_USE, SoundSource.BLOCKS, 1f, 1f);

        if (inputStack.getCount() > 1) {
            ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(),
                    new ItemStack(outputItem, 1));
            world.addFreshEntity(itemEntity);
            inputStack.shrink(1);
        } else {
            player.setItemInHand(player.getUsedItemHand(),
                    new ItemStack(outputItem, 1));
        }
    }

    private void processDualOutputConversion(Level world, BlockPos pos, Player player, ItemStack inputStack) {
        world.playSound(player, pos, SoundEvents.ANVIL_STEP, SoundSource.BLOCKS, 1f, 1f);

        // Erstes Ausgabeitem
        ItemEntity firstItem = new ItemEntity(world, pos.getX() - 0.3, pos.getY() + 1, pos.getZ(),
                new ItemStack(ModItems.SAPPHIRE.get(), 1));

        // Zweites Ausgabeitem
        ItemEntity secondItem = new ItemEntity(world, pos.getX() + 0.3, pos.getY() + 1, pos.getZ(),
                new ItemStack(ModItems.MINERALS.get(), 1));

        world.addFreshEntity(firstItem);
        world.addFreshEntity(secondItem);

        // Reduziere den Eingabestack um 1
        inputStack.shrink(1);

    }



}