package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class TieredArrowEntityRenderer extends ArrowRenderer<TieredArrowEntity> {

    public TieredArrowEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public @NotNull ResourceLocation getTextureLocation(TieredArrowEntity tieredArrow) {
        return ResourceLocation.fromNamespaceAndPath(Constants.MOD_ID, "textures/entity/arrow/" + tieredArrow.getVariant().getSerializedName() + "_arrow.png");
    }
}
