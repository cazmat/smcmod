package me.cazmat.smcmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class ConfigManager {
    private static ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;
    // Vanilla Portals Configuration
    private static final ForgeConfigSpec.BooleanValue END_PORTAL_ENABLED;
    private static final ForgeConfigSpec.BooleanValue NETHER_PORTAL_ENABLED;
    private static final ForgeConfigSpec.BooleanValue PLAYERMOB_HOSTILE;
    static {
        BUILDER.push("Vanilla Portals");
        END_PORTAL_ENABLED = BUILDER.define("endPortalEnabled", false);
        NETHER_PORTAL_ENABLED = BUILDER.define("netherPortalEnabled", false);
        BUILDER.pop();
        BUILDER.push("PlayerMob Settings");
        PLAYERMOB_HOSTILE = BUILDER.define("playerMobHostile", true);
        BUILDER.pop();
        SPEC = BUILDER.build();
    }
    public static boolean isEndPortalEnabled() {
        return END_PORTAL_ENABLED.get();
    }
    public static boolean isNetherPortalEnabled() {
        return NETHER_PORTAL_ENABLED.get();
    }
    public static boolean arePlayerMobsHostile() {
        return PLAYERMOB_HOSTILE.get();
    }
}
