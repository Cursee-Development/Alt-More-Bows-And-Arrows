package com.cursee.more_bows_and_arrows.core.util;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.player.Player;

public class DragonBreathUtil {

    public static void createAreaEffectCloud(Player player, BlockPos blockPos) {

        final int CLOUD_DURATION = 5 * 20;
        final AreaEffectCloud cloud = new AreaEffectCloud(player.level(), blockPos.getX(), blockPos.getY(), blockPos.getZ());

        cloud.setOwner(player);
        cloud.setParticle(ParticleTypes.DRAGON_BREATH);
        cloud.setRadius(1.5f);
        cloud.setDuration(CLOUD_DURATION);
        cloud.setRadiusPerTick((7.0F - cloud.getRadius()) / (float) cloud.getDuration());
        cloud.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, CLOUD_DURATION));

        player.level().addFreshEntity(cloud);

    }
}
