package net.floderfloh.gemsoftheworld.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.floderfloh.gemsoftheworld.GemsOfTheWorld;
import net.floderfloh.gemsoftheworld.entity.custom.SlothEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class SlothModel<T extends SlothEntity> extends HierarchicalModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
     new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(GemsOfTheWorld.MOD_ID, "sloth"), "main");
    private final ModelPart body;
    private final ModelPart head;


    public SlothModel(ModelPart root) {
        this.body = root.getChild("body");
        this.head = this.body.getChild("neck").getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 1.0F));

        PartDefinition upper = body.addOrReplaceChild("upper", CubeListBuilder.create().texOffs(54, 29).addBox(-5.0F, -3.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 51).addBox(3.0F, -3.0F, -1.5F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(0, 34).addBox(-3.0F, -4.0F, -4.0F, 6.0F, 4.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(50, 35).addBox(-2.0F, -3.0F, 2.0F, 4.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -8.0F, 0.0F));

        PartDefinition cube_r1 = upper.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-1.0F, -6.0F, -7.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -7.0F, 3.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition lower = body.addOrReplaceChild("lower", CubeListBuilder.create().texOffs(48, 4).addBox(3.0F, -8.0F, -0.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(28, 7).addBox(-3.0F, -2.0F, -1.0F, 6.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(48, 22).addBox(-5.0F, -8.0F, -0.5F, 2.0F, 4.0F, 3.0F, new CubeDeformation(0.0F))
                .texOffs(26, 29).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
                .texOffs(42, 29).addBox(-2.0F, -8.0F, 3.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -1.0F));

        PartDefinition cube_r2 = lower.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -6.0F, -7.0F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, -9.0F, 4.0F, 1.5708F, 0.0F, 0.0F));

        PartDefinition legL = body.addOrReplaceChild("legL", CubeListBuilder.create(), PartPose.offset(2.0F, -2.0F, -1.0F));

        PartDefinition upperlL = legL.addOrReplaceChild("upperlL", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 0.0F));

        PartDefinition cube_r3 = upperlL.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(16, 36).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.4549F, -0.1586F, -0.3123F));

        PartDefinition lowerlL = upperlL.addOrReplaceChild("lowerlL", CubeListBuilder.create(), PartPose.offset(1.0F, 3.0F, -2.0F));

        PartDefinition cube_r4 = lowerlL.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 36).addBox(-0.5F, -4.5F, -2.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -1.3948F, -0.1289F, -0.0229F));

        PartDefinition lower2lL = lowerlL.addOrReplaceChild("lower2lL", CubeListBuilder.create(), PartPose.offset(1.0F, 1.0F, -7.0F));

        PartDefinition cube_r5 = lower2lL.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 47).addBox(-0.5F, -2.5F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, -1.0F, -1.526F, 0.0455F, -0.015F));

        PartDefinition footL = lower2lL.addOrReplaceChild("footL", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, -3.0F));

        PartDefinition cube_r6 = footL.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(10, 40).addBox(0.0F, -1.8F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, -0.0411F, 0.3027F, -0.1372F));

        PartDefinition cube_r7 = footL.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(58, 4).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.0F, 0.3054F, 0.0F));

        PartDefinition cube_r8 = footL.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(28, 21).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, -2.0F, 0.3351F, -0.4108F, -0.233F));

        PartDefinition cube_r9 = footL.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 54).addBox(-1.0F, -2.5F, -1.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.0F, 0.1745F, 0.0F));

        PartDefinition cube_r10 = footL.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 34).addBox(-2.0F, -0.3F, -1.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -2.0F, -0.0125F, -0.4979F, -0.0909F));

        PartDefinition cube_r11 = footL.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(36, 21).addBox(-2.0F, -0.7F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, -0.3989F, -0.2046F, 0.1079F));

        PartDefinition armL = body.addOrReplaceChild("armL", CubeListBuilder.create(), PartPose.offset(3.0F, -11.0F, -1.0F));

        PartDefinition upperaL = armL.addOrReplaceChild("upperaL", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r12 = upperaL.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(44, 13).addBox(-1.0F, -3.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.4549F, -0.1586F, -0.3123F));

        PartDefinition loweraL = upperaL.addOrReplaceChild("loweraL", CubeListBuilder.create(), PartPose.offset(1.0F, 3.0F, -2.0F));

        PartDefinition cube_r13 = loweraL.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(10, 45).addBox(-0.5F, -4.5F, -2.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -1.3948F, -0.1289F, -0.0229F));

        PartDefinition lower2aL = loweraL.addOrReplaceChild("lower2aL", CubeListBuilder.create(), PartPose.offset(1.0F, 1.0F, -6.0F));

        PartDefinition cube_r14 = lower2aL.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(56, 11).addBox(-0.5F, -2.5F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 1.0F, -2.0F, -1.526F, 0.0455F, -0.015F));

        PartDefinition handL = lower2aL.addOrReplaceChild("handL", CubeListBuilder.create(), PartPose.offset(-1.0F, 0.0F, -4.0F));

        PartDefinition cube_r15 = handL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(60, 40).addBox(0.0F, -1.8F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.0F, -2.0F, -0.0411F, 0.3027F, -0.1372F));

        PartDefinition cube_r16 = handL.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(58, 54).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.0F, 0.3054F, 0.0F));

        PartDefinition cube_r17 = handL.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(60, 49).addBox(-2.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 2.0F, -2.0F, 0.3351F, -0.4108F, -0.233F));

        PartDefinition cube_r18 = handL.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(10, 56).addBox(-1.0F, -2.5F, -1.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.0F, 0.1745F, 0.0F));

        PartDefinition cube_r19 = handL.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(60, 47).addBox(-2.0F, -0.3F, -1.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 0.0F, -2.0F, -0.0125F, -0.4979F, -0.0909F));

        PartDefinition cube_r20 = handL.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(60, 45).addBox(-2.0F, -0.7F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, -1.0F, -2.0F, -0.3989F, -0.2046F, 0.1079F));

        PartDefinition armR = body.addOrReplaceChild("armR", CubeListBuilder.create(), PartPose.offset(-3.0F, -11.0F, -1.0F));

        PartDefinition upperaR = armR.addOrReplaceChild("upperaR", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r21 = upperaR.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(38, 45).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.4549F, 0.1586F, 0.3123F));

        PartDefinition loweraR = upperaR.addOrReplaceChild("loweraR", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.0F, -3.0F));

        PartDefinition cube_r22 = loweraR.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(20, 47).addBox(-1.5F, -4.5F, -2.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -3.0F, -1.3948F, 0.1289F, 0.0229F));

        PartDefinition lower2aR = loweraR.addOrReplaceChild("lower2aR", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.0F, -5.0F));

        PartDefinition cube_r23 = lower2aR.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(58, 19).addBox(-1.5F, -2.5F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, -2.0F, -1.526F, -0.0455F, 0.015F));

        PartDefinition handR = lower2aR.addOrReplaceChild("handR", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, -4.0F));

        PartDefinition cube_r24 = handR.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(44, 60).addBox(-1.0F, -1.8F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, -0.0411F, -0.3027F, 0.1372F));

        PartDefinition cube_r25 = handR.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(58, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.0F, -0.3054F, 0.0F));

        PartDefinition cube_r26 = handR.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(62, 0).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, -2.0F, 0.3351F, 0.4108F, 0.233F));

        PartDefinition cube_r27 = handR.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(0, 57).addBox(-1.0F, -2.5F, -1.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.0F, -0.1745F, 0.0F));

        PartDefinition cube_r28 = handR.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(60, 51).addBox(-1.0F, -0.3F, -1.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -2.0F, -0.0125F, 0.4979F, 0.0909F));

        PartDefinition cube_r29 = handR.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(50, 60).addBox(-1.0F, -0.7F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.0F, -2.0F, -0.3989F, 0.2046F, -0.1079F));

        PartDefinition legR = body.addOrReplaceChild("legR", CubeListBuilder.create(), PartPose.offset(-3.0F, -2.0F, -1.0F));

        PartDefinition upperlR = legR.addOrReplaceChild("upperlR", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r30 = upperlR.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(38, 36).addBox(-2.0F, -3.0F, -2.0F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, -0.4549F, 0.1586F, 0.3123F));

        PartDefinition lowerlR = upperlR.addOrReplaceChild("lowerlR", CubeListBuilder.create(), PartPose.offset(-1.0F, 3.0F, -2.0F));

        PartDefinition cube_r31 = lowerlR.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(0, 40).addBox(-1.5F, -4.5F, -2.0F, 2.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -4.0F, -1.3948F, 0.1289F, 0.0229F));

        PartDefinition lower2lR = lowerlR.addOrReplaceChild("lower2lR", CubeListBuilder.create(), PartPose.offset(-1.0F, 1.0F, -7.0F));

        PartDefinition cube_r32 = lower2lR.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(30, 55).addBox(-1.5F, -2.5F, -2.0F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, -1.0F, -1.526F, -0.0455F, 0.015F));

        PartDefinition footR = lower2lR.addOrReplaceChild("footR", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, -3.0F));

        PartDefinition cube_r33 = footR.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(38, 60).addBox(-1.0F, -1.8F, -0.7F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 0.0F, -2.0F, -0.0411F, -0.3027F, 0.1372F));

        PartDefinition cube_r34 = footR.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 58).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 0.0F, -0.3054F, 0.0F));

        PartDefinition cube_r35 = footR.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(58, 27).addBox(-1.0F, -1.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 2.0F, -2.0F, 0.3351F, 0.4108F, 0.233F));

        PartDefinition cube_r36 = footR.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(48, 54).addBox(-1.0F, -2.5F, -1.7F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.0F, -0.1745F, 0.0F));

        PartDefinition cube_r37 = footR.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(48, 11).addBox(-1.0F, -0.3F, -1.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, 0.0F, -2.0F, -0.0125F, 0.4979F, 0.0909F));

        PartDefinition cube_r38 = footR.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(20, 45).addBox(-1.0F, -0.7F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -1.0F, -2.0F, -0.3989F, 0.2046F, -0.1079F));

        PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(0.0F, -13.0F, -2.0F));

        PartDefinition cube_r39 = neck.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(28, 13).addBox(-2.0F, -4.0F, 1.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.0F, -2.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -1.0F, -1.0F));

        PartDefinition cube_r40 = head.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(26, 23).addBox(-3.0F, -1.3F, -0.2F, 6.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -1.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r41 = head.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(50, 47).addBox(3.0F, -4.0F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(50, 40).addBox(-6.0F, -4.0F, 1.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
                .texOffs(0, 12).addBox(-5.0F, -5.0F, 0.0F, 8.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0F, 1.0F, -2.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r42 = head.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(28, 0).addBox(-3.0F, -3.4F, 0.0F, 6.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r43 = head.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(48, 0).addBox(-3.0F, -4.4F, 4.6F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r44 = head.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(58, 8).addBox(2.0F, -1.7F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 2.0F, -3.0F, 0.3054F, 0.0F, 0.0F));

        PartDefinition cube_r45 = head.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(58, 8).addBox(2.0F, -2.0F, 0.3F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0F, 1.0F, -3.0F, 0.3054F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(SlothEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch);

        this.animateWalk(SlothAnimations.SLOTH_WALKING_HANGING, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(entity.idleAnimationState, SlothAnimations.SLOTH_IDLE_ONGROUND, ageInTicks, 1f);

    }
    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int color) {
        body.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }
    @Override
    public ModelPart root() {
        return body;
    }

}
