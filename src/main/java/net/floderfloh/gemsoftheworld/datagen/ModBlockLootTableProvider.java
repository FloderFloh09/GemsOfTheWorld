package net.floderfloh.gemsoftheworld.datagen;

import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.RUBY_BLOCK.get());
        dropSelf(ModBlocks.TANZANITE_BLOCK.get());
        dropSelf(ModBlocks.SAPPHIRE_BLOCK.get());
        dropSelf(ModBlocks.ALEXANDRITE_BLOCK.get());
        dropSelf(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
        dropSelf(ModBlocks.PINK_GARNET_BLOCK.get());
        dropSelf(ModBlocks.RAW_PINK_GARNET_BLOCK.get());
        dropSelf(ModBlocks.RED_GARNET_BLOCK.get());
        dropSelf(ModBlocks.RAW_RED_GARNET_BLOCK.get());
        dropSelf(ModBlocks.GREEN_GARNET_BLOCK.get());
        dropSelf(ModBlocks.RAW_GREEN_GARNET_BLOCK.get());
        dropSelf(ModBlocks.YELLOW_GARNET_BLOCK.get());
        dropSelf(ModBlocks.RAW_YELLOW_GARNET_BLOCK.get());
        dropSelf(ModBlocks.CITRINE_BLOCK.get());
        dropSelf(ModBlocks.RAW_CITRINE_BLOCK.get());
        dropSelf(ModBlocks.PARAIBA_TOURMALINE_BLOCK.get());
        dropSelf(ModBlocks.PINK_SPINEL_BLOCK.get());
        dropSelf(ModBlocks.BLACK_SPINEL_BLOCK.get());
        dropSelf(ModBlocks.BLUE_SPINEL_BLOCK.get());
        dropSelf(ModBlocks.CHISELED_SAPPHIRE.get());
        dropSelf(ModBlocks.AQUAMARINE_BLOCK.get());
        dropSelf(ModBlocks.BLUE_TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.BROWN_TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.YELLOW_TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.PINK_TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.ORANGE_TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.COLORLESS_TOPAZ_BLOCK.get());
        dropSelf(ModBlocks.GEM_GRINDSTONE.get());
        dropSelf(ModBlocks.AMBER_BLOCK.get());
        dropSelf(ModBlocks.AMBER_BRICKS.get());
        dropWhenSilkTouch(ModBlocks.AMBER_STONE.get());
        dropWhenSilkTouch(ModBlocks.DEEPSLATE_AMBER.get());

        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.BONDED_RUBY.get()));
        this.add(ModBlocks.RUBY_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_DEEPSLATE_ORE.get(), ModItems.BONDED_RUBY.get(), 1, 2));
        this.add(ModBlocks.ALEXANDRITE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ALEXANDRITE_ORE.get(), ModItems.BONDED_ALEXANDRITE.get(), 1, 3));
        this.add(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get(), ModItems.BONDED_ALEXANDRITE.get(), 1, 3));
        this.add(ModBlocks.PINK_GARNET_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PINK_GARNET_ORE.get(), ModItems.BONDED_PINK_GARNET.get(), 1, 3));
        this.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.PINK_GARNET_DEEPSLATE_ORE.get(), ModItems.BONDED_PINK_GARNET.get(), 1, 3));
        this.add(ModBlocks.RED_GARNET_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RED_GARNET_ORE.get(), ModItems.BONDED_RED_GARNET.get(), 1, 3));
        this.add(ModBlocks.RED_GARNET_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RED_GARNET_DEEPSLATE_ORE.get(), ModItems.BONDED_RED_GARNET.get(), 1, 3));
        this.add(ModBlocks.GREEN_GARNET_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.GREEN_GARNET_ORE.get(), ModItems.BONDED_GREEN_GARNET.get(), 1, 3));
        this.add(ModBlocks.GREEN_GARNET_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.GREEN_GARNET_DEEPSLATE_ORE.get(), ModItems.BONDED_GREEN_GARNET.get(), 1, 3));
        this.add(ModBlocks.YELLOW_GARNET_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.YELLOW_GARNET_ORE.get(), ModItems.BONDED_YELLOW_GARNET.get(), 1, 3));
        this.add(ModBlocks.YELLOW_GARNET_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.YELLOW_GARNET_DEEPSLATE_ORE.get(), ModItems.BONDED_YELLOW_GARNET.get(), 1, 3));
        this.add(ModBlocks.CITRINE_ORE.get(),
                block -> createOreDrop(ModBlocks.CITRINE_ORE.get(), ModItems.RAW_CITRINE.get()));
        this.add(ModBlocks.CITRINE_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.CITRINE_DEEPSLATE_ORE.get(), ModItems.RAW_CITRINE.get()));
        this.add(ModBlocks.SAPPHIRE_ORE.get(),
                block -> createOreDrop(ModBlocks.SAPPHIRE_ORE.get(), ModItems.BONDED_SAPPHIRE.get()));
        this.add(ModBlocks.SAPPHIRE_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.SAPPHIRE_DEEPSLATE_ORE.get(), ModItems.BONDED_SAPPHIRE.get()));
        this.add(ModBlocks.TANZANITE_ORE.get(),
                block -> createOreDrop(ModBlocks.TANZANITE_ORE.get(), ModItems.BONDED_TANZANITE.get()));
        this.add(ModBlocks.TANZANITE_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.TANZANITE_DEEPSLATE_ORE.get(), ModItems.BONDED_TANZANITE.get()));
        this.add(ModBlocks.PARAIBA_TOURMALINE_ORE.get(),
                block -> createOreDrop(ModBlocks.PARAIBA_TOURMALINE_ORE.get(), ModItems.BONDED_PARAIBA_TOURMALINE.get()));
        this.add(ModBlocks.PARAIBA_TOURMALINE_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.PARAIBA_TOURMALINE_DEEPSLATE_ORE.get(), ModItems.BONDED_PARAIBA_TOURMALINE.get()));
        this.add(ModBlocks.PINK_SPINEL_ORE.get(),
                block -> createOreDrop(ModBlocks.PINK_SPINEL_ORE.get(), ModItems.BONDED_PINK_SPINEL.get()));
        this.add(ModBlocks.PINK_SPINEL_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.PINK_SPINEL_DEEPSLATE_ORE.get(), ModItems.BONDED_PINK_SPINEL.get()));
        this.add(ModBlocks.BLUE_SPINEL_ORE.get(),
                block -> createOreDrop(ModBlocks.BLUE_SPINEL_ORE.get(), ModItems.BONDED_BLUE_SPINEL.get()));
        this.add(ModBlocks.BLUE_SPINEL_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.BLUE_SPINEL_DEEPSLATE_ORE.get(), ModItems.BONDED_BLUE_SPINEL.get()));
        this.add(ModBlocks.BLACK_SPINEL_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACK_SPINEL_ORE.get(), ModItems.BONDED_BLACK_SPINEL.get()));
        this.add(ModBlocks.BLACK_SPINEL_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.BLACK_SPINEL_DEEPSLATE_ORE.get(), ModItems.BONDED_BLACK_SPINEL.get()));
        this.add(ModBlocks.AQUAMARINE_ORE.get(),
                block -> createOreDrop(ModBlocks.AQUAMARINE_ORE.get(), ModItems.AQUAMARINE.get()));
        this.add(ModBlocks.BLUE_TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlocks.BLUE_TOPAZ_ORE.get(), ModItems.BONDED_BLUE_TOPAZ.get()));
        this.add(ModBlocks.BROWN_TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlocks.BROWN_TOPAZ_ORE.get(), ModItems.BONDED_BROWN_TOPAZ.get()));
        this.add(ModBlocks.YELLOW_TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlocks.YELLOW_TOPAZ_ORE.get(), ModItems.BONDED_YELLOW_TOPAZ.get()));
        this.add(ModBlocks.PINK_TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlocks.PINK_TOPAZ_ORE.get(), ModItems.BONDED_PINK_TOPAZ.get()));
        this.add(ModBlocks.ORANGE_TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlocks.ORANGE_TOPAZ_ORE.get(), ModItems.BONDED_ORANGE_TOPAZ.get()));
        this.add(ModBlocks.COLORLESS_TOPAZ_ORE.get(),
                block -> createOreDrop(ModBlocks.COLORLESS_TOPAZ_ORE.get(), ModItems.BONDED_COLORLESS_TOPAZ.get()));
        this.add(ModBlocks.BLUE_TOPAZ_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.BLUE_TOPAZ_DEEPSLATE_ORE.get(), ModItems.BONDED_BLUE_TOPAZ.get()));
        this.add(ModBlocks.BROWN_TOPAZ_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.BROWN_TOPAZ_DEEPSLATE_ORE.get(), ModItems.BONDED_BROWN_TOPAZ.get()));
        this.add(ModBlocks.YELLOW_TOPAZ_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.YELLOW_TOPAZ_DEEPSLATE_ORE.get(), ModItems.BONDED_YELLOW_TOPAZ.get()));
        this.add(ModBlocks.PINK_TOPAZ_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.PINK_TOPAZ_DEEPSLATE_ORE.get(), ModItems.BONDED_PINK_TOPAZ.get()));
        this.add(ModBlocks.ORANGE_TOPAZ_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.ORANGE_TOPAZ_DEEPSLATE_ORE.get(), ModItems.BONDED_ORANGE_TOPAZ.get()));
        this.add(ModBlocks.COLORLESS_TOPAZ_DEEPSLATE_ORE.get(),
                block -> createOreDrop(ModBlocks.COLORLESS_TOPAZ_DEEPSLATE_ORE.get(), ModItems.BONDED_COLORLESS_TOPAZ.get()));


        dropSelf(ModBlocks.AMBER_WALL.get());
        dropSelf(ModBlocks.AMBER_TRAPDOOR.get());
        dropSelf(ModBlocks.AMBER_STAIRS.get());
        this.add(ModBlocks.AMBER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMBER_SLAB.get()));
        dropSelf(ModBlocks.AMBER_BUTTON.get());
        dropSelf(ModBlocks.AMBER_FENCE_GATE.get());
        dropSelf(ModBlocks.AMBER_FENCE.get());
        dropSelf(ModBlocks.AMBER_PRESSURE_PLATE.get());
        this.add(ModBlocks.AMBER_DOOR.get(),
                block -> createDoorTable(ModBlocks.AMBER_DOOR.get()));
        dropSelf(ModBlocks.AMBER_BRICKS_BUTTON.get());
        this.add(ModBlocks.AMBER_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMBER_BRICKS_SLAB.get()));
        dropSelf(ModBlocks.AMBER_BRICKS_WALL.get());
        dropSelf(ModBlocks.AMBER_BRICKS_STAIRS.get());
        dropSelf(ModBlocks.AMBER_TILES_BUTTON.get());
        this.add(ModBlocks.AMBER_TILES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.AMBER_TILES_SLAB.get()));
        dropSelf(ModBlocks.AMBER_TILES_WALL.get());
        dropSelf(ModBlocks.AMBER_TILES_STAIRS.get());
        dropSelf(ModBlocks.AMBER_TILES.get());
    }

    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
