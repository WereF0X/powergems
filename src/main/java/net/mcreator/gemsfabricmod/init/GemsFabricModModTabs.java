
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemsfabricmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.gemsfabricmod.GemsFabricModMod;

public class GemsFabricModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GemsFabricModMod.MODID);
	public static final RegistryObject<CreativeModeTab> GEMS = REGISTRY.register("gems",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.gems_fabric_mod.gems")).icon(() -> new ItemStack(GemsFabricModModItems.GEM_CRYSTAL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(GemsFabricModModItems.LIFEGEM.get());
				tabData.accept(GemsFabricModModItems.FIRE_GEM.get());
				tabData.accept(GemsFabricModModItems.GEM_CRYSTAL.get());
				tabData.accept(GemsFabricModModItems.STRENGHT_GEM.get());
				tabData.accept(GemsFabricModModItems.EARTHGEMS.get());
				tabData.accept(GemsFabricModModItems.NETHERITEGEM.get());
				tabData.accept(GemsFabricModModItems.SCULK_GEM.get());
				tabData.accept(GemsFabricModModItems.GEM_UPGRADER.get());
				tabData.accept(GemsFabricModModItems.GEMUPGRADERTIER_3.get());
				tabData.accept(GemsFabricModModItems.TRADE_TOKEN.get());
				tabData.accept(GemsFabricModModItems.MYSTERIOUSGEM.get());
				tabData.accept(GemsFabricModModItems.MYSTERIUS_GEM.get());
				tabData.accept(GemsFabricModModItems.MYSTERIOS_GEM.get());
				tabData.accept(GemsFabricModModItems.MYSTEROUSGEM.get());
				tabData.accept(GemsFabricModModItems.MISTERIOUSGEM.get());
				tabData.accept(GemsFabricModModItems.MYSTIRIOUSGEM.get());
				tabData.accept(GemsFabricModModItems.REVIVETOTEM.get());
			})

					.build());
}
