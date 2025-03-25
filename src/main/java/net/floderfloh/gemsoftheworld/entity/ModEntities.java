package net.floderfloh.gemsoftheworld.entity;

import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.entity.custom.SlothEntity;
import net.floderfloh.gemsoftheworld.entity.custom.SnailEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GemsOfTheWorld.MOD_ID);

    public static final RegistryObject<EntityType<SlothEntity>> SLOTH =
            ENTITY_TYPES.register("sloth", () -> EntityType.Builder.of(SlothEntity::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("sloth"));
    public static final RegistryObject<EntityType<SnailEntity>> SNAIL =
            ENTITY_TYPES.register("snail", () -> EntityType.Builder.of(SnailEntity::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.4f).build("snail"));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
