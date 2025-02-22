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

    public static final RegistryObject<CreativeModeTab> GEMS_OF_THE_WORLD_TAB = CREATIVE_MODE_TABS.register("gems_of_the_world_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RUBY.get()))
                    .title(Component.translatable("creativetab.gemsoftheworld"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RUBY.get());
                        output.accept(ModItems.RUBY_SHARD.get());
                        output.accept(ModItems.SAPPHIRE.get());
                        output.accept(ModItems.BONDED_SAPPHIRE.get());
                        output.accept(ModItems.JUCY_APPLE.get());
                        output.accept(ModItems.AMBER.get());
                        output.accept(ModBlocks.RUBY_BLOCK.get());
                        output.accept(ModBlocks.RUBY_SHARD_BLOCK.get());
                        output.accept(ModBlocks.RUBY_ORE.get());
                        output.accept(ModBlocks.RUBY_DEEPSLATE_ORE.get());
                    }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
