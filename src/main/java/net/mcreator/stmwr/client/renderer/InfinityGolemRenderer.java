
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.stmwr.entity.InfinityGolemEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class InfinityGolemRenderer extends MobRenderer<InfinityGolemEntity, VillagerModel<InfinityGolemEntity>> {
	public InfinityGolemRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(InfinityGolemEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(1.5f, 1.5f, 1.5f);
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(InfinityGolemEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/infinititegolem.png");
	}
}
