
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.an.dokodemocraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.an.dokodemocraft.DokoDemoCraftMod;

public class DokoDemoCraftModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DokoDemoCraftMod.MODID);
	public static final RegistryObject<Item> KURO = REGISTRY.register("kuro_spawn_egg",
			() -> new ForgeSpawnEggItem(DokoDemoCraftModEntities.KURO, -11120307, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> TORO_INOUE = REGISTRY.register("toro_inoue_spawn_egg",
			() -> new ForgeSpawnEggItem(DokoDemoCraftModEntities.TORO_INOUE, -1, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> KURO_HOSTILE = REGISTRY.register("kuro_hostile_spawn_egg",
			() -> new ForgeSpawnEggItem(DokoDemoCraftModEntities.KURO_HOSTILE, -11120307, -127722,
					new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> RICKY = REGISTRY.register("ricky_spawn_egg",
			() -> new ForgeSpawnEggItem(DokoDemoCraftModEntities.RICKY, -5452657, -16777216, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}
