package com.cursee.more_bows_and_arrows.core.registry;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModTabsForge {

    public static void register() {}

    public static final RegistryObject<CreativeModeTab> MORE_BOWS_AND_ARROWS = RegistryForge.registerTab(Constants.MOD_ID, () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
            .title(Component.translatable("itemGroup.moreBowsAndArrows"))
            .icon(() -> new ItemStack(ModBowItemsForge.BLAZE_ROD_BOW.get()))
            .displayItems(((itemDisplayParameters, output) -> {
                addBows(output);
                addArrows(output);
            }))
            .build());

    public static void addBows(CreativeModeTab.Output output) {
        output.accept(ModBowItemsForge.OAK_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_OAK_BOW.get());
        output.accept(ModBowItemsForge.DARK_OAK_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_DARK_OAK_BOW.get());
        output.accept(ModBowItemsForge.SPRUCE_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_SPRUCE_BOW.get());
        output.accept(ModBowItemsForge.BIRCH_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_BIRCH_BOW.get());
        output.accept(ModBowItemsForge.JUNGLE_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_JUNGLE_BOW.get());
        output.accept(ModBowItemsForge.ACACIA_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_ACACIA_BOW.get());
        output.accept(ModBowItemsForge.MANGROVE_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_MANGROVE_BOW.get());
        output.accept(ModBowItemsForge.CHERRY_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_CHERRY_BOW.get());
        output.accept(ModBowItemsForge.WARPED_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_WARPED_BOW.get());
        output.accept(ModBowItemsForge.CRIMSON_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_CRIMSON_BOW.get());
        output.accept(ModBowItemsForge.BAMBOO_BOW.get());
        output.accept(ModBowItemsForge.STRIPPED_BAMBOO_BOW.get());

        output.accept(ModBowItemsForge.AMETHYST_BOW.get());
        output.accept(ModBowItemsForge.BLAZE_ROD_BOW.get());
        output.accept(ModBowItemsForge.BONE_BOW.get());
        output.accept(ModBowItemsForge.COPPER_BOW.get());
        output.accept(ModBowItemsForge.DIAMOND_BOW.get());
        output.accept(ModBowItemsForge.EMERALD_BOW.get());
        output.accept(ModBowItemsForge.END_STONE_BOW.get());
        output.accept(ModBowItemsForge.GOLD_BOW.get());
        output.accept(ModBowItemsForge.IRON_BOW.get());
        output.accept(ModBowItemsForge.LAPIS_BOW.get());
        output.accept(ModBowItemsForge.LIGHTNING_ROD_BOW.get());
        output.accept(ModBowItemsForge.NETHERITE_BOW.get());
        output.accept(ModBowItemsForge.OBSIDIAN_BOW.get());
        output.accept(ModBowItemsForge.PAPER_BOW.get());
        output.accept(ModBowItemsForge.PRISMARINE_BOW.get());
    }

    public static void addArrows(CreativeModeTab.Output output) {
        output.accept(ModArrowItemsForge.AMETHYST_ARROW.get());
        output.accept(ModArrowItemsForge.BAMBOO_ARROW.get());
        output.accept(ModArrowItemsForge.BLAZE_ROD_ARROW.get());
        output.accept(ModArrowItemsForge.BONE_ARROW.get());
        output.accept(ModArrowItemsForge.CACTUS_ARROW.get());
        output.accept(ModArrowItemsForge.COAL_ARROW.get());
        output.accept(ModArrowItemsForge.COPPER_ARROW.get());
        output.accept(ModArrowItemsForge.DIAMOND_ARROW.get());
        output.accept(ModArrowItemsForge.DRAGON_BREATH_ARROW.get());
        output.accept(ModArrowItemsForge.DRIPSTONE_ARROW.get());
        output.accept(ModArrowItemsForge.ECHO_ARROW.get());
        output.accept(ModArrowItemsForge.EGG_ARROW.get());
        output.accept(ModArrowItemsForge.EMERALD_ARROW.get());
        output.accept(ModArrowItemsForge.ENDER_PEARL_ARROW.get());
        output.accept(ModArrowItemsForge.FIREWORK_ARROW.get());
        output.accept(ModArrowItemsForge.FIRE_CHARGE_ARROW.get());
        output.accept(ModArrowItemsForge.FLINT_ARROW.get());
        output.accept(ModArrowItemsForge.FLINT_AND_STEEL_ARROW.get());
        output.accept(ModArrowItemsForge.GLOW_INK_SAC_ARROW.get());
        output.accept(ModArrowItemsForge.GOLD_ARROW.get());
        output.accept(ModArrowItemsForge.ICE_ARROW.get());
        output.accept(ModArrowItemsForge.INK_SAC_ARROW.get());
        output.accept(ModArrowItemsForge.IRON_ARROW.get());
        output.accept(ModArrowItemsForge.LADDER_ARROW.get());
        output.accept(ModArrowItemsForge.LAPIS_ARROW.get());
        output.accept(ModArrowItemsForge.LIGHTNING_ROD_ARROW.get());
        output.accept(ModArrowItemsForge.NETHERITE_ARROW.get());
        output.accept(ModArrowItemsForge.NETHER_QUARTZ_ARROW.get());
        output.accept(ModArrowItemsForge.NETHER_STAR_ARROW.get());
        output.accept(ModArrowItemsForge.OBSIDIAN_ARROW.get());
        output.accept(ModArrowItemsForge.PAPER_ARROW.get());
        output.accept(ModArrowItemsForge.PRISMARINE_ARROW.get());
        output.accept(ModArrowItemsForge.REDSTONE_ARROW.get());
        output.accept(ModArrowItemsForge.SHEAR_ARROW.get());
        output.accept(ModArrowItemsForge.SHULKER_SHELL_ARROW.get());
        output.accept(ModArrowItemsForge.SLIMEBALL_ARROW.get());
        output.accept(ModArrowItemsForge.SMOKING_ARROW.get());
        output.accept(ModArrowItemsForge.SNOWBALL_ARROW.get());
        output.accept(ModArrowItemsForge.TNT_ARROW.get());
        output.accept(ModArrowItemsForge.WATER_BOTTLE_ARROW.get());
    }
}
