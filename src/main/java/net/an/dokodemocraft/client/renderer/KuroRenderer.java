
package net.an.dokodemocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.an.dokodemocraft.entity.KuroEntity;
import net.an.dokodemocraft.client.model.Modelkuro;

public class KuroRenderer extends MobRenderer<KuroEntity, Modelkuro<KuroEntity>> {
	public KuroRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkuro(context.bakeLayer(Modelkuro.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KuroEntity entity) {
		return new ResourceLocation("doko_demo_craft:textures/kuro.png");
	}
}
