package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.Nullable;

public class ArrowHitsEntityInteractions {

    public static void interact(TieredArrowEntity tieredArrowEntity, @Nullable Entity nullableOwner, EntityHitResult entityHitResult) {

        if (!(nullableOwner instanceof Player player)) return;

        switch (tieredArrowEntity.getVariant()) {
            case AMETHYST, BAMBOO -> {/* NO-OP */}
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
                if (player.getMainHandItem().getItem() instanceof TieredBowItem tieredBowItem && tieredBowItem.tier == BowTier.LIGHTNING_ROD) tieredArrowEntity.level().explode(player, entityHitResult.getEntity().xo, entityHitResult.getEntity().yo, entityHitResult.getEntity().zo, 4.0f, Level.ExplosionInteraction.TNT);
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
