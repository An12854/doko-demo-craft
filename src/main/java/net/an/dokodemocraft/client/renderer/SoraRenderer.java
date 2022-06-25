
package net.an.dokodemocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.an.dokodemocraft.entity.SoraEntity;
import net.an.dokodemocraft.client.model.ModelSora;

public class SoraRenderer extends MobRenderer<SoraEntity, ModelSora<SoraEntity>> {
	public SoraRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSora(context.bakeLayer(ModelSora.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SoraEntity entity) {
		return new ResourceLocation("doko_demo_craft:textures/sora.png");
	}
}
