package net.floderfloh.gemsoftheworld.item;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.item.custom.*;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

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
    public static final RegistryObject<Item> BONDED_RUBY = ITEMS.register("bonded_ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_ALEXANDRITE = ITEMS.register("bonded_alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_PINK_GARNET = ITEMS.register("bonded_pink_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_RED_GARNET = ITEMS.register("bonded_red_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_YELLOW_GARNET = ITEMS.register("bonded_yellow_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_GREEN_GARNET = ITEMS.register("bonded_green_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MINERALS = ITEMS.register("minerals",
            () -> new GemGrowthItem(new Item.Properties()){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()) {
                        pTooltipComponents.add(Component.translatable("tooltip.gemsoftheworld.minerals"));
                    } else {
                        pTooltipComponents.add(Component.translatable("tooltip.gemsoftheworld.minerals.shift_down"));
                    }

                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }
            });
    public static final RegistryObject<Item> JUCY_APPLE = ITEMS.register("jucy_apple",
            () -> new Item(new Item.Properties().food(ModFoodProperties.JUCY_APPLE)));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new CombinedAmberItem(new Item.Properties(), 1200){
                @Override
                public void appendHoverText(ItemStack pStack, TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
                    if(Screen.hasShiftDown()) {
                        pTooltipComponents.add(Component.translatable("tooltip.gemsoftheworld.amber"));
                    } else {
                        pTooltipComponents.add(Component.translatable("tooltip.gemsoftheworld.amber.shift_down"));
                    }

                    super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
                }});
    public static final RegistryObject<Item> ALEXANDRITE = ITEMS.register("alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ALEXANDRITE = ITEMS.register("raw_alexandrite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PINK_GARNET = ITEMS.register("pink_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_PINK_GARNET = ITEMS.register("raw_pink_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RED_GARNET = ITEMS.register("red_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_RED_GARNET = ITEMS.register("raw_red_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YELLOW_GARNET = ITEMS.register("yellow_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_YELLOW_GARNET = ITEMS.register("raw_yellow_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GREEN_GARNET = ITEMS.register("green_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GREEN_GARNET = ITEMS.register("raw_green_garnet",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TANZANITE = ITEMS.register("tanzanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_TANZANITE = ITEMS.register("bonded_tanzanite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PARAIBA_TOURMALINE = ITEMS.register("paraiba_tourmaline",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_PARAIBA_TOURMALINE = ITEMS.register("bonded_paraiba_tourmaline",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BONDED_DIAMOND = ITEMS.register("bonded_diamond",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOOD_CHISEL = ITEMS.register("wood_chisel",
            () -> new ChiselItem(Tiers.WOOD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.WOOD, 1, -2.5f))));
    public static final RegistryObject<Item> STONE_CHISEL = ITEMS.register("stone_chisel",
            () -> new ChiselItem(Tiers.STONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.STONE, 2, -2.5f))));
    public static final RegistryObject<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            () -> new ChiselItem(Tiers.IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 3, -2.5f))));
    public static final RegistryObject<Item> DIAMOND_CHISEL = ITEMS.register("diamond_chisel",
            () -> new ChiselItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 4, -2.5f))));
    public static final RegistryObject<Item> NETHERITE_CHISEL = ITEMS.register("netherite_chisel",
            () -> new ChiselItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 4, -2.5f))));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}