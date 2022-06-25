
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.an.dokodemocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.an.dokodemocraft.entity.ToroInoueEntity;
import net.an.dokodemocraft.entity.SoraEntity;
import net.an.dokodemocraft.entity.RickyEntity;
import net.an.dokodemocraft.entity.RSuzukiEntity;
import net.an.dokodemocraft.entity.PierreYamamotoEntity;
import net.an.dokodemocraft.entity.KuroHostileEntity;
import net.an.dokodemocraft.entity.KuroEntity;
import net.an.dokodemocraft.entity.JunMiharaEntity;
import net.an.dokodemocraft.DokoDemoCraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DokoDemoCraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITIES, DokoDemoCraftMod.MODID);
	public static final RegistryObject<EntityType<KuroEntity>> KURO = register("kuro",
			EntityType.Builder.<KuroEntity>of(KuroEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(KuroEntity::new)

					.sized(0.6f, 1.95f));
	public static final RegistryObject<EntityType<ToroInoueEntity>> TORO_INOUE = register("toro_inoue",
			EntityType.Builder.<ToroInoueEntity>of(ToroInoueEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ToroInoueEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<KuroHostileEntity>> KURO_HOSTILE = register("kuro_hostile",
			EntityType.Builder.<KuroHostileEntity>of(KuroHostileEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(KuroHostileEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RickyEntity>> RICKY = register("ricky",
			EntityType.Builder.<RickyEntity>of(RickyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RickyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<JunMiharaEntity>> JUN_MIHARA = register("jun_mihara",
			EntityType.Builder.<JunMiharaEntity>of(JunMiharaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(JunMiharaEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<PierreYamamotoEntity>> PIERRE_YAMAMOTO = register("pierre_yamamoto",
			EntityType.Builder.<PierreYamamotoEntity>of(PierreYamamotoEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
					.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PierreYamamotoEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<RSuzukiEntity>> R_SUZUKI = register("r_suzuki",
			EntityType.Builder.<RSuzukiEntity>of(RSuzukiEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(RSuzukiEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<SoraEntity>> SORA = register("sora",
			EntityType.Builder.<SoraEntity>of(SoraEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64)
					.setUpdateInterval(3).setCustomClientFactory(SoraEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			KuroEntity.init();
			ToroInoueEntity.init();
			KuroHostileEntity.init();
			RickyEntity.init();
			JunMiharaEntity.init();
			PierreYamamotoEntity.init();
			RSuzukiEntity.init();
			SoraEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(KURO.get(), KuroEntity.createAttributes().build());
		event.put(TORO_INOUE.get(), ToroInoueEntity.createAttributes().build());
		event.put(KURO_HOSTILE.get(), KuroHostileEntity.createAttributes().build());
		event.put(RICKY.get(), RickyEntity.createAttributes().build());
		event.put(JUN_MIHARA.get(), JunMiharaEntity.createAttributes().build());
		event.put(PIERRE_YAMAMOTO.get(), PierreYamamotoEntity.createAttributes().build());
		event.put(R_SUZUKI.get(), RSuzukiEntity.createAttributes().build());
		event.put(SORA.get(), SoraEntity.createAttributes().build());
	}
}
