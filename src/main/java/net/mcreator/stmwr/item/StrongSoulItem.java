
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class StrongSoulItem extends Item {
	public StrongSoulItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
