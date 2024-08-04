
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.stmwr.world.inventory.UpgradeStationTutorialSheetGUIMenu;
import net.mcreator.stmwr.world.inventory.UpgradeStationGUIMenu;
import net.mcreator.stmwr.world.inventory.ModifiersTableMenu;
import net.mcreator.stmwr.world.inventory.MasterCubbyPackGUIMenu;
import net.mcreator.stmwr.world.inventory.MasterCubbyCubeGUIMenu;
import net.mcreator.stmwr.world.inventory.BasicCubbyPackGUIMenu;
import net.mcreator.stmwr.world.inventory.BasicCubbyCubeGUIMenu;
import net.mcreator.stmwr.world.inventory.AdvancedCubbyPackGUIMenu;
import net.mcreator.stmwr.world.inventory.AdvancedCubbyCubeGUIMenu;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StmwrMod.MODID);
	public static final RegistryObject<MenuType<ModifiersTableMenu>> MODIFIERS_TABLE = REGISTRY.register("modifiers_table", () -> IForgeMenuType.create(ModifiersTableMenu::new));
	public static final RegistryObject<MenuType<BasicCubbyCubeGUIMenu>> BASIC_CUBBY_CUBE_GUI = REGISTRY.register("basic_cubby_cube_gui", () -> IForgeMenuType.create(BasicCubbyCubeGUIMenu::new));
	public static final RegistryObject<MenuType<BasicCubbyPackGUIMenu>> BASIC_CUBBY_PACK_GUI = REGISTRY.register("basic_cubby_pack_gui", () -> IForgeMenuType.create(BasicCubbyPackGUIMenu::new));
	public static final RegistryObject<MenuType<AdvancedCubbyCubeGUIMenu>> ADVANCED_CUBBY_CUBE_GUI = REGISTRY.register("advanced_cubby_cube_gui", () -> IForgeMenuType.create(AdvancedCubbyCubeGUIMenu::new));
	public static final RegistryObject<MenuType<AdvancedCubbyPackGUIMenu>> ADVANCED_CUBBY_PACK_GUI = REGISTRY.register("advanced_cubby_pack_gui", () -> IForgeMenuType.create(AdvancedCubbyPackGUIMenu::new));
	public static final RegistryObject<MenuType<MasterCubbyCubeGUIMenu>> MASTER_CUBBY_CUBE_GUI = REGISTRY.register("master_cubby_cube_gui", () -> IForgeMenuType.create(MasterCubbyCubeGUIMenu::new));
	public static final RegistryObject<MenuType<MasterCubbyPackGUIMenu>> MASTER_CUBBY_PACK_GUI = REGISTRY.register("master_cubby_pack_gui", () -> IForgeMenuType.create(MasterCubbyPackGUIMenu::new));
	public static final RegistryObject<MenuType<UpgradeStationGUIMenu>> UPGRADE_STATION_GUI = REGISTRY.register("upgrade_station_gui", () -> IForgeMenuType.create(UpgradeStationGUIMenu::new));
	public static final RegistryObject<MenuType<UpgradeStationTutorialSheetGUIMenu>> UPGRADE_STATION_TUTORIAL_SHEET_GUI = REGISTRY.register("upgrade_station_tutorial_sheet_gui", () -> IForgeMenuType.create(UpgradeStationTutorialSheetGUIMenu::new));
}
