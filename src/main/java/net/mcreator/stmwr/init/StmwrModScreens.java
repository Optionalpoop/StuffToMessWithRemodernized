
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.stmwr.client.gui.UpgradeStationTutorialSheetGUIScreen;
import net.mcreator.stmwr.client.gui.UpgradeStationGUIScreen;
import net.mcreator.stmwr.client.gui.ModifiersTableScreen;
import net.mcreator.stmwr.client.gui.MasterCubbyPackGUIScreen;
import net.mcreator.stmwr.client.gui.MasterCubbyCubeGUIScreen;
import net.mcreator.stmwr.client.gui.BasicCubbyPackGUIScreen;
import net.mcreator.stmwr.client.gui.BasicCubbyCubeGUIScreen;
import net.mcreator.stmwr.client.gui.AdvancedCubbyPackGUIScreen;
import net.mcreator.stmwr.client.gui.AdvancedCubbyCubeGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StmwrModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StmwrModMenus.MODIFIERS_TABLE.get(), ModifiersTableScreen::new);
			MenuScreens.register(StmwrModMenus.BASIC_CUBBY_CUBE_GUI.get(), BasicCubbyCubeGUIScreen::new);
			MenuScreens.register(StmwrModMenus.BASIC_CUBBY_PACK_GUI.get(), BasicCubbyPackGUIScreen::new);
			MenuScreens.register(StmwrModMenus.ADVANCED_CUBBY_CUBE_GUI.get(), AdvancedCubbyCubeGUIScreen::new);
			MenuScreens.register(StmwrModMenus.ADVANCED_CUBBY_PACK_GUI.get(), AdvancedCubbyPackGUIScreen::new);
			MenuScreens.register(StmwrModMenus.MASTER_CUBBY_CUBE_GUI.get(), MasterCubbyCubeGUIScreen::new);
			MenuScreens.register(StmwrModMenus.MASTER_CUBBY_PACK_GUI.get(), MasterCubbyPackGUIScreen::new);
			MenuScreens.register(StmwrModMenus.UPGRADE_STATION_GUI.get(), UpgradeStationGUIScreen::new);
			MenuScreens.register(StmwrModMenus.UPGRADE_STATION_TUTORIAL_SHEET_GUI.get(), UpgradeStationTutorialSheetGUIScreen::new);
		});
	}
}
