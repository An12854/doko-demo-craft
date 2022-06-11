
package net.an.dokodemocraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.an.dokodemocraft.entity.JunMiharaEntity;
import net.an.dokodemocraft.client.model.Modeljun_mihara;

public class JunMiharaRenderer extends MobRenderer<JunMiharaEntity, Modeljun_mihara<JunMiharaEntity>> {
	public JunMiharaRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeljun_mihara(context.bakeLayer(Modeljun_mihara.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(JunMiharaEntity entity) {
		return new ResourceLocation("doko_demo_craft:textures/jun_mihara.png");
	}
}
