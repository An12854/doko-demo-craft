
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.an.dokodemocraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.an.dokodemocraft.client.model.Modeltoro_inoue;
import net.an.dokodemocraft.client.model.Modelricky;
import net.an.dokodemocraft.client.model.Modelr_suzuki;
import net.an.dokodemocraft.client.model.Modelpierre_yamamoto;
import net.an.dokodemocraft.client.model.Modelkuro;
import net.an.dokodemocraft.client.model.Modeljun_mihara;
import net.an.dokodemocraft.client.model.ModelSora;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DokoDemoCraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelpierre_yamamoto.LAYER_LOCATION, Modelpierre_yamamoto::createBodyLayer);
		event.registerLayerDefinition(Modelricky.LAYER_LOCATION, Modelricky::createBodyLayer);
		event.registerLayerDefinition(ModelSora.LAYER_LOCATION, ModelSora::createBodyLayer);
		event.registerLayerDefinition(Modeltoro_inoue.LAYER_LOCATION, Modeltoro_inoue::createBodyLayer);
		event.registerLayerDefinition(Modelr_suzuki.LAYER_LOCATION, Modelr_suzuki::createBodyLayer);
		event.registerLayerDefinition(Modeljun_mihara.LAYER_LOCATION, Modeljun_mihara::createBodyLayer);
		event.registerLayerDefinition(Modelkuro.LAYER_LOCATION, Modelkuro::createBodyLayer);
	}
}
