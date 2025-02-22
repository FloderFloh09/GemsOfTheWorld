package net.floderfloh.gemsoftheworld.item;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.item.custom.FuelItem;
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
    public static final RegistryObject<Item> JUCY_APPLE = ITEMS.register("jucy_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JUCY_APPLE)));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new FuelItem(new Item.Properties(), 1200));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}