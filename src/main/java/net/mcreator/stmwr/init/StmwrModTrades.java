
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class StmwrModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == StmwrModVillagerProfessions.APOCALYPSE_VILLAGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 2),

					new ItemStack(StmwrModItems.PISTOL_AMMO.get(), 16), 16, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.DURABLE_APPLE.get()), 16, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 8),

					new ItemStack(StmwrModItems.WINGED_APPLE.get()), 8, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 2),

					new ItemStack(StmwrModItems.STEEL_CORE.get(), 4), 10, 6, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.STEEL_INGOT.get(), 4), 16, 7, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 6),

					new ItemStack(StmwrModItems.MUTANT_GOOP.get()), 4, 10, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.RAW_TOTEM.get(), 4), 24, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.ADVANCED_TOTEM_BASE.get(), 2), 12, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.PIKASTAFF.get()), 8, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 2),

					new ItemStack(StmwrModItems.WEAK_SOUL.get()), 4, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 16),

					new ItemStack(StmwrModItems.ASSAULT_RIFLE.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 2),

					new ItemStack(StmwrModItems.ASSAULT_RIFLE_AMMO.get(), 16), 10, 5, 0.05f));
		}
		if (event.getType() == StmwrModVillagerProfessions.MAGIC_VILLAGER.get()) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.MAGICITE_DUST.get(), 16), 32, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.GODLIUM_INGOT.get(), 4), 32, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.WANDAR_CORE.get(), 4), 15, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.DIRT_NUGGET.get(), 8), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 2),

					new ItemStack(StmwrModItems.CASTING_WANDAR.get(), 4), 16, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 2),

					new ItemStack(StmwrModItems.BUILDING_WANDAR.get(), 4), 16, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 3),

					new ItemStack(StmwrModItems.WEAK_SOUL.get()), 16, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get()),

					new ItemStack(StmwrModItems.MYSTICAL_PAGE.get()), 16, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 10),

					new ItemStack(StmwrModItems.EMPTY_SPELL_BOOK.get()), 16, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(StmwrModItems.NOOBISH_TRIAL_COIN.get(), 20),

					new ItemStack(StmwrModItems.SPELL_BOOK_OF_TRANSMUTATION.get()), 8, 5, 0.05f));
		}
	}
}
