package com.cursee.more_bows_and_arrows.mixin;

import com.cursee.more_bows_and_arrows.core.entity.TieredArrowEntity;
import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.phys.EntityHitResult;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AbstractArrow.class)
public class FabricAbstractArrowMixin {

    /** Occurs when an entity is actually being hurt, after a potion effect would have been applied by an arrow. */
    @Inject(method = "onHitEntity", at= @At(value = "INVOKE", shift = At.Shift.AFTER, target = "Lnet/minecraft/world/item/enchantment/EnchantmentHelper;doPostHurtEffects(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Entity;)V"))
    private void injected$onHitEntity(EntityHitResult result, CallbackInfo ci) {

        AbstractArrow instance = (AbstractArrow) (Object) this;
        if (!(result.getEntity() instanceof LivingEntity livingEntity)) return;

        if (instance.getOwner() instanceof Player player && player.getMainHandItem().getItem() instanceof TieredBowItem tieredBowItem) {
            livingEntity.hurt(livingEntity.damageSources().playerAttack(player), tieredBowItem.tier.bonusDamage());
        }

        if (instance instanceof TieredArrowEntity tieredArrowEntity) {
            livingEntity.hurt(livingEntity.damageSources().arrow(instance, tieredArrowEntity.getOwner()), tieredArrowEntity.bonusDamage());
        }
    }
}
