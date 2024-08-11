
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.PigModel;

import net.mcreator.stmwr.entity.TinyPigEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TinyPigRenderer extends MobRenderer<TinyPigEntity, PigModel<TinyPigEntity>> {
	public TinyPigRenderer(EntityRendererProvider.Context context) {
		super(context, new PigModel(context.bakeLayer(ModelLayers.PIG)), 0.5f);
	}

	@Override
	protected void scale(TinyPigEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.3f, 0.3f, 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(TinyPigEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/pig.png");
	}
}
