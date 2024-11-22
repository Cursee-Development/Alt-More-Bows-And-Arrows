package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.RegistryObject;

public class ModBowItemsForge {

    public static void register() {}

    public static final RegistryObject<Item> BOW_UPGRADE_TEMPLATE = RegistryForge.registerItem("bow_upgrade_template", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> OAK_BOW = RegistryForge.registerItem("oak_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final RegistryObject<Item> STRIPPED_OAK_BOW = RegistryForge.registerItem("stripped_oak_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final RegistryObject<Item> DARK_OAK_BOW = RegistryForge.registerItem("dark_oak_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final RegistryObject<Item> STRIPPED_DARK_OAK_BOW = RegistryForge.registerItem("stripped_dark_oak_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final RegistryObject<Item> SPRUCE_BOW = RegistryForge.registerItem("spruce_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final RegistryObject<Item> STRIPPED_SPRUCE_BOW = RegistryForge.registerItem("stripped_spruce_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final RegistryObject<Item> BIRCH_BOW = RegistryForge.registerItem("birch_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final RegistryObject<Item> STRIPPED_BIRCH_BOW = RegistryForge.registerItem("stripped_birch_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final RegistryObject<Item> JUNGLE_BOW = RegistryForge.registerItem("jungle_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final RegistryObject<Item> STRIPPED_JUNGLE_BOW = RegistryForge.registerItem("stripped_jungle_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final RegistryObject<Item> ACACIA_BOW = RegistryForge.registerItem("acacia_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final RegistryObject<Item> STRIPPED_ACACIA_BOW = RegistryForge.registerItem("stripped_acacia_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final RegistryObject<Item> MANGROVE_BOW = RegistryForge.registerItem("mangrove_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final RegistryObject<Item> STRIPPED_MANGROVE_BOW = RegistryForge.registerItem("stripped_mangrove_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final RegistryObject<Item> CHERRY_BOW = RegistryForge.registerItem("cherry_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final RegistryObject<Item> STRIPPED_CHERRY_BOW = RegistryForge.registerItem("stripped_cherry_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));

    public static final RegistryObject<Item> WARPED_BOW = RegistryForge.registerItem("warped_bow", () -> new TieredBowItem(BowTier.NETHER_WOOD));
    public static final RegistryObject<Item> STRIPPED_WARPED_BOW = RegistryForge.registerItem("stripped_warped_bow", () -> new TieredBowItem(BowTier.STRIPPED_NETHER_WOOD));
    public static final RegistryObject<Item> CRIMSON_BOW = RegistryForge.registerItem("crimson_bow", () -> new TieredBowItem(BowTier.NETHER_WOOD));
    public static final RegistryObject<Item> STRIPPED_CRIMSON_BOW = RegistryForge.registerItem("stripped_crimson_bow", () -> new TieredBowItem(BowTier.STRIPPED_NETHER_WOOD));

    public static final RegistryObject<Item> BAMBOO_BOW = RegistryForge.registerItem("bamboo_bow", () -> new TieredBowItem(BowTier.BAMBOO));
    public static final RegistryObject<Item> STRIPPED_BAMBOO_BOW = RegistryForge.registerItem("stripped_bamboo_bow", () -> new TieredBowItem(BowTier.STRIPPED_BAMBOO));

    public static final RegistryObject<Item> AMETHYST_BOW = RegistryForge.registerItem("amethyst_bow", () -> new TieredBowItem(BowTier.AMETHYST));
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
