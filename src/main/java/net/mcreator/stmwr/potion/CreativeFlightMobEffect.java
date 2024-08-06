
package net.mcreator.stmwr.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.stmwr.procedures.CreativeFlightOnEffectActiveTickProcedure;

public class CreativeFlightMobEffect extends MobEffect {
	public CreativeFlightMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10066330);
	}

	@Override
	public void applyEffectTick(LivingEntity entity, int amplifier) {
		CreativeFlightOnEffectActiveTickProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
