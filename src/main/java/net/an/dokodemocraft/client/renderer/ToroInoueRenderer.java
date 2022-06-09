
package net.an.dokodemocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.an.dokodemocraft.entity.ToroInoueEntity;
import net.an.dokodemocraft.client.model.Modeltoro_inoue;

public class ToroInoueRenderer extends MobRenderer<ToroInoueEntity, Modeltoro_inoue<ToroInoueEntity>> {
	public ToroInoueRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltoro_inoue(context.bakeLayer(Modeltoro_inoue.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ToroInoueEntity entity) {
		return new ResourceLocation("doko_demo_craft:textures/toro_inoue.png");
	}
}
