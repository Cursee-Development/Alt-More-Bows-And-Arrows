package com.cursee.more_bows_and_arrows.core.client;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.TieredArrowEntityRenderer;
import com.cursee.more_bows_and_arrows.core.registry.ModBowItemsForge;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesForge;
import com.cursee.more_bows_and_arrows.core.util.TieredBowUtil;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = Constants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreBowsAndArrowsForgeClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        MoreBowsAndArrowsForgeClient.registerBowItemProperties(event);
    }

    @SubscribeEvent
    public static void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        MoreBowsAndArrowsForgeClient.registerArrowEntityRenderers(event);
    }

    private static void registerBowItemProperties(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            TieredBowUtil.registerItemProperties(ModBowItemsForge.OAK_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_OAK_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.DARK_OAK_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_DARK_OAK_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.SPRUCE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_SPRUCE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.BIRCH_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_BIRCH_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.JUNGLE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_JUNGLE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.ACACIA_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_ACACIA_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.MANGROVE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_MANGROVE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.CHERRY_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_CHERRY_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.WARPED_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_WARPED_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.CRIMSON_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_CRIMSON_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.BAMBOO_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.STRIPPED_BAMBOO_BOW.get());

            TieredBowUtil.registerItemProperties(ModBowItemsForge.AMETHYST_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.BLAZE_ROD_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.BONE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.COPPER_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.DIAMOND_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.EMERALD_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.END_STONE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.GOLD_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.IRON_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.LAPIS_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.LIGHTNING_ROD_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.NETHERITE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.OBSIDIAN_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.PAPER_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsForge.PRISMARINE_BOW.get());
        });
    }

    private static void registerArrowEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypesForge.AMETHYST_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.BAMBOO_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.BLAZE_ROD_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.BONE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.CACTUS_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.COAL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.COPPER_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.DIAMOND_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.DRAGON_BREATH_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.DRIPSTONE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.ECHO_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.EGG_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.EMERALD_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.ENDER_PEARL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.FIREWORK_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.FIRE_CHARGE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.FLINT_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.FLINT_AND_STEEL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.GLOW_INK_SAC_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.GOLD_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.ICE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.INK_SAC_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.IRON_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.LADDER_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.LAPIS_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.LIGHTNING_ROD_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.NETHERITE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.NETHER_QUARTZ_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.NETHER_STAR_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.OBSIDIAN_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.PAPER_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.PRISMARINE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.REDSTONE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.SHEAR_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.SHULKER_SHELL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.SLIMEBALL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.SMOKING_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.SNOWBALL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.TNT_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesForge.WATER_BOTTLE_ARROW.get(), TieredArrowEntityRenderer::new);
    }
}
