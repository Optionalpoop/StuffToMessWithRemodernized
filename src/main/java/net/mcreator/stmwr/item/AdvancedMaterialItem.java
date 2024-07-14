
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AdvancedMaterialItem extends Item {
	public AdvancedMaterialItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
