package net.floderfloh.gemsoftheworld.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.entity.custom.SlothEntity;
import net.floderfloh.gemsoftheworld.entity.custom.SnailEntity;
import net.minecraft.client.animation.definitions.CamelAnimation;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class SnailModel<T extends SnailEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID, "snail"), "main");
    private final ModelPart snailanimal;
    private final ModelPart head;


    public SnailModel(ModelPart root) {
        this.snailanimal = root.getChild("snailanimal");
        this.head = this.snailanimal.getChild("body").getChild("front").getChild("head");

    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition snailanimal = partdefinition.addOrReplaceChild("snailanimal", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

        PartDefinition body = snailanimal.addOrReplaceChild("body", CubeListBuilder.create().texOffs(56, 0).addBox(-10.0F, -5.3F, -3.0F, 21.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(56, 12).addBox(-9.0F, -6.3F, -2.0F, 23.0F, 6.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(56, 22).addBox(-9.0F, -4.31F, -2.0F, 23.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 64).addBox(-9.0F, -4.3F, -4.0F, 20.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(52, 64).addBox(-9.0F, -4.3F, -2.0F, 20.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition front = body.addOrReplaceChild("front", CubeListBuilder.create(), PartPose.offset(10.0F, -2.0F, 0.0F));

        PartDefinition cube_r1 = front.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(56, 74).addBox(-0.4633F, -3.4812F, -3.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2618F));

        PartDefinition head = front.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(7.0F, -1.0F, 0.0F));

        PartDefinition cube_r2 = head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(86, 90).addBox(-1.2456F, -2.8927F, -1.5F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -1.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition cube_r3 = head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(32, 96).addBox(-2.4575F, -2.2207F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition cube_r4 = head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(64, 97).addBox(-2.4575F, -1.2207F, -1.5F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.6109F));

        PartDefinition sensorL = head.addOrReplaceChild("sensorL", CubeListBuilder.create(), PartPose.offset(2.0F, -5.0F, 2.0F));

        PartDefinition cube_r5 = sensorL.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(76, 97).addBox(0.0F, -6.0F, -1.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, -0.3011F, 0.0522F, 0.1666F));

        PartDefinition sensorR = head.addOrReplaceChild("sensorR", CubeListBuilder.create(), PartPose.offset(2.0F, -5.0F, -2.0F));

        PartDefinition cube_r6 = sensorR.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(80, 97).addBox(0.0F, -6.0F, 0.0F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, 0.0F, 0.3011F, -0.0522F, 0.1666F));

        PartDefinition back = body.addOrReplaceChild("back", CubeListBuilder.create().texOffs(72, 61).addBox(-7.0F, -4.3F, -1.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(84, 74).addBox(-11.0F, -3.3F, -2.0F, 11.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(84, 83).addBox(-10.0F, -2.3F, -1.0F, 11.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(56, 90).addBox(-10.0F, -2.3F, -3.0F, 11.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.0F, -1.0F, 0.0F));

        PartDefinition tail = back.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(48, 97).addBox(-6.0F, -1.3F, -1.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(56, 86).addBox(-2.0F, -2.3F, -0.5F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F))
                .texOffs(56, 31).addBox(-5.0F, -0.3F, 0.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(70, 86).addBox(-5.0F, -0.3F, -2.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(90, 61).addBox(-9.0F, -0.3F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, 0.0F, 0.0F));

        PartDefinition house = snailanimal.addOrReplaceChild("house", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -5.0F, 0.0F, 0.0F, -1.5272F, 0.0F));

        PartDefinition cube_r7 = house.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(28, 74).addBox(2.0F, -13.0F, -2.0F, 2.0F, 10.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(0, 74).addBox(-10.0F, -13.0F, -2.0F, 2.0F, 10.0F, 12.0F, new CubeDeformation(0.0F))
                .texOffs(36, 34).addBox(-9.0F, -15.0F, -4.0F, 2.0F, 14.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(0, 34).addBox(1.0F, -15.0F, -4.0F, 2.0F, 14.0F, 16.0F, new CubeDeformation(0.0F))
                .texOffs(0, 0).addBox(-8.0F, -16.0F, -5.0F, 10.0F, 16.0F, 18.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1745F, -1.0F, -2.9962F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r8 = house.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(16, 96).addBox(-3.0F, -14.0F, 11.0F, 6.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, -3.0F, -19.9962F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r9 = house.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 96).addBox(-3.0F, -14.0F, 11.0F, 6.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, -1.0F, -1.9962F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r10 = house.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(72, 46).addBox(-4.0F, -2.0F, -1.0F, 8.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, 0.0F, -4.9962F, -0.0873F, 0.0F, 0.0F));

        PartDefinition cube_r11 = house.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(72, 31).addBox(-4.0F, -2.0F, -1.0F, 8.0F, 2.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.1745F, -16.0F, -2.9962F, -0.0873F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(SnailEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);



        this.animateWalk(SnailAnimations.SNAIL_WALK, limbSwing, limbSwingAmount, 2.0F, 2.5F);
        this.animate(entity.idleAnimationState, SnailAnimations.SNAIL_IDLE, ageInTicks, 1f);
        if (entity.isClimbing()) {
            this.snailanimal.xRot = 0;
            this.snailanimal.yRot = 0;
            this.snailanimal.zRot = (float) Math.toRadians(-90);
        }

    }
    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        snailanimal.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }
    @Override
    public ModelPart root() {
        return snailanimal;
    }
}
