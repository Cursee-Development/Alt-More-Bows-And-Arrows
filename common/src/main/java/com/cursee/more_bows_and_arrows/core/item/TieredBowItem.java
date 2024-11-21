package com.cursee.more_bows_and_arrows.core.item;

import com.cursee.more_bows_and_arrows.core.tier.BowTier;
import com.cursee.more_bows_and_arrows.core.util.FireworkUtil;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Vec3i;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
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

    private static void lightingCausedByPlayer(Player player, BlockPos blockPos) {

        Level level = player.level();
        LightningBolt bolt = EntityType.LIGHTNING_BOLT.create(level);

        if (bolt == null) return;
        if (player instanceof ServerPlayer serverPlayer) bolt.setCause(serverPlayer);

        bolt.moveTo(Vec3.atBottomCenterOf(blockPos));
        level.addFreshEntity(bolt);
    }

    private static void lightOrIgniteBlock(BlockHitResult result, Level level) {

        final BlockPos blockPos = result.getBlockPos();

        if (!level.getBlockState(blockPos).hasProperty(BlockStateProperties.LIT)) {
            BlockPos relativePosition = blockPos.relative(result.getDirection());
            if (level.isEmptyBlock(relativePosition)) level.setBlockAndUpdate(relativePosition, BaseFireBlock.getState(level, relativePosition));
        }
        else {
            level.setBlock(blockPos, level.getBlockState(blockPos).setValue(BlockStateProperties.LIT, true), Block.UPDATE_ALL);
        }
    }

    private static void randomEntityEffects(Player attacker, LivingEntity defender) {

        switch (attacker.getRandom().nextInt(1, 8)) {
            case 1 -> TieredBowItem.lightingCausedByPlayer(attacker, defender.blockPosition());
            case 2 -> defender.setSecondsOnFire(2);
            case 3 -> defender.teleportTo(attacker.xo, attacker.yo, attacker.zo);
            case 4 -> attacker.teleportTo(defender.xo, defender.yo, defender.zo);
            case 5 -> defender.teleportTo(defender.xo, defender.yo + 10, defender.zo);
            case 6 -> attacker.level().explode(attacker, defender.xo, defender.yo, defender.zo, 2.0f, true, Level.ExplosionInteraction.TNT);
            case 7 -> {
                for (int i=1; i<4; ++i) {
                    Chicken createdChicken = EntityType.CHICKEN.create(attacker.level());
                    if (createdChicken == null) return;

                    if (attacker.getRandom().nextFloat() < 0.05f) {
                        if (attacker.getRandom().nextBoolean()) {
                            createdChicken.setCustomName(Component.literal("Dinnerbone"));
                        } else {
                            createdChicken.setCustomName(Component.literal("Grumm"));
                        }
                    }

                    createdChicken.moveTo(defender.xo, defender.yo + i, defender.zo);
                }
            }
            case 8 -> {
                for (int i=1; i<4; ++i) {
                    Zombie createdZombie = EntityType.ZOMBIE.create(attacker.level());
                    if (createdZombie == null) return;

                    if (attacker.getRandom().nextFloat() < 0.05f) {
                        if (attacker.getRandom().nextBoolean()) {
                            createdZombie.setCustomName(Component.literal("Dinnerbone"));
                        } else {
                            createdZombie.setCustomName(Component.literal("Grumm"));
                        }
                    }

                    createdZombie.moveTo(defender.xo, defender.yo, defender.zo);
                }
            }
        }
    }

    private static void randomBlockEffects(Player player, BlockHitResult blockHitResult) {

        final BlockPos blockPos = blockHitResult.getBlockPos();

        switch (player.getRandom().nextInt(1, 8)) {
            case 1 -> player.level().explode(player, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 2.0f, true, Level.ExplosionInteraction.TNT);
            case 2 -> player.teleportTo(blockPos.getX(), blockPos.getY() + 10, blockPos.getZ());
            case 3 -> player.teleportTo(player.xo, player.yo + 10, player.zo);
            case 4 -> player.teleportTo(blockPos.getX(), blockPos.getY(), blockPos.getZ());
            case 5 -> TieredBowItem.lightingCausedByPlayer(player, blockPos);
            case 6 -> FireworkUtil.createRandomFireworkFromEntity(player, blockHitResult);
            case 7 -> {
                for (int i=1; i<4; ++i) {
                    Chicken createdChicken = EntityType.CHICKEN.create(player.level());
                    if (createdChicken == null) return;

                    if (player.getRandom().nextFloat() < 0.05f) {
                        if (player.getRandom().nextBoolean()) {
                            createdChicken.setCustomName(Component.literal("Dinnerbone"));
                        } else {
                            createdChicken.setCustomName(Component.literal("Grumm"));
                        }
                    }

                    createdChicken.moveTo(blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY() + i, blockHitResult.getBlockPos().getZ());
                }
            }
            case 8 -> {
                for (int i=1; i<4; ++i) {
                    Zombie createdZombie = EntityType.ZOMBIE.create(player.level());
                    if (createdZombie == null) return;

                    if (player.getRandom().nextFloat() < 0.05f) {
                        if (player.getRandom().nextBoolean()) {
                            createdZombie.setCustomName(Component.literal("Dinnerbone"));
                        } else {
                            createdZombie.setCustomName(Component.literal("Grumm"));
                        }
                    }

                    createdZombie.moveTo(blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult.getBlockPos().getZ());
                }
            }
        }
    }

    public void playerAttacksEntity(Player player, LivingEntity livingEntity) {
        switch (this.tier) {
            case BLAZE_ROD -> livingEntity.setSecondsOnFire(2);
            case BONE -> livingEntity.addEffect(new MobEffectInstance(MobEffects.WITHER, 20 * 5, 1));
            case LIGHTNING_ROD -> TieredBowItem.lightingCausedByPlayer(player, livingEntity.blockPosition());
            case PAPER -> TieredBowItem.randomEntityEffects(player, livingEntity);
        }
    }

    public void playerAttacksBlock(Player player, BlockHitResult blockHitResult) {

        switch (this.tier) {
            case BLAZE_ROD -> TieredBowItem.lightOrIgniteBlock(blockHitResult, player.level());
            case LIGHTNING_ROD -> TieredBowItem.lightingCausedByPlayer(player, blockHitResult.getBlockPos());
            case PAPER -> TieredBowItem.randomBlockEffects(player, blockHitResult);
        }
    }
}
