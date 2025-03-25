package net.floderfloh.gemsoftheworld.event;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.entity.client.SlothModel;
import net.floderfloh.gemsoftheworld.entity.ModEntities;
import net.floderfloh.gemsoftheworld.entity.client.SnailModel;
import net.floderfloh.gemsoftheworld.entity.custom.SlothEntity;
import net.floderfloh.gemsoftheworld.entity.custom.SnailEntity;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = GemsOfTheWorld.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(SlothModel.LAYER_LOCATION, SlothModel::createBodyLayer);
        event.registerLayerDefinition(SnailModel.LAYER_LOCATION, SnailModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SLOTH.get(), SlothEntity.createAttributes().build());
        event.put(ModEntities.SNAIL.get(), SnailEntity.createAttributes().build());
    }
}
