package io.github.Cryberry.cryb_mod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.quiltmc.loader.api.ModContainer;


public class CrybModItems {
    public static final Item ENDERGEM = new Item(new Item.Settings());
    public static final Block ENDERGEM_ORE = new Block(AbstractBlock.Settings.create());
    public static final Block ENDERGEM_BLOCK = new Block(AbstractBlock.Settings.create());
    public static final Item ENDERGEM_HELMET = new ArmorItem(CrybModArmorMaterials.ENDERGEM, ArmorItem.ArmorSlot.HELMET, new Item.Settings().maxDamage(ArmorItem.ArmorSlot.HELMET.getBaseDurability(CrybModArmorMaterials.ENDERGEM_DURABILITY_MULTIPLIER)));
    public static final Item ENDERGEM_CHESTPLATE = new ArmorItem(CrybModArmorMaterials.ENDERGEM, ArmorItem.ArmorSlot.CHESTPLATE, new Item.Settings().maxDamage(ArmorItem.ArmorSlot.CHESTPLATE.getBaseDurability(CrybModArmorMaterials.ENDERGEM_DURABILITY_MULTIPLIER)));
    public static final Item ENDERGEM_LEGGINGS = new ArmorItem(CrybModArmorMaterials.ENDERGEM, ArmorItem.ArmorSlot.LEGGINGS, new Item.Settings().maxDamage(ArmorItem.ArmorSlot.LEGGINGS.getBaseDurability(CrybModArmorMaterials.ENDERGEM_DURABILITY_MULTIPLIER)));
    public static final Item ENDERGEM_BOOTS = new ArmorItem(CrybModArmorMaterials.ENDERGEM, ArmorItem.ArmorSlot.BOOTS, new Item.Settings().maxDamage(ArmorItem.ArmorSlot.BOOTS.getBaseDurability(CrybModArmorMaterials.ENDERGEM_DURABILITY_MULTIPLIER)));
    public static final Item ENDERGEM_SWORD = new SwordItem(CrybModToolMaterials.ENDERGEM, new Item.Settings());
    public static final Item ENDERGEM_PICKAXE = new PickaxeItem(CrybModToolMaterials.ENDERGEM, new Item.Settings());
    public static final Item ENDERGEM_AXE = new AxeItem(CrybModToolMaterials.ENDERGEM, new Item.Settings());
    public static final Item ENDERGEM_SHOVEL = new ShovelItem(CrybModToolMaterials.ENDERGEM, new Item.Settings());
    public static final Item ENDERGEM_HOE = new HoeItem(CrybModToolMaterials.ENDERGEM, new Item.Settings());

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
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_sword"), ENDERGEM_SWORD);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_pickaxe"), ENDERGEM_PICKAXE);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_axe"), ENDERGEM_AXE);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_shovel"), ENDERGEM_SHOVEL);
        Registry.register(Registries.ITEM, Identifier.of(mod.metadata().id(), "endergem_hoe"), ENDERGEM_HOE);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Blocks.NETHERITE_BLOCK.asItem(), ENDERGEM_BLOCK.asItem());
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS_AND_UTILITIES).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Items.NETHERITE_HOE, ENDERGEM_SHOVEL, ENDERGEM_PICKAXE, ENDERGEM_AXE, ENDERGEM_HOE);
        } );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.addAfter(Items.NETHERITE_SWORD, ENDERGEM_SWORD);
            fabricItemGroupEntries.addAfter(Items.NETHERITE_AXE, ENDERGEM_AXE);
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
            fabricItemGroupEntries.addItem(ENDERGEM_SWORD);
            fabricItemGroupEntries.addItem(ENDERGEM_PICKAXE);
            fabricItemGroupEntries.addItem(ENDERGEM_AXE);
            fabricItemGroupEntries.addItem(ENDERGEM_HOE);
            fabricItemGroupEntries.addItem(ENDERGEM_SHOVEL);
            fabricItemGroupEntries.addItem(ENDERGEM_HELMET);
            fabricItemGroupEntries.addItem(ENDERGEM_CHESTPLATE);
            fabricItemGroupEntries.addItem(ENDERGEM_LEGGINGS);
            fabricItemGroupEntries.addItem(ENDERGEM_BOOTS);
        });
    }
}
