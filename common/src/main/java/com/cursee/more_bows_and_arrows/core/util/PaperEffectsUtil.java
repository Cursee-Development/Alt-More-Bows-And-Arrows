package com.cursee.more_bows_and_arrows.core.util;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Chicken;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class PaperEffectsUtil {

    public static void randomEntityEffects(Player attacker, LivingEntity defender) {

        switch (attacker.getRandom().nextInt(1, 8)) {
            case 1 -> CommonEffectsUtil.lightingCausedByPlayer(attacker, defender.blockPosition());
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

    public static void randomBlockEffects(Player player, BlockHitResult blockHitResult) {

        final BlockPos blockPos = blockHitResult.getBlockPos();

        switch (player.getRandom().nextInt(1, 8)) {
            case 1 -> player.level().explode(player, blockPos.getX(), blockPos.getY(), blockPos.getZ(), 2.0f, true, Level.ExplosionInteraction.TNT);
            case 2 -> player.teleportTo(blockPos.getX(), blockPos.getY() + 10, blockPos.getZ());
            case 3 -> player.teleportTo(player.xo, player.yo + 10, player.zo);
            case 4 -> player.teleportTo(blockPos.getX(), blockPos.getY(), blockPos.getZ());
            case 5 -> CommonEffectsUtil.lightingCausedByPlayer(player, blockPos);
            case 6 -> FireworkUtil.createRandomFireworkFromEntity(player, blockHitResult.getBlockPos());
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
}
