
package net.mcreator.stmwr.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.stmwr.procedures.WandOfTransmutationRightclickedOnBlockProcedure;

public class WandOfTransmutationItem extends Item {
	public WandOfTransmutationItem() {
		super(new Item.Properties().durability(100).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		WandOfTransmutationRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getItemInHand());
		return InteractionResult.SUCCESS;
	}
}
