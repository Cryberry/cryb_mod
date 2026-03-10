package io.github.Cryberry.cryb_mod.components;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.PrimitiveCodec;
import io.github.Cryberry.cryb_mod.CrybMod;
import net.minecraft.component.DataComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CrybModGripComponent {
    public static final DataComponentType<Boolean> GRIP = register("grip");

    public static <T>DataComponentType<T> register(String name) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, Identifier.of(CrybMod.MOD_ID, name), DataComponentType.<T>builder().codec((Codec<T>) PrimitiveCodec.BOOL).build());
    }

    public static void registerGripComponent() {
        CrybMod.LOGGER.info("Firmly grasping it!");
    }
}