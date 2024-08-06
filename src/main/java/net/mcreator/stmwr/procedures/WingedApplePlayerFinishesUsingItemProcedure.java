package net.mcreator.stmwr.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.stmwr.init.StmwrModMobEffects;

public class WingedApplePlayerFinishesUsingItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(StmwrModMobEffects.CREATIVE_FLIGHT.get(), 200, 1));
	}
}
