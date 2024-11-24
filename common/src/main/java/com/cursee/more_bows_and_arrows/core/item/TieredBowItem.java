package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import com.cursee.more_bows_and_arrows.core.util.CommonEffectsUtil;
import com.cursee.more_bows_and_arrows.core.util.PaperEffectsUtil;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TieredBowItem extends BowItem {

    public final BowTier tier;

    public TieredBowItem(BowTier tier) {
        super(new Properties().durability(tier.defaultDurability()));
        this.tier = tier;
    }

    @Override
    public int getUseDuration(ItemStack $$0, LivingEntity $$1) {
        if ($$0.getItem() instanceof TieredBowItem tieredBowItem && tieredBowItem.tier == BowTier.NETHERITE) {
            return 36000;
        }

        return super.getUseDuration($$0, $$1);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, TooltipContext $$1, List<Component> components, TooltipFlag $$3) {

        if (!(itemStack.getItem() instanceof TieredBowItem)) return;

        BowTier instanceTier = this.tier;

        if (instanceTier == BowTier.BAMBOO) instanceTier = BowTier.WOOD;
        if (instanceTier == BowTier.STRIPPED_BAMBOO) instanceTier = BowTier.STRIPPED_WOOD;
        
        components.add(Component.translatable("lore.more_bows_and_arrows." + instanceTier.toString().toLowerCase() + "_bow1"));
        components.add(Component.translatable("lore.more_bows_and_arrows." + instanceTier.toString().toLowerCase() + "_bow2"));
        components.add(Component.translatable("lore.more_bows_and_arrows." + instanceTier.toString().toLowerCase() + "_bow_damage"));

        super.appendHoverText(itemStack, $$1, components, $$3);
    }

    public void playerAttacksEntity(Player player, LivingEntity livingEntity) {
        switch (this.tier) {
            case BLAZE_ROD -> livingEntity.setRemainingFireTicks(2 * 20);
            case BONE -> livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 20 * 5, 1));
            case LIGHTNING_ROD -> CommonEffectsUtil.lightingCausedByPlayer(player, livingEntity.blockPosition());
            case PAPER -> PaperEffectsUtil.randomEntityEffects(player, livingEntity);
        }
    }

    public void playerAttacksBlock(Player player, BlockHitResult blockHitResult) {

        switch (this.tier) {
            case BLAZE_ROD -> CommonEffectsUtil.lightOrIgniteBlock(blockHitResult, player.level());
            case LIGHTNING_ROD -> CommonEffectsUtil.lightingCausedByPlayer(player, blockHitResult.getBlockPos());
            case PAPER -> PaperEffectsUtil.randomBlockEffects(player, blockHitResult);
        }
    }
}
