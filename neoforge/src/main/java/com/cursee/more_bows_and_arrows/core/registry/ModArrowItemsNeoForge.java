package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TieredArrowItem;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModArrowItemsNeoForge {

    public static void register() {}

    public static final DeferredHolder<Item, Item> ARROW_UPGRADE_TEMPLATE = RegistryNeoForge.registerItem("arrow_upgrade_template", () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> AMETHYST_ARROW = RegistryNeoForge.registerItem("amethyst_arrow", () -> new TieredArrowItem(ArrowTier.AMETHYST));
    public static final DeferredHolder<Item, Item> BAMBOO_ARROW = RegistryNeoForge.registerItem("bamboo_arrow", () -> new TieredArrowItem(ArrowTier.BAMBOO));
    public static final DeferredHolder<Item, Item> BLAZE_ROD_ARROW = RegistryNeoForge.registerItem("blaze_rod_arrow", () -> new TieredArrowItem(ArrowTier.BLAZE_ROD));
    public static final DeferredHolder<Item, Item> BONE_ARROW = RegistryNeoForge.registerItem("bone_arrow", () -> new TieredArrowItem(ArrowTier.BONE));
    public static final DeferredHolder<Item, Item> CACTUS_ARROW = RegistryNeoForge.registerItem("cactus_arrow", () -> new TieredArrowItem(ArrowTier.CACTUS));
    public static final DeferredHolder<Item, Item> COAL_ARROW = RegistryNeoForge.registerItem("coal_arrow", () -> new TieredArrowItem(ArrowTier.COAL));
    public static final DeferredHolder<Item, Item> COPPER_ARROW = RegistryNeoForge.registerItem("copper_arrow", () -> new TieredArrowItem(ArrowTier.COPPER));
    public static final DeferredHolder<Item, Item> DIAMOND_ARROW = RegistryNeoForge.registerItem("diamond_arrow", () -> new TieredArrowItem(ArrowTier.DIAMOND));
    public static final DeferredHolder<Item, Item> DRAGON_BREATH_ARROW = RegistryNeoForge.registerItem("dragon_breath_arrow", () -> new TieredArrowItem(ArrowTier.DRAGON_BREATH));
    public static final DeferredHolder<Item, Item> DRIPSTONE_ARROW = RegistryNeoForge.registerItem("dripstone_arrow", () -> new TieredArrowItem(ArrowTier.DRIPSTONE));
    public static final DeferredHolder<Item, Item> ECHO_ARROW = RegistryNeoForge.registerItem("echo_arrow", () -> new TieredArrowItem(ArrowTier.ECHO));
    public static final DeferredHolder<Item, Item> EGG_ARROW = RegistryNeoForge.registerItem("egg_arrow", () -> new TieredArrowItem(ArrowTier.EGG));
    public static final DeferredHolder<Item, Item> EMERALD_ARROW = RegistryNeoForge.registerItem("emerald_arrow", () -> new TieredArrowItem(ArrowTier.EMERALD));
    public static final DeferredHolder<Item, Item> ENDER_PEARL_ARROW = RegistryNeoForge.registerItem("ender_pearl_arrow", () -> new TieredArrowItem(ArrowTier.ENDER_PEARL));
    public static final DeferredHolder<Item, Item> FIREWORK_ARROW = RegistryNeoForge.registerItem("firework_arrow", () -> new TieredArrowItem(ArrowTier.FIREWORK));
    public static final DeferredHolder<Item, Item> FIRE_CHARGE_ARROW = RegistryNeoForge.registerItem("fire_charge_arrow", () -> new TieredArrowItem(ArrowTier.FIRE_CHARGE));
    public static final DeferredHolder<Item, Item> FLINT_ARROW = RegistryNeoForge.registerItem("flint_arrow", () -> new TieredArrowItem(ArrowTier.FLINT));
    public static final DeferredHolder<Item, Item> FLINT_AND_STEEL_ARROW = RegistryNeoForge.registerItem("flint_and_steel_arrow", () -> new TieredArrowItem(ArrowTier.FLINT_AND_STEEL));
    public static final DeferredHolder<Item, Item> GLOW_INK_SAC_ARROW = RegistryNeoForge.registerItem("glow_ink_sac_arrow", () -> new TieredArrowItem(ArrowTier.GLOW_INK_SAC));
    public static final DeferredHolder<Item, Item> GOLD_ARROW = RegistryNeoForge.registerItem("gold_arrow", () -> new TieredArrowItem(ArrowTier.GOLD));
    public static final DeferredHolder<Item, Item> ICE_ARROW = RegistryNeoForge.registerItem("ice_arrow", () -> new TieredArrowItem(ArrowTier.ICE));
    public static final DeferredHolder<Item, Item> INK_SAC_ARROW = RegistryNeoForge.registerItem("ink_sac_arrow", () -> new TieredArrowItem(ArrowTier.INK_SAC));
    public static final DeferredHolder<Item, Item> IRON_ARROW = RegistryNeoForge.registerItem("iron_arrow", () -> new TieredArrowItem(ArrowTier.IRON));
    public static final DeferredHolder<Item, Item> LADDER_ARROW = RegistryNeoForge.registerItem("ladder_arrow", () -> new TieredArrowItem(ArrowTier.LADDER));
    public static final DeferredHolder<Item, Item> LAPIS_ARROW = RegistryNeoForge.registerItem("lapis_arrow", () -> new TieredArrowItem(ArrowTier.LAPIS));
    public static final DeferredHolder<Item, Item> LIGHTNING_ROD_ARROW = RegistryNeoForge.registerItem("lightning_rod_arrow", () -> new TieredArrowItem(ArrowTier.LIGHTNING_ROD));
    public static final DeferredHolder<Item, Item> NETHERITE_ARROW = RegistryNeoForge.registerItem("netherite_arrow", () -> new TieredArrowItem(ArrowTier.NETHERITE));
    public static final DeferredHolder<Item, Item> NETHER_QUARTZ_ARROW = RegistryNeoForge.registerItem("nether_quartz_arrow", () -> new TieredArrowItem(ArrowTier.NETHER_QUARTZ));
    public static final DeferredHolder<Item, Item> NETHER_STAR_ARROW = RegistryNeoForge.registerItem("nether_star_arrow", () -> new TieredArrowItem(ArrowTier.NETHER_STAR));
    public static final DeferredHolder<Item, Item> OBSIDIAN_ARROW = RegistryNeoForge.registerItem("obsidian_arrow", () -> new TieredArrowItem(ArrowTier.OBSIDIAN));
    public static final DeferredHolder<Item, Item> PAPER_ARROW = RegistryNeoForge.registerItem("paper_arrow", () -> new TieredArrowItem(ArrowTier.PAPER));
    public static final DeferredHolder<Item, Item> PRISMARINE_ARROW = RegistryNeoForge.registerItem("prismarine_arrow", () -> new TieredArrowItem(ArrowTier.PRISMARINE));
    public static final DeferredHolder<Item, Item> REDSTONE_ARROW = RegistryNeoForge.registerItem("redstone_arrow", () -> new TieredArrowItem(ArrowTier.REDSTONE));
    public static final DeferredHolder<Item, Item> SHEAR_ARROW = RegistryNeoForge.registerItem("shear_arrow", () -> new TieredArrowItem(ArrowTier.SHEAR));
    public static final DeferredHolder<Item, Item> SHULKER_SHELL_ARROW = RegistryNeoForge.registerItem("shulker_shell_arrow", () -> new TieredArrowItem(ArrowTier.SHULKER_SHELL));
    public static final DeferredHolder<Item, Item> SLIMEBALL_ARROW = RegistryNeoForge.registerItem("slimeball_arrow", () -> new TieredArrowItem(ArrowTier.SLIMEBALL));
    public static final DeferredHolder<Item, Item> SMOKING_ARROW = RegistryNeoForge.registerItem("smoking_arrow", () -> new TieredArrowItem(ArrowTier.SMOKING));
    public static final DeferredHolder<Item, Item> SNOWBALL_ARROW = RegistryNeoForge.registerItem("snowball_arrow", () -> new TieredArrowItem(ArrowTier.SNOWBALL));
    public static final DeferredHolder<Item, Item> TNT_ARROW = RegistryNeoForge.registerItem("tnt_arrow", () -> new TieredArrowItem(ArrowTier.TNT));
    public static final DeferredHolder<Item, Item> WATER_BOTTLE_ARROW = RegistryNeoForge.registerItem("water_bottle_arrow", () -> new TieredArrowItem(ArrowTier.WATER_BOTTLE));
}
