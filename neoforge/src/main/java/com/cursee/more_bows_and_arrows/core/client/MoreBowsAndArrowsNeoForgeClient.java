package com.cursee.more_bows_and_arrows.core.client;

import com.cursee.more_bows_and_arrows.Constants;
import com.cursee.more_bows_and_arrows.core.entity.TieredArrowEntityRenderer;
import com.cursee.more_bows_and_arrows.core.registry.ModBowItemsNeoForge;
import com.cursee.more_bows_and_arrows.core.registry.ModEntityTypesNeoForge;
import com.cursee.more_bows_and_arrows.core.util.TieredBowUtil;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@EventBusSubscriber(modid = Constants.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreBowsAndArrowsNeoForgeClient {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        MoreBowsAndArrowsNeoForgeClient.registerBowItemProperties(event);
    }

    @SubscribeEvent
    public static void onRegisterEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        MoreBowsAndArrowsNeoForgeClient.registerArrowEntityRenderers(event);
    }

    private static void registerBowItemProperties(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.OAK_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_OAK_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.DARK_OAK_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_DARK_OAK_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.SPRUCE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_SPRUCE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.BIRCH_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_BIRCH_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.JUNGLE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_JUNGLE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.ACACIA_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_ACACIA_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.MANGROVE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_MANGROVE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.CHERRY_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_CHERRY_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.WARPED_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_WARPED_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.CRIMSON_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_CRIMSON_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.BAMBOO_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.STRIPPED_BAMBOO_BOW.get());

            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.AMETHYST_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.BLAZE_ROD_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.BONE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.COPPER_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.DIAMOND_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.EMERALD_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.END_STONE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.GOLD_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.IRON_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.LAPIS_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.LIGHTNING_ROD_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.NETHERITE_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.OBSIDIAN_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.PAPER_BOW.get());
            TieredBowUtil.registerItemProperties(ModBowItemsNeoForge.PRISMARINE_BOW.get());
        });
    }

    private static void registerArrowEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntityTypesNeoForge.AMETHYST_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.BAMBOO_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.BLAZE_ROD_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.BONE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.CACTUS_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.COAL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.COPPER_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.DIAMOND_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.DRAGON_BREATH_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.DRIPSTONE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.ECHO_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.EGG_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.EMERALD_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.ENDER_PEARL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.FIREWORK_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.FIRE_CHARGE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.FLINT_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.FLINT_AND_STEEL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.GLOW_INK_SAC_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.GOLD_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.ICE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.INK_SAC_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.IRON_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.LADDER_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.LAPIS_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.LIGHTNING_ROD_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.NETHERITE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.NETHER_QUARTZ_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.NETHER_STAR_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.OBSIDIAN_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.PAPER_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.PRISMARINE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.REDSTONE_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.SHEAR_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.SHULKER_SHELL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.SLIMEBALL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.SMOKING_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.SNOWBALL_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.TNT_ARROW.get(), TieredArrowEntityRenderer::new);
        event.registerEntityRenderer(ModEntityTypesNeoForge.WATER_BOTTLE_ARROW.get(), TieredArrowEntityRenderer::new);
    }
}
