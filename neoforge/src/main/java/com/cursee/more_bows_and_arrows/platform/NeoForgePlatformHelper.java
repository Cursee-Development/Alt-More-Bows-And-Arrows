package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsNeoForge;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesNeoForge;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import com.cursee.more_bows_and_arrows.platform.services.IPlatformHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLLoader;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "NeoForge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public EntityType entityFromTier(ArrowTier tier) {
        return switch (tier) {
            case AMETHYST -> ModEntityTypesNeoForge.AMETHYST_ARROW.get();
            case BAMBOO -> ModEntityTypesNeoForge.BAMBOO_ARROW.get();
            case BLAZE_ROD -> ModEntityTypesNeoForge.BLAZE_ROD_ARROW.get();
            case BONE -> ModEntityTypesNeoForge.BONE_ARROW.get();
            case CACTUS -> ModEntityTypesNeoForge.CACTUS_ARROW.get();
            case COAL -> ModEntityTypesNeoForge.COAL_ARROW.get();
            case COPPER -> ModEntityTypesNeoForge.COPPER_ARROW.get();
            case DIAMOND -> ModEntityTypesNeoForge.DIAMOND_ARROW.get();
            case DRAGON_BREATH -> ModEntityTypesNeoForge.DRAGON_BREATH_ARROW.get();
            case DRIPSTONE -> ModEntityTypesNeoForge.DRIPSTONE_ARROW.get();
            case ECHO -> ModEntityTypesNeoForge.ECHO_ARROW.get();
            case EGG -> ModEntityTypesNeoForge.EGG_ARROW.get();
            case EMERALD -> ModEntityTypesNeoForge.EMERALD_ARROW.get();
            case ENDER_PEARL -> ModEntityTypesNeoForge.ENDER_PEARL_ARROW.get();
            case FIREWORK -> ModEntityTypesNeoForge.FIREWORK_ARROW.get();
            case FIRE_CHARGE -> ModEntityTypesNeoForge.FIRE_CHARGE_ARROW.get();
            case FLINT -> ModEntityTypesNeoForge.FLINT_ARROW.get();
            case FLINT_AND_STEEL -> ModEntityTypesNeoForge.FLINT_AND_STEEL_ARROW.get();
            case GLOW_INK_SAC -> ModEntityTypesNeoForge.GLOW_INK_SAC_ARROW.get();
            case GOLD -> ModEntityTypesNeoForge.GOLD_ARROW.get();
            case ICE -> ModEntityTypesNeoForge.ICE_ARROW.get();
            case INK_SAC -> ModEntityTypesNeoForge.INK_SAC_ARROW.get();
            case IRON -> ModEntityTypesNeoForge.IRON_ARROW.get();
            case LADDER -> ModEntityTypesNeoForge.LADDER_ARROW.get();
            case LAPIS -> ModEntityTypesNeoForge.LAPIS_ARROW.get();
            case LIGHTNING_ROD -> ModEntityTypesNeoForge.LIGHTNING_ROD_ARROW.get();
            case NETHERITE -> ModEntityTypesNeoForge.NETHERITE_ARROW.get();
            case NETHER_QUARTZ -> ModEntityTypesNeoForge.NETHER_QUARTZ_ARROW.get();
            case NETHER_STAR -> ModEntityTypesNeoForge.NETHER_STAR_ARROW.get();
            case OBSIDIAN -> ModEntityTypesNeoForge.OBSIDIAN_ARROW.get();
            case PAPER -> ModEntityTypesNeoForge.PAPER_ARROW.get();
            case PRISMARINE -> ModEntityTypesNeoForge.PRISMARINE_ARROW.get();
            case REDSTONE -> ModEntityTypesNeoForge.REDSTONE_ARROW.get();
            case SHEAR -> ModEntityTypesNeoForge.SHEAR_ARROW.get();
            case SHULKER_SHELL -> ModEntityTypesNeoForge.SHULKER_SHELL_ARROW.get();
            case SLIMEBALL -> ModEntityTypesNeoForge.SLIMEBALL_ARROW.get();
            case SMOKING -> ModEntityTypesNeoForge.SMOKING_ARROW.get();
            case SNOWBALL -> ModEntityTypesNeoForge.SNOWBALL_ARROW.get();
            case TNT -> ModEntityTypesNeoForge.TNT_ARROW.get();
            case WATER_BOTTLE -> ModEntityTypesNeoForge.WATER_BOTTLE_ARROW.get();
        };
    }

    @Override
    public Item itemFromTier(ArrowTier tier) {
        return switch (tier) {
            case AMETHYST -> ModArrowItemsNeoForge.AMETHYST_ARROW.get();
            case BAMBOO -> ModArrowItemsNeoForge.BAMBOO_ARROW.get();
            case BLAZE_ROD -> ModArrowItemsNeoForge.BLAZE_ROD_ARROW.get();
            case BONE -> ModArrowItemsNeoForge.BONE_ARROW.get();
            case CACTUS -> ModArrowItemsNeoForge.CACTUS_ARROW.get();
            case COAL -> ModArrowItemsNeoForge.COAL_ARROW.get();
            case COPPER -> ModArrowItemsNeoForge.COPPER_ARROW.get();
            case DIAMOND -> ModArrowItemsNeoForge.DIAMOND_ARROW.get();
            case DRAGON_BREATH -> ModArrowItemsNeoForge.DRAGON_BREATH_ARROW.get();
            case DRIPSTONE -> ModArrowItemsNeoForge.DRIPSTONE_ARROW.get();
            case ECHO -> ModArrowItemsNeoForge.ECHO_ARROW.get();
            case EGG -> ModArrowItemsNeoForge.EGG_ARROW.get();
            case EMERALD -> ModArrowItemsNeoForge.EMERALD_ARROW.get();
            case ENDER_PEARL -> ModArrowItemsNeoForge.ENDER_PEARL_ARROW.get();
            case FIREWORK -> ModArrowItemsNeoForge.FIREWORK_ARROW.get();
            case FIRE_CHARGE -> ModArrowItemsNeoForge.FIRE_CHARGE_ARROW.get();
            case FLINT -> ModArrowItemsNeoForge.FLINT_ARROW.get();
            case FLINT_AND_STEEL -> ModArrowItemsNeoForge.FLINT_AND_STEEL_ARROW.get();
            case GLOW_INK_SAC -> ModArrowItemsNeoForge.GLOW_INK_SAC_ARROW.get();
            case GOLD -> ModArrowItemsNeoForge.GOLD_ARROW.get();
            case ICE -> ModArrowItemsNeoForge.ICE_ARROW.get();
            case INK_SAC -> ModArrowItemsNeoForge.INK_SAC_ARROW.get();
            case IRON -> ModArrowItemsNeoForge.IRON_ARROW.get();
            case LADDER -> ModArrowItemsNeoForge.LADDER_ARROW.get();
            case LAPIS -> ModArrowItemsNeoForge.LAPIS_ARROW.get();
            case LIGHTNING_ROD -> ModArrowItemsNeoForge.LIGHTNING_ROD_ARROW.get();
            case NETHERITE -> ModArrowItemsNeoForge.NETHERITE_ARROW.get();
            case NETHER_QUARTZ -> ModArrowItemsNeoForge.NETHER_QUARTZ_ARROW.get();
            case NETHER_STAR -> ModArrowItemsNeoForge.NETHER_STAR_ARROW.get();
            case OBSIDIAN -> ModArrowItemsNeoForge.OBSIDIAN_ARROW.get();
            case PAPER -> ModArrowItemsNeoForge.PAPER_ARROW.get();
            case PRISMARINE -> ModArrowItemsNeoForge.PRISMARINE_ARROW.get();
            case REDSTONE -> ModArrowItemsNeoForge.REDSTONE_ARROW.get();
            case SHEAR -> ModArrowItemsNeoForge.SHEAR_ARROW.get();
            case SHULKER_SHELL -> ModArrowItemsNeoForge.SHULKER_SHELL_ARROW.get();
            case SLIMEBALL -> ModArrowItemsNeoForge.SLIMEBALL_ARROW.get();
            case SMOKING -> ModArrowItemsNeoForge.SMOKING_ARROW.get();
            case SNOWBALL -> ModArrowItemsNeoForge.SNOWBALL_ARROW.get();
            case TNT -> ModArrowItemsNeoForge.TNT_ARROW.get();
            case WATER_BOTTLE -> ModArrowItemsNeoForge.WATER_BOTTLE_ARROW.get();
        };
    }
}