
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BasicSpellbookItem extends Item {
	public BasicSpellbookItem() {
		super(new Item.Properties().stacksTo(4).rarity(Rarity.COMMON));
	}
}
