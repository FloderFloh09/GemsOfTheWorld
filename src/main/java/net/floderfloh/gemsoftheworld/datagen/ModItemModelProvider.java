package net.floderfloh.gemsoftheworld.datagen;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, GemsOfTheWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RUBY.get());
        basicItem(ModItems.RUBY_SHARD.get());
        basicItem(ModItems.SAPPHIRE.get());
        basicItem(ModItems.BONDED_SAPPHIRE.get());
        basicItem(ModItems.MINERALS.get());
        basicItem(ModItems.WOOD_CHISEL.get());
        basicItem(ModItems.STONE_CHISEL.get());
        basicItem(ModItems.IRON_CHISEL.get());
        basicItem(ModItems.DIAMOND_CHISEL.get());
        basicItem(ModItems.NETHERITE_CHISEL.get());


        basicItem(ModItems.AMBER.get());
        basicItem(ModItems.JUCY_APPLE.get());
    }
}