package net.mcreator.stmwr.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class BlazedSwordToolInInventoryTickProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.FIRE_ASPECT, 5);
	}
}
