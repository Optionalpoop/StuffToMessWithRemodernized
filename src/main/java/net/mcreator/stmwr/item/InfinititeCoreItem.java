
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class InfinititeCoreItem extends Item {
	public InfinititeCoreItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
