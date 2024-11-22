package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.dispenser.ProjectileDispenseBehavior;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DispenserBlock;

import java.util.Map;
import java.util.function.Supplier;

public class ModDispenserBehaviorsNeoForge {

    public static Object2ObjectMap<Item, ProjectileDispenseBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap<>();

    public static void register() {

        Map<Item, ProjectileDispenseBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.AMETHYST_ARROW, ArrowTier.AMETHYST);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.BAMBOO_ARROW, ArrowTier.BAMBOO);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.BLAZE_ROD_ARROW, ArrowTier.BLAZE_ROD);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.BONE_ARROW, ArrowTier.BONE);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.CACTUS_ARROW, ArrowTier.CACTUS);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.COAL_ARROW, ArrowTier.COAL);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.COPPER_ARROW, ArrowTier.COPPER);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.DIAMOND_ARROW, ArrowTier.DIAMOND);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.DRAGON_BREATH_ARROW, ArrowTier.DRAGON_BREATH);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.DRIPSTONE_ARROW, ArrowTier.DRIPSTONE);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.ECHO_ARROW, ArrowTier.ECHO);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.EGG_ARROW, ArrowTier.EGG);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.EMERALD_ARROW, ArrowTier.EMERALD);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.ENDER_PEARL_ARROW, ArrowTier.ENDER_PEARL);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.FIREWORK_ARROW, ArrowTier.FIREWORK);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.FIRE_CHARGE_ARROW, ArrowTier.FIRE_CHARGE);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.FLINT_ARROW, ArrowTier.FLINT);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.FLINT_AND_STEEL_ARROW, ArrowTier.FLINT_AND_STEEL);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.GLOW_INK_SAC_ARROW, ArrowTier.GLOW_INK_SAC);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.GOLD_ARROW, ArrowTier.GOLD);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.ICE_ARROW, ArrowTier.ICE);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.INK_SAC_ARROW, ArrowTier.INK_SAC);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.IRON_ARROW, ArrowTier.IRON);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.LADDER_ARROW, ArrowTier.LADDER);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.LAPIS_ARROW, ArrowTier.LAPIS);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.LIGHTNING_ROD_ARROW, ArrowTier.LIGHTNING_ROD);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.NETHERITE_ARROW, ArrowTier.NETHERITE);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.NETHER_QUARTZ_ARROW, ArrowTier.NETHER_QUARTZ);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.NETHER_STAR_ARROW, ArrowTier.NETHER_STAR);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.OBSIDIAN_ARROW, ArrowTier.OBSIDIAN);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.PAPER_ARROW, ArrowTier.PAPER);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.PRISMARINE_ARROW, ArrowTier.PRISMARINE);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.REDSTONE_ARROW, ArrowTier.REDSTONE);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.SHEAR_ARROW, ArrowTier.SHEAR);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.SHULKER_SHELL_ARROW, ArrowTier.SHULKER_SHELL);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.SLIMEBALL_ARROW, ArrowTier.SLIMEBALL);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.SMOKING_ARROW, ArrowTier.SMOKING);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.SNOWBALL_ARROW, ArrowTier.SNOWBALL);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.TNT_ARROW, ArrowTier.TNT);
        ModDispenserBehaviorsNeoForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsNeoForge.WATER_BOTTLE_ARROW, ArrowTier.WATER_BOTTLE);

        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }

    private static void mappedArrow(Map<Item, ProjectileDispenseBehavior> map, Supplier<Item> item, ArrowTier tier) {
        map.put(item.get(), new ProjectileDispenseBehavior(item.get()));
    }
}
