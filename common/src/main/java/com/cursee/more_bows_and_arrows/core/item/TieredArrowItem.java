package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.entity.TieredArrowEntity;
import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Arrow;
import net.minecraft.world.item.ArrowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TieredArrowItem extends ArrowItem {

    public final ArrowTier tier;

    public TieredArrowItem(ArrowTier tier) {
        super(new Properties());
        this.tier = tier;
    }

    @Override
    public void appendHoverText(@NotNull ItemStack itemStack, @Nullable Level level, @NotNull List<Component> components, @NotNull TooltipFlag flag) {

        if (!(itemStack.getItem() instanceof TieredBowItem)) return;

        components.add(Component.translatable("lore.more_bows_and_arrows." + this.tier.getSerializedName() + "_arrow1"));
        components.add(Component.translatable("lore.more_bows_and_arrows." + this.tier.getSerializedName() + "_arrow2"));
        components.add(Component.translatable("lore.more_bows_and_arrows." + this.tier.getSerializedName() + "_arrow_damage"));

        super.appendHoverText(itemStack, level, components, flag);
    }

    @Override
    public @NotNull AbstractArrow createArrow(@NotNull Level level, @NotNull ItemStack itemStack, @NotNull LivingEntity livingEntity) {
        return new TieredArrowEntity(livingEntity, level, this.tier);
    }
}
