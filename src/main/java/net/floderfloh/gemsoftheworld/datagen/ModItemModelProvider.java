package net.floderfloh.gemsoftheworld.datagen;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

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
        basicItem(ModItems.BONDED_ALEXANDRITE.get());
        basicItem(ModItems.BONDED_PINK_GARNET.get());
        basicItem(ModItems.BONDED_RED_GARNET.get());
        basicItem(ModItems.BONDED_GREEN_GARNET.get());
        basicItem(ModItems.BONDED_YELLOW_GARNET.get());
        basicItem(ModItems.BONDED_RUBY.get());
        basicItem(ModItems.MINERALS.get());
        basicItem(ModItems.ALEXANDRITE.get());
        basicItem(ModItems.RAW_ALEXANDRITE.get());
        basicItem(ModItems.RAW_PINK_GARNET.get());
        basicItem(ModItems.PINK_GARNET.get());
        basicItem(ModItems.RAW_RED_GARNET.get());
        basicItem(ModItems.RED_GARNET.get());
        basicItem(ModItems.RAW_YELLOW_GARNET.get());
        basicItem(ModItems.YELLOW_GARNET.get());
        basicItem(ModItems.RAW_GREEN_GARNET.get());
        basicItem(ModItems.GREEN_GARNET.get());
        basicItem(ModItems.RAW_CITRINE.get());
        basicItem(ModItems.CITRINE.get());
        basicItem(ModItems.BONDED_TANZANITE.get());
        basicItem(ModItems.TANZANITE.get());
        basicItem(ModItems.BONDED_DIAMOND.get());
        basicItem(ModItems.WOOD_CHISEL.get());
        basicItem(ModItems.STONE_CHISEL.get());
        basicItem(ModItems.IRON_CHISEL.get());
        basicItem(ModItems.DIAMOND_CHISEL.get());
        basicItem(ModItems.NETHERITE_CHISEL.get());


        basicItem(ModItems.AMBER.get());
        basicItem(ModItems.JUCY_APPLE.get());

        buttonItem(ModBlocks.AMBER_BUTTON, ModBlocks.AMBER_BLOCK);
        fenceItem(ModBlocks.AMBER_FENCE, ModBlocks.AMBER_BLOCK);
        wallItem(ModBlocks.AMBER_WALL, ModBlocks.AMBER_BLOCK);
        wallItem(ModBlocks.AMBER_BRICKS_WALL, ModBlocks.AMBER_BRICKS);
        buttonItem(ModBlocks.AMBER_BRICKS_BUTTON, ModBlocks.AMBER_BRICKS);
        wallItem(ModBlocks.AMBER_TILES_WALL, ModBlocks.AMBER_TILES);
        buttonItem(ModBlocks.AMBER_TILES_BUTTON, ModBlocks.AMBER_TILES);

        simpleBlockItem(ModBlocks.AMBER_DOOR);
    }
    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID,
                        "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID,"item/" + item.getId().getPath()));
    }
}