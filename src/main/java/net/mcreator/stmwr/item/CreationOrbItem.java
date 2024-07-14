
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CreationOrbItem extends Item {
	public CreationOrbItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
