package com.cursee.more_bows_and_arrows.core.tier;

import com.mojang.serialization.Codec;
import net.minecraft.util.ByIdMap;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.entity.animal.horse.Variant;
import org.jetbrains.annotations.NotNull;

import java.util.function.IntFunction;

/** Contains the bonus damage values of added arrows. */
public enum ArrowTier implements StringRepresentable {

    AMETHYST(0, "amethyst", DamageConstant.LESSER_GEM),
    BAMBOO(1, "bamboo", 1.0f),
    BLAZE_ROD(2, "blaze_rod", DamageConstant.GREATER_METAL - 1.0f), // always ignite
    BONE(3, "bone", 2.0f), // wither if paired with bone bow
    CACTUS(4, "cactus", 2.0f), // extra piercing damage
    COAL(5, "coal", 1.0f), // only ignite if hitting netherrack
    COPPER(6, "copper", DamageConstant.LESSER_METAL - 0.5f),
    DIAMOND(7, "diamond", DamageConstant.GREATER_GEM),
    DRAGON_BREATH(8, "dragon_breath", DamageConstant.LESSER_GEM), // extra piercing damage
    DRIPSTONE(9, "dripstone", DamageConstant.LESSER_GEM - 0.5f), // extra piercing damage

    ECHO(10, "echo", DamageConstant.GREATER_GEM), // play sound for player if target is hit
    EGG(11, "egg", 1.0f), // chicken
    EMERALD(12, "emerald", DamageConstant.GREATER_GEM),
    ENDER_PEARL(13, "ender_pearl", DamageConstant.GREATER_GEM), // tp player to hit pos, or hit to player
    FIREWORK(14, "firework", 1.0f), // launch firework
    FIRE_CHARGE(15, "fire_charge", DamageConstant.LESSER_METAL - 1.5f), // always ignite
    FLINT(16, "flint", DamageConstant.LESSER_METAL - 1.5f), // ignite if paired with iron bow
    FLINT_AND_STEEL(17, "flint_and_steel", 2.0f), // ignite on hit
    GLOW_INK_SAC(18, "glow_ink_sac", 1.0f), // glow on hit
    GOLD(19, "gold", DamageConstant.LESSER_METAL - 1.0f),

    ICE(20, "ice", 1.0f), // freezing on hit
    INK_SAC(21, "ink_sac", 1.0f), // blindness on hit
    IRON(22, "iron", DamageConstant.LESSER_METAL),
    LADDER(23, "ladder", 0.0f), // tp player on Y axis only
    LAPIS(24, "lapis", DamageConstant.LESSER_GEM),
    LIGHTNING_ROD(25, "lightning_rod", DamageConstant.LESSER_METAL), // lightning
    NETHERITE(26, "netherite", DamageConstant.GREATER_METAL),
    NETHER_QUARTZ(27, "nether_quartz", DamageConstant.LESSER_GEM),
    NETHER_STAR(28, "nether_star", DamageConstant.GREATER_GEM), // BIG explosion
    OBSIDIAN(29, "obsidian", DamageConstant.GREATER_METAL - 1.0f),

    PAPER(30, "paper", 0.0f), // ??? effect
    PRISMARINE(31, "prismarine", DamageConstant.LESSER_GEM),
    REDSTONE(32, "redstone", 0.0f), // activate nearby redstone
    SHEAR(33, "shear", 0.0f), // shear sheep? idek
    SHULKER_SHELL(34, "shulker_shell", 0.0f), // levitation
    SLIMEBALL(35, "slimeball", 0.0f), // slowness effect
    SMOKING(36, "smoking", 0.0f), // leaves smoke particle effects behind
    SNOWBALL(37, "snowball", 0.0f),
    TNT(38, "tnt", DamageConstant.LESSER_METAL), // explosion
    WATER_BOTTLE(39, "water_bottle", 1.0f), // explosion
    ;

    public static final Codec<ArrowTier> CODEC = StringRepresentable.fromEnum(ArrowTier::values);
    private static final IntFunction<ArrowTier> BY_ID = ByIdMap.continuous(ArrowTier::getId, values(), ByIdMap.OutOfBoundsStrategy.WRAP);

    private final int id;
    private final String name;
    private final float bonusDamage;

    ArrowTier(int id, String name, float bonusDamage) {
        this.id = id;
        this.name = name;
        this.bonusDamage = bonusDamage;
    }

    public int getId() {
        return id;
    }

    @Override
    public @NotNull String getSerializedName() {
        return this.name;
    }

    public float bonusDamage() {
        return bonusDamage;
    }

    /**
     * Uses the `ByIdMap.continuous` utility to map an integer ID to an enum instance efficiently.
     * The `OutOfBoundsStrategy.WRAP` ensures that invalid IDs are handled gracefully by wrapping them
     * within the valid range, allowing for safe and predictable lookups.
     */
    public static ArrowTier byId(int id) {
        return BY_ID.apply(id);
    }

    private static class DamageConstant {
        public static final float LESSER_GEM = 2.0f;
        public static final float GREATER_GEM = 5.0f;
        public static final float LESSER_METAL = 3.0f;
        public static final float GREATER_METAL = 6.0f;
    }
}
