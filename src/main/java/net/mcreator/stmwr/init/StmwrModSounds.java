
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
	public static final RegistryObject<SoundEvent> STEVECOWLANDAMBIENCE = REGISTRY.register("stevecowlandambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "stevecowlandambience")));
	public static final RegistryObject<SoundEvent> STEVECOWBOSSMUSIC = REGISTRY.register("stevecowbossmusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "stevecowbossmusic")));
	public static final RegistryObject<SoundEvent> MILITARIAAMBIENCE = REGISTRY.register("militariaambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "militariaambience")));
	public static final RegistryObject<SoundEvent> GOOPBOSS = REGISTRY.register("goopboss", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "goopboss")));
	public static final RegistryObject<SoundEvent> TITANKINGBOSSMUSIC = REGISTRY.register("titankingbossmusic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "titankingbossmusic")));
	public static final RegistryObject<SoundEvent> WIZARDWORLDAMBIENCE = REGISTRY.register("wizardworldambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "wizardworldambience")));
	public static final RegistryObject<SoundEvent> TITANWORLDAMBIENCE = REGISTRY.register("titanworldambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "titanworldambience")));
	public static final RegistryObject<SoundEvent> SMALLWORLDAMBIENCE = REGISTRY.register("smallworldambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "smallworldambience")));
	public static final RegistryObject<SoundEvent> EMPTYPLAINSAMBIENCE = REGISTRY.register("emptyplainsambience", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("stmwr", "emptyplainsambience")));
}
