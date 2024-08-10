
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.stmwr.entity.TitanicCowEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TitanicCowRenderer extends MobRenderer<TitanicCowEntity, CowModel<TitanicCowEntity>> {
	public TitanicCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	protected void scale(TitanicCowEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(10f, 10f, 10f);
	}

	@Override
	public ResourceLocation getTextureLocation(TitanicCowEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/cow.png");
	}
}
