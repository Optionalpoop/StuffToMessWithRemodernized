
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class BuildingWandarItem extends Item {
	public BuildingWandarItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
