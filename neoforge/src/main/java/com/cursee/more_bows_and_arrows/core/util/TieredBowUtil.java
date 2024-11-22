package com.cursee.more_bows_and_arrows.core.util;

import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class TieredBowUtil {
    public static <T extends Item> void registerItemProperties(T bowItem) {
        ItemProperties.register(bowItem, ResourceLocation.withDefaultNamespace("pull"), (stack, world, entity, seed) -> (entity == null || entity.getUseItem() != stack) ? 0.0f : (float)(stack.getUseDuration(entity) - entity.getUseItemRemainingTicks()) / 20.0f);
        ItemProperties.register(bowItem, ResourceLocation.withDefaultNamespace("pulling"), (stack, world, entity, seed) -> entity != null && entity.isUsingItem() && entity.getUseItem() == stack ? 1.0f : 0.0f);
    }
}
