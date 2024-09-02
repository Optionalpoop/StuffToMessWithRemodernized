
package net.mcreator.stmwr.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class GiantStevECowMusicItem extends RecordItem {
	public GiantStevECowMusicItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stmwr:stevecowbossmusic")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 10000);
	}
}
