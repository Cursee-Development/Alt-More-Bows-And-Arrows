package com.cursee.more_bows_and_arrows.platform;

import com.cursee.more_bows_and_arrows.core.tier.ArrowTier;
import com.cursee.more_bows_and_arrows.platform.services.IPlatformHelper;
import net.minecraft.world.entity.EntityType;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.loading.FMLLoader;

@SuppressWarnings("all")
public class ForgePlatformHelper implements IPlatformHelper {

    @Override
    public String getPlatformName() {

        return "Forge";
    }

    @Override
    public boolean isModLoaded(String modId) {

        return ModList.get().isLoaded(modId);
    }

    @Override
    public boolean isDevelopmentEnvironment() {

        return !FMLLoader.isProduction();
    }

    @Override
    public EntityType entityFromTier(ArrowTier tier) {
        return null;
    }
}