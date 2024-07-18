
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AdvancedTotemBaseItem extends Item {
	public AdvancedTotemBaseItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
