package io.github.Cryberry.cryb_mod.items;

import io.github.Cryberry.cryb_mod.CrybMod;
import io.github.Cryberry.cryb_mod.components.CrybModGripComponent;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.awt.*;

public class TwoGripTool extends ToolItem {
    protected String modelPath1;
    protected String modelPath2;

    public TwoGripTool(ToolMaterial material, Settings settings, String model1, String model2) {
        super(material, settings);
        this.modelPath1=model1;
        this.modelPath2=model2;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if (world.isClient)  {
            return TypedActionResult.pass(itemStack);
        }
        itemStack.set(CrybModGripComponent.GRIP, !CrybModGripComponent.GRIP.isTransient());
        CrybMod.LOGGER.info("Grip Swap!");
        return TypedActionResult.success(itemStack);
    }


}