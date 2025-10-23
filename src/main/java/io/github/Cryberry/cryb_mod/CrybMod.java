package io.github.Cryberry.cryb_mod;

import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrybMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Cryberry's Mod");
    public static final String MOD_ID = "cryb_mod";

    @Override
    public void onInitialize(ModContainer mod) {
        LOGGER.info("Hello Quilt world from {}! Stay fresh!", mod.metadata().name());
        LOGGER.info("Registering {} Armor!", mod.metadata().name());
        CrybModArmorMaterials.initialize();
        LOGGER.info("Registering {} Items!", mod.metadata().name());
        CrybModItems.register(mod);
    }
}