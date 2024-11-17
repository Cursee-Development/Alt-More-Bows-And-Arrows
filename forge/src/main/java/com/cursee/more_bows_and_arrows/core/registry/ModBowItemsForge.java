package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModBowItemsForge {

    public static void register() {}

    public static final RegistryObject<Item> AMETHYST_BOW = RegistryForge.registerItem("amethyst_bow", () -> new TieredBowItem(BowTier.AMETHYST));
    public static final RegistryObject<Item> BAMBOO_BOW = RegistryForge.registerItem("bamboo_bow", () -> new TieredBowItem(BowTier.BAMBOO));
    public static final RegistryObject<Item> BLAZE_ROD_BOW = RegistryForge.registerItem("blaze_rod_bow", () -> new TieredBowItem(BowTier.BLAZE_ROD));
    public static final RegistryObject<Item> BONE_BOW = RegistryForge.registerItem("bone_bow", () -> new TieredBowItem(BowTier.BONE));
    public static final RegistryObject<Item> COPPER_BOW = RegistryForge.registerItem("copper_bow", () -> new TieredBowItem(BowTier.COPPER));
    public static final RegistryObject<Item> DIAMOND_BOW = RegistryForge.registerItem("diamond_bow", () -> new TieredBowItem(BowTier.DIAMOND));
    public static final RegistryObject<Item> EMERALD_BOW = RegistryForge.registerItem("emerald_bow", () -> new TieredBowItem(BowTier.EMERALD));
    public static final RegistryObject<Item> END_STONE_BOW = RegistryForge.registerItem("end_stone_bow", () -> new TieredBowItem(BowTier.END_STONE));
    public static final RegistryObject<Item> GOLD_BOW = RegistryForge.registerItem("gold_bow", () -> new TieredBowItem(BowTier.GOLD));
    public static final RegistryObject<Item> IRON_BOW = RegistryForge.registerItem("iron_bow", () -> new TieredBowItem(BowTier.IRON));
    public static final RegistryObject<Item> LAPIS_BOW = RegistryForge.registerItem("lapis_bow", () -> new TieredBowItem(BowTier.LAPIS));
    public static final RegistryObject<Item> LIGHTNING_ROD_BOW = RegistryForge.registerItem("lightning_rod_bow", () -> new TieredBowItem(BowTier.LIGHTNING_ROD));
    public static final RegistryObject<Item> NETHERITE_BOW = RegistryForge.registerItem("netherite_bow", () -> new TieredBowItem(BowTier.NETHERITE));
    public static final RegistryObject<Item> OBSIDIAN_BOW = RegistryForge.registerItem("obsidian_bow", () -> new TieredBowItem(BowTier.OBSIDIAN));
    public static final RegistryObject<Item> PAPER_BOW = RegistryForge.registerItem("paper_bow", () -> new TieredBowItem(BowTier.PAPER));
    public static final RegistryObject<Item> PRISMARINE_BOW = RegistryForge.registerItem("prismarine_bow", () -> new TieredBowItem(BowTier.PRISMARINE));
}
