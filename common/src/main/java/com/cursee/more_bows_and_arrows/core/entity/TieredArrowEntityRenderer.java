package com.cursee.more_bows_and_arrows.core.entity;

import com.cursee.more_bows_and_arrows.Constants;
import net.minecraft.client.renderer.entity.ArrowRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;

public class TieredArrowEntityRenderer extends ArrowRenderer<TieredArrowEntity> {

    public TieredArrowEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public ResourceLocation getTextureLocation(TieredArrowEntity tieredArrow) {
        return new ResourceLocation(Constants.MOD_ID, "textures/entity/arrow/" + tieredArrow.getVariant().getSerializedName() + "_arrow.png");
    }
}
