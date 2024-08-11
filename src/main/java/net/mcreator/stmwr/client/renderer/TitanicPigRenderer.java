
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.stmwr.entity.TitanicPigEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TitanicPigRenderer extends MobRenderer<TitanicPigEntity, PigModel<TitanicPigEntity>> {
	public TitanicPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	protected void scale(TitanicPigEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(10f, 10f, 10f);
	}

	@Override
	public ResourceLocation getTextureLocation(TitanicPigEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/pig.png");
	}
}
