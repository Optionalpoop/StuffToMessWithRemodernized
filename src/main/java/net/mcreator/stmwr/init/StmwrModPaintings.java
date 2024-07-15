
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

import net.mcreator.stmwr.StmwrMod;

public class StmwrModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, StmwrMod.MODID);
	public static final RegistryObject<PaintingVariant> THE_BLURB = REGISTRY.register("the_blurb", () -> new PaintingVariant(16, 16));
}
