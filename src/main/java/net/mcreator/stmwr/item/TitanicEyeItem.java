
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TitanicEyeItem extends Item {
	public TitanicEyeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.EPIC));
	}
}
