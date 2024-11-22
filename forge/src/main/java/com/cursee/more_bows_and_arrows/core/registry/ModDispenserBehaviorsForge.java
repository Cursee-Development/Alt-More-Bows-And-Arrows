package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.entity.TieredArrowEntity;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.ProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.function.Supplier;

public class ModDispenserBehaviorsForge {

    public static Object2ObjectMap<Item, ProjectileDispenseBehavior> DISPENSER_OBJECT_MAP = new Object2ObjectOpenHashMap<>();

    public static void register() {

        Map<Item, ProjectileDispenseBehavior> syncronizedDispenserMap = Object2ObjectMaps.synchronize(DISPENSER_OBJECT_MAP);

        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.AMETHYST_ARROW, ArrowTier.AMETHYST);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.BAMBOO_ARROW, ArrowTier.BAMBOO);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.BLAZE_ROD_ARROW, ArrowTier.BLAZE_ROD);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.BONE_ARROW, ArrowTier.BONE);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.CACTUS_ARROW, ArrowTier.CACTUS);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.COAL_ARROW, ArrowTier.COAL);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.COPPER_ARROW, ArrowTier.COPPER);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.DIAMOND_ARROW, ArrowTier.DIAMOND);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.DRAGON_BREATH_ARROW, ArrowTier.DRAGON_BREATH);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.DRIPSTONE_ARROW, ArrowTier.DRIPSTONE);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.ECHO_ARROW, ArrowTier.ECHO);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.EGG_ARROW, ArrowTier.EGG);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.EMERALD_ARROW, ArrowTier.EMERALD);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.ENDER_PEARL_ARROW, ArrowTier.ENDER_PEARL);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.FIREWORK_ARROW, ArrowTier.FIREWORK);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.FIRE_CHARGE_ARROW, ArrowTier.FIRE_CHARGE);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.FLINT_ARROW, ArrowTier.FLINT);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.FLINT_AND_STEEL_ARROW, ArrowTier.FLINT_AND_STEEL);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.GLOW_INK_SAC_ARROW, ArrowTier.GLOW_INK_SAC);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.GOLD_ARROW, ArrowTier.GOLD);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.ICE_ARROW, ArrowTier.ICE);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.INK_SAC_ARROW, ArrowTier.INK_SAC);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.IRON_ARROW, ArrowTier.IRON);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.LADDER_ARROW, ArrowTier.LADDER);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.LAPIS_ARROW, ArrowTier.LAPIS);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.LIGHTNING_ROD_ARROW, ArrowTier.LIGHTNING_ROD);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.NETHERITE_ARROW, ArrowTier.NETHERITE);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.NETHER_QUARTZ_ARROW, ArrowTier.NETHER_QUARTZ);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.NETHER_STAR_ARROW, ArrowTier.NETHER_STAR);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.OBSIDIAN_ARROW, ArrowTier.OBSIDIAN);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.PAPER_ARROW, ArrowTier.PAPER);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.PRISMARINE_ARROW, ArrowTier.PRISMARINE);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.REDSTONE_ARROW, ArrowTier.REDSTONE);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.SHEAR_ARROW, ArrowTier.SHEAR);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.SHULKER_SHELL_ARROW, ArrowTier.SHULKER_SHELL);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.SLIMEBALL_ARROW, ArrowTier.SLIMEBALL);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.SMOKING_ARROW, ArrowTier.SMOKING);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.SNOWBALL_ARROW, ArrowTier.SNOWBALL);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.TNT_ARROW, ArrowTier.TNT);
        ModDispenserBehaviorsForge.mappedArrow(DISPENSER_OBJECT_MAP, ModArrowItemsForge.WATER_BOTTLE_ARROW, ArrowTier.WATER_BOTTLE);

        DispenserBlock.DISPENSER_REGISTRY.putAll(syncronizedDispenserMap);
    }

    private static void mappedArrow(Map<Item, ProjectileDispenseBehavior> map, Supplier<Item> item, ArrowTier tier) {
        map.put(item.get(), new ProjectileDispenseBehavior(item.get()));
    }
}
