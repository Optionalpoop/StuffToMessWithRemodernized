
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.stmwr.world.inventory.CubbyCubeGUIMenu;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StmwrMod.MODID);
	public static final RegistryObject<MenuType<CubbyCubeGUIMenu>> CUBBY_CUBE_GUI = REGISTRY.register("cubby_cube_gui", () -> IForgeMenuType.create(CubbyCubeGUIMenu::new));
}
