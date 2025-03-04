package net.floderfloh.gemsoftheworld.datagen;


import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.floderfloh.gemsoftheworld.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE.get(), ModBlocks.RUBY_DEEPSLATE_ORE.get());
        List<ItemLike> AMBER_SMELTABLES = List.of(ModBlocks.AMBER_STONE.get(), ModBlocks.DEEPSLATE_AMBER.get());
        List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModBlocks.SAPPHIRE_ORE.get(), ModBlocks.SAPPHIRE_DEEPSLATE_ORE.get());
        List<ItemLike> ALEX_SMELTABLES = List.of(ModItems.RAW_ALEXANDRITE.get(),ModBlocks.ALEXANDRITE_ORE.get(),
                ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());
        List<ItemLike> PG_SMELTABLES = List.of(ModItems.RAW_PINK_GARNET.get(),ModBlocks.PINK_GARNET_ORE.get(),
                ModBlocks.PINK_GARNET_DEEPSLATE_ORE.get());
        List<ItemLike> RG_SMELTABLES = List.of(ModItems.RAW_RED_GARNET.get(),ModBlocks.RED_GARNET_ORE.get(),
                ModBlocks.RED_GARNET_DEEPSLATE_ORE.get());
        List<ItemLike> GG_SMELTABLES = List.of(ModItems.RAW_GREEN_GARNET.get(),ModBlocks.GREEN_GARNET_ORE.get(),
                ModBlocks.GREEN_GARNET_DEEPSLATE_ORE.get());
        List<ItemLike> YG_SMELTABLES = List.of(ModItems.RAW_YELLOW_GARNET.get(),ModBlocks.YELLOW_GARNET_ORE.get(),
                ModBlocks.YELLOW_GARNET_DEEPSLATE_ORE.get());
        List<ItemLike> CITRINE_SMELTABLES = List.of(ModItems.RAW_CITRINE.get(),ModBlocks.CITRINE_ORE.get(),
                ModBlocks.CITRINE_DEEPSLATE_ORE.get());
        List<ItemLike> TANZANITE_SMELTABLES = List.of(ModBlocks.TANZANITE_ORE.get(),
                ModBlocks.TANZANITE_DEEPSLATE_ORE.get());
        List<ItemLike> PARAIBA_SMELTABLES = List.of(ModBlocks.PARAIBA_TOURMALINE_ORE.get(),
                ModBlocks.PARAIBA_TOURMALINE_DEEPSLATE_ORE.get());
        List<ItemLike> PS_SMELTABLES = List.of(ModBlocks.PINK_SPINEL_DEEPSLATE_ORE.get(),
                ModBlocks.PINK_SPINEL_ORE.get());
        List<ItemLike> BLACKS_SMELTABLES = List.of(ModBlocks.BLACK_SPINEL_DEEPSLATE_ORE.get(),
                ModBlocks.BLACK_SPINEL_ORE.get());
        List<ItemLike> BLUES_SMELTABLES = List.of(ModBlocks.BLUE_SPINEL_ORE.get(),
                ModBlocks.BLUE_SPINEL_DEEPSLATE_ORE.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.SAPPHIRE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.SAPPHIRE.get())
                .unlockedBy(getHasName(ModItems.SAPPHIRE.get()), has(ModItems.SAPPHIRE.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ALEXANDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.ALEXANDRITE.get())
                .unlockedBy(getHasName(ModItems.ALEXANDRITE.get()), has(ModItems.ALEXANDRITE.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_ALEXANDRITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_ALEXANDRITE.get())
                .unlockedBy(getHasName(ModItems.RAW_ALEXANDRITE.get()), has(ModItems.RAW_ALEXANDRITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PINK_GARNET.get())
                .unlockedBy(getHasName(ModItems.PINK_GARNET.get()), has(ModItems.PINK_GARNET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_PINK_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_PINK_GARNET.get())
                .unlockedBy(getHasName(ModItems.RAW_PINK_GARNET.get()), has(ModItems.RAW_PINK_GARNET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RED_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RED_GARNET.get())
                .unlockedBy(getHasName(ModItems.RED_GARNET.get()), has(ModItems.RED_GARNET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_RED_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_RED_GARNET.get())
                .unlockedBy(getHasName(ModItems.RAW_RED_GARNET.get()), has(ModItems.RAW_RED_GARNET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GREEN_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.GREEN_GARNET.get())
                .unlockedBy(getHasName(ModItems.GREEN_GARNET.get()), has(ModItems.GREEN_GARNET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_GREEN_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_GREEN_GARNET.get())
                .unlockedBy(getHasName(ModItems.RAW_GREEN_GARNET.get()), has(ModItems.RAW_GREEN_GARNET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.YELLOW_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.YELLOW_GARNET.get())
                .unlockedBy(getHasName(ModItems.YELLOW_GARNET.get()), has(ModItems.YELLOW_GARNET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_YELLOW_GARNET_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_YELLOW_GARNET.get())
                .unlockedBy(getHasName(ModItems.RAW_YELLOW_GARNET.get()), has(ModItems.RAW_YELLOW_GARNET.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CITRINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.CITRINE.get())
                .unlockedBy(getHasName(ModItems.CITRINE.get()), has(ModItems.CITRINE.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RAW_CITRINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RAW_CITRINE.get())
                .unlockedBy(getHasName(ModItems.RAW_CITRINE.get()), has(ModItems.RAW_CITRINE.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TANZANITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.TANZANITE.get())
                .unlockedBy(getHasName(ModItems.TANZANITE.get()), has(ModItems.TANZANITE.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PARAIBA_TOURMALINE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PARAIBA_TOURMALINE.get())
                .unlockedBy(getHasName(ModItems.PARAIBA_TOURMALINE.get()), has(ModItems.PARAIBA_TOURMALINE.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.PINK_SPINEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.PINK_SPINEL.get())
                .unlockedBy(getHasName(ModItems.PINK_SPINEL.get()), has(ModItems.PINK_SPINEL.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLUE_SPINEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BLUE_SPINEL.get())
                .unlockedBy(getHasName(ModItems.BLUE_SPINEL.get()), has(ModItems.BLUE_SPINEL.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_SPINEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.BLACK_SPINEL.get())
                .unlockedBy(getHasName(ModItems.BLACK_SPINEL.get()), has(ModItems.BLACK_SPINEL.get())).save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()), has(ModBlocks.RUBY_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":ruby_from_ruby_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 9)
                .requires(ModBlocks.SAPPHIRE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.SAPPHIRE_BLOCK.get()), has(ModBlocks.SAPPHIRE_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":sapphire_from_sapphire_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 9)
                .requires(ModBlocks.ALEXANDRITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ALEXANDRITE_BLOCK.get()), has(ModBlocks.ALEXANDRITE_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":alexandrite_from_alexandrite_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_ALEXANDRITE.get(), 9)
                .requires(ModBlocks.RAW_ALEXANDRITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_ALEXANDRITE_BLOCK.get()), has(ModBlocks.RAW_ALEXANDRITE_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":raw_alexandrite_from_raw_alexandrite_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PINK_GARNET.get(), 9)
                .requires(ModBlocks.PINK_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PINK_GARNET_BLOCK.get()), has(ModBlocks.PINK_GARNET_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":pink_garnet_from_pink_garnet_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_PINK_GARNET.get(), 9)
                .requires(ModBlocks.RAW_PINK_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_PINK_GARNET_BLOCK.get()), has(ModBlocks.RAW_PINK_GARNET_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":raw_pink_garnet_from_raw_pink_garnet_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RED_GARNET.get(), 9)
                .requires(ModBlocks.RED_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RED_GARNET_BLOCK.get()), has(ModBlocks.RED_GARNET_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":red_garnet_from_red_garnet_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_RED_GARNET.get(), 9)
                .requires(ModBlocks.RAW_RED_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_RED_GARNET_BLOCK.get()), has(ModBlocks.RAW_RED_GARNET_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":raw_red_garnet_from_raw_red_garnet_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.YELLOW_GARNET.get(), 9)
                .requires(ModBlocks.YELLOW_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.YELLOW_GARNET_BLOCK.get()), has(ModBlocks.YELLOW_GARNET_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":yellow_garnet_from_yellow_garnet_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_YELLOW_GARNET.get(), 9)
                .requires(ModBlocks.RAW_YELLOW_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_YELLOW_GARNET_BLOCK.get()), has(ModBlocks.RAW_YELLOW_GARNET_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":raw_yellow_garnet_from_raw_yellow_garnet_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GREEN_GARNET.get(), 9)
                .requires(ModBlocks.GREEN_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.GREEN_GARNET_BLOCK.get()), has(ModBlocks.GREEN_GARNET_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":green_garnet_from_green_garnet_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_GREEN_GARNET.get(), 9)
                .requires(ModBlocks.RAW_GREEN_GARNET_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_GREEN_GARNET_BLOCK.get()), has(ModBlocks.RAW_GREEN_GARNET_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":raw_green_garnet_from_raw_green_garnet_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CITRINE.get(), 9)
                .requires(ModBlocks.CITRINE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CITRINE_BLOCK.get()), has(ModBlocks.CITRINE_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":citrine_from_citrine_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RAW_CITRINE.get(), 9)
                .requires(ModBlocks.RAW_CITRINE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RAW_CITRINE_BLOCK.get()), has(ModBlocks.RAW_CITRINE_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":raw_citrine_from_raw_citrine_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TANZANITE.get(), 9)
                .requires(ModBlocks.TANZANITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TANZANITE_BLOCK.get()), has(ModBlocks.TANZANITE_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":tanzanite_from_tanzanite_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PARAIBA_TOURMALINE.get(), 9)
                .requires(ModBlocks.PARAIBA_TOURMALINE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PARAIBA_TOURMALINE_BLOCK.get()), has(ModBlocks.PARAIBA_TOURMALINE_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":paraiba_tourmaline_from_paraiba_tourmaline_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.PINK_SPINEL.get(), 9)
                .requires(ModBlocks.PINK_SPINEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.PINK_SPINEL_BLOCK.get()), has(ModBlocks.PINK_SPINEL_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":pink_spinel_from_pink_spinel_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLACK_SPINEL.get(), 9)
                .requires(ModBlocks.BLACK_SPINEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_SPINEL_BLOCK.get()), has(ModBlocks.BLACK_SPINEL_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + "black_spinel_from_black_spinel_block");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BLUE_SPINEL.get(), 9)
                .requires(ModBlocks.BLUE_SPINEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.BLUE_SPINEL_BLOCK.get()), has(ModBlocks.BLUE_SPINEL_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":blue_spinel_from_blue_spinel_block");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMBER.get(), 9)
                .requires(ModBlocks.AMBER_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.AMBER_BLOCK.get()), has(ModBlocks.AMBER_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":amber_from_amber_block");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMBER_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.AMBER.get())
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.AMBER.get())).save(pRecipeOutput);

        oreSmelting(pRecipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f, 200,"ruby");
        oreBlasting(pRecipeOutput, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY.get(), 0.25f, 100, "ruby");
        oreSmelting(pRecipeOutput, AMBER_SMELTABLES, RecipeCategory.MISC, ModItems.AMBER.get(), 0.6f, 80,"amber");
        oreBlasting(pRecipeOutput, AMBER_SMELTABLES, RecipeCategory.MISC, ModItems.AMBER.get(), 0.6f, 50, "amber");
        oreSmelting(pRecipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 200,"sapphire");
        oreBlasting(pRecipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.25f, 100, "sapphire");
        oreSmelting(pRecipeOutput, ALEX_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 200,"alex");
        oreBlasting(pRecipeOutput, ALEX_SMELTABLES, RecipeCategory.MISC, ModItems.ALEXANDRITE.get(), 0.25f, 100, "alex");
        oreSmelting(pRecipeOutput, PG_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET.get(), 0.25f, 200,"garnet");
        oreBlasting(pRecipeOutput, PG_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_GARNET.get(), 0.25f, 100, "garnet");
        oreSmelting(pRecipeOutput, GG_SMELTABLES, RecipeCategory.MISC, ModItems.GREEN_GARNET.get(), 0.25f, 200,"garnet");
        oreBlasting(pRecipeOutput, GG_SMELTABLES, RecipeCategory.MISC, ModItems.GREEN_GARNET.get(), 0.25f, 100, "garnet");
        oreSmelting(pRecipeOutput, RG_SMELTABLES, RecipeCategory.MISC, ModItems.RED_GARNET.get(), 0.25f, 200,"garnet");
        oreBlasting(pRecipeOutput, RG_SMELTABLES, RecipeCategory.MISC, ModItems.RED_GARNET.get(), 0.25f, 100, "garnet");
        oreSmelting(pRecipeOutput, YG_SMELTABLES, RecipeCategory.MISC, ModItems.YELLOW_GARNET.get(), 0.25f, 200,"garnet");
        oreBlasting(pRecipeOutput, YG_SMELTABLES, RecipeCategory.MISC, ModItems.YELLOW_GARNET.get(), 0.25f, 100, "garnet");
        oreSmelting(pRecipeOutput, CITRINE_SMELTABLES, RecipeCategory.MISC, ModItems.CITRINE.get(), 1.4f, 180,"citrine");
        oreBlasting(pRecipeOutput, CITRINE_SMELTABLES, RecipeCategory.MISC, ModItems.CITRINE.get(), 1.4f, 60, "citrine");
        oreSmelting(pRecipeOutput, TANZANITE_SMELTABLES, RecipeCategory.MISC, ModItems.TANZANITE.get(), 0.4f, 200,"tanzanite");
        oreBlasting(pRecipeOutput, TANZANITE_SMELTABLES, RecipeCategory.MISC, ModItems.TANZANITE.get(), 0.4f, 100, "tanzanite");
        oreSmelting(pRecipeOutput, PARAIBA_SMELTABLES, RecipeCategory.MISC, ModItems.PARAIBA_TOURMALINE.get(), 0.4f, 300,"paraiba");
        oreBlasting(pRecipeOutput, PARAIBA_SMELTABLES, RecipeCategory.MISC, ModItems.PARAIBA_TOURMALINE.get(), 0.4f, 200, "paraiba");
        oreSmelting(pRecipeOutput, PS_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_SPINEL.get(), 0.4f, 300,"spinel");
        oreBlasting(pRecipeOutput, PS_SMELTABLES, RecipeCategory.MISC, ModItems.PINK_SPINEL.get(), 0.4f, 200, "spinel");
        oreSmelting(pRecipeOutput, BLACKS_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_SPINEL.get(), 0.4f, 300,"spinel");
        oreBlasting(pRecipeOutput, BLACKS_SMELTABLES, RecipeCategory.MISC, ModItems.BLACK_SPINEL.get(), 0.4f, 200, "spinel");
        oreSmelting(pRecipeOutput, BLUES_SMELTABLES, RecipeCategory.MISC, ModItems.BLUE_SPINEL.get(), 0.4f, 300,"spinel");
        oreBlasting(pRecipeOutput, BLUES_SMELTABLES, RecipeCategory.MISC, ModItems.BLUE_SPINEL.get(), 0.4f, 200, "spinel");




        stairBuilder(ModBlocks.AMBER_STAIRS.get(), Ingredient.of(ModItems.AMBER.get())).group("amber")
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.AMBER.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_SLAB.get(), ModItems.AMBER.get());

        buttonBuilder(ModBlocks.AMBER_BUTTON.get(), Ingredient.of(ModItems.AMBER.get())).group("amber")
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.AMBER.get())).save(pRecipeOutput);
        pressurePlate(pRecipeOutput, ModBlocks.AMBER_PRESSURE_PLATE.get(), ModItems.AMBER.get());

        fenceBuilder(ModBlocks.AMBER_FENCE.get(), Ingredient.of(ModItems.AMBER.get())).group("amber")
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.AMBER.get())).save(pRecipeOutput);
        fenceGateBuilder(ModBlocks.AMBER_FENCE_GATE.get(), Ingredient.of(ModItems.AMBER.get())).group("amber")
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.AMBER.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_WALL.get(), ModItems.AMBER.get());

        doorBuilder(ModBlocks.AMBER_DOOR.get(), Ingredient.of(ModItems.AMBER.get())).group("amber")
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.AMBER.get())).save(pRecipeOutput);
        trapdoorBuilder(ModBlocks.AMBER_TRAPDOOR.get(), Ingredient.of(ModItems.AMBER.get())).group("amber")
                .unlockedBy(getHasName(ModItems.AMBER.get()), has(ModItems.AMBER.get())).save(pRecipeOutput);

        stairBuilder(ModBlocks.AMBER_BRICKS_STAIRS.get(), Ingredient.of(ModBlocks.AMBER_BRICKS.get())).group("amber_bricks")
                .unlockedBy(getHasName(ModBlocks.AMBER_BRICKS.get()), has(ModBlocks.AMBER_BRICKS.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_BRICKS_SLAB.get(), ModBlocks.AMBER_BRICKS.get());

        buttonBuilder(ModBlocks.AMBER_BRICKS_BUTTON.get(), Ingredient.of(ModBlocks.AMBER_BRICKS.get())).group("amber_bricks")
                .unlockedBy(getHasName(ModBlocks.AMBER_BRICKS.get()), has(ModBlocks.AMBER_BRICKS.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_BRICKS_WALL.get(), ModBlocks.AMBER_BRICKS.get());

        stairBuilder(ModBlocks.AMBER_TILES_STAIRS.get(), Ingredient.of(ModBlocks.AMBER_TILES.get())).group("amber_tiles")
                .unlockedBy(getHasName(ModBlocks.AMBER_TILES.get()), has(ModBlocks.AMBER_TILES.get())).save(pRecipeOutput);
        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_TILES_SLAB.get(), ModBlocks.AMBER_TILES.get());

        buttonBuilder(ModBlocks.AMBER_TILES_BUTTON.get(), Ingredient.of(ModBlocks.AMBER_TILES.get())).group("amber_tiles")
                .unlockedBy(getHasName(ModBlocks.AMBER_TILES.get()), has(ModBlocks.AMBER_TILES.get())).save(pRecipeOutput);
        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMBER_TILES_WALL.get(), ModBlocks.AMBER_TILES.get());
    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, GemsOfTheWorld.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}