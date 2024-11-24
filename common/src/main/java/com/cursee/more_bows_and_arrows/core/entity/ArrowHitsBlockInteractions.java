package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.core.item.TieredBowItem;
import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import com.cursee.more_bows_and_arrows.core.util.CommonEffectsUtil;
import com.cursee.more_bows_and_arrows.core.util.DragonBreathUtil;
import com.cursee.more_bows_and_arrows.core.util.FireworkUtil;
import com.cursee.more_bows_and_arrows.core.util.PaperEffectsUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.TagType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.FireworkRocketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.Nullable;

public class ArrowHitsBlockInteractions {

    public static void interact(TieredArrowEntity tieredArrowEntity, @Nullable Entity nullableOwner, BlockHitResult blockHitResult) {

        if (!(nullableOwner instanceof Player player)) return;

        ItemStack itemStack = player.getMainHandItem();
        Item item = itemStack.getItem();

        // if (!(item instanceof TieredBowItem tieredBowItem)) return;

        final BlockPos blockPos = blockHitResult.getBlockPos();
        final Direction direction = blockHitResult.getDirection();
        final BlockPos relative = blockPos.relative(direction);

        switch (tieredArrowEntity.getVariant()) {
            case BAMBOO -> {

                if (!(player.getMainHandItem().getItem() instanceof TieredBowItem)) return;
                if (( (TieredBowItem) player.getMainHandItem().getItem()).tier != BowTier.BAMBOO) return;

                BlockState state = player.level().getBlockState(blockPos);
                if (Blocks.BAMBOO.defaultBlockState().canSurvive(player.level(), blockPos)) {

                    if (Feature.isDirt(state)) {
                        player.level().setBlock(blockPos, Blocks.PODZOL.defaultBlockState(), Block.UPDATE_ALL);
                        player.level().setBlock(blockPos.above(), Blocks.BAMBOO.defaultBlockState(), Block.UPDATE_ALL);
                    }
                    else if (state.is(Blocks.BAMBOO)) {
                        player.level().setBlock(blockPos.above(), Blocks.BAMBOO.defaultBlockState(), Block.UPDATE_ALL);
                    }
                }
            }
            case BLAZE_ROD -> CommonEffectsUtil.lightOrIgniteBlock(blockHitResult, player.level());
            case DRAGON_BREATH -> DragonBreathUtil.createAreaEffectCloud(player, blockHitResult.getBlockPos());
            case ECHO -> {
                if (!(player.level() instanceof ServerLevel serverLevel)) return;
                serverLevel.playSound(player, blockHitResult.getBlockPos(), SoundEvents.EVOKER_CAST_SPELL, SoundSource.PLAYERS, 1.0f, 1.0f);
            }
            case EGG -> {
                Chicken chicken = EntityType.CHICKEN.create(player.level());
                if (chicken != null) {
                    chicken.moveTo(blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
                    player.level().addFreshEntity(chicken);
                }
            }
            case ENDER_PEARL -> player.teleportTo(blockPos.getX(), blockPos.getY(), blockPos.getZ());
            case FIREWORK -> FireworkUtil.createRandomFireworkFromEntity(player, blockHitResult.getBlockPos());
            case FIRE_CHARGE -> CommonEffectsUtil.lightOrIgniteBlock(blockHitResult, player.level());
            case FLINT -> {
                if (player.getMainHandItem().getItem() instanceof TieredBowItem bow && bow.tier == BowTier.IRON) CommonEffectsUtil.lightOrIgniteBlock(blockHitResult, player.level());
            }
            case FLINT_AND_STEEL -> CommonEffectsUtil.lightOrIgniteBlock(blockHitResult, player.level());
            case LADDER -> player.teleportTo(player.blockPosition().getX(), blockPos.getY(), player.blockPosition().getZ());
            case LIGHTNING_ROD -> CommonEffectsUtil.lightingCausedByPlayer(player, blockPos);
            case NETHER_STAR -> player.level().explode(player, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 4.0f, Level.ExplosionInteraction.TNT);
            case PAPER -> PaperEffectsUtil.randomBlockEffects(player, blockHitResult);
            case REDSTONE -> {
                if (player.level().getBlockState(blockPos).hasProperty(RedStoneOreBlock.LIT)) {
                    player.level().getBlockState(blockPos).setValue(RedStoneOreBlock.LIT, true);
                }
            }
            case TNT -> player.level().explode(player, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 2.0f, Level.ExplosionInteraction.TNT);
            case WATER_BOTTLE -> {
                if (player.level().getBlockState(blockPos).hasProperty(CampfireBlock.LIT)) {
                    player.level().getBlockState(blockPos).setValue(CampfireBlock.LIT, false);
                }
            }
        }
    }
}
