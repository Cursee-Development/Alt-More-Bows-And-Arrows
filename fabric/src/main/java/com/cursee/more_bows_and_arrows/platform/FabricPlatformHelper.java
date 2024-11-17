package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.registry.ModArrowItemsFabric;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesFabric;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import com.cursee.more_bows_and_arrows.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;

@SuppressWarnings("all")
public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public EntityType entityFromTier(ArrowTier tier) {
        return switch (tier) {
            case AMETHYST -> ModEntityTypesFabric.AMETHYST_ARROW;
            case BAMBOO -> ModEntityTypesFabric.BAMBOO_ARROW;
            case BLAZE_ROD -> ModEntityTypesFabric.BLAZE_ROD_ARROW;
            case BONE -> ModEntityTypesFabric.BONE_ARROW;
            case CACTUS -> ModEntityTypesFabric.CACTUS_ARROW;
            case COAL -> ModEntityTypesFabric.COAL_ARROW;
            case COPPER -> ModEntityTypesFabric.COPPER_ARROW;
            case DIAMOND -> ModEntityTypesFabric.DIAMOND_ARROW;
            case DRAGON_BREATH -> ModEntityTypesFabric.DRAGON_BREATH_ARROW;
            case DRIPSTONE -> ModEntityTypesFabric.DRIPSTONE_ARROW;
            case ECHO -> ModEntityTypesFabric.ECHO_ARROW;
            case EGG -> ModEntityTypesFabric.EGG_ARROW;
            case EMERALD -> ModEntityTypesFabric.EMERALD_ARROW;
            case ENDER_PEARL -> ModEntityTypesFabric.ENDER_PEARL_ARROW;
            case FIREWORK -> ModEntityTypesFabric.FIREWORK_ARROW;
            case FIRE_CHARGE -> ModEntityTypesFabric.FIRE_CHARGE_ARROW;
            case FLINT -> ModEntityTypesFabric.FLINT_ARROW;
            case FLINT_AND_STEEL -> ModEntityTypesFabric.FLINT_AND_STEEL_ARROW;
            case GLOW_INK_SAC -> ModEntityTypesFabric.GLOW_INK_SAC_ARROW;
            case GOLD -> ModEntityTypesFabric.GOLD_ARROW;
            case ICE -> ModEntityTypesFabric.ICE_ARROW;
            case INK_SAC -> ModEntityTypesFabric.INK_SAC_ARROW;
            case IRON -> ModEntityTypesFabric.IRON_ARROW;
            case LADDER -> ModEntityTypesFabric.LADDER_ARROW;
            case LAPIS -> ModEntityTypesFabric.LAPIS_ARROW;
            case LIGHTNING_ROD -> ModEntityTypesFabric.LIGHTNING_ROD_ARROW;
            case NETHERITE -> ModEntityTypesFabric.NETHERITE_ARROW;
            case NETHER_QUARTZ -> ModEntityTypesFabric.NETHER_QUARTZ_ARROW;
            case NETHER_STAR -> ModEntityTypesFabric.NETHER_STAR_ARROW;
            case OBSIDIAN -> ModEntityTypesFabric.OBSIDIAN_ARROW;
            case PAPER -> ModEntityTypesFabric.PAPER_ARROW;
            case PRISMARINE -> ModEntityTypesFabric.PRISMARINE_ARROW;
            case REDSTONE -> ModEntityTypesFabric.REDSTONE_ARROW;
            case SHEAR -> ModEntityTypesFabric.SHEAR_ARROW;
            case SHULKER_SHELL -> ModEntityTypesFabric.SHULKER_SHELL_ARROW;
            case SLIMEBALL -> ModEntityTypesFabric.SLIMEBALL_ARROW;
            case SMOKING -> ModEntityTypesFabric.SMOKING_ARROW;
            case SNOWBALL -> ModEntityTypesFabric.SNOWBALL_ARROW;
            case TNT -> ModEntityTypesFabric.TNT_ARROW;
            case WATER_BOTTLE -> ModEntityTypesFabric.WATER_BOTTLE_ARROW;
        };
    }

    @Override
    public Item itemFromTier(ArrowTier tier) {
        return switch (tier) {
            case AMETHYST -> ModArrowItemsFabric.AMETHYST_ARROW;
            case BAMBOO -> ModArrowItemsFabric.BAMBOO_ARROW;
            case BLAZE_ROD -> ModArrowItemsFabric.BLAZE_ROD_ARROW;
            case BONE -> ModArrowItemsFabric.BONE_ARROW;
            case CACTUS -> ModArrowItemsFabric.CACTUS_ARROW;
            case COAL -> ModArrowItemsFabric.COAL_ARROW;
            case COPPER -> ModArrowItemsFabric.COPPER_ARROW;
            case DIAMOND -> ModArrowItemsFabric.DIAMOND_ARROW;
            case DRAGON_BREATH -> ModArrowItemsFabric.DRAGON_BREATH_ARROW;
            case DRIPSTONE -> ModArrowItemsFabric.DRIPSTONE_ARROW;
            case ECHO -> ModArrowItemsFabric.ECHO_ARROW;
            case EGG -> ModArrowItemsFabric.EGG_ARROW;
            case EMERALD -> ModArrowItemsFabric.EMERALD_ARROW;
            case ENDER_PEARL -> ModArrowItemsFabric.ENDER_PEARL_ARROW;
            case FIREWORK -> ModArrowItemsFabric.FIREWORK_ARROW;
            case FIRE_CHARGE -> ModArrowItemsFabric.FIRE_CHARGE_ARROW;
            case FLINT -> ModArrowItemsFabric.FLINT_ARROW;
            case FLINT_AND_STEEL -> ModArrowItemsFabric.FLINT_AND_STEEL_ARROW;
            case GLOW_INK_SAC -> ModArrowItemsFabric.GLOW_INK_SAC_ARROW;
            case GOLD -> ModArrowItemsFabric.GOLD_ARROW;
            case ICE -> ModArrowItemsFabric.ICE_ARROW;
            case INK_SAC -> ModArrowItemsFabric.INK_SAC_ARROW;
            case IRON -> ModArrowItemsFabric.IRON_ARROW;
            case LADDER -> ModArrowItemsFabric.LADDER_ARROW;
            case LAPIS -> ModArrowItemsFabric.LAPIS_ARROW;
            case LIGHTNING_ROD -> ModArrowItemsFabric.LIGHTNING_ROD_ARROW;
            case NETHERITE -> ModArrowItemsFabric.NETHERITE_ARROW;
            case NETHER_QUARTZ -> ModArrowItemsFabric.NETHER_QUARTZ_ARROW;
            case NETHER_STAR -> ModArrowItemsFabric.NETHER_STAR_ARROW;
            case OBSIDIAN -> ModArrowItemsFabric.OBSIDIAN_ARROW;
            case PAPER -> ModArrowItemsFabric.PAPER_ARROW;
            case PRISMARINE -> ModArrowItemsFabric.PRISMARINE_ARROW;
            case REDSTONE -> ModArrowItemsFabric.REDSTONE_ARROW;
            case SHEAR -> ModArrowItemsFabric.SHEAR_ARROW;
            case SHULKER_SHELL -> ModArrowItemsFabric.SHULKER_SHELL_ARROW;
            case SLIMEBALL -> ModArrowItemsFabric.SLIMEBALL_ARROW;
            case SMOKING -> ModArrowItemsFabric.SMOKING_ARROW;
            case SNOWBALL -> ModArrowItemsFabric.SNOWBALL_ARROW;
            case TNT -> ModArrowItemsFabric.TNT_ARROW;
            case WATER_BOTTLE -> ModArrowItemsFabric.WATER_BOTTLE_ARROW;
        };
    }
}
