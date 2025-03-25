package net.floderfloh.gemsoftheworld.entity.client;

import net.minecraft.client.animation.AnimationChannel;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.KeyframeAnimations;

public class SlothAnimations {


    public static final AnimationDefinition SLOTH_IDLE_HANGING = AnimationDefinition.Builder.withLength(2.45833f).looping()
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -10f, -4f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-87.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.33333f, KeyframeAnimations.scaleVec(1.1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.33333f, KeyframeAnimations.scaleVec(1.1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerlL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -15f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 17.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerlR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 20f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition SLOTH_IDLE_ONGROUND = AnimationDefinition.Builder.withLength(2.45833f).looping()
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 3f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-82.5f, 90f, 90f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -3.5f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.41667f, KeyframeAnimations.scaleVec(1f, 1f, 1.1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -4f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.41667f, KeyframeAnimations.scaleVec(1f, 1f, 1.1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperlL",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-2f, 2f, -3f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperlL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(32.5f, -50f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerlL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(7.56f, -7.44f, -0.98f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("footL",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-7f, 0f, -6f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("footL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -37.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperaL",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(7f, 6f, -9f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperaL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-87.5f, -60f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraL",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 1f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(22.5f, 0f, 17.5f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("handL",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-6f, 0f, -6f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("handL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -37.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperaR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(-2f, -1f, -4f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperaR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 20f, 15f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -3f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-5f, 37.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("handR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(5f, -1f, -4f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("handR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(16.03f, 26.06f, 30.9f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperlR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, -6f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperlR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(7.5f, 70f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerlR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(25f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("head",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.degreeVec(0f, -10f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("neck",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 3f, -11f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.posVec(0f, 3f, -11f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("neck",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-32.62f, -8.08f, 4.96f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.degreeVec(-32.62f, -8.08f, 4.96f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower2lL",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 7f, -2f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower2lL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(52.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower2lR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(3.5f, 0f, -4f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower2lR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 35f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower2aR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(3f, 4f, -20f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower2aR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-91.44f, -4.28f, -15.39f),
                                    AnimationChannel.Interpolations.LINEAR))).build();
    public static final AnimationDefinition SLOTH_WALKING_HANGING = AnimationDefinition.Builder.withLength(7.375f).looping()
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, -10f, -4f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.posVec(0f, -10f, -4f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("body",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(-87.5f, 90f, 90f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.degreeVec(-87.5f, 90f, 90f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upper",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.33333f, KeyframeAnimations.scaleVec(1.1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.625f, KeyframeAnimations.scaleVec(1.1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4.875f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(6.16667f, KeyframeAnimations.scaleVec(1.1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lower",
                    new AnimationChannel(AnimationChannel.Targets.SCALE,
                            new Keyframe(0f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.33333f, KeyframeAnimations.scaleVec(1.1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.45833f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.scaleVec(1f, 1f, 1f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperlL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.41667f, KeyframeAnimations.degreeVec(-5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerlL",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.41667f, KeyframeAnimations.posVec(0f, 0f, -1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerlL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1.41667f, KeyframeAnimations.degreeVec(-5f, -12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(-7.5f, -12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.degreeVec(0f, -12.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperaL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.41667f, KeyframeAnimations.degreeVec(-7.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4.91667f, KeyframeAnimations.degreeVec(-15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraL",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.41667f, KeyframeAnimations.posVec(0f, 0f, -1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraL",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, -15f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(0f, -15f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.41667f, KeyframeAnimations.degreeVec(-12.5f, -15f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4.91667f, KeyframeAnimations.degreeVec(-15f, -15f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.degreeVec(0f, -15f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("loweraR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 17.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(1f, KeyframeAnimations.degreeVec(-15f, 17.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2f, KeyframeAnimations.degreeVec(-20f, 17.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.degreeVec(0f, 17.5f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("upperlR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.41667f, KeyframeAnimations.degreeVec(-12.5f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4.91667f, KeyframeAnimations.degreeVec(-15f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.degreeVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerlR",
                    new AnimationChannel(AnimationChannel.Targets.POSITION,
                            new Keyframe(0f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.41667f, KeyframeAnimations.posVec(0f, 0f, -2f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4.91667f, KeyframeAnimations.posVec(0f, 0f, -1f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.posVec(0f, 0f, 0f),
                                    AnimationChannel.Interpolations.LINEAR)))
            .addAnimation("lowerlR",
                    new AnimationChannel(AnimationChannel.Targets.ROTATION,
                            new Keyframe(0f, KeyframeAnimations.degreeVec(0f, 20f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(2.25f, KeyframeAnimations.degreeVec(0f, 20f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(3.41667f, KeyframeAnimations.degreeVec(2.5f, 20f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(4.91667f, KeyframeAnimations.degreeVec(0f, 20f, 0f),
                                    AnimationChannel.Interpolations.LINEAR),
                            new Keyframe(7.375f, KeyframeAnimations.degreeVec(0f, 20f, 0f),
                                    AnimationChannel.Interpolations.LINEAR))).build();

}
