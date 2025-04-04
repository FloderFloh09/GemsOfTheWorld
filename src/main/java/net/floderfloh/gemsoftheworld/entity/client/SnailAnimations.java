package net.floderfloh.gemsoftheworld.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.AnimationDefinition;

public class SnailAnimations {
    public static final AnimationDefinition SNAIL_IDLE = AnimationDefinition.Builder.withLength(1.58333f).looping()
            .addAnimation("front",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.83333f, KeyframeAnimations.degreeVec(0f, 0f, 3.8f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.58333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.83333f, KeyframeAnimations.degreeVec(0f, 0f, -7.5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.58333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("sensorL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.83333f, KeyframeAnimations.degreeVec(2.61f, -9.66f, -15.22f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.58333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("sensorR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(0.83333f, KeyframeAnimations.degreeVec(7.39f, -1.3f, 9.92f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.58333f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition SNAIL_WALK = AnimationDefinition.Builder.withLength(3.04167f).looping()
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.scaleVec(0.9f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("house",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(1f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.posVec(2f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("front",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(-0.5f, -0.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.posVec(0.5f, -0.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("front",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.degreeVec(0f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.posVec(0.98f, 0.17f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.degreeVec(0f, 0f, 17.5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("sensorL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.degreeVec(-5f, 0f, 12.5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("sensorR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(0f, 0f, 5f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.degreeVec(5f, 0f, 10f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("back",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("back",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.scaleVec(0.9f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.875f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.04167f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
}
