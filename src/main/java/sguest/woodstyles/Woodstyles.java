package sguest.woodstyles;

import static sguest.woodstyles.Woodstyles.MOD_ID;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MOD_ID)
public class Woodstyles {
    public static final String MOD_ID = "woodstyles";

    private static final Logger LOGGER = LogManager.getLogger();

    public Woodstyles()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        LOGGER.info("Woodstyles pre-init");
    }
}
