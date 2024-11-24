package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import com.cursee.more_bows_and_arrows.core.util.CommonEffectsUtil;
import com.cursee.more_bows_and_arrows.core.util.DragonBreathUtil;
import com.cursee.more_bows_and_arrows.core.util.FireworkUtil;
import com.cursee.more_bows_and_arrows.core.util.PaperEffectsUtil;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.EntityHitResult;
import org.jetbrains.annotations.Nullable;

public class ArrowHitsEntityInteractions {

    public static void interact(TieredArrowEntity tieredArrowEntity, @Nullable Entity nullableOwner, EntityHitResult entityHitResult) {

        if (!(nullableOwner instanceof Player player) || !(entityHitResult.getEntity() instanceof LivingEntity hitEntity)) return;

        switch (tieredArrowEntity.getVariant()) {
            case AMETHYST, BAMBOO, COAL, DIAMOND, EMERALD -> {/* NO-OP */}
            case BLAZE_ROD -> hitEntity.setSecondsOnFire(2);
            case BONE -> hitEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 2 * 20, 1));
            case CACTUS -> hitEntity.hurt(player.level().damageSources().cactus(), 1.5f);
            case COPPER -> {
                if (!(player.getMainHandItem().getItem() instanceof TieredBowItem tieredBowItem)) return;
                if (tieredBowItem.tier == BowTier.COPPER) CommonEffectsUtil.lightingCausedByPlayer(player, hitEntity.blockPosition());
            }
            case DRAGON_BREATH -> DragonBreathUtil.createAreaEffectCloud(player, hitEntity.blockPosition());
            case DRIPSTONE -> hitEntity.hurt(player.level().damageSources().playerAttack(player), 1.5f);
            case ECHO -> {
                if (!(player.level() instanceof ServerLevel serverLevel)) return;
                serverLevel.playSound(player, hitEntity.blockPosition(), SoundEvents.EVOKER_CAST_SPELL, SoundSource.PLAYERS, 1.0f, 1.0f);
            }
            case EGG -> {
                Chicken chicken = EntityType.CHICKEN.create(player.level());
                if (chicken != null) {
                    chicken.moveTo(hitEntity.blockPosition().getX(), hitEntity.blockPosition().getY(), hitEntity.blockPosition().getZ());
                    player.level().addFreshEntity(chicken);
                }
            }
            case ENDER_PEARL -> hitEntity.teleportTo(player.xo, player.yo, player.zo);
            case FIREWORK -> FireworkUtil.createRandomFireworkFromEntity(player, entityHitResult.getEntity().blockPosition());
            case FIRE_CHARGE -> hitEntity.setSecondsOnFire(2);
            case FLINT -> {
                if (player.getMainHandItem().getItem() instanceof TieredBowItem bow && bow.tier == BowTier.IRON) hitEntity.setSecondsOnFire(2);
            }
            case FLINT_AND_STEEL -> hitEntity.setSecondsOnFire(2);
            case GLOW_INK_SAC -> hitEntity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 4 * 20, 1));
            case ICE -> hitEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 4 * 20, 2));
            case INK_SAC -> hitEntity.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 4 * 20, 1));
            case LADDER -> player.teleportTo(player.xo, hitEntity.blockPosition().getY(), player.zo);
            case LIGHTNING_ROD -> {
                if (player.getMainHandItem().getItem() instanceof TieredBowItem tieredBowItem && tieredBowItem.tier == BowTier.LIGHTNING_ROD) tieredArrowEntity.level().explode(player, entityHitResult.getEntity().xo, entityHitResult.getEntity().yo, entityHitResult.getEntity().zo, 4.0f, Level.ExplosionInteraction.TNT);
            }
            case NETHER_STAR -> player.level().explode(player, hitEntity.blockPosition().getX(), hitEntity.blockPosition().getY(), hitEntity.blockPosition().getZ(), 4.0f, Level.ExplosionInteraction.TNT);
            case PAPER -> PaperEffectsUtil.randomEntityEffects(player, hitEntity);
            case SHEAR -> {
                if (hitEntity instanceof Sheep sheep && sheep.readyForShearing()) {
                    sheep.shear(SoundSource.PLAYERS);
                    sheep.gameEvent(GameEvent.SHEAR, player);
                    sheep.addEffect(new MobEffectInstance(MobEffects.HEAL, 20, 2));
                }
            }
            case SHULKER_SHELL -> hitEntity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 2 * 20, 1));
            case SLIMEBALL -> hitEntity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 4 * 20, 4));
            case SMOKING -> {
                for (int i=0; i<3; ++i) {
                    final double modifier = player.level().random.nextBoolean() ? 1.0D : -1.0D;
                    player.level().addParticle(ParticleTypes.SMOKE, hitEntity.blockPosition().getX(), hitEntity.blockPosition().getY() + 1.0D, hitEntity.blockPosition().getZ(), player.level().random.nextDouble() * modifier, player.level().random.nextDouble() * modifier, player.level().random.nextDouble() * modifier);
                }
            }
            case TNT -> player.level().explode(player, hitEntity.blockPosition().getX(), hitEntity.blockPosition().getY(), hitEntity.blockPosition().getZ(), 2.0f, Level.ExplosionInteraction.TNT);
            case WATER_BOTTLE -> {
                if (!hitEntity.isOnFire()) return;
                hitEntity.setRemainingFireTicks(1);
            }
        }
    }
}
