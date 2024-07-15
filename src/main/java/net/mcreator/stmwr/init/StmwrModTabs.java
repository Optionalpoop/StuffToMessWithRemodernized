
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.stmwr.StmwrMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
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
				tabData.accept(StmwrModItems.BUILDERS_WAND.get());
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
				tabData.accept(StmwrModItems.WANDAR.get());
				tabData.accept(StmwrModItems.ADVANCED_WAND_STICK.get());
				tabData.accept(StmwrModItems.IRON_WAND.get());
				tabData.accept(StmwrModItems.COAL_WAND.get());
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
				tabData.accept(StmwrModBlocks.CUBBY_CUBE.get().asItem());
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
				tabData.accept(StmwrModItems.SUGGESTIUM.get());
				tabData.accept(StmwrModBlocks.SUGGESTIUM_ORE.get().asItem());
				tabData.accept(StmwrModBlocks.SUGGESTIUM_BLOCK.get().asItem());
				tabData.accept(StmwrModItems.IDK_SOMETHING.get());
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
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(StmwrModItems.FROST_ZOMBIE_SPAWN_EGG.get());
		}
	}
}
