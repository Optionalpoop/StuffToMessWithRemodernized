
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.stmwr.StmwrMod;

public class StmwrModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StmwrMod.MODID);
	public static final RegistryObject<SoundEvent> FINALBOSSMUSIC = REGISTRY.register("finalbossmusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "finalbossmusic")));
}
