package net.mcreator.stmwr.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.stmwr.init.StmwrModItems;
import net.mcreator.stmwr.init.StmwrModBlocks;

public class PortalStevecowProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(StmwrModBlocks.TRIAL_BRICK.get()).copy();
			_setstack.setCount(64);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
		if (entity instanceof Player _player) {
			ItemStack _setstack = new ItemStack(StmwrModItems.LAND_OF_THE_STEVE_COWS.get()).copy();
			_setstack.setCount(1);
			ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
		}
	}
}
