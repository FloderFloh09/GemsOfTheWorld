package net.floderfloh.gemsoftheworld.entity.custom;

import net.floderfloh.gemsoftheworld.entity.ModEntities;
import net.floderfloh.gemsoftheworld.entity.client.SnailModel;
import net.floderfloh.gemsoftheworld.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.AnimationState;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.ai.navigation.WallClimberNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;

public class SnailEntity extends Animal {
    public final AnimationState idleAnimationState = new AnimationState();
    private int idleAnimationTimeout = 0;
    private static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(SnailEntity.class, EntityDataSerializers.BYTE);


    public SnailEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    @Override
    protected void defineSynchedData(SynchedEntityData.Builder pBuilder) {
        super.defineSynchedData(pBuilder);
        pBuilder.define(DATA_FLAGS_ID, (byte)0);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new FloatGoal(this));

        this.goalSelector.addGoal(1, new PanicGoal(this, 1.2));
        this.goalSelector.addGoal(2, new BreedGoal(this, 1.0));
        this.goalSelector.addGoal(3, new TemptGoal(this, 1.05, stack -> stack.is(ModItems.JUCY_APPLE.get()), false));

        this.goalSelector.addGoal(4, new FollowParentGoal(this, 1.0));

        this.goalSelector.addGoal(5, new WaterAvoidingRandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(6, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(7, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 2D)
                .add(Attributes.MOVEMENT_SPEED, 0.1D)
                .add(Attributes.FOLLOW_RANGE, 8D);
    }

    @Override
    public boolean isFood(ItemStack pStack) {
        return pStack.is(ModItems.JUCY_APPLE.get());
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.SNAIL.get().create(pLevel);
    }

    private void setupAnimationStates() {
        if(this.idleAnimationTimeout <= 0 && !this.idleAnimationState.isStarted()) {
            this.idleAnimationTimeout = 32;
            this.idleAnimationState.start(this.tickCount);
        } else {
            --this.idleAnimationTimeout;
        }
    }

    @Override
    public void tick() {
        super.tick();
        if (this.getDeltaMovement().horizontalDistanceSqr() > 0.01) { // Statt 0.001 ein höherer Wert
            System.out.println("Snail is moving!");
        }



        if(this.level().isClientSide()) {
            this.setupAnimationStates();
        }
        if (!this.level().isClientSide()) { // Führe es auf dem Server aus!
            this.setClimbing(this.horizontalCollision);
        }
        if (this.isClimbing()) {
            BlockPos pos = this.blockPosition();
            BlockState state = this.level().getBlockState(pos);

            // Prüfe, an welcher Seite die Schnecke klebt
            if (this.horizontalCollision) {
                Direction facing = this.getFacingFromMovement(); // Bestimme Richtung anhand Bewegung

                switch (facing) {
                    case NORTH:
                        this.setYRot(180);  // Schnecke schaut nach Süden
                        this.setXRot(90);   // Aufrecht an der Wand
                        break;
                    case SOUTH:
                        this.setYRot(0);    // Schnecke schaut nach Norden
                        this.setXRot(90);
                        break;
                    case WEST:
                        this.setYRot(90);   // Schnecke schaut nach Osten
                        this.setXRot(90);
                        break;
                    case EAST:
                        this.setYRot(-90);  // Schnecke schaut nach Westen
                        this.setXRot(90);
                        break;
                    default:
                        break;
                }
            } else {
                // Normale Ausrichtung, wenn nicht an der Wand
                this.setXRot(0);
            }
        }
    }
    @Override
    protected PathNavigation createNavigation(Level pLevel) {
        return new WallClimberNavigation(this, pLevel);
    }

    private Direction getFacingFromMovement() {
        Vec3 movement = this.getDeltaMovement();
        if (Math.abs(movement.x) > Math.abs(movement.z)) {
            return movement.x > 0 ? Direction.EAST : Direction.WEST;
        } else {
            return movement.z > 0 ? Direction.SOUTH : Direction.NORTH;
        }
    }

    @Override
    public boolean onClimbable() {
        return this.isClimbing();
    }

    public boolean isClimbing() {
        return (this.entityData.get(DATA_FLAGS_ID) & 1) != 0;
    }

    public void setClimbing(boolean pClimbing) {
        byte b0 = this.entityData.get(DATA_FLAGS_ID);
        if (pClimbing) {
            b0 = (byte)(b0 | 1);
        } else {
            b0 = (byte)(b0 & -2);
        }

        this.entityData.set(DATA_FLAGS_ID, b0);
    }
    @Override
    public Vec3 getVehicleAttachmentPoint(Entity pEntity) {
        return pEntity.getBbWidth() <= this.getBbWidth() ? new Vec3(0.0, 0.3125 * (double)this.getScale(), 0.0) : super.getVehicleAttachmentPoint(pEntity);
    }
}
