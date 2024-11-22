package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TieredArrowItem;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import net.minecraft.world.item.Item;

public class ModArrowItemsFabric {

    public static void register() {}

    public static final Item ARROW_UPGRADE_TEMPLATE = RegistryFabric.registerItem("arrow_upgrade_template", () -> new Item(new Item.Properties()));

    public static final Item AMETHYST_ARROW = RegistryFabric.registerItem("amethyst_arrow", () -> new TieredArrowItem(ArrowTier.AMETHYST));
    public static final Item BAMBOO_ARROW = RegistryFabric.registerItem("bamboo_arrow", () -> new TieredArrowItem(ArrowTier.BAMBOO));
    public static final Item BLAZE_ROD_ARROW = RegistryFabric.registerItem("blaze_rod_arrow", () -> new TieredArrowItem(ArrowTier.BLAZE_ROD));
    public static final Item BONE_ARROW = RegistryFabric.registerItem("bone_arrow", () -> new TieredArrowItem(ArrowTier.BONE));
    public static final Item CACTUS_ARROW = RegistryFabric.registerItem("cactus_arrow", () -> new TieredArrowItem(ArrowTier.CACTUS));
    public static final Item COAL_ARROW = RegistryFabric.registerItem("coal_arrow", () -> new TieredArrowItem(ArrowTier.COAL));
    public static final Item COPPER_ARROW = RegistryFabric.registerItem("copper_arrow", () -> new TieredArrowItem(ArrowTier.COPPER));
    public static final Item DIAMOND_ARROW = RegistryFabric.registerItem("diamond_arrow", () -> new TieredArrowItem(ArrowTier.DIAMOND));
    public static final Item DRAGON_BREATH_ARROW = RegistryFabric.registerItem("dragon_breath_arrow", () -> new TieredArrowItem(ArrowTier.DRAGON_BREATH));
    public static final Item DRIPSTONE_ARROW = RegistryFabric.registerItem("dripstone_arrow", () -> new TieredArrowItem(ArrowTier.DRIPSTONE));
    public static final Item ECHO_ARROW = RegistryFabric.registerItem("echo_arrow", () -> new TieredArrowItem(ArrowTier.ECHO));
    public static final Item EGG_ARROW = RegistryFabric.registerItem("egg_arrow", () -> new TieredArrowItem(ArrowTier.EGG));
    public static final Item EMERALD_ARROW = RegistryFabric.registerItem("emerald_arrow", () -> new TieredArrowItem(ArrowTier.EMERALD));
    public static final Item ENDER_PEARL_ARROW = RegistryFabric.registerItem("ender_pearl_arrow", () -> new TieredArrowItem(ArrowTier.ENDER_PEARL));
    public static final Item FIREWORK_ARROW = RegistryFabric.registerItem("firework_arrow", () -> new TieredArrowItem(ArrowTier.FIREWORK));
    public static final Item FIRE_CHARGE_ARROW = RegistryFabric.registerItem("fire_charge_arrow", () -> new TieredArrowItem(ArrowTier.FIRE_CHARGE));
    public static final Item FLINT_ARROW = RegistryFabric.registerItem("flint_arrow", () -> new TieredArrowItem(ArrowTier.FLINT));
    public static final Item FLINT_AND_STEEL_ARROW = RegistryFabric.registerItem("flint_and_steel_arrow", () -> new TieredArrowItem(ArrowTier.FLINT_AND_STEEL));
    public static final Item GLOW_INK_SAC_ARROW = RegistryFabric.registerItem("glow_ink_sac_arrow", () -> new TieredArrowItem(ArrowTier.GLOW_INK_SAC));
    public static final Item GOLD_ARROW = RegistryFabric.registerItem("gold_arrow", () -> new TieredArrowItem(ArrowTier.GOLD));
    public static final Item ICE_ARROW = RegistryFabric.registerItem("ice_arrow", () -> new TieredArrowItem(ArrowTier.ICE));
    public static final Item INK_SAC_ARROW = RegistryFabric.registerItem("ink_sac_arrow", () -> new TieredArrowItem(ArrowTier.INK_SAC));
    public static final Item IRON_ARROW = RegistryFabric.registerItem("iron_arrow", () -> new TieredArrowItem(ArrowTier.IRON));
    public static final Item LADDER_ARROW = RegistryFabric.registerItem("ladder_arrow", () -> new TieredArrowItem(ArrowTier.LADDER));
    public static final Item LAPIS_ARROW = RegistryFabric.registerItem("lapis_arrow", () -> new TieredArrowItem(ArrowTier.LAPIS));
    public static final Item LIGHTNING_ROD_ARROW = RegistryFabric.registerItem("lightning_rod_arrow", () -> new TieredArrowItem(ArrowTier.LIGHTNING_ROD));
    public static final Item NETHERITE_ARROW = RegistryFabric.registerItem("netherite_arrow", () -> new TieredArrowItem(ArrowTier.NETHERITE));
    public static final Item NETHER_QUARTZ_ARROW = RegistryFabric.registerItem("nether_quartz_arrow", () -> new TieredArrowItem(ArrowTier.NETHER_QUARTZ));
    public static final Item NETHER_STAR_ARROW = RegistryFabric.registerItem("nether_star_arrow", () -> new TieredArrowItem(ArrowTier.NETHER_STAR));
    public static final Item OBSIDIAN_ARROW = RegistryFabric.registerItem("obsidian_arrow", () -> new TieredArrowItem(ArrowTier.OBSIDIAN));
    public static final Item PAPER_ARROW = RegistryFabric.registerItem("paper_arrow", () -> new TieredArrowItem(ArrowTier.PAPER));
    public static final Item PRISMARINE_ARROW = RegistryFabric.registerItem("prismarine_arrow", () -> new TieredArrowItem(ArrowTier.PRISMARINE));
    public static final Item REDSTONE_ARROW = RegistryFabric.registerItem("redstone_arrow", () -> new TieredArrowItem(ArrowTier.REDSTONE));
    public static final Item SHEAR_ARROW = RegistryFabric.registerItem("shear_arrow", () -> new TieredArrowItem(ArrowTier.SHEAR));
    public static final Item SHULKER_SHELL_ARROW = RegistryFabric.registerItem("shulker_shell_arrow", () -> new TieredArrowItem(ArrowTier.SHULKER_SHELL));
    public static final Item SLIMEBALL_ARROW = RegistryFabric.registerItem("slimeball_arrow", () -> new TieredArrowItem(ArrowTier.SLIMEBALL));
    public static final Item SMOKING_ARROW = RegistryFabric.registerItem("smoking_arrow", () -> new TieredArrowItem(ArrowTier.SMOKING));
    public static final Item SNOWBALL_ARROW = RegistryFabric.registerItem("snowball_arrow", () -> new TieredArrowItem(ArrowTier.SNOWBALL));
    public static final Item TNT_ARROW = RegistryFabric.registerItem("tnt_arrow", () -> new TieredArrowItem(ArrowTier.TNT));
    public static final Item WATER_BOTTLE_ARROW = RegistryFabric.registerItem("water_bottle_arrow", () -> new TieredArrowItem(ArrowTier.WATER_BOTTLE));
}
