package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
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
}
