
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemsfabricmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.gemsfabricmod.world.inventory.SelectaGemMenu;
import net.mcreator.gemsfabricmod.world.inventory.ReviveMenu;
import net.mcreator.gemsfabricmod.world.inventory.RecipesMenu;
import net.mcreator.gemsfabricmod.world.inventory.Recipes6Menu;
import net.mcreator.gemsfabricmod.world.inventory.Recipes5Menu;
import net.mcreator.gemsfabricmod.world.inventory.Recipes4Menu;
import net.mcreator.gemsfabricmod.world.inventory.Recipes3Menu;
import net.mcreator.gemsfabricmod.world.inventory.Recipes2Menu;
import net.mcreator.gemsfabricmod.world.inventory.ChangeGemMenu;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

public class GemsFabricModModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, GemsFabricModMod.MODID);
	public static final RegistryObject<MenuType<RecipesMenu>> RECIPES = REGISTRY.register("recipes", () -> IForgeMenuType.create(RecipesMenu::new));
	public static final RegistryObject<MenuType<SelectaGemMenu>> SELECTA_GEM = REGISTRY.register("selecta_gem", () -> IForgeMenuType.create(SelectaGemMenu::new));
	public static final RegistryObject<MenuType<Recipes2Menu>> RECIPES_2 = REGISTRY.register("recipes_2", () -> IForgeMenuType.create(Recipes2Menu::new));
	public static final RegistryObject<MenuType<Recipes3Menu>> RECIPES_3 = REGISTRY.register("recipes_3", () -> IForgeMenuType.create(Recipes3Menu::new));
	public static final RegistryObject<MenuType<Recipes4Menu>> RECIPES_4 = REGISTRY.register("recipes_4", () -> IForgeMenuType.create(Recipes4Menu::new));
	public static final RegistryObject<MenuType<Recipes5Menu>> RECIPES_5 = REGISTRY.register("recipes_5", () -> IForgeMenuType.create(Recipes5Menu::new));
	public static final RegistryObject<MenuType<Recipes6Menu>> RECIPES_6 = REGISTRY.register("recipes_6", () -> IForgeMenuType.create(Recipes6Menu::new));
	public static final RegistryObject<MenuType<ReviveMenu>> REVIVE = REGISTRY.register("revive", () -> IForgeMenuType.create(ReviveMenu::new));
	public static final RegistryObject<MenuType<ChangeGemMenu>> CHANGE_GEM = REGISTRY.register("change_gem", () -> IForgeMenuType.create(ChangeGemMenu::new));
}
