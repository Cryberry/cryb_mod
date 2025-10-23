package io.github.Cryberry.cryb_mod;

import com.google.common.base.Suppliers;
import net.minecraft.block.Block;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.ToolMaterials;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum CrybModToolMaterials implements ToolMaterial {
    ENDERGEM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1337, 9.9F, 3.3F, 18, () -> Ingredient.ofItems(CrybModItems.ENDERGEM));

    private final TagKey<Block> incorrectForDropsBlocks;
    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    private CrybModToolMaterials(
            final TagKey<Block> incorrectForDropsBlocks,
            final int itemDurability,
            final float miningSpeed,
            final float attackDamage,
            final int enchantability,
            final Supplier<Ingredient> obj
    ) {
        this.incorrectForDropsBlocks = incorrectForDropsBlocks;
        this.durability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = Suppliers.memoize(obj::get);
    };

    @Override
    public int getDurability() {
        return this.durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getIncorrectForDropsBlocks() {
        return this.incorrectForDropsBlocks;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
