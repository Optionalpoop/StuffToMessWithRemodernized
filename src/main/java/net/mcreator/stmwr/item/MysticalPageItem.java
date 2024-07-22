
package net.mcreator.stmwr.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MysticalPageItem extends Item {
	public MysticalPageItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
