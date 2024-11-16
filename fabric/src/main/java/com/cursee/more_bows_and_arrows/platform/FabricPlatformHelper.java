package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import com.cursee.more_bows_and_arrows.platform.services.IPlatformHelper;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.world.entity.EntityType;

@SuppressWarnings("all")
public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {
        return "Fabric";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return FabricLoader.getInstance().isModLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return FabricLoader.getInstance().isDevelopmentEnvironment();
    }

    @Override
    public EntityType entityFromTier(ArrowTier tier) {
        return null;
    }
}
