package me.cazmat.smcmod;

import me.cazmat.smcmod.config.ConfigManager;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.loading.FMLPaths;

import java.util.Calendar;
import java.util.Date;

@Mod(Constants.MOD_ID)
public class SMCMod {
    private static boolean isDateAprilFools = false;
    private static boolean isDateChristmas = false;
    private static boolean isDateHalloween = false;
    public SMCMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigManager.COMMON_CONFIG);
        ConfigManager.loadConfig(ConfigManager.COMMON_CONFIG, FMLPaths.CONFIGDIR.get().resolve(Constants.MOD_ID + "-common.toml"));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        isDateAprilFools = calendar.get(Calendar.MONTH) + 1 == 4 && calendar.get(Calendar.DATE) == 1;
        isDateChristmas = calendar.get(Calendar.MONTH) + 1 == 12 && calendar.get(Calendar.DATE) >= 24 && calendar.get(Calendar.DATE) <= 26;
        isDateHalloween = calendar.get(Calendar.MONTH) + 1 == 10 && calendar.get(Calendar.DATE) >= 29 && calendar.get(Calendar.DATE) <= 31;
    }

    public static boolean isAprilFools() {
        return isDateAprilFools;
    }
    public static boolean isHalloween() {
        return isDateHalloween;
    }
    public static boolean isChristmas() {
        return isDateChristmas;
    }
}
