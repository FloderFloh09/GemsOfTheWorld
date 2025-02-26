package net.floderfloh.gemsoftheworld.datagen;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, GemsOfTheWorld.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.RUBY_BLOCK);
        blockWithItem(ModBlocks.SAPPHIRE_BLOCK);

        blockWithItem(ModBlocks.RUBY_ORE);
        blockWithItem(ModBlocks.RUBY_DEEPSLATE_ORE);
        blockWithItem(ModBlocks.AMBER_STONE);
        blockWithItem(ModBlocks.DEEPSLATE_AMBER);
        blockWithItem(ModBlocks.AMBER_BLOCK);
        blockWithItem(ModBlocks.AMBER_BRICKS);
        blockWithItem(ModBlocks.AMBER_TILES);


        stairsBlock(ModBlocks.AMBER_STAIRS.get(), blockTexture(ModBlocks.AMBER_BLOCK.get()));
        slabBlock(ModBlocks.AMBER_SLAB.get(), blockTexture(ModBlocks.AMBER_BLOCK.get()), blockTexture(ModBlocks.AMBER_BLOCK.get()));

        buttonBlock(ModBlocks.AMBER_BUTTON.get(), blockTexture(ModBlocks.AMBER_BLOCK.get()));
        pressurePlateBlock(ModBlocks.AMBER_PRESSURE_PLATE.get(), blockTexture(ModBlocks.AMBER_BLOCK.get()));

        fenceBlock(ModBlocks.AMBER_FENCE.get(), blockTexture(ModBlocks.AMBER_BLOCK.get()));
        fenceGateBlock(ModBlocks.AMBER_FENCE_GATE.get(), blockTexture(ModBlocks.AMBER_BLOCK.get()));
        wallBlock(ModBlocks.AMBER_WALL.get(), blockTexture(ModBlocks.AMBER_BLOCK.get()));

        doorBlockWithRenderType(ModBlocks.AMBER_DOOR.get(), modLoc("block/amber_door_bottom"), modLoc("block/amber_door_top"), "cutout");
        trapdoorBlockWithRenderType(ModBlocks.AMBER_TRAPDOOR.get(), modLoc("block/amber_trapdoor"), true, "cutout");

        stairsBlock(ModBlocks.AMBER_BRICKS_STAIRS.get(), blockTexture(ModBlocks.AMBER_BRICKS.get()));
        slabBlock(ModBlocks.AMBER_BRICKS_SLAB.get(), blockTexture(ModBlocks.AMBER_BRICKS.get()), blockTexture(ModBlocks.AMBER_BRICKS.get()));
        buttonBlock(ModBlocks.AMBER_BRICKS_BUTTON.get(), blockTexture(ModBlocks.AMBER_BRICKS.get()));
        wallBlock(ModBlocks.AMBER_BRICKS_WALL.get(), blockTexture(ModBlocks.AMBER_BRICKS.get()));

        stairsBlock(ModBlocks.AMBER_TILES_STAIRS.get(), blockTexture(ModBlocks.AMBER_TILES.get()));
        slabBlock(ModBlocks.AMBER_TILES_SLAB.get(), blockTexture(ModBlocks.AMBER_TILES.get()), blockTexture(ModBlocks.AMBER_TILES.get()));
        buttonBlock(ModBlocks.AMBER_TILES_BUTTON.get(), blockTexture(ModBlocks.AMBER_TILES.get()));
        wallBlock(ModBlocks.AMBER_TILES_WALL.get(), blockTexture(ModBlocks.AMBER_TILES.get()));


        blockItem(ModBlocks.AMBER_STAIRS);
        blockItem(ModBlocks.AMBER_SLAB);
        blockItem(ModBlocks.AMBER_PRESSURE_PLATE);
        blockItem(ModBlocks.AMBER_FENCE_GATE);
        blockItem(ModBlocks.AMBER_TRAPDOOR, "_bottom");
        blockItem(ModBlocks.AMBER_BRICKS_STAIRS);
        blockItem(ModBlocks.AMBER_BRICKS_SLAB);
        blockItem(ModBlocks.AMBER_TILES_STAIRS);
        blockItem(ModBlocks.AMBER_TILES_SLAB);

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void blockItem(RegistryObject<? extends Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("gemsoftheworld:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("gemsoftheworld:block/" +
                ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }
}
