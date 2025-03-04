package net.floderfloh.gemsoftheworld.item;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GemsOfTheWorld.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GEMS_OF_THE_WORLD_ITEMS = CREATIVE_MODE_TABS.register("gems_of_the_world_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetabi.gemsoftheworld"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.AMBER.get());
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.PINK_GARNET.get());
                        output.accept(ModItems.RED_GARNET.get());
                        output.accept(ModItems.GREEN_GARNET.get());
                        output.accept(ModItems.YELLOW_GARNET.get());
                        output.accept(ModItems.CITRINE.get());
                        output.accept(ModItems.TANZANITE.get());
                        output.accept(ModItems.PARAIBA_TOURMALINE.get());
                        output.accept(ModItems.PINK_SPINEL.get());
                        output.accept(ModItems.BLUE_SPINEL.get());
                        output.accept(ModItems.BLACK_SPINEL.get());
                        output.accept(ModItems.AQUAMARINE.get());

                        output.accept(ModItems.RAW_ALEXANDRITE.get());
                        output.accept(ModItems.RAW_PINK_GARNET.get());
                        output.accept(ModItems.RAW_RED_GARNET.get());
                        output.accept(ModItems.RAW_GREEN_GARNET.get());
                        output.accept(ModItems.RAW_YELLOW_GARNET.get());
                        output.accept(ModItems.RAW_CITRINE.get());

                        output.accept(ModItems.BONDED_RUBY.get());
                        output.accept(ModItems.BONDED_SAPPHIRE.get());
                        output.accept(ModItems.BONDED_ALEXANDRITE.get());
                        output.accept(ModItems.BONDED_PINK_GARNET.get());
                        output.accept(ModItems.BONDED_RED_GARNET.get());
                        output.accept(ModItems.BONDED_GREEN_GARNET.get());
                        output.accept(ModItems.BONDED_YELLOW_GARNET.get());
                        output.accept(ModItems.BONDED_TANZANITE.get());
                        output.accept(ModItems.BONDED_PARAIBA_TOURMALINE.get());
                        output.accept(ModItems.BONDED_PINK_SPINEL.get());
                        output.accept(ModItems.BONDED_BLUE_SPINEL.get());
                        output.accept(ModItems.BONDED_BLACK_SPINEL.get());


                        output.accept(ModItems.MINERALS.get());
                        output.accept(ModItems.BONDED_DIAMOND.get());
                        output.accept(ModItems.RUBY_SHARD.get());

                    }).build());
    public static final RegistryObject<CreativeModeTab> GEMS_OF_THE_WORLD_BLOCKS = CREATIVE_MODE_TABS.register("gems_of_the_world_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.RUBY_BLOCK.get()))
                    .title(Component.translatable("creativetabb.gemsoftheworld"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        output.accept(ModBlocks.CHISELED_SAPPHIRE.get());
                        output.accept(ModBlocks.TANZANITE_BLOCK.get());
                        output.accept(ModBlocks.AMBER_BLOCK.get());
                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.PINK_GARNET_BLOCK.get());
                        output.accept(ModBlocks.RED_GARNET_BLOCK.get());
                        output.accept(ModBlocks.GREEN_GARNET_BLOCK.get());
                        output.accept(ModBlocks.YELLOW_GARNET_BLOCK.get());
                        output.accept(ModBlocks.RAW_PINK_GARNET_BLOCK.get());
                        output.accept(ModBlocks.RAW_RED_GARNET_BLOCK.get());
                        output.accept(ModBlocks.RAW_GREEN_GARNET_BLOCK.get());
                        output.accept(ModBlocks.RAW_YELLOW_GARNET_BLOCK.get());
                        output.accept(ModBlocks.CITRINE_BLOCK.get());
                        output.accept(ModBlocks.RAW_CITRINE_BLOCK.get());
                        output.accept(ModBlocks.PARAIBA_TOURMALINE_BLOCK.get());
                        output.accept(ModBlocks.PINK_SPINEL_BLOCK.get());
                        output.accept(ModBlocks.BLUE_SPINEL_BLOCK.get());
                        output.accept(ModBlocks.BLACK_SPINEL_BLOCK.get());
                        output.accept(ModBlocks.AQUAMARINE_BLOCK.get());

                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.RUBY_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.AMBER_STONE.get());
                        output.accept(ModBlocks.DEEPSLATE_AMBER.get());
                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.ALEXANDRITE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.PINK_GARNET_ORE.get());
                        output.accept(ModBlocks.PINK_GARNET_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.RED_GARNET_ORE.get());
                        output.accept(ModBlocks.RED_GARNET_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.GREEN_GARNET_ORE.get());
                        output.accept(ModBlocks.GREEN_GARNET_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.YELLOW_GARNET_ORE.get());
                        output.accept(ModBlocks.YELLOW_GARNET_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.CITRINE_ORE.get());
                        output.accept(ModBlocks.CITRINE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.SAPPHIRE_ORE.get());
                        output.accept(ModBlocks.SAPPHIRE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.TANZANITE_ORE.get());
                        output.accept(ModBlocks.TANZANITE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.PARAIBA_TOURMALINE_ORE.get());
                        output.accept(ModBlocks.PARAIBA_TOURMALINE_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.PINK_SPINEL_ORE.get());
                        output.accept(ModBlocks.PINK_SPINEL_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.BLUE_SPINEL_ORE.get());
                        output.accept(ModBlocks.BLUE_SPINEL_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.BLACK_SPINEL_ORE.get());
                        output.accept(ModBlocks.BLACK_SPINEL_DEEPSLATE_ORE.get());
                        output.accept(ModBlocks.AQUAMARINE_ORE.get());


                        output.accept(ModBlocks.AMBER_DOOR.get());
                        output.accept(ModBlocks.AMBER_BUTTON.get());
                        output.accept(ModBlocks.AMBER_FENCE.get());
                        output.accept(ModBlocks.AMBER_FENCE_GATE.get());
                        output.accept(ModBlocks.AMBER_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.AMBER_STAIRS.get());
                        output.accept(ModBlocks.AMBER_SLAB.get());
                        output.accept(ModBlocks.AMBER_TRAPDOOR.get());
                        output.accept(ModBlocks.AMBER_WALL.get());
                        output.accept(ModBlocks.AMBER_BRICKS.get());
                        output.accept(ModBlocks.AMBER_BRICKS_STAIRS.get());
                        output.accept(ModBlocks.AMBER_BRICKS_SLAB.get());
                        output.accept(ModBlocks.AMBER_BRICKS_WALL.get());
                        output.accept(ModBlocks.AMBER_BRICKS_BUTTON.get());
                        output.accept(ModBlocks.AMBER_TILES.get());
                        output.accept(ModBlocks.AMBER_TILES_BUTTON.get());
                        output.accept(ModBlocks.AMBER_TILES_WALL.get());
                        output.accept(ModBlocks.AMBER_TILES_SLAB.get());
                        output.accept(ModBlocks.AMBER_TILES_STAIRS.get());





                    }).build());
    public static final RegistryObject<CreativeModeTab> GEMS_OF_THE_WORLD_OTHER = CREATIVE_MODE_TABS.register("gems_of_the_world_other",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.JUCY_APPLE.get()))
                    .title(Component.translatable("creativetabo.gemsoftheworld"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.JUCY_APPLE.get());

                        output.accept(ModItems.WOOD_CHISEL.get());
                        output.accept(ModItems.STONE_CHISEL.get());
                        output.accept(ModItems.IRON_CHISEL.get());
                        output.accept(ModItems.DIAMOND_CHISEL.get());
                        output.accept(ModItems.NETHERITE_CHISEL.get());
                    }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
