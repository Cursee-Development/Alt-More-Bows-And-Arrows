package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TieredBowItem extends BowItem {

    public final BowTier tier;

    public TieredBowItem(BowTier tier) {
        super(new Properties().defaultDurability(tier.defaultDurability()));
        this.tier = tier;
    }

    @Override
    public int getUseDuration(@NotNull ItemStack itemStack) {

        if (itemStack.getItem() instanceof TieredBowItem tieredBowItem && tieredBowItem.tier == BowTier.NETHERITE) {
            return 36000;
        }

        return super.getUseDuration(itemStack);
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> components, @NotNull TooltipFlag flag) {

        if (!(itemStack.getItem() instanceof TieredBowItem)) return;

        components.add(Component.translatable("lore.more_bows_and_arrows." + this.tier.toString().toLowerCase() + "_bow1"));
        components.add(Component.translatable("lore.more_bows_and_arrows." + this.tier.toString().toLowerCase() + "_bow2"));
        components.add(Component.translatable("lore.more_bows_and_arrows." + this.tier.toString().toLowerCase() + "_bow_damage"));

        super.appendHoverText(itemStack, level, components, flag);
    }

    public void playerAttacksEntity(Player player, LivingEntity livingEntity) {
        switch (this.tier) {
            case STRIPPED_WOOD -> {
            }
            case WOOD -> {
            }
            case STRIPPED_NETHER_WOOD -> {
            }
            case NETHER_WOOD -> {
            }
            case STRIPPED_BAMBOO -> {
            }
            case BAMBOO -> {
            }
            case AMETHYST -> {
            }
            case BLAZE_ROD -> {
            }
            case BONE -> {
            }
            case COPPER -> {
            }
            case DIAMOND -> {
            }
            case EMERALD -> {
            }
            case END_STONE -> {
            }
            case GOLD -> {
            }
            case IRON -> {
            }
            case LAPIS -> {
            }
            case LIGHTNING_ROD -> {
                this.lightningRodBowInteraction(player, livingEntity);
            }
            case NETHERITE -> {
            }
            case OBSIDIAN -> {
            }
            case PAPER -> {
            }
            case PRISMARINE -> {
            }
        }
    }

    private void lightningRodBowInteraction(Player player, LivingEntity livingEntity) {

        Level level = livingEntity.level();

        LightningBolt bolt = EntityType.LIGHTNING_BOLT.create(level);
        if (bolt == null) return;

        bolt.moveTo(Vec3.atBottomCenterOf(livingEntity.blockPosition()));
        if (player instanceof ServerPlayer serverPlayer) bolt.setCause(serverPlayer);

        level.addFreshEntity(bolt);
    }

    public void playerAttacksBlock(Player player, BlockHitResult result) {

    }
}
