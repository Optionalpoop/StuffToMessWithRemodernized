
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.stmwr.entity.MinorSandWormEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class MinorSandWormRenderer extends MobRenderer<MinorSandWormEntity, SilverfishModel<MinorSandWormEntity>> {
	public MinorSandWormRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	protected void scale(MinorSandWormEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(6f, 6f, 6f);
	}

	@Override
	public ResourceLocation getTextureLocation(MinorSandWormEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/sandworm.png");
	}
}
