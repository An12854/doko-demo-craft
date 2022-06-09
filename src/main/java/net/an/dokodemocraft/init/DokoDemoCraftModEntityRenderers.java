
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.an.dokodemocraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.an.dokodemocraft.client.renderer.ToroInoueRenderer;
import net.an.dokodemocraft.client.renderer.RickyRenderer;
import net.an.dokodemocraft.client.renderer.KuroRenderer;
import net.an.dokodemocraft.client.renderer.KuroHostileRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DokoDemoCraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DokoDemoCraftModEntities.KURO.get(), KuroRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.TORO_INOUE.get(), ToroInoueRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.KURO_HOSTILE.get(), KuroHostileRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.RICKY.get(), RickyRenderer::new);
	}
}
