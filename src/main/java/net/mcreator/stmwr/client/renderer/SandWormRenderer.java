
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.stmwr.entity.SandWormEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SandWormRenderer extends MobRenderer<SandWormEntity, SilverfishModel<SandWormEntity>> {
	public SandWormRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.5f);
	}

	@Override
	protected void scale(SandWormEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(10f, 10f, 10f);
	}

	@Override
	public ResourceLocation getTextureLocation(SandWormEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/sandworm.png");
	}
}
