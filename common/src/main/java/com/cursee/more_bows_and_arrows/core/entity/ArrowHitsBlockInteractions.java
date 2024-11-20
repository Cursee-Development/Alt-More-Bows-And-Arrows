package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.Nullable;

public class ArrowHitsBlockInteractions {

    public static void interact(TieredArrowEntity tieredArrowEntity, @Nullable Entity entity, BlockHitResult blockHitResult) {

        if (!(entity instanceof LivingEntity owner)) return;

        ItemStack itemStack = owner.getMainHandItem();
        Item item = itemStack.getItem();

        if (!(item instanceof TieredBowItem tieredBowItem)) return;

        final BlockPos blockPos = blockHitResult.getBlockPos();
        final Direction direction = blockHitResult.getDirection();
        final BlockPos relative = blockPos.relative(direction);

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
