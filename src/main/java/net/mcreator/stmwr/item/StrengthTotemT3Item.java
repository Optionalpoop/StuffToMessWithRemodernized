
package net.mcreator.stmwr.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.stmwr.procedures.StrengthTotemT3RightclickedProcedure;

public class StrengthTotemT3Item extends Item {
	public StrengthTotemT3Item() {
		super(new Item.Properties().durability(30).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		StrengthTotemT3RightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}
}
