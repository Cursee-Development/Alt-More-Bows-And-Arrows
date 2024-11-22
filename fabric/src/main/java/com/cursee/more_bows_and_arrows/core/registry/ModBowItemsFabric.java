package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.world.item.Item;

public class ModBowItemsFabric {

    public static void register() {}

    public static final Item BOW_UPGRADE_TEMPLATE = RegistryFabric.registerItem("bow_upgrade_template", () -> new Item(new Item.Properties()));

    public static final Item OAK_BOW = RegistryFabric.registerItem("oak_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_OAK_BOW = RegistryFabric.registerItem("stripped_oak_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item DARK_OAK_BOW = RegistryFabric.registerItem("dark_oak_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_DARK_OAK_BOW = RegistryFabric.registerItem("stripped_dark_oak_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item SPRUCE_BOW = RegistryFabric.registerItem("spruce_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_SPRUCE_BOW = RegistryFabric.registerItem("stripped_spruce_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item BIRCH_BOW = RegistryFabric.registerItem("birch_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_BIRCH_BOW = RegistryFabric.registerItem("stripped_birch_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item JUNGLE_BOW = RegistryFabric.registerItem("jungle_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_JUNGLE_BOW = RegistryFabric.registerItem("stripped_jungle_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item ACACIA_BOW = RegistryFabric.registerItem("acacia_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_ACACIA_BOW = RegistryFabric.registerItem("stripped_acacia_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item MANGROVE_BOW = RegistryFabric.registerItem("mangrove_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_MANGROVE_BOW = RegistryFabric.registerItem("stripped_mangrove_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item CHERRY_BOW = RegistryFabric.registerItem("cherry_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_CHERRY_BOW = RegistryFabric.registerItem("stripped_cherry_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item BAMBOO_BOW = RegistryFabric.registerItem("bamboo_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final Item STRIPPED_BAMBOO_BOW = RegistryFabric.registerItem("stripped_bamboo_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final Item WARPED_BOW = RegistryFabric.registerItem("warped_bow", () -> new TieredBowItem(BowTier.NETHER_WOOD));
    public static final Item STRIPPED_WARPED_BOW = RegistryFabric.registerItem("stripped_warped_bow", () -> new TieredBowItem(BowTier.STRIPPED_NETHER_WOOD));
    public static final Item CRIMSON_BOW = RegistryFabric.registerItem("crimson_bow", () -> new TieredBowItem(BowTier.NETHER_WOOD));
    public static final Item STRIPPED_CRIMSON_BOW = RegistryFabric.registerItem("stripped_crimson_bow", () -> new TieredBowItem(BowTier.STRIPPED_NETHER_WOOD));
    public static final Item AMETHYST_BOW = RegistryFabric.registerItem("amethyst_bow", () -> new TieredBowItem(BowTier.AMETHYST));
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
