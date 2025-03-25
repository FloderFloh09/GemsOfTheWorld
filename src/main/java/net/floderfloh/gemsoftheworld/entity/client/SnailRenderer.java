package net.floderfloh.gemsoftheworld.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.entity.custom.SlothEntity;
import net.floderfloh.gemsoftheworld.entity.custom.SnailEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SnailRenderer extends MobRenderer<SnailEntity, SnailModel<SnailEntity>> {
    public SnailRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SnailModel<>(pContext.bakeLayer(SnailModel.LAYER_LOCATION)), 0.55f);
    }

    @Override
    public ResourceLocation getTextureLocation(SnailEntity pEntity) {
        return ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID, "textures/entity/snail/snail_brown.png");
    }

    @Override
    public void render(SnailEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pPoseStack.scale(0.2f, 0.2f, 0.2f);
        } else {
            pPoseStack.scale(0.34f, 0.34f, 0.34f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }

}
