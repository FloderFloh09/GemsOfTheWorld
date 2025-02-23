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
        dropSelf(ModBlocks.GEM_GRINDSTONE.get());
        dropSelf(ModBlocks.AMBER_BLOCK.get());
        dropSelf(ModBlocks.AMBER_BRICKS.get());
        dropWhenSilkTouch(ModBlocks.AMBER_STONE.get());
        dropWhenSilkTouch(ModBlocks.DEEPSLATE_AMBER.get());

        this.add(ModBlocks.RUBY_ORE.get(),
                block -> createOreDrop(ModBlocks.RUBY_ORE.get(), ModItems.RUBY_SHARD.get()));
        this.add(ModBlocks.RUBY_DEEPSLATE_ORE.get(),
                block -> createMultipleOreDrops(ModBlocks.RUBY_DEEPSLATE_ORE.get(), ModItems.RUBY_SHARD.get(), 4, 8));

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
