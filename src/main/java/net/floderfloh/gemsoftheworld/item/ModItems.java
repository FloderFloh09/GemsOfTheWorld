package net.floderfloh.gemsoftheworld.item;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.item.custom.*;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, GemsOfTheWorld.MOD_ID);

    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_SAPPHIRE = ITEMS.register("bonded_sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINERALS = ITEMS.register("minerals",
            () -> new GemGrowthItem(new Item.Properties()));
    public static final RegistryObject<Item> JUCY_APPLE = ITEMS.register("jucy_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JUCY_APPLE)));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new CombinedAmberItem(new Item.Properties(), 1200));
    public static final RegistryObject<Item> WOOD_CHISEL = ITEMS.register("wood_chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));
    public static final RegistryObject<Item> STONE_CHISEL = ITEMS.register("stone_chisel",
            () -> new ChiselItem(new Item.Properties().durability(142)));
    public static final RegistryObject<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            () -> new ChiselItem(new Item.Properties().durability(420)));
    public static final RegistryObject<Item> DIAMOND_CHISEL = ITEMS.register("diamond_chisel",
            () -> new ChiselItem(new Item.Properties().durability(856)));
    public static final RegistryObject<Item> NETHERITE_CHISEL = ITEMS.register("netherite_chisel",
            () -> new ChiselItem(new Item.Properties().durability(1894)));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}