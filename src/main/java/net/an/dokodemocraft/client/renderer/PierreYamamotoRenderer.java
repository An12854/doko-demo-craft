
package net.an.dokodemocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.an.dokodemocraft.entity.PierreYamamotoEntity;
import net.an.dokodemocraft.client.model.Modelpierre_yamamoto;

public class PierreYamamotoRenderer extends MobRenderer<PierreYamamotoEntity, Modelpierre_yamamoto<PierreYamamotoEntity>> {
	public PierreYamamotoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelpierre_yamamoto(context.bakeLayer(Modelpierre_yamamoto.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(PierreYamamotoEntity entity) {
		return new ResourceLocation("doko_demo_craft:textures/pierre_yamamoto.png");
	}
}
