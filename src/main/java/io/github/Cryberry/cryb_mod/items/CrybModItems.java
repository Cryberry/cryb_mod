package io.github.Cryberry.cryb_mod.items;

import io.github.Cryberry.cryb_mod.CrybModArmorMaterials;
import io.github.Cryberry.cryb_mod.CrybModToolMaterials;
import io.github.Cryberry.cryb_mod.components.CrybModGripComponent;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.int_provider.ConstantIntProvider;
import org.quiltmc.loader.api.ModContainer;


public class CrybModItems {
    public static final Item ENDERGEM = new Item(new Item.Settings());
    public static final Block ENDERGEM_ORE = new ExperienceDroppingBlock(
            ConstantIntProvider.create(9),
            AbstractBlock.Settings.create().strength(1F, 150.0F).toolRequired()
    );
    public static final Block ENDERGEM_BLOCK = new Block(Block.Settings.create().toolRequired().strength(9F, 150F));
    public static final Item ENDERGEM_HELMET = new ArmorItem(CrybModArmorMaterials.ENDERGEM, ArmorItem.ArmorSlot.HELMET, new Item.Settings().maxDamage(ArmorItem.ArmorSlot.HELMET.getBaseDurability(CrybModArmorMaterials.ENDERGEM_DURABILITY_MULTIPLIER)));
    public static final Item ENDERGEM_CHESTPLATE = new ArmorItem(CrybModArmorMaterials.ENDERGEM, ArmorItem.ArmorSlot.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.ArmorSlot.CHESTPLATE.getBaseDurability(CrybModArmorMaterials.ENDERGEM_DURABILITY_MULTIPLIER)));
    public static final Item ENDERGEM_LEGGINGS = new ArmorItem(CrybModArmorMaterials.ENDERGEM, ArmorItem.ArmorSlot.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.ArmorSlot.LEGGINGS.getBaseDurability(CrybModArmorMaterials.ENDERGEM_DURABILITY_MULTIPLIER)));
    public static final Item ENDERGEM_BOOTS = new ArmorItem(CrybModArmorMaterials.ENDERGEM, ArmorItem.ArmorSlot.BOOTS, new Item.Settings().maxDamage(ArmorItem.ArmorSlot.BOOTS.getBaseDurability(CrybModArmorMaterials.ENDERGEM_DURABILITY_MULTIPLIER)));
    public static final Item ENDERGEM_VIRTUAL_SWORD = new SwordItem(CrybModToolMaterials.ENDERGEM, new Item.Settings().attributeModifiersComponent(SwordItem.createAttributes(CrybModToolMaterials.ENDERGEM, 3, 2.4F)).rarity(Rarity.EPIC));
    public static final Item ENDERGEM_VIRTUAL_PICKAXE = new PickaxeItem(CrybModToolMaterials.ENDERGEM, new Item.Settings().attributeModifiersComponent(PickaxeItem.createAttributes(CrybModToolMaterials.ENDERGEM, 3, 2.4F)).rarity(Rarity.EPIC));
    public static final Item ENDERGEM_VIRTUAL_AXE = new AxeItem(CrybModToolMaterials.ENDERGEM, new Item.Settings().attributeModifiersComponent(AxeItem.createAttributes(CrybModToolMaterials.ENDERGEM, 3, 2.4F)).rarity(Rarity.EPIC));
    public static final Item ENDERGEM_VIRTUAL_SHOVEL = new ShovelItem(CrybModToolMaterials.ENDERGEM, new Item.Settings().attributeModifiersComponent(ShovelItem.createAttributes(CrybModToolMaterials.ENDERGEM, 3, 2.4F)).rarity(Rarity.EPIC));
    public static final Item ENDERGEM_VIRTUAL_HOE = new HoeItem(CrybModToolMaterials.ENDERGEM, new Item.Settings().attributeModifiersComponent(HoeItem.createAttributes(CrybModToolMaterials.ENDERGEM, 3, 2.4F)).rarity(Rarity.EPIC));
    public static final Item ENDERGEM_PICKAXE = new PickaxeShovel(CrybModToolMaterials.ENDERGEM, new Item.Settings().component(CrybModGripComponent.GRIP, false), "endergem_pickaxe_grip_1", "endergem_pickaxe_grip_2");
    public static final Item ENDERGEM_CLEAVER = new TwoGripTool(CrybModToolMaterials.ENDERGEM, new Item.Settings().component(CrybModGripComponent.GRIP, false), "endergem_cleaver_grip_1", "endergem_cleaver_grip_2");
    public static final Item ENDERGEM_HALBERD = new TwoGripTool(CrybModToolMaterials.ENDERGEM, new Item.Settings().component(CrybModGripComponent.GRIP, false), "endergem_halberd_grip_1", "endergem_halberd_grip_2");
    public static final Item ENDERGEM_SHOVEL = new TwoGripTool(CrybModToolMaterials.ENDERGEM, new Item.Settings().component(CrybModGripComponent.GRIP, false),  "endergem_shovel_1", "endergem_shovel_2");
    public static final Item ENDERGEM_PLOW = new TwoGripTool(CrybModToolMaterials.ENDERGEM, new Item.Settings().component(CrybModGripComponent.GRIP, false), "endergem_plow_grip_1", "endergem_plow_grip_2");

    public static void register(ModContainer mod) {
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem"), ENDERGEM);
        Registry.register(Registries.BLOCK, Identifier.of(mod.metadata().id(), "endergem_ore"), ENDERGEM_ORE);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_ore"), new BlockItem(ENDERGEM_ORE, new Item.Settings()));
        Registry.register(Registries.BLOCK, Identifier.of(mod.metadata().id(), "endergem_block"), ENDERGEM_BLOCK);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_block"), new BlockItem(ENDERGEM_BLOCK, new Item.Settings()));
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_helmet"), ENDERGEM_HELMET);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_chestplate"), ENDERGEM_CHESTPLATE);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_leggings"), ENDERGEM_LEGGINGS);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_boots"), ENDERGEM_BOOTS);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_cleaver"), ENDERGEM_CLEAVER);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_pickaxe"), ENDERGEM_PICKAXE);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_halberd"), ENDERGEM_HALBERD);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_shovel"), ENDERGEM_SHOVEL);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_plow"), ENDERGEM_PLOW);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_virtual_sword"), ENDERGEM_VIRTUAL_SWORD);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_virtual_pickaxe"), ENDERGEM_VIRTUAL_PICKAXE);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_virtual_axe"), ENDERGEM_VIRTUAL_AXE);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_virtual_shovel"), ENDERGEM_VIRTUAL_SHOVEL);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_virtual_hoe"), ENDERGEM_VIRTUAL_HOE);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Blocks.NETHERITE_BLOCK.asItem(), ENDERGEM_BLOCK.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS_AND_UTILITIES).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Items.NETHERITE_HOE, ENDERGEM_SHOVEL, ENDERGEM_PICKAXE, ENDERGEM_HALBERD, ENDERGEM_PLOW);
        } );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Items.NETHERITE_SWORD, ENDERGEM_CLEAVER);
            fabricItemGroupEntries.addAfter(Items.NETHERITE_AXE, ENDERGEM_HALBERD);
            fabricItemGroupEntries.addAfter(Items.DIAMOND_BOOTS, ENDERGEM_HELMET, ENDERGEM_CHESTPLATE, ENDERGEM_LEGGINGS, ENDERGEM_BOOTS);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL_BLOCKS).register(fabricItemGroupEntries ->{
            fabricItemGroupEntries.addAfter(Blocks.ANCIENT_DEBRIS.asItem(), ENDERGEM_ORE.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addItem(ENDERGEM);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.SEARCH_ITEMS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addItem(ENDERGEM);
            fabricItemGroupEntries.addItem(ENDERGEM_ORE.asItem());
            fabricItemGroupEntries.addItem(ENDERGEM_BLOCK.asItem());
            fabricItemGroupEntries.addItem(ENDERGEM_CLEAVER);
            fabricItemGroupEntries.addItem(ENDERGEM_PICKAXE);
            fabricItemGroupEntries.addItem(ENDERGEM_HALBERD);
            fabricItemGroupEntries.addItem(ENDERGEM_PLOW);
            fabricItemGroupEntries.addItem(ENDERGEM_SHOVEL);
            fabricItemGroupEntries.addItem(ENDERGEM_HELMET);
            fabricItemGroupEntries.addItem(ENDERGEM_CHESTPLATE);
            fabricItemGroupEntries.addItem(ENDERGEM_LEGGINGS);
            fabricItemGroupEntries.addItem(ENDERGEM_BOOTS);
        });
    }
}
