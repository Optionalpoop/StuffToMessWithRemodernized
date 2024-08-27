
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class CloakFragmentItem extends Item {
	public CloakFragmentItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.RARE));
	}
}
