
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.LivingEntity;

import net.mcreator.stmwr.procedures.WandOfSlowingLivingEntityIsHitWithItemProcedure;

public class WandOfSlowingItem extends Item {
	public WandOfSlowingItem() {
		super(new Item.Properties().durability(50).rarity(Rarity.COMMON));
	}

	@Override
	public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
		boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
		WandOfSlowingLivingEntityIsHitWithItemProcedure.execute(entity, itemstack);
		return retval;
	}
}
