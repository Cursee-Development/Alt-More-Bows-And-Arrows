package com.cursee.more_bows_and_arrows;

import com.cursee.more_bows_and_arrows.platform.Services;

public class MoreBowsAndArrows {

    public static void init() {
        if (Services.PLATFORM.isDevelopmentEnvironment()) Constants.LOG.info("Initialized core in development environment!");
    }
}