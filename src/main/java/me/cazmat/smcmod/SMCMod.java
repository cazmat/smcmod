package me.cazmat.smcmod;

import com.mojang.logging.LogUtils;
import me.cazmat.smcmod.config.ConfigManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(Constants.MOD_ID)
public class SMCMod {
    private static final Logger LOGGER = LogUtils.getLogger();

    public SMCMod() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigManager.SPEC);

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
