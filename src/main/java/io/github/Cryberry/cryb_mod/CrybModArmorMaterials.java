package io.github.Cryberry.cryb_mod;


import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Holder;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class CrybModArmorMaterials {
    public static void initialize() {};

    public static final int ENDERGEM_DURABILITY_MULTIPLIER = 15;

    public static final Holder<ArmorMaterial> ENDERGEM = register("endergem",
            Map.of(
                    ArmorItem.ArmorSlot.HELMET, 9,
                    ArmorItem.ArmorSlot.CHESTPLATE, 27,
                    ArmorItem.ArmorSlot.LEGGINGS, 18,
                    ArmorItem.ArmorSlot.BOOTS, 9
            ),
            27,
            SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,
            0.0F,
            -0.3F,
            () -> Ingredient.ofItems(CrybModItems.ENDERGEM)
    );

    private static Holder<ArmorMaterial> register(
            String name,
            Map<ArmorItem.ArmorSlot, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient
    ) {
        List<ArmorMaterial.Layer> list = List.of(new ArmorMaterial.Layer(Identifier.ofDefault(name)));
        return register(name, defense, enchantmentValue, equipSound, toughness, knockbackResistance, repairIngredient, list);
    }
    public static Holder<ArmorMaterial> register(
            String name,
            Map<ArmorItem.ArmorSlot, Integer> defense,
            int enchantmentValue,
            Holder<SoundEvent> equipSound,
            float toughness,
            float knockbackResistance,
            Supplier<Ingredient> repairIngredient,
            List<ArmorMaterial.Layer> layers
            ) {
        EnumMap<ArmorItem.ArmorSlot, Integer> enumMap = new  EnumMap<>(ArmorItem.ArmorSlot.class);

        for (ArmorItem.ArmorSlot armorSlot : ArmorItem.ArmorSlot.values()) {
            enumMap.put(armorSlot, (Integer) defense.get(armorSlot));
        }

        return Registry.registerHolder(
                Registries.ARMOR_MATERIAL,
                Identifier.ofDefault(name),
                new ArmorMaterial(enumMap, enchantmentValue, equipSound, repairIngredient, layers, toughness, knockbackResistance)
        );
    }
}
