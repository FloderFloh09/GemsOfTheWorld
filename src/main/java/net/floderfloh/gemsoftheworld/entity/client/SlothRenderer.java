package net.floderfloh.gemsoftheworld.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.entity.custom.SlothEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class SlothRenderer extends MobRenderer<SlothEntity, SlothModel<SlothEntity>> {
public SlothRenderer(EntityRendererProvider.Context pContext) {
    super(pContext, new SlothModel<>(pContext.bakeLayer(SlothModel.LAYER_LOCATION)), 0.55f);
}

@Override
public ResourceLocation getTextureLocation(SlothEntity pEntity) {
    return ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID, "textures/entity/sloth/sloth_brown.png");
}

@Override
public void render(SlothEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack,
                   MultiBufferSource pBuffer, int pPackedLight) {
    if(pEntity.isBaby()) {
        pPoseStack.scale(0.5f, 0.5f, 0.5f);
    } else {
        pPoseStack.scale(1f, 1f, 1f);
    }

    super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
}
}
