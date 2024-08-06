
package net.mcreator.stmwr.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.stmwr.procedures.SandWormCallerRightclickedProcedure;

public class SandWormCallerItem extends Item {
	public SandWormCallerItem() {
		super(new Item.Properties().durability(10).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SandWormCallerRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), ar.getObject());
		return ar;
	}
}
