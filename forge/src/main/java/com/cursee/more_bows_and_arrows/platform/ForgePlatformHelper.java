package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsForge;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesForge;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import com.cursee.more_bows_and_arrows.platform.services.IPlatformHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

@SuppressWarnings("all")
public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "Forge";
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
            case AMETHYST -> ModEntityTypesForge.AMETHYST_ARROW.get();
            case BAMBOO -> ModEntityTypesForge.BAMBOO_ARROW.get();
            case BLAZE_ROD -> ModEntityTypesForge.BLAZE_ROD_ARROW.get();
            case BONE -> ModEntityTypesForge.BONE_ARROW.get();
            case CACTUS -> ModEntityTypesForge.CACTUS_ARROW.get();
            case COAL -> ModEntityTypesForge.COAL_ARROW.get();
            case COPPER -> ModEntityTypesForge.COPPER_ARROW.get();
            case DIAMOND -> ModEntityTypesForge.DIAMOND_ARROW.get();
            case DRAGON_BREATH -> ModEntityTypesForge.DRAGON_BREATH_ARROW.get();
            case DRIPSTONE -> ModEntityTypesForge.DRIPSTONE_ARROW.get();
            case ECHO -> ModEntityTypesForge.ECHO_ARROW.get();
            case EGG -> ModEntityTypesForge.EGG_ARROW.get();
            case EMERALD -> ModEntityTypesForge.EMERALD_ARROW.get();
            case ENDER_PEARL -> ModEntityTypesForge.ENDER_PEARL_ARROW.get();
            case FIREWORK -> ModEntityTypesForge.FIREWORK_ARROW.get();
            case FIRE_CHARGE -> ModEntityTypesForge.FIRE_CHARGE_ARROW.get();
            case FLINT -> ModEntityTypesForge.FLINT_ARROW.get();
            case FLINT_AND_STEEL -> ModEntityTypesForge.FLINT_AND_STEEL_ARROW.get();
            case GLOW_INK_SAC -> ModEntityTypesForge.GLOW_INK_SAC_ARROW.get();
            case GOLD -> ModEntityTypesForge.GOLD_ARROW.get();
            case ICE -> ModEntityTypesForge.ICE_ARROW.get();
            case INK_SAC -> ModEntityTypesForge.INK_SAC_ARROW.get();
            case IRON -> ModEntityTypesForge.IRON_ARROW.get();
            case LADDER -> ModEntityTypesForge.LADDER_ARROW.get();
            case LAPIS -> ModEntityTypesForge.LAPIS_ARROW.get();
            case LIGHTNING_ROD -> ModEntityTypesForge.LIGHTNING_ROD_ARROW.get();
            case NETHERITE -> ModEntityTypesForge.NETHERITE_ARROW.get();
            case NETHER_QUARTZ -> ModEntityTypesForge.NETHER_QUARTZ_ARROW.get();
            case NETHER_STAR -> ModEntityTypesForge.NETHER_STAR_ARROW.get();
            case OBSIDIAN -> ModEntityTypesForge.OBSIDIAN_ARROW.get();
            case PAPER -> ModEntityTypesForge.PAPER_ARROW.get();
            case PRISMARINE -> ModEntityTypesForge.PRISMARINE_ARROW.get();
            case REDSTONE -> ModEntityTypesForge.REDSTONE_ARROW.get();
            case SHEAR -> ModEntityTypesForge.SHEAR_ARROW.get();
            case SHULKER_SHELL -> ModEntityTypesForge.SHULKER_SHELL_ARROW.get();
            case SLIMEBALL -> ModEntityTypesForge.SLIMEBALL_ARROW.get();
            case SMOKING -> ModEntityTypesForge.SMOKING_ARROW.get();
            case SNOWBALL -> ModEntityTypesForge.SNOWBALL_ARROW.get();
            case TNT -> ModEntityTypesForge.TNT_ARROW.get();
            case WATER_BOTTLE -> ModEntityTypesForge.WATER_BOTTLE_ARROW.get();
        };
    }

    @Override
    public Item itemFromTier(ArrowTier tier) {
        return switch (tier) {
            case AMETHYST -> ModArrowItemsForge.AMETHYST_ARROW.get();
            case BAMBOO -> ModArrowItemsForge.BAMBOO_ARROW.get();
            case BLAZE_ROD -> ModArrowItemsForge.BLAZE_ROD_ARROW.get();
            case BONE -> ModArrowItemsForge.BONE_ARROW.get();
            case CACTUS -> ModArrowItemsForge.CACTUS_ARROW.get();
            case COAL -> ModArrowItemsForge.COAL_ARROW.get();
            case COPPER -> ModArrowItemsForge.COPPER_ARROW.get();
            case DIAMOND -> ModArrowItemsForge.DIAMOND_ARROW.get();
            case DRAGON_BREATH -> ModArrowItemsForge.DRAGON_BREATH_ARROW.get();
            case DRIPSTONE -> ModArrowItemsForge.DRIPSTONE_ARROW.get();
            case ECHO -> ModArrowItemsForge.ECHO_ARROW.get();
            case EGG -> ModArrowItemsForge.EGG_ARROW.get();
            case EMERALD -> ModArrowItemsForge.EMERALD_ARROW.get();
            case ENDER_PEARL -> ModArrowItemsForge.ENDER_PEARL_ARROW.get();
            case FIREWORK -> ModArrowItemsForge.FIREWORK_ARROW.get();
            case FIRE_CHARGE -> ModArrowItemsForge.FIRE_CHARGE_ARROW.get();
            case FLINT -> ModArrowItemsForge.FLINT_ARROW.get();
            case FLINT_AND_STEEL -> ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get();
            case GLOW_INK_SAC -> ModArrowItemsForge.GLOW_INK_SAC_ARROW.get();
            case GOLD -> ModArrowItemsForge.GOLD_ARROW.get();
            case ICE -> ModArrowItemsForge.ICE_ARROW.get();
            case INK_SAC -> ModArrowItemsForge.INK_SAC_ARROW.get();
            case IRON -> ModArrowItemsForge.IRON_ARROW.get();
            case LADDER -> ModArrowItemsForge.LADDER_ARROW.get();
            case LAPIS -> ModArrowItemsForge.LAPIS_ARROW.get();
            case LIGHTNING_ROD -> ModArrowItemsForge.LIGHTNING_ROD_ARROW.get();
            case NETHERITE -> ModArrowItemsForge.NETHERITE_ARROW.get();
            case NETHER_QUARTZ -> ModArrowItemsForge.NETHER_QUARTZ_ARROW.get();
            case NETHER_STAR -> ModArrowItemsForge.NETHER_STAR_ARROW.get();
            case OBSIDIAN -> ModArrowItemsForge.OBSIDIAN_ARROW.get();
            case PAPER -> ModArrowItemsForge.PAPER_ARROW.get();
            case PRISMARINE -> ModArrowItemsForge.PRISMARINE_ARROW.get();
            case REDSTONE -> ModArrowItemsForge.REDSTONE_ARROW.get();
            case SHEAR -> ModArrowItemsForge.SHEAR_ARROW.get();
            case SHULKER_SHELL -> ModArrowItemsForge.SHULKER_SHELL_ARROW.get();
            case SLIMEBALL -> ModArrowItemsForge.SLIMEBALL_ARROW.get();
            case SMOKING -> ModArrowItemsForge.SMOKING_ARROW.get();
            case SNOWBALL -> ModArrowItemsForge.SNOWBALL_ARROW.get();
            case TNT -> ModArrowItemsForge.TNT_ARROW.get();
            case WATER_BOTTLE -> ModArrowItemsForge.WATER_BOTTLE_ARROW.get();
        };
    }
}