package net.floderfloh.gemsoftheworld.datagen;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, GemsOfTheWorld.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RUBY_DEEPSLATE_ORE.get())
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.GEM_GRINDSTONE.get())
                .add(ModBlocks.AMBER_BRICKS.get())
                .add(ModBlocks.AMBER_TILES.get())
                .add(ModBlocks.AMBER_BLOCK.get())
                .add(ModBlocks.ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.ALEXANDRITE_ORE.get())
                .add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PINK_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK.get())
                .add(ModBlocks.PINK_GARNET_ORE.get())
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE.get())
                .add(ModBlocks.RED_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_RED_GARNET_BLOCK.get())
                .add(ModBlocks.RED_GARNET_ORE.get())
                .add(ModBlocks.RED_GARNET_DEEPSLATE_ORE.get())
                .add(ModBlocks.GREEN_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_GREEN_GARNET_BLOCK.get())
                .add(ModBlocks.GREEN_GARNET_ORE.get())
                .add(ModBlocks.GREEN_GARNET_DEEPSLATE_ORE.get())
                .add(ModBlocks.YELLOW_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_YELLOW_GARNET_BLOCK.get())
                .add(ModBlocks.YELLOW_GARNET_ORE.get())
                .add(ModBlocks.YELLOW_GARNET_DEEPSLATE_ORE.get())
                .add(ModBlocks.CITRINE_BLOCK.get())
                .add(ModBlocks.RAW_CITRINE_BLOCK.get())
                .add(ModBlocks.CITRINE_ORE.get())
                .add(ModBlocks.CITRINE_DEEPSLATE_ORE.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_DEEPSLATE_ORE.get())
                .add(ModBlocks.TANZANITE_BLOCK.get())
                .add(ModBlocks.TANZANITE_ORE.get())
                .add(ModBlocks.TANZANITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PARAIBA_TOURMALINE_BLOCK.get())
                .add(ModBlocks.PARAIBA_TOURMALINE_ORE.get())
                .add(ModBlocks.PARAIBA_TOURMALINE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PINK_SPINEL_BLOCK.get())
                .add(ModBlocks.PINK_SPINEL_ORE.get())
                .add(ModBlocks.PINK_SPINEL_DEEPSLATE_ORE.get())
                .add(ModBlocks.BLUE_SPINEL_BLOCK.get())
                .add(ModBlocks.BLUE_SPINEL_ORE.get())
                .add(ModBlocks.BLUE_SPINEL_DEEPSLATE_ORE.get())
                .add(ModBlocks.BLACK_SPINEL_BLOCK.get())
                .add(ModBlocks.BLACK_SPINEL_ORE.get())
                .add(ModBlocks.BLACK_SPINEL_DEEPSLATE_ORE.get())
                .add(ModBlocks.AQUAMARINE_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_ORE.get());;



        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GEM_GRINDSTONE.get());

        tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.SAPPHIRE_BLOCK.get())
                .add(ModBlocks.RUBY_BLOCK.get())
                .add(ModBlocks.ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.RAW_ALEXANDRITE_BLOCK.get())
                .add(ModBlocks.PINK_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_PINK_GARNET_BLOCK.get())
                .add(ModBlocks.RED_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_RED_GARNET_BLOCK.get())
                .add(ModBlocks.GREEN_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_GREEN_GARNET_BLOCK.get())
                .add(ModBlocks.YELLOW_GARNET_BLOCK.get())
                .add(ModBlocks.RAW_YELLOW_GARNET_BLOCK.get())
                .add(ModBlocks.CITRINE_BLOCK.get())
                .add(ModBlocks.RAW_CITRINE_BLOCK.get())
                .add(ModBlocks.CITRINE_ORE.get())
                .add(ModBlocks.CITRINE_DEEPSLATE_ORE.get())
                .add(ModBlocks.TANZANITE_BLOCK.get())
                .add(ModBlocks.TANZANITE_ORE.get())
                .add(ModBlocks.TANZANITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PARAIBA_TOURMALINE_BLOCK.get())
                .add(ModBlocks.PINK_SPINEL_BLOCK.get())
                .add(ModBlocks.BLUE_SPINEL_BLOCK.get())
                .add(ModBlocks.BLACK_SPINEL_BLOCK.get())
                .add(ModBlocks.AQUAMARINE_BLOCK.get());





        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.RUBY_ORE.get())
                .add(ModBlocks.RUBY_DEEPSLATE_ORE.get())
                .add(ModBlocks.ALEXANDRITE_ORE.get())
                .add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PINK_GARNET_ORE.get())
                .add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE.get())
                .add(ModBlocks.RED_GARNET_ORE.get())
                .add(ModBlocks.RED_GARNET_DEEPSLATE_ORE.get())
                .add(ModBlocks.GREEN_GARNET_ORE.get())
                .add(ModBlocks.GREEN_GARNET_DEEPSLATE_ORE.get())
                .add(ModBlocks.YELLOW_GARNET_ORE.get())
                .add(ModBlocks.YELLOW_GARNET_DEEPSLATE_ORE.get())
                .add(ModBlocks.SAPPHIRE_ORE.get())
                .add(ModBlocks.SAPPHIRE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PARAIBA_TOURMALINE_ORE.get())
                .add(ModBlocks.PARAIBA_TOURMALINE_DEEPSLATE_ORE.get())
                .add(ModBlocks.PINK_SPINEL_ORE.get())
                .add(ModBlocks.PINK_SPINEL_DEEPSLATE_ORE.get())
                .add(ModBlocks.BLUE_SPINEL_ORE.get())
                .add(ModBlocks.BLUE_SPINEL_DEEPSLATE_ORE.get())
                .add(ModBlocks.BLACK_SPINEL_ORE.get())
                .add(ModBlocks.BLACK_SPINEL_DEEPSLATE_ORE.get())
                .add(ModBlocks.AQUAMARINE_ORE.get());

        tag(BlockTags.FENCES).add(ModBlocks.AMBER_FENCE.get());

        tag(BlockTags.FENCE_GATES).add(ModBlocks.AMBER_FENCE_GATE.get());

        tag(BlockTags.WALLS)
                .add(ModBlocks.AMBER_WALL.get())
                .add(ModBlocks.AMBER_TILES_WALL.get())
                .add(ModBlocks.AMBER_BRICKS_WALL.get());

    }
}
