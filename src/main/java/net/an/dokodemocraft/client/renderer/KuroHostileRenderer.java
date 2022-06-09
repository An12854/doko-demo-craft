
package net.an.dokodemocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.an.dokodemocraft.entity.KuroHostileEntity;
import net.an.dokodemocraft.client.model.Modelkuro;

public class KuroHostileRenderer extends MobRenderer<KuroHostileEntity, Modelkuro<KuroHostileEntity>> {
	public KuroHostileRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelkuro(context.bakeLayer(Modelkuro.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(KuroHostileEntity entity) {
		return new ResourceLocation("doko_demo_craft:textures/kurohostile.png");
	}
}
