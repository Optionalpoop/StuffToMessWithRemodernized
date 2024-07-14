
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class GoopItem extends Item {
	public GoopItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
