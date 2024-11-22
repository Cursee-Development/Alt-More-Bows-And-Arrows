package com.cursee.more_bows_and_arrows.core.util;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;

public class CommonEffectsUtil {

    public static void lightingCausedByPlayer(Player player, BlockPos blockPos) {

        Level level = player.level();
        LightningBolt bolt = EntityType.LIGHTNING_BOLT.create(level);

        if (bolt == null) return;
        if (player instanceof ServerPlayer serverPlayer) bolt.setCause(serverPlayer);

        bolt.moveTo(Vec3.atBottomCenterOf(blockPos));
        level.addFreshEntity(bolt);
    }

    public static void lightOrIgniteBlock(BlockHitResult result, Level level) {

        final BlockPos blockPos = result.getBlockPos();

        if (!level.getBlockState(blockPos).hasProperty(BlockStateProperties.LIT)) {
            BlockPos relativePosition = blockPos.relative(result.getDirection());
            if (level.isEmptyBlock(relativePosition)) level.setBlockAndUpdate(relativePosition, BaseFireBlock.getState(level, relativePosition));
        }
        else {
            level.setBlock(blockPos, level.getBlockState(blockPos).setValue(BlockStateProperties.LIT, true), Block.UPDATE_ALL);
        }
    }
}
