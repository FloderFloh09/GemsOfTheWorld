package net.floderfloh.gemsoftheworld.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
    public static final FoodProperties JUCY_APPLE = new FoodProperties.Builder().nutrition(3).saturationModifier(0.25f)
            .effect(new MobEffectInstance(MobEffects.GLOWING, 400), 1f).build();

}
