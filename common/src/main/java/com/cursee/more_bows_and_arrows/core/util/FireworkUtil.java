package com.cursee.more_bows_and_arrows.core.util;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.FireworkRocketEntity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class FireworkUtil {

    public static void createRandomFireworkFromEntity(@NotNull LivingEntity owner, BlockHitResult blockHitResult) {

        if (!(owner.level() instanceof ServerLevel serverLevel)) return;

        final BlockPos blockPos = blockHitResult.getBlockPos();
        ItemStack fireworkRocketItem = Items.FIREWORK_ROCKET.getDefaultInstance();

        fireworkRocketItem = FireworkUtil.addRandomFireworkData(serverLevel.getRandom(), fireworkRocketItem);

        FireworkUtil.spawnFireworkEntity(serverLevel, owner, blockPos, fireworkRocketItem);
    }

    private static void spawnFireworkEntity(Level level, LivingEntity owner, BlockPos pos, ItemStack fireworkItem) {
        FireworkRocketEntity fireworkRocketEntity = new FireworkRocketEntity(owner.level(), owner, pos.getX(), pos.getY(), pos.getZ(), fireworkItem);
        fireworkRocketEntity.moveTo(pos.getX(), pos.getY() + 1.0D, pos.getZ());
        level.addFreshEntity(fireworkRocketEntity);
    }

    private static boolean noFireworkExplosionSet(ItemStack stack) {
        if (stack.getTag() == null || !stack.hasTag()) return false;
        return !stack.getTag().contains("Fireworks") || !stack.getTag().getCompound("Fireworks").contains("Explosions");
    }

    private static ItemStack addRandomFireworkData(RandomSource random, ItemStack stack) {

        final ItemStack newRandomFireworkItemStack = stack.copy();

        if (FireworkUtil.noFireworkExplosionSet(stack)) {

            CompoundTag compoundTagFromFireworkItemStack = stack.hasTag() && stack.getTag() != null ? stack.getTag() : new CompoundTag();
            CompoundTag fireworks = compoundTagFromFireworkItemStack.contains("Fireworks") ? compoundTagFromFireworkItemStack.getCompound("Fireworks") : new CompoundTag();

            fireworks.put("Explosions", randomExplosions(random));
            compoundTagFromFireworkItemStack.put("Fireworks", fireworks);
            newRandomFireworkItemStack.setTag(compoundTagFromFireworkItemStack);
        }

        return newRandomFireworkItemStack;
    }

    private static ListTag randomExplosions(RandomSource random) {

        ListTag list = new ListTag();

        list.add(FireworkUtil.randomExplosion(random));

        if (random.nextBoolean()) {
            for (int i = 0; i < random.nextInt(2) + 1; i++) {
                list.add(FireworkUtil.randomExplosion(random));
            }
        }

        return list;
    }

    private static CompoundTag randomExplosion(RandomSource random) {

        final CompoundTag EXPLOSION = new CompoundTag();

        EXPLOSION.putIntArray("Colors", FireworkUtil.randomColors(random, 1));
        EXPLOSION.putIntArray("FadeColors", FireworkUtil.randomColors(random, 5));
        EXPLOSION.putByte("Type", (byte) random.nextInt(5));

        int randomFlickerTrail = random.nextInt(10);

        if (randomFlickerTrail == 7 || randomFlickerTrail == 9) {
            EXPLOSION.putBoolean("Trail", true);
        }

        if (randomFlickerTrail == 8 || randomFlickerTrail == 9) {
            EXPLOSION.putBoolean("Flicker", true);
        }

        return EXPLOSION;
    }

    private static ArrayList<Integer> randomColors(RandomSource random, int probChance) {

        final ArrayList<Integer> RANDOM_COLORS = new ArrayList<>();

        RANDOM_COLORS.add(FireworkUtil.randomColor(random));

        for(int i = 0; i < random.nextInt(3); i++) {
            RANDOM_COLORS.add(FireworkUtil.randomColor(random));
        }

        return RANDOM_COLORS;
    }

    private static int randomColor(RandomSource random) {

        final DyeColor DEFAULTED_COLOR = DyeColor.WHITE;
        final String[] blockedColors = new String[] {
                DyeColor.BLACK.getName(),
                DyeColor.GRAY.getName(),
                DyeColor.LIGHT_GRAY.getName(),
                DyeColor.WHITE.getName()
        };

        DyeColor chosenColor = DyeColor.byId(random.nextInt(DyeColor.values().length));

        Set<Integer> skippedIDSet = Arrays.stream(blockedColors).map(colorName -> DyeColor.byName(colorName, DEFAULTED_COLOR).getId()).collect(Collectors.toSet());
        while(skippedIDSet.contains(chosenColor.getId())) {
            chosenColor = DyeColor.byId(random.nextInt(DyeColor.values().length));
        }

        return chosenColor.getFireworkColor();
    }
}
