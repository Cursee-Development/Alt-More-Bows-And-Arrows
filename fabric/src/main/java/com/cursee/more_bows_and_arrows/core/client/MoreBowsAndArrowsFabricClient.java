package com.cursee.more_bows_and_arrows.core.client;

import com.cursee.more_bows_and_arrows.core.entity.TieredArrowEntityRenderer;
import com.cursee.more_bows_and_arrows.core.registry.ModBowItemsFabric;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesFabric;
import com.cursee.more_bows_and_arrows.core.util.TieredBowUtil;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class MoreBowsAndArrowsFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        MoreBowsAndArrowsFabricClient.registerBowItemProperties();
        MoreBowsAndArrowsFabricClient.registerArrowEntityRenderers();
    }

    private static void registerBowItemProperties() {
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.OAK_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_OAK_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.DARK_OAK_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_DARK_OAK_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.SPRUCE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_SPRUCE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.BIRCH_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_BIRCH_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.JUNGLE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_JUNGLE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.ACACIA_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_ACACIA_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.MANGROVE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_MANGROVE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.CHERRY_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_CHERRY_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.WARPED_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_WARPED_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.CRIMSON_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_CRIMSON_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.BAMBOO_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.STRIPPED_BAMBOO_BOW);

        TieredBowUtil.registerItemProperties(ModBowItemsFabric.AMETHYST_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.BLAZE_ROD_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.BONE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.COPPER_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.DIAMOND_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.EMERALD_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.END_STONE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.GOLD_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.IRON_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.LAPIS_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.LIGHTNING_ROD_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.NETHERITE_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.OBSIDIAN_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.PAPER_BOW);
        TieredBowUtil.registerItemProperties(ModBowItemsFabric.PRISMARINE_BOW);
    }

    private static void registerArrowEntityRenderers() {
        EntityRendererRegistry.register(ModEntityTypesFabric.AMETHYST_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.BAMBOO_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.BLAZE_ROD_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.BONE_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.CACTUS_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.COAL_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.COPPER_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.DIAMOND_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.DRAGON_BREATH_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.DRIPSTONE_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.ECHO_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.EGG_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.EMERALD_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.ENDER_PEARL_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.FIREWORK_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.FIRE_CHARGE_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.FLINT_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.FLINT_AND_STEEL_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.GLOW_INK_SAC_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.GOLD_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.ICE_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.INK_SAC_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.IRON_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.LADDER_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.LAPIS_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.LIGHTNING_ROD_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.NETHERITE_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.NETHER_QUARTZ_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.NETHER_STAR_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.OBSIDIAN_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.PAPER_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.PRISMARINE_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.REDSTONE_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.SHEAR_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.SHULKER_SHELL_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.SLIMEBALL_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.SMOKING_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.SNOWBALL_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.TNT_ARROW, TieredArrowEntityRenderer::new);
        EntityRendererRegistry.register(ModEntityTypesFabric.WATER_BOTTLE_ARROW, TieredArrowEntityRenderer::new);
    }
}
