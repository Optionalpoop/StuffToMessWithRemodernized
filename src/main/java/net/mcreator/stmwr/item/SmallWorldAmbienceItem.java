
package net.mcreator.stmwr.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class SmallWorldAmbienceItem extends RecordItem {
	public SmallWorldAmbienceItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stmwr:smallworldambience")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 10000);
	}
}
