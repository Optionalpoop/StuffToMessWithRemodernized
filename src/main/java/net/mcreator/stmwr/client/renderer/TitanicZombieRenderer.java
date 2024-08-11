
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.stmwr.entity.TitanicZombieEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TitanicZombieRenderer extends MobRenderer<TitanicZombieEntity, VillagerModel<TitanicZombieEntity>> {
	public TitanicZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(TitanicZombieEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(10f, 10f, 10f);
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(TitanicZombieEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/zombievillager.png");
	}
}
