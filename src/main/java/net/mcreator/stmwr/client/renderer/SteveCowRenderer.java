
package net.mcreator.stmwr.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.stmwr.entity.SteveCowEntity;

public class SteveCowRenderer extends MobRenderer<SteveCowEntity, CowModel<SteveCowEntity>> {
	public SteveCowRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SteveCowEntity entity) {
		return new ResourceLocation("stmwr:textures/entities/sevecow.png");
	}
}
