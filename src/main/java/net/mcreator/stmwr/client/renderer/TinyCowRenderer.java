
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.stmwr.entity.TinyCowEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class TinyCowRenderer extends MobRenderer<TinyCowEntity, CowModel<TinyCowEntity>> {
	public TinyCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	protected void scale(TinyCowEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.3f, 0.3f, 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(TinyCowEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/cow.png");
	}
}
