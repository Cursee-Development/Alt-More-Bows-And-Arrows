package com.cursee.more_bows_and_arrows.core.tier;

/** Contains the bonus damage values of added arrows. */
public enum ArrowTier {

    AMETHYST(DamageConstant.LESSER_GEM),
    BAMBOO(1.0f),
    BLAZE_ROD(DamageConstant.GREATER_METAL - 1.0f), // always ignite
    BONE(2.0f), // wither if paired with bone bow
    CACTUS(2.0f), // extra piercing damage
    COAL(1.0f), // only ignite if hitting netherrack
    COPPER(DamageConstant.LESSER_METAL - 0.5f),
    DIAMOND(DamageConstant.GREATER_GEM),
    DRIPSTONE(DamageConstant.LESSER_GEM - 0.5f), // extra piercing damage
    ECHO(DamageConstant.GREATER_GEM), // play sound for player if target is hit
    EGG(1.0f), // chicken
    EMERALD(DamageConstant.GREATER_GEM),
    ENDER_PEARL(DamageConstant.GREATER_GEM), // tp player to hit pos, or hit to player
    FIREWORK(1.0f), // launch firework
    FIRE_CHARGE(DamageConstant.LESSER_METAL - 1.5f), // always ignite
    FLINT(DamageConstant.LESSER_METAL - 1.5f), // ignite if paired with iron bow
    FLINT_AND_STEEL(2.0f), // ignite on hit
    GLOW_INK_SAC(1.0f), // glow on hit
    GOLD(DamageConstant.LESSER_METAL - 1.0f),
    INK_SAC(1.0f), // blindness on hit
    IRON(DamageConstant.LESSER_METAL),
    LADDER(0.0f), // tp player on Y axis only
    LAPIS(DamageConstant.LESSER_GEM),
    LIGHTNING_ROD(DamageConstant.LESSER_METAL), // lightning
    NETHERITE(DamageConstant.GREATER_METAL),
    NETHER_QUARTZ(DamageConstant.LESSER_GEM),
    NETHER_STAR(DamageConstant.GREATER_GEM), // BIG explosion
    OBSIDIAN(DamageConstant.GREATER_METAL - 1.0f),
    PAPER(0.0f), // ??? effect
    PRISMARINE(DamageConstant.LESSER_GEM),
    REDSTONE(0.0f), // activate nearby redstone
    SHEAR(0.0f), // shear sheep? idek
    SLIMEBALL(0.0f), // slowness effect
    SNOWBALL(0.0f),
    TNT(DamageConstant.LESSER_METAL), // explosion
    ;

    private final float bonusDamage;

    ArrowTier(float bonusDamage) {
        this.bonusDamage = bonusDamage;
    }

    public float bonusDamage() {
        return bonusDamage;
    }

    private static class DamageConstant {
        public static final float LESSER_GEM = 2.0f;
        public static final float GREATER_GEM = 5.0f;
        public static final float LESSER_METAL = 3.0f;
        public static final float GREATER_METAL = 6.0f;
    }
}
