package net.floderfloh.gemsoftheworld.util;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> GEM_BLOCKS = createTag("gem_blocks");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> GEM_GRINDSTONE_ITEMS = createTag("gem_grindstone_items");
        public static final TagKey<Item> GEMS = createTag("gems");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID, name));
        }
    }
}
