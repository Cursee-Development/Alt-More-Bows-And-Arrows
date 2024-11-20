package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TieredArrowItem;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModArrowItemsForge {

    public static void register() {}

    public static final RegistryObject<Item> ARROW_UPGRADE_TEMPLATE = RegistryForge.registerItem("arrow_upgrade_template", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST_ARROW = RegistryForge.registerItem("amethyst_arrow", () -> new TieredArrowItem(ArrowTier.AMETHYST));
    public static final RegistryObject<Item> BAMBOO_ARROW = RegistryForge.registerItem("bamboo_arrow", () -> new TieredArrowItem(ArrowTier.BAMBOO));
    public static final RegistryObject<Item> BLAZE_ROD_ARROW = RegistryForge.registerItem("blaze_rod_arrow", () -> new TieredArrowItem(ArrowTier.BLAZE_ROD));
    public static final RegistryObject<Item> BONE_ARROW = RegistryForge.registerItem("bone_arrow", () -> new TieredArrowItem(ArrowTier.BONE));
    public static final RegistryObject<Item> CACTUS_ARROW = RegistryForge.registerItem("cactus_arrow", () -> new TieredArrowItem(ArrowTier.CACTUS));
    public static final RegistryObject<Item> COAL_ARROW = RegistryForge.registerItem("coal_arrow", () -> new TieredArrowItem(ArrowTier.COAL));
    public static final RegistryObject<Item> COPPER_ARROW = RegistryForge.registerItem("copper_arrow", () -> new TieredArrowItem(ArrowTier.COPPER));
    public static final RegistryObject<Item> DIAMOND_ARROW = RegistryForge.registerItem("diamond_arrow", () -> new TieredArrowItem(ArrowTier.DIAMOND));
    public static final RegistryObject<Item> DRAGON_BREATH_ARROW = RegistryForge.registerItem("dragon_breath_arrow", () -> new TieredArrowItem(ArrowTier.DRAGON_BREATH));
    public static final RegistryObject<Item> DRIPSTONE_ARROW = RegistryForge.registerItem("dripstone_arrow", () -> new TieredArrowItem(ArrowTier.DRIPSTONE));
    public static final RegistryObject<Item> ECHO_ARROW = RegistryForge.registerItem("echo_arrow", () -> new TieredArrowItem(ArrowTier.ECHO));
    public static final RegistryObject<Item> EGG_ARROW = RegistryForge.registerItem("egg_arrow", () -> new TieredArrowItem(ArrowTier.EGG));
    public static final RegistryObject<Item> EMERALD_ARROW = RegistryForge.registerItem("emerald_arrow", () -> new TieredArrowItem(ArrowTier.EMERALD));
    public static final RegistryObject<Item> ENDER_PEARL_ARROW = RegistryForge.registerItem("ender_pearl_arrow", () -> new TieredArrowItem(ArrowTier.ENDER_PEARL));
    public static final RegistryObject<Item> FIREWORK_ARROW = RegistryForge.registerItem("firework_arrow", () -> new TieredArrowItem(ArrowTier.FIREWORK));
    public static final RegistryObject<Item> FIRE_CHARGE_ARROW = RegistryForge.registerItem("fire_charge_arrow", () -> new TieredArrowItem(ArrowTier.FIRE_CHARGE));
    public static final RegistryObject<Item> FLINT_ARROW = RegistryForge.registerItem("flint_arrow", () -> new TieredArrowItem(ArrowTier.FLINT));
    public static final RegistryObject<Item> FLINT_AND_STEEL_ARROW = RegistryForge.registerItem("flint_and_steel_arrow", () -> new TieredArrowItem(ArrowTier.FLINT_AND_STEEL));
    public static final RegistryObject<Item> GLOW_INK_SAC_ARROW = RegistryForge.registerItem("glow_ink_sac_arrow", () -> new TieredArrowItem(ArrowTier.GLOW_INK_SAC));
    public static final RegistryObject<Item> GOLD_ARROW = RegistryForge.registerItem("gold_arrow", () -> new TieredArrowItem(ArrowTier.GOLD));
    public static final RegistryObject<Item> ICE_ARROW = RegistryForge.registerItem("ice_arrow", () -> new TieredArrowItem(ArrowTier.ICE));
    public static final RegistryObject<Item> INK_SAC_ARROW = RegistryForge.registerItem("ink_sac_arrow", () -> new TieredArrowItem(ArrowTier.INK_SAC));
    public static final RegistryObject<Item> IRON_ARROW = RegistryForge.registerItem("iron_arrow", () -> new TieredArrowItem(ArrowTier.IRON));
    public static final RegistryObject<Item> LADDER_ARROW = RegistryForge.registerItem("ladder_arrow", () -> new TieredArrowItem(ArrowTier.LADDER));
    public static final RegistryObject<Item> LAPIS_ARROW = RegistryForge.registerItem("lapis_arrow", () -> new TieredArrowItem(ArrowTier.LAPIS));
    public static final RegistryObject<Item> LIGHTNING_ROD_ARROW = RegistryForge.registerItem("lightning_rod_arrow", () -> new TieredArrowItem(ArrowTier.LIGHTNING_ROD));
    public static final RegistryObject<Item> NETHERITE_ARROW = RegistryForge.registerItem("netherite_arrow", () -> new TieredArrowItem(ArrowTier.NETHERITE));
    public static final RegistryObject<Item> NETHER_QUARTZ_ARROW = RegistryForge.registerItem("nether_quartz_arrow", () -> new TieredArrowItem(ArrowTier.NETHER_QUARTZ));
    public static final RegistryObject<Item> NETHER_STAR_ARROW = RegistryForge.registerItem("nether_star_arrow", () -> new TieredArrowItem(ArrowTier.NETHER_STAR));
    public static final RegistryObject<Item> OBSIDIAN_ARROW = RegistryForge.registerItem("obsidian_arrow", () -> new TieredArrowItem(ArrowTier.OBSIDIAN));
    public static final RegistryObject<Item> PAPER_ARROW = RegistryForge.registerItem("paper_arrow", () -> new TieredArrowItem(ArrowTier.PAPER));
    public static final RegistryObject<Item> PRISMARINE_ARROW = RegistryForge.registerItem("prismarine_arrow", () -> new TieredArrowItem(ArrowTier.PRISMARINE));
    public static final RegistryObject<Item> REDSTONE_ARROW = RegistryForge.registerItem("redstone_arrow", () -> new TieredArrowItem(ArrowTier.REDSTONE));
    public static final RegistryObject<Item> SHEAR_ARROW = RegistryForge.registerItem("shear_arrow", () -> new TieredArrowItem(ArrowTier.SHEAR));
    public static final RegistryObject<Item> SHULKER_SHELL_ARROW = RegistryForge.registerItem("shulker_shell_arrow", () -> new TieredArrowItem(ArrowTier.SHULKER_SHELL));
    public static final RegistryObject<Item> SLIMEBALL_ARROW = RegistryForge.registerItem("slimeball_arrow", () -> new TieredArrowItem(ArrowTier.SLIMEBALL));
    public static final RegistryObject<Item> SMOKING_ARROW = RegistryForge.registerItem("smoking_arrow", () -> new TieredArrowItem(ArrowTier.SMOKING));
    public static final RegistryObject<Item> SNOWBALL_ARROW = RegistryForge.registerItem("snowball_arrow", () -> new TieredArrowItem(ArrowTier.SNOWBALL));
    public static final RegistryObject<Item> TNT_ARROW = RegistryForge.registerItem("tnt_arrow", () -> new TieredArrowItem(ArrowTier.TNT));
    public static final RegistryObject<Item> WATER_BOTTLE_ARROW = RegistryForge.registerItem("water_bottle_arrow", () -> new TieredArrowItem(ArrowTier.WATER_BOTTLE));
}
