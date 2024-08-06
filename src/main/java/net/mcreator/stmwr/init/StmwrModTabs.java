
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.stmwr.StmwrMod;

public class StmwrModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, StmwrMod.MODID);
	public static final RegistryObject<CreativeModeTab> STMW_5 = REGISTRY.register("stmw_5",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.stmwr.stmw_5")).icon(() -> new ItemStack(StmwrModBlocks.INFINITITE_BLOCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(StmwrModItems.ATOM_SMASHER.get());
				tabData.accept(StmwrModItems.DIRT_NUGGET.get());
				tabData.accept(StmwrModItems.MAGICITE_DUST.get());
				tabData.accept(StmwrModBlocks.MAGICITE_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.MAGICITE_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.PLASTIKA.get());
				tabData.accept(StmwrModBlocks.PLASTICILIA.get().asItem());
				tabData.accept(StmwrModItems.GODLIUM_INGOT.get());
				tabData.accept(StmwrModBlocks.GODLIUM_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.GODLIUM_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.GODLIUM_PICKAXE.get());
				tabData.accept(StmwrModItems.GODLIUM_AXE.get());
				tabData.accept(StmwrModItems.GODLIUM_SWORD.get());
				tabData.accept(StmwrModItems.GODLIUM_SHOVEL.get());
				tabData.accept(StmwrModItems.GODLIUM_HOE.get());
				tabData.accept(StmwrModItems.GODLIUM_ARMOR_HELMET.get());
				tabData.accept(StmwrModItems.GODLIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(StmwrModItems.GODLIUM_ARMOR_LEGGINGS.get());
				tabData.accept(StmwrModItems.GODLIUM_ARMOR_BOOTS.get());
				tabData.accept(StmwrModItems.ULTRITE.get());
				tabData.accept(StmwrModItems.RAW_TOTEM.get());
				tabData.accept(StmwrModItems.WAND_STICK.get());
				tabData.accept(StmwrModItems.HEALING_TOTEM.get());
				tabData.accept(StmwrModItems.HEALING_TOTEM_T_2.get());
				tabData.accept(StmwrModItems.HEALTH_TOTEM_T_3.get());
				tabData.accept(StmwrModItems.SPEED_TOTEM_T_1.get());
				tabData.accept(StmwrModItems.SPEED_TOTEM_T_2.get());
				tabData.accept(StmwrModItems.SPEED_TOTEM_T_3.get());
				tabData.accept(StmwrModItems.NIGHTVISION_TOTEM.get());
				tabData.accept(StmwrModItems.JUMPBOOST_TOTEM_T_1.get());
				tabData.accept(StmwrModItems.JUMPBOOST_TOTEM_T_2.get());
				tabData.accept(StmwrModItems.JUMPBOOST_TOTEM_T_3.get());
				tabData.accept(StmwrModItems.HASTE_TOTEM_T_1.get());
				tabData.accept(StmwrModItems.HASTE_TOTEM_T_2.get());
				tabData.accept(StmwrModItems.HASTE_TOTEM_T_3.get());
				tabData.accept(StmwrModItems.ADVANCED_WAND_STICK.get());
				tabData.accept(StmwrModItems.INFINITITE_INGOT.get());
				tabData.accept(StmwrModBlocks.INFINITITE_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.INFINITITE_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.BLAZED_INGOT.get());
				tabData.accept(StmwrModBlocks.BLAZED_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.BLAZED_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.BLAZED_PICKAXE.get());
				tabData.accept(StmwrModItems.BLAZED_AXE.get());
				tabData.accept(StmwrModItems.BLAZED_SWORD.get());
				tabData.accept(StmwrModItems.BLAZED_SHOVEL.get());
				tabData.accept(StmwrModItems.BLAZED_HOE.get());
				tabData.accept(StmwrModItems.BLAZED_ARMOR_HELMET.get());
				tabData.accept(StmwrModItems.BLAZED_ARMOR_CHESTPLATE.get());
				tabData.accept(StmwrModItems.BLAZED_ARMOR_LEGGINGS.get());
				tabData.accept(StmwrModItems.BLAZED_ARMOR_BOOTS.get());
				tabData.accept(StmwrModItems.DOUGH.get());
				tabData.accept(StmwrModItems.ANIMAL_STRAP.get());
				tabData.accept(StmwrModItems.STORUM.get());
				tabData.accept(StmwrModBlocks.STORUM_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.STORUM_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.FIREPROOF_TOTEM.get());
				tabData.accept(StmwrModItems.KNIFE.get());
				tabData.accept(StmwrModItems.RAW_SAUSAGE.get());
				tabData.accept(StmwrModItems.SAUSAGE.get());
				tabData.accept(StmwrModBlocks.TRIAL_BRICK.get().asItem());
				tabData.accept(StmwrModItems.STEVE_COW_HORN.get());
				tabData.accept(StmwrModItems.STEVE_COW_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.LAND_OF_THE_STEVE_COWS.get());
				tabData.accept(StmwrModItems.KEY_PIECE.get());
				tabData.accept(StmwrModItems.STEVUM.get());
				tabData.accept(StmwrModBlocks.STEVUM_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.STEVUM_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.GIANT_STEVE_COW_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.GIANT_STEVE_COW_HEART.get());
				tabData.accept(StmwrModItems.GIANT_CALLER.get());
				tabData.accept(StmwrModItems.UGLUM.get());
				tabData.accept(StmwrModItems.PIKACHU_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.PIKASTAFF.get());
				tabData.accept(StmwrModItems.MYSTERIOUS_SCRAP.get());
				tabData.accept(StmwrModItems.SURVIVOR_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.ADVANCED_MATERIAL.get());
				tabData.accept(StmwrModItems.SOLDIER_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.MUTANT_GOOP.get());
				tabData.accept(StmwrModItems.MUTANT_BOSS_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.MILITARIA.get());
				tabData.accept(StmwrModItems.MUTANT_WHISTLE.get());
				tabData.accept(StmwrModItems.GOOP.get());
				tabData.accept(StmwrModItems.MUTANT_WORM_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.STEEL_INGOT.get());
				tabData.accept(StmwrModBlocks.STEEL_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.STEEL_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.STEEL_PICKAXE.get());
				tabData.accept(StmwrModItems.STEEL_AXE.get());
				tabData.accept(StmwrModItems.STEEL_SWORD.get());
				tabData.accept(StmwrModItems.STEEL_SHOVEL.get());
				tabData.accept(StmwrModItems.STEEL_HOE.get());
				tabData.accept(StmwrModItems.STEEL_ARMOR_HELMET.get());
				tabData.accept(StmwrModItems.STEEL_ARMOR_CHESTPLATE.get());
				tabData.accept(StmwrModItems.STEEL_ARMOR_LEGGINGS.get());
				tabData.accept(StmwrModItems.STEEL_ARMOR_BOOTS.get());
				tabData.accept(StmwrModItems.CHEESE.get());
				tabData.accept(StmwrModItems.CHEESE_STICK.get());
				tabData.accept(StmwrModItems.SHREDDED_BEEF.get());
				tabData.accept(StmwrModItems.TORTILLA.get());
				tabData.accept(StmwrModItems.TACO.get());
				tabData.accept(StmwrModItems.PORTABLE_OVEN.get());
				tabData.accept(StmwrModItems.MAGIC_CARROT.get());
				tabData.accept(StmwrModItems.PIZZA.get());
				tabData.accept(StmwrModItems.PIZZA_SLICE.get());
				tabData.accept(StmwrModItems.CREATION_ORB.get());
				tabData.accept(StmwrModItems.CHOCOLATE.get());
				tabData.accept(StmwrModItems.STRENGTH_TOTEM_T_1.get());
				tabData.accept(StmwrModItems.STRENGTH_TOTEM_T_2.get());
				tabData.accept(StmwrModItems.STRENGTH_TOTEM_T_3.get());
				tabData.accept(StmwrModBlocks.MODIFIER_TABLE.get().asItem());
				tabData.accept(StmwrModItems.ICE_SHARD.get());
				tabData.accept(StmwrModItems.FROST_ZOMBIE_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.PISTOL_AMMO.get());
				tabData.accept(StmwrModItems.PISTOL.get());
				tabData.accept(StmwrModItems.GAS_MASK_ZOMBIE_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.NOOBISH_TRIAL_COIN.get());
				tabData.accept(StmwrModItems.TOTEM_OF_THE_GOOP.get());
				tabData.accept(StmwrModItems.TOTEM_OF_THE_COW.get());
				tabData.accept(StmwrModItems.ADVANCED_TOTEM_BASE.get());
				tabData.accept(StmwrModItems.PORTABLE_CRUCIBLE.get());
				tabData.accept(StmwrModItems.TOTEM_OF_SLOW_FALLING.get());
				tabData.accept(StmwrModBlocks.BASIC_CUBBY_CUBE.get().asItem());
				tabData.accept(StmwrModItems.BASIC_CUBBY_PACK.get());
				tabData.accept(StmwrModItems.STORALIUM.get());
				tabData.accept(StmwrModBlocks.ADVANCED_CUBBY_CUBE.get().asItem());
				tabData.accept(StmwrModItems.ADVANCED_CUBBY_PACK.get());
				tabData.accept(StmwrModBlocks.MASTER_CUBBY_CUBE.get().asItem());
				tabData.accept(StmwrModItems.MASTER_CUBBY_PACK.get());
				tabData.accept(StmwrModItems.WANDAR_CORE.get());
				tabData.accept(StmwrModItems.CASTING_WANDAR.get());
				tabData.accept(StmwrModItems.BUILDING_WANDAR.get());
				tabData.accept(StmwrModItems.TRAPPED_WIZARD_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.WEAK_SOUL.get());
				tabData.accept(StmwrModItems.WIZARD_WORLD.get());
				tabData.accept(StmwrModItems.MYSTICAL_PAGE.get());
				tabData.accept(StmwrModItems.JUNIOR_WIZARD_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.STRONG_SOUL.get());
				tabData.accept(StmwrModItems.DANGEROUS_WIZARD_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.EMPTY_SPELL_BOOK.get());
				tabData.accept(StmwrModItems.HEALING_WAND.get());
				tabData.accept(StmwrModItems.SPELL_BOOK_OF_HEALING.get());
				tabData.accept(StmwrModItems.TOTEM_OF_LEVITATION.get());
				tabData.accept(StmwrModBlocks.TRANSMUTATED_GELATIN.get().asItem());
				tabData.accept(StmwrModItems.WAND_OF_TRANSMUTATION.get());
				tabData.accept(StmwrModItems.WAND_OF_THE_TOWER.get());
				tabData.accept(StmwrModItems.INFINITITE_SCRAP.get());
				tabData.accept(StmwrModItems.INFINITITE_MOLD.get());
				tabData.accept(StmwrModItems.INFINITITE_ARMOR_HELMET.get());
				tabData.accept(StmwrModItems.INFINITITE_ARMOR_CHESTPLATE.get());
				tabData.accept(StmwrModItems.INFINITITE_ARMOR_LEGGINGS.get());
				tabData.accept(StmwrModItems.INFINITITE_ARMOR_BOOTS.get());
				tabData.accept(StmwrModItems.INFINITY_GOLEM_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.FINAL_BOSS_SPAWN_EGG.get());
				tabData.accept(StmwrModItems.IRON_SPIKE.get());
				tabData.accept(StmwrModItems.PEPPERONI.get());
				tabData.accept(StmwrModBlocks.TOTEMIC_CRATE.get().asItem());
				tabData.accept(StmwrModItems.CRATE_TOTEM.get());
				tabData.accept(StmwrModBlocks.FOODY_CRATE.get().asItem());
				tabData.accept(StmwrModBlocks.MAGICIAN_CRATE.get().asItem());
				tabData.accept(StmwrModBlocks.TRIAL_CRATE.get().asItem());
				tabData.accept(StmwrModBlocks.STORING_CRATE.get().asItem());
				tabData.accept(StmwrModBlocks.GENERAL_CRATE.get().asItem());
				tabData.accept(StmwrModBlocks.VANILLA_CRATE.get().asItem());
				tabData.accept(StmwrModItems.CAN.get());
				tabData.accept(StmwrModItems.CANNED_PIKACHU.get());
				tabData.accept(StmwrModBlocks.UPGRADE_STATION.get().asItem());
				tabData.accept(StmwrModItems.EASTER_EGG.get());
				tabData.accept(StmwrModItems.UPGRADE_STATION_TUTORIAL_SHEET.get());
				tabData.accept(StmwrModItems.GODLIUM_CORE.get());
				tabData.accept(StmwrModItems.GEAR_CORE.get());
				tabData.accept(StmwrModBlocks.GEAR_CRATE.get().asItem());
				tabData.accept(StmwrModItems.BLAZED_CORE.get());
				tabData.accept(StmwrModItems.STEEL_CORE.get());
				tabData.accept(StmwrModItems.INFINITITE_CORE.get());
				tabData.accept(StmwrModBlocks.SPELL_BOOK_APPLICATOR.get().asItem());
				tabData.accept(StmwrModItems.SPELL_BOOK_APPLICATOR_TUTORIAL_SHEET.get());
				tabData.accept(StmwrModItems.SPELL_BOOK_OF_TRANSMUTATION.get());
				tabData.accept(StmwrModItems.MAGICIAN_APPLE.get());
				tabData.accept(StmwrModBlocks.APPLE_CRATE.get().asItem());
				tabData.accept(StmwrModItems.BOOSTER_APPLE.get());
				tabData.accept(StmwrModItems.INFINI_BOING_APPLE.get());
				tabData.accept(StmwrModItems.DURABLE_APPLE.get());
				tabData.accept(StmwrModItems.MINER_APPLE.get());
				tabData.accept(StmwrModItems.HEALER_APPLE.get());
				tabData.accept(StmwrModItems.WINGED_APPLE.get());
			})

					.build());
}
