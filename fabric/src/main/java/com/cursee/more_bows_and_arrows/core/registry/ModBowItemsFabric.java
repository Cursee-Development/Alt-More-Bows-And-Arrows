package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.world.item.Item;

public class ModBowItemsFabric {

    public static void register() {}

    public static final Item AMETHYST_BOW = RegistryFabric.registerItem("amethyst_bow", () -> new TieredBowItem(BowTier.AMETHYST));
    public static final Item BAMBOO_BOW = RegistryFabric.registerItem("bamboo_bow", () -> new TieredBowItem(BowTier.BAMBOO));
    public static final Item BLAZE_ROD_BOW = RegistryFabric.registerItem("blaze_rod_bow", () -> new TieredBowItem(BowTier.BLAZE_ROD));
    public static final Item BONE_BOW = RegistryFabric.registerItem("bone_bow", () -> new TieredBowItem(BowTier.BONE));
    public static final Item COPPER_BOW = RegistryFabric.registerItem("copper_bow", () -> new TieredBowItem(BowTier.COPPER));
    public static final Item DIAMOND_BOW = RegistryFabric.registerItem("diamond_bow", () -> new TieredBowItem(BowTier.DIAMOND));
    public static final Item EMERALD_BOW = RegistryFabric.registerItem("emerald_bow", () -> new TieredBowItem(BowTier.EMERALD));
    public static final Item END_STONE_BOW = RegistryFabric.registerItem("end_stone_bow", () -> new TieredBowItem(BowTier.END_STONE));
    public static final Item GOLD_BOW = RegistryFabric.registerItem("gold_bow", () -> new TieredBowItem(BowTier.GOLD));
    public static final Item IRON_BOW = RegistryFabric.registerItem("iron_bow", () -> new TieredBowItem(BowTier.IRON));
    public static final Item LAPIS_BOW = RegistryFabric.registerItem("lapis_bow", () -> new TieredBowItem(BowTier.LAPIS));
    public static final Item LIGHTNING_ROD_BOW = RegistryFabric.registerItem("lightning_rod_bow", () -> new TieredBowItem(BowTier.LIGHTNING_ROD));
    public static final Item NETHERITE_BOW = RegistryFabric.registerItem("netherite_bow", () -> new TieredBowItem(BowTier.NETHERITE));
    public static final Item OBSIDIAN_BOW = RegistryFabric.registerItem("obsidian_bow", () -> new TieredBowItem(BowTier.OBSIDIAN));
    public static final Item PAPER_BOW = RegistryFabric.registerItem("paper_bow", () -> new TieredBowItem(BowTier.PAPER));
    public static final Item PRISMARINE_BOW = RegistryFabric.registerItem("prismarine_bow", () -> new TieredBowItem(BowTier.PRISMARINE));
}
