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
        List<ItemLike> SAPPHIRE_SMELTABLES = List.of(ModItems.BONDED_SAPPHIRE.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.RUBY_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ModItems.RUBY.get())
                .unlockedBy(getHasName(ModItems.RUBY.get()), has(ModItems.RUBY.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.RUBY.get(), 9)
                .requires(ModBlocks.RUBY_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.RUBY_BLOCK.get()), has(ModBlocks.RUBY_BLOCK.get()))
                .save(pRecipeOutput, GemsOfTheWorld.MOD_ID + ":ruby_from_ruby_block");

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
        oreSmelting(pRecipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.3f, 200,"sapphire");
        oreBlasting(pRecipeOutput, SAPPHIRE_SMELTABLES, RecipeCategory.MISC, ModItems.SAPPHIRE.get(), 0.3f, 100, "sapphire");




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