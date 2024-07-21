
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.stmwr.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.stmwr.client.renderer.SurvivorRenderer;
import net.mcreator.stmwr.client.renderer.SteveCowRenderer;
import net.mcreator.stmwr.client.renderer.SoldierRenderer;
import net.mcreator.stmwr.client.renderer.PikachuRenderer;
import net.mcreator.stmwr.client.renderer.MutantWormRenderer;
import net.mcreator.stmwr.client.renderer.MutantBossRenderer;
import net.mcreator.stmwr.client.renderer.GiantSteveCowRenderer;
import net.mcreator.stmwr.client.renderer.GasMaskZombieRenderer;
import net.mcreator.stmwr.client.renderer.FrostZombieRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StmwrModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(StmwrModEntities.STEVE_COW.get(), SteveCowRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.GIANT_STEVE_COW.get(), GiantSteveCowRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.PIKACHU.get(), PikachuRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.SURVIVOR.get(), SurvivorRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.SOLDIER.get(), SoldierRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.MUTANT_BOSS.get(), MutantBossRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.MUTANT_WORM.get(), MutantWormRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.FROST_ZOMBIE.get(), FrostZombieRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.BULLET.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(StmwrModEntities.GAS_MASK_ZOMBIE.get(), GasMaskZombieRenderer::new);
	}
}
