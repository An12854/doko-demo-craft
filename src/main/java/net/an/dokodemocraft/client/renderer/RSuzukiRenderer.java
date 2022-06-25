
package net.an.dokodemocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.an.dokodemocraft.entity.RSuzukiEntity;
import net.an.dokodemocraft.client.model.Modelr_suzuki;

public class RSuzukiRenderer extends MobRenderer<RSuzukiEntity, Modelr_suzuki<RSuzukiEntity>> {
	public RSuzukiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelr_suzuki(context.bakeLayer(Modelr_suzuki.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RSuzukiEntity entity) {
		return new ResourceLocation("doko_demo_craft:textures/r._suzuki.png");
	}
}
