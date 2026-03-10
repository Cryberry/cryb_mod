package io.github.Cryberry.cryb_mod.items;

import io.github.Cryberry.cryb_mod.components.CrybModGripComponent;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.item.*;
import net.minecraft.registry.Registry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class PickaxeShovel extends TwoGripTool{

    public PickaxeShovel(ToolMaterial material, Settings settings, String model1, String model2) {
        super(material, settings, model1, model2);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        ActionResult toolType = super.useOnBlock(context);
        ItemStack stack = context.getStack();
        if (Boolean.TRUE.equals(stack.get(CrybModGripComponent.GRIP))) {
            toolType = CrybModItems.ENDERGEM_VIRTUAL_SHOVEL.useOnBlock(context);
        }
        if (!Boolean.TRUE.equals(stack.get(CrybModGripComponent.GRIP))) {
            toolType = CrybModItems.ENDERGEM_VIRTUAL_PICKAXE.useOnBlock(context);
        }
        return toolType;
    }
}
