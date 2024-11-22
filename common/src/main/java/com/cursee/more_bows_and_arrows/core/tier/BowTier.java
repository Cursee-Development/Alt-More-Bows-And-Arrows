package com.cursee.more_bows_and_arrows.core.tier;

/** Contains the bonus damage and default durability values of added bows. */
public enum BowTier {

    STRIPPED_WOOD(DamageConstant.NORMAL_WOOD - 0.5f, DurabilityConstant.NORMAL_WOOD - 50),
    WOOD(DamageConstant.NORMAL_WOOD, DurabilityConstant.NORMAL_WOOD),
    STRIPPED_NETHER_WOOD(DamageConstant.NORMAL_WOOD, DurabilityConstant.NORMAL_WOOD),
    NETHER_WOOD(DamageConstant.NORMAL_WOOD + 0.5f, DurabilityConstant.NORMAL_WOOD + 50),

    STRIPPED_BAMBOO(DamageConstant.NORMAL_WOOD - 0.5f, DurabilityConstant.NORMAL_WOOD - 50),
    BAMBOO(DamageConstant.NORMAL_WOOD, DurabilityConstant.NORMAL_WOOD),

    AMETHYST(DamageConstant.LESSER_GEM, DurabilityConstant.LESSER_GEM),
    BLAZE_ROD(DamageConstant.GREATER_GEM, 750), // all arrows are ignited
    BONE(DamageConstant.LESSER_METAL - 1.5f, DurabilityConstant.LESSER_METAL - 100),
    COPPER(DamageConstant.LESSER_METAL - 1.0f, DurabilityConstant.LESSER_METAL),

    DIAMOND(DamageConstant.GREATER_GEM, DurabilityConstant.GREATER_GEM * 2),
    EMERALD(DamageConstant.GREATER_GEM, DurabilityConstant.GREATER_GEM),
    END_STONE(2.0f, 600),
    GOLD(DamageConstant.LESSER_METAL - 0.5f, DurabilityConstant.LESSER_METAL),

    IRON(DamageConstant.LESSER_METAL, DurabilityConstant.LESSER_METAL * 2), // ignites flint arrows
    LAPIS(DamageConstant.LESSER_GEM, DurabilityConstant.LESSER_GEM),
    LIGHTNING_ROD(DamageConstant.LESSER_METAL - 1.0f, DurabilityConstant.LESSER_METAL), // lightning
    NETHERITE(DamageConstant.GREATER_METAL, DurabilityConstant.GREATER_METAL * 2),

    OBSIDIAN(DamageConstant.GREATER_METAL - 1.0f, 750),
    PAPER(0.0f, 100), // ??? effect
    PRISMARINE(DamageConstant.LESSER_GEM, DurabilityConstant.LESSER_GEM), // shoots normally in water?
    ;

    private final float bonusDamage;
    private final int defaultDurability;

    BowTier(float bonusDamage, int defaultDurability) {
        this.bonusDamage = bonusDamage;
        this.defaultDurability = defaultDurability;
    }

    public float bonusDamage() {
        return bonusDamage;
    }

    public int defaultDurability() {
        return defaultDurability;
    }

    private static class DamageConstant {
        public static final float NORMAL_WOOD = 1.0f;
        public static final float LESSER_GEM = 2.0f;
        public static final float GREATER_GEM = 4.0f;
        public static final float LESSER_METAL = 3.0f;
        public static final float GREATER_METAL = 6.0f;
    }

    private static class DurabilityConstant {
        public static final int NORMAL_WOOD = 350;
        public static final int LESSER_GEM = 400;
        public static final int GREATER_GEM = 500;
        public static final int LESSER_METAL = 500;
        public static final int GREATER_METAL = 1000;
    }
}
