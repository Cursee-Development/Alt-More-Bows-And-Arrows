package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredHolder;

public class ModBowItemsNeoForge {

    public static void register() {}

    public static final DeferredHolder<Item, Item> BOW_UPGRADE_TEMPLATE = RegistryNeoForge.registerItem("bow_upgrade_template", () -> new Item(new Item.Properties()));

    public static final DeferredHolder<Item, Item> OAK_BOW = RegistryNeoForge.registerItem("oak_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_OAK_BOW = RegistryNeoForge.registerItem("stripped_oak_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final DeferredHolder<Item, Item> DARK_OAK_BOW = RegistryNeoForge.registerItem("dark_oak_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_DARK_OAK_BOW = RegistryNeoForge.registerItem("stripped_dark_oak_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final DeferredHolder<Item, Item> SPRUCE_BOW = RegistryNeoForge.registerItem("spruce_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_SPRUCE_BOW = RegistryNeoForge.registerItem("stripped_spruce_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final DeferredHolder<Item, Item> BIRCH_BOW = RegistryNeoForge.registerItem("birch_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_BIRCH_BOW = RegistryNeoForge.registerItem("stripped_birch_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final DeferredHolder<Item, Item> JUNGLE_BOW = RegistryNeoForge.registerItem("jungle_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_JUNGLE_BOW = RegistryNeoForge.registerItem("stripped_jungle_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final DeferredHolder<Item, Item> ACACIA_BOW = RegistryNeoForge.registerItem("acacia_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_ACACIA_BOW = RegistryNeoForge.registerItem("stripped_acacia_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final DeferredHolder<Item, Item> MANGROVE_BOW = RegistryNeoForge.registerItem("mangrove_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_MANGROVE_BOW = RegistryNeoForge.registerItem("stripped_mangrove_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));
    public static final DeferredHolder<Item, Item> CHERRY_BOW = RegistryNeoForge.registerItem("cherry_bow", () -> new TieredBowItem(BowTier.WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_CHERRY_BOW = RegistryNeoForge.registerItem("stripped_cherry_bow", () -> new TieredBowItem(BowTier.STRIPPED_WOOD));

    public static final DeferredHolder<Item, Item> WARPED_BOW = RegistryNeoForge.registerItem("warped_bow", () -> new TieredBowItem(BowTier.NETHER_WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_WARPED_BOW = RegistryNeoForge.registerItem("stripped_warped_bow", () -> new TieredBowItem(BowTier.STRIPPED_NETHER_WOOD));
    public static final DeferredHolder<Item, Item> CRIMSON_BOW = RegistryNeoForge.registerItem("crimson_bow", () -> new TieredBowItem(BowTier.NETHER_WOOD));
    public static final DeferredHolder<Item, Item> STRIPPED_CRIMSON_BOW = RegistryNeoForge.registerItem("stripped_crimson_bow", () -> new TieredBowItem(BowTier.STRIPPED_NETHER_WOOD));

    public static final DeferredHolder<Item, Item> BAMBOO_BOW = RegistryNeoForge.registerItem("bamboo_bow", () -> new TieredBowItem(BowTier.BAMBOO));
    public static final DeferredHolder<Item, Item> STRIPPED_BAMBOO_BOW = RegistryNeoForge.registerItem("stripped_bamboo_bow", () -> new TieredBowItem(BowTier.STRIPPED_BAMBOO));

    public static final DeferredHolder<Item, Item> AMETHYST_BOW = RegistryNeoForge.registerItem("amethyst_bow", () -> new TieredBowItem(BowTier.AMETHYST));
    public static final DeferredHolder<Item, Item> BLAZE_ROD_BOW = RegistryNeoForge.registerItem("blaze_rod_bow", () -> new TieredBowItem(BowTier.BLAZE_ROD));
    public static final DeferredHolder<Item, Item> BONE_BOW = RegistryNeoForge.registerItem("bone_bow", () -> new TieredBowItem(BowTier.BONE));
    public static final DeferredHolder<Item, Item> COPPER_BOW = RegistryNeoForge.registerItem("copper_bow", () -> new TieredBowItem(BowTier.COPPER));
    public static final DeferredHolder<Item, Item> DIAMOND_BOW = RegistryNeoForge.registerItem("diamond_bow", () -> new TieredBowItem(BowTier.DIAMOND));
    public static final DeferredHolder<Item, Item> EMERALD_BOW = RegistryNeoForge.registerItem("emerald_bow", () -> new TieredBowItem(BowTier.EMERALD));
    public static final DeferredHolder<Item, Item> END_STONE_BOW = RegistryNeoForge.registerItem("end_stone_bow", () -> new TieredBowItem(BowTier.END_STONE));
    public static final DeferredHolder<Item, Item> GOLD_BOW = RegistryNeoForge.registerItem("gold_bow", () -> new TieredBowItem(BowTier.GOLD));
    public static final DeferredHolder<Item, Item> IRON_BOW = RegistryNeoForge.registerItem("iron_bow", () -> new TieredBowItem(BowTier.IRON));
    public static final DeferredHolder<Item, Item> LAPIS_BOW = RegistryNeoForge.registerItem("lapis_bow", () -> new TieredBowItem(BowTier.LAPIS));
    public static final DeferredHolder<Item, Item> LIGHTNING_ROD_BOW = RegistryNeoForge.registerItem("lightning_rod_bow", () -> new TieredBowItem(BowTier.LIGHTNING_ROD));
    public static final DeferredHolder<Item, Item> NETHERITE_BOW = RegistryNeoForge.registerItem("netherite_bow", () -> new TieredBowItem(BowTier.NETHERITE));
    public static final DeferredHolder<Item, Item> OBSIDIAN_BOW = RegistryNeoForge.registerItem("obsidian_bow", () -> new TieredBowItem(BowTier.OBSIDIAN));
    public static final DeferredHolder<Item, Item> PAPER_BOW = RegistryNeoForge.registerItem("paper_bow", () -> new TieredBowItem(BowTier.PAPER));
    public static final DeferredHolder<Item, Item> PRISMARINE_BOW = RegistryNeoForge.registerItem("prismarine_bow", () -> new TieredBowItem(BowTier.PRISMARINE));
}
