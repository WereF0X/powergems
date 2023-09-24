
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemsfabricmod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.gemsfabricmod.client.gui.SelectaGemScreen;
import net.mcreator.gemsfabricmod.client.gui.ReviveScreen;
import net.mcreator.gemsfabricmod.client.gui.RecipesScreen;
import net.mcreator.gemsfabricmod.client.gui.Recipes6Screen;
import net.mcreator.gemsfabricmod.client.gui.Recipes5Screen;
import net.mcreator.gemsfabricmod.client.gui.Recipes4Screen;
import net.mcreator.gemsfabricmod.client.gui.Recipes3Screen;
import net.mcreator.gemsfabricmod.client.gui.Recipes2Screen;
import net.mcreator.gemsfabricmod.client.gui.ChangeGemScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class GemsFabricModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(GemsFabricModModMenus.RECIPES.get(), RecipesScreen::new);
			MenuScreens.register(GemsFabricModModMenus.SELECTA_GEM.get(), SelectaGemScreen::new);
			MenuScreens.register(GemsFabricModModMenus.RECIPES_2.get(), Recipes2Screen::new);
			MenuScreens.register(GemsFabricModModMenus.RECIPES_3.get(), Recipes3Screen::new);
			MenuScreens.register(GemsFabricModModMenus.RECIPES_4.get(), Recipes4Screen::new);
			MenuScreens.register(GemsFabricModModMenus.RECIPES_5.get(), Recipes5Screen::new);
			MenuScreens.register(GemsFabricModModMenus.RECIPES_6.get(), Recipes6Screen::new);
			MenuScreens.register(GemsFabricModModMenus.REVIVE.get(), ReviveScreen::new);
			MenuScreens.register(GemsFabricModModMenus.CHANGE_GEM.get(), ChangeGemScreen::new);
		});
	}
}
