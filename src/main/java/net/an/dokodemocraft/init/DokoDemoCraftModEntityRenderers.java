
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.an.dokodemocraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.an.dokodemocraft.client.renderer.ToroInoueRenderer;
import net.an.dokodemocraft.client.renderer.SoraRenderer;
import net.an.dokodemocraft.client.renderer.RickyRenderer;
import net.an.dokodemocraft.client.renderer.RSuzukiRenderer;
import net.an.dokodemocraft.client.renderer.PierreYamamotoRenderer;
import net.an.dokodemocraft.client.renderer.KuroRenderer;
import net.an.dokodemocraft.client.renderer.KuroHostileRenderer;
import net.an.dokodemocraft.client.renderer.JunMiharaRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class DokoDemoCraftModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(DokoDemoCraftModEntities.KURO.get(), KuroRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.TORO_INOUE.get(), ToroInoueRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.KURO_HOSTILE.get(), KuroHostileRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.RICKY.get(), RickyRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.JUN_MIHARA.get(), JunMiharaRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.PIERRE_YAMAMOTO.get(), PierreYamamotoRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.R_SUZUKI.get(), RSuzukiRenderer::new);
		event.registerEntityRenderer(DokoDemoCraftModEntities.SORA.get(), SoraRenderer::new);
	}
}
