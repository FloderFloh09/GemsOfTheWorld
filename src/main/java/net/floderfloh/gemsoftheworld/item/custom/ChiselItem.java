package net.floderfloh.gemsoftheworld.item.custom;

import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.Map;
import java.util.Random;

public class ChiselItem extends Item {
    private static final Map<Block, Block> CHISEL_MAP =
            Map.of(
                    ModBlocks.AMBER_STONE.get(), Blocks.STONE,
                    ModBlocks.DEEPSLATE_AMBER.get(), Blocks.DEEPSLATE,
                    Blocks.DIRT, ModBlocks.RUBY_BLOCK.get()
            );



    public ChiselItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Level level = pContext.getLevel();
        Block clickedBlock = level.getBlockState(pContext.getClickedPos()).getBlock();

        if(CHISEL_MAP.containsKey(clickedBlock)) {
            if(!level.isClientSide()) {
                level.setBlockAndUpdate(pContext.getClickedPos(), CHISEL_MAP.get(clickedBlock).defaultBlockState());

                // Zufällige Anzahl zwischen 1 und 3 für das Amber-Item
                Random random = new Random();
                int amberCount = random.nextInt(3) + 1;

                // Spawn des Amber-Items
                ItemEntity amberDrop = new ItemEntity(level,
                        pContext.getClickedPos().getX(),
                        pContext.getClickedPos().getY(),
                        pContext.getClickedPos().getZ(),
                        new ItemStack(ModItems.AMBER.get(), amberCount));

                level.addFreshEntity(amberDrop);

                pContext.getItemInHand().hurtAndBreak(1, ((ServerLevel) level), ((ServerPlayer) pContext.getPlayer()),
                        item -> pContext.getPlayer().onEquippedItemBroken(item, EquipmentSlot.MAINHAND));

                level.playSound(null, pContext.getClickedPos(), SoundEvents.BARREL_OPEN, SoundSource.BLOCKS);
            }
        }

        return InteractionResult.SUCCESS;
    }
}
