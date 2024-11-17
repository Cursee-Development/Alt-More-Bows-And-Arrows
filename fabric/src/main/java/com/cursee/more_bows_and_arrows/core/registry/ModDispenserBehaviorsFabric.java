package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.core.entity.TieredArrowEntity;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;

import java.util.HashMap;
import java.util.Map;

public class ModDispenserBehaviorsFabric {

    public static void register() {
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.AMETHYST_ARROW, ArrowTier.AMETHYST);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.BAMBOO_ARROW, ArrowTier.BAMBOO);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.BLAZE_ROD_ARROW, ArrowTier.BLAZE_ROD);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.BONE_ARROW, ArrowTier.BONE);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.CACTUS_ARROW, ArrowTier.CACTUS);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.COAL_ARROW, ArrowTier.COAL);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.COPPER_ARROW, ArrowTier.COPPER);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.DIAMOND_ARROW, ArrowTier.DIAMOND);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.DRAGON_BREATH_ARROW, ArrowTier.DRAGON_BREATH);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.DRIPSTONE_ARROW, ArrowTier.DRIPSTONE);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.ECHO_ARROW, ArrowTier.ECHO);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.EGG_ARROW, ArrowTier.EGG);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.EMERALD_ARROW, ArrowTier.EMERALD);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.ENDER_PEARL_ARROW, ArrowTier.ENDER_PEARL);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.FIREWORK_ARROW, ArrowTier.FIREWORK);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.FIRE_CHARGE_ARROW, ArrowTier.FIRE_CHARGE);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.FLINT_ARROW, ArrowTier.FLINT);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.FLINT_AND_STEEL_ARROW, ArrowTier.FLINT_AND_STEEL);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.GLOW_INK_SAC_ARROW, ArrowTier.GLOW_INK_SAC);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.GOLD_ARROW, ArrowTier.GOLD);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.ICE_ARROW, ArrowTier.ICE);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.INK_SAC_ARROW, ArrowTier.INK_SAC);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.IRON_ARROW, ArrowTier.IRON);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.LADDER_ARROW, ArrowTier.LADDER);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.LAPIS_ARROW, ArrowTier.LAPIS);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.LIGHTNING_ROD_ARROW, ArrowTier.LIGHTNING_ROD);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.NETHERITE_ARROW, ArrowTier.NETHERITE);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.NETHER_QUARTZ_ARROW, ArrowTier.NETHER_QUARTZ);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.NETHER_STAR_ARROW, ArrowTier.NETHER_STAR);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.OBSIDIAN_ARROW, ArrowTier.OBSIDIAN);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.PAPER_ARROW, ArrowTier.PAPER);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.PRISMARINE_ARROW, ArrowTier.PRISMARINE);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.REDSTONE_ARROW, ArrowTier.REDSTONE);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.SHEAR_ARROW, ArrowTier.SHEAR);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.SHULKER_SHELL_ARROW, ArrowTier.SHULKER_SHELL);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.SLIMEBALL_ARROW, ArrowTier.SLIMEBALL);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.SMOKING_ARROW, ArrowTier.SMOKING);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.SNOWBALL_ARROW, ArrowTier.SNOWBALL);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.TNT_ARROW, ArrowTier.TNT);
        ModDispenserBehaviorsFabric.mappedArrow(ModArrowItemsFabric.WATER_BOTTLE_ARROW, ArrowTier.WATER_BOTTLE);
    }

    private static void mappedArrow(Item item, ArrowTier tier) {
        DispenserBlock.registerBehavior(item, new AbstractProjectileDispenseBehavior() {
            @Override
            protected Projectile getProjectile(Level pLevel, Position pPosition, ItemStack stack) {
                final TieredArrowEntity projectile = new TieredArrowEntity(pPosition.x(), pPosition.y(), pPosition.z(), pLevel, tier);
                projectile.pickup = AbstractArrow.Pickup.ALLOWED;
                return null;
            }
        });
    }
}
