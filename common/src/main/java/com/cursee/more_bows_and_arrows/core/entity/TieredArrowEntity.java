package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import com.cursee.more_bows_and_arrows.platform.Services;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unchecked")
public class TieredArrowEntity extends AbstractArrow {

    private static final EntityDataAccessor<Integer> DATA_ID_TYPE_VARIANT = SynchedEntityData.defineId(TieredArrowEntity.class, EntityDataSerializers.INT);

    private final ArrowTier tier;

    /** Used when an arrow is registered. */
    public TieredArrowEntity(EntityType entityType, Level level, ArrowTier tier) {
        super(entityType, level);
        this.tier = tier;
        this.setVariant(this.tier); // the entity is constructed with a variant, and should logically send the same variant???
        this.setBaseDamage(this.getBaseDamage() + this.tier.bonusDamage());
    }

    /** Used when arrow is fired from a dispenser. */
    public TieredArrowEntity(double x, double y, double z, Level level, ArrowTier tier) {
        super(Services.PLATFORM.entityFromTier(tier), x, y, z, level);
        this.tier = tier;
        this.setVariant(tier);
        this.setBaseDamage(this.getBaseDamage() + this.tier.bonusDamage());
    }

    /** Used when arrow is fired from an entity. */
    public TieredArrowEntity(LivingEntity livingEntity, Level level, ArrowTier tier) {
        super(Services.PLATFORM.entityFromTier(tier), livingEntity, level);
        this.tier = tier;
        this.setVariant(tier);
        this.setBaseDamage(this.getBaseDamage() + this.tier.bonusDamage());
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_ID_TYPE_VARIANT, 0);
    }

    private int getTypeVariant() {
        return this.entityData.get(DATA_ID_TYPE_VARIANT);
    }

    public ArrowTier getVariant() {
        return ArrowTier.byId(this.getTypeVariant() & 255);
    }

    private void setVariant(ArrowTier tier) {
        this.entityData.set(DATA_ID_TYPE_VARIANT, tier.getId() & 255);
    }

    @Override
    protected @NotNull ItemStack getPickupItem() {
        return switch (this.tier) {
            default -> new ItemStack(Items.ARROW);
        };
    }

    @Override
    protected void onHitEntity(EntityHitResult $$0) {
        // todo: fill in operations
    }

    @Override
    protected void onHitBlock(BlockHitResult $$0) {
        // todo: fill in operations
    }
}
