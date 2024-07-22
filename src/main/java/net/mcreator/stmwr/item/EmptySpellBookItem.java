
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptySpellBookItem extends Item {
	public EmptySpellBookItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
