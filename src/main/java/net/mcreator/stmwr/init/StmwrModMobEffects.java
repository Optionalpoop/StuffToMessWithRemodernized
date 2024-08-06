
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.stmwr.potion.CreativeFlightMobEffect;
import net.mcreator.stmwr.StmwrMod;

public class StmwrModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StmwrMod.MODID);
	public static final RegistryObject<MobEffect> CREATIVE_FLIGHT = REGISTRY.register("creative_flight", () -> new CreativeFlightMobEffect());
}
