
package net.mcreator.stmwr.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class WizardWorldAmbienceItem extends RecordItem {
	public WizardWorldAmbienceItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("stmwr:wizardworldambience")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 10000);
	}
}
