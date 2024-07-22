
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SpellBookOfHealingItem extends Item {
	public SpellBookOfHealingItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
