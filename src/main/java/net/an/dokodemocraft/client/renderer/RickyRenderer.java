
package net.an.dokodemocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.an.dokodemocraft.entity.RickyEntity;
import net.an.dokodemocraft.client.model.Modelricky;

public class RickyRenderer extends MobRenderer<RickyEntity, Modelricky<RickyEntity>> {
	public RickyRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelricky(context.bakeLayer(Modelricky.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RickyEntity entity) {
		return new ResourceLocation("doko_demo_craft:textures/ricky.png");
	}
}
