
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.stmwr.client.gui.ModifiersTableScreen;
import net.mcreator.stmwr.client.gui.CubbyCubeGUIScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StmwrModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StmwrModMenus.CUBBY_CUBE_GUI.get(), CubbyCubeGUIScreen::new);
			MenuScreens.register(StmwrModMenus.MODIFIERS_TABLE.get(), ModifiersTableScreen::new);
		});
	}
}
