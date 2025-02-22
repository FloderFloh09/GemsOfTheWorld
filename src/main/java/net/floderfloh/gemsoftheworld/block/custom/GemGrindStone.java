package net.floderfloh.gemsoftheworld.block.custom;

import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
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
        // Holen wir uns den aktuellen Stack in der Hand
        ItemStack heldStack = player.getItemInHand(player.getUsedItemHand());

        // Prüfen ob der Stack nicht leer ist und das richtige Item enthält
        if (!heldStack.isEmpty() && heldStack.is(ModItems.RUBY.get())) {
            // Spielen wir den Sound ab
            world.playSound(player, pos, SoundEvents.ANVIL_STEP, SoundSource.BLOCKS, 1f, 1f);

            // Wenn der Stack mehrere Items enthält, wandeln wir nur eins um
            if (heldStack.getCount() > 1) {
                // Ein neuer Stack mit nur einem Item erstellen
                ItemStack newItemStack = new ItemStack(ModItems.RUBY_SHARD.get(), 1);

                // Das Item als Entity in der Welt platzieren
                ItemEntity itemEntity = new ItemEntity(world, pos.getX(), pos.getY() + 1, pos.getZ(), newItemStack);
                world.addFreshEntity(itemEntity);

                // Reduziere die Anzahl im Ursprungsstack um 1
                heldStack.shrink(1);
            }
            // Wenn der Stack nur ein Item enthält, wandeln wir es direkt um
            else {
                // Erstelle einen neuen Stack mit demselben Slot und reduziere die Größe auf 1
                player.setItemInHand(player.getUsedItemHand(),
                        new ItemStack(ModItems.RUBY_SHARD.get(), 1));
            }

            return InteractionResult.SUCCESS;
        }

        return InteractionResult.PASS;
    }
}
