package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.Nullable;

public class ArrowHitsEntityInteractions {

    public static void interact(TieredArrowEntity tieredArrowEntity, @Nullable Entity entity, EntityHitResult entityHitResult) {

        if (!(entity instanceof LivingEntity owner)) return;

        ItemStack itemStack = owner.getMainHandItem();
        Item item = itemStack.getItem();

        if (!(item instanceof TieredBowItem tieredBowItem)) return;

        Entity hitResultEntity = entityHitResult.getEntity();

        if (!(hitResultEntity instanceof LivingEntity hitEntity)) return;

        // owner
        // hitEntity

        // tieredBowItem

        // todo create mixin to apply this bow damage from all arrows
        // hitEntity.hurt(hitEntity.level().damageSources().arrow(tieredArrowEntity, owner), tieredBowItem.tier.bonusDamage());

        hitEntity.hurt(hitEntity.level().damageSources().arrow(tieredArrowEntity, owner), tieredArrowEntity.getVariant().bonusDamage());

        switch (tieredArrowEntity.getVariant()) {
            case AMETHYST -> {
            }
            case BAMBOO -> {
            }
            case BLAZE_ROD -> {
            }
            case BONE -> {
            }
            case CACTUS -> {
            }
            case COAL -> {
            }
            case COPPER -> {
            }
            case DIAMOND -> {
            }
            case DRAGON_BREATH -> {
            }
            case DRIPSTONE -> {
            }
            case ECHO -> {
            }
            case EGG -> {
            }
            case EMERALD -> {
            }
            case ENDER_PEARL -> {
            }
            case FIREWORK -> {
            }
            case FIRE_CHARGE -> {
            }
            case FLINT -> {
            }
            case FLINT_AND_STEEL -> {
            }
            case GLOW_INK_SAC -> {
            }
            case GOLD -> {
            }
            case ICE -> {
            }
            case INK_SAC -> {
            }
            case IRON -> {
            }
            case LADDER -> {
            }
            case LAPIS -> {
            }
            case LIGHTNING_ROD -> {
            }
            case NETHERITE -> {
            }
            case NETHER_QUARTZ -> {
            }
            case NETHER_STAR -> {
            }
            case OBSIDIAN -> {
            }
            case PAPER -> {
            }
            case PRISMARINE -> {
            }
            case REDSTONE -> {
            }
            case SHEAR -> {
            }
            case SHULKER_SHELL -> {
            }
            case SLIMEBALL -> {
            }
            case SMOKING -> {
            }
            case SNOWBALL -> {
            }
            case TNT -> {
            }
            case WATER_BOTTLE -> {
            }
        }
    }
}
