
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemsfabricmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.gemsfabricmod.item.TradeTokenItem;
import net.mcreator.gemsfabricmod.item.Strenghtgem2Item;
import net.mcreator.gemsfabricmod.item.StrenghtGem3Item;
import net.mcreator.gemsfabricmod.item.SculkarmorItem;
import net.mcreator.gemsfabricmod.item.SculkGemItem;
import net.mcreator.gemsfabricmod.item.RevivetotemItem;
import net.mcreator.gemsfabricmod.item.ResilienceGemItem;
import net.mcreator.gemsfabricmod.item.Nethgem2Item;
import net.mcreator.gemsfabricmod.item.NetheritegemItem;
import net.mcreator.gemsfabricmod.item.NetheriteGemSwordItem;
import net.mcreator.gemsfabricmod.item.MystiriousgemItem;
import net.mcreator.gemsfabricmod.item.MysterousgemItem;
import net.mcreator.gemsfabricmod.item.MysteriusGemItem;
import net.mcreator.gemsfabricmod.item.MysteriousgemItem;
import net.mcreator.gemsfabricmod.item.MysteriosGemItem;
import net.mcreator.gemsfabricmod.item.MisteriousgemItem;
import net.mcreator.gemsfabricmod.item.LifegemItem;
import net.mcreator.gemsfabricmod.item.Lifegem2Item;
import net.mcreator.gemsfabricmod.item.Gemupgradertier3Item;
import net.mcreator.gemsfabricmod.item.GemUpgraderItem;
import net.mcreator.gemsfabricmod.item.GemCrystalItem;
import net.mcreator.gemsfabricmod.item.FirelauncherItem;
import net.mcreator.gemsfabricmod.item.FireGemItem;
import net.mcreator.gemsfabricmod.item.FireGem2Item;
import net.mcreator.gemsfabricmod.item.EarthgemsItem;
import net.mcreator.gemsfabricmod.item.EarthGemItem;
import net.mcreator.gemsfabricmod.item.EarthGem2Item;
import net.mcreator.gemsfabricmod.item.EarthDartItem;
import net.mcreator.gemsfabricmod.item.EarthBowItem;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

public class GemsFabricModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GemsFabricModMod.MODID);
	public static final RegistryObject<Item> GEM_CRYSTAL = REGISTRY.register("gem_crystal", () -> new GemCrystalItem());
	public static final RegistryObject<Item> FIRE_GEM = REGISTRY.register("fire_gem", () -> new FireGemItem());
	public static final RegistryObject<Item> LIFEGEM = REGISTRY.register("lifegem", () -> new LifegemItem());
	public static final RegistryObject<Item> STRENGHT_GEM = REGISTRY.register("strenght_gem", () -> new EarthGemItem());
	public static final RegistryObject<Item> EARTHGEMS = REGISTRY.register("earthgems", () -> new EarthgemsItem());
	public static final RegistryObject<Item> NETHERITEGEM = REGISTRY.register("netheritegem", () -> new NetheritegemItem());
	public static final RegistryObject<Item> SCULK_GEM = REGISTRY.register("sculk_gem", () -> new SculkGemItem());
	public static final RegistryObject<Item> RESILIENCE_GEM = REGISTRY.register("resilience_gem", () -> new ResilienceGemItem());
	public static final RegistryObject<Item> GEM_UPGRADER = REGISTRY.register("gem_upgrader", () -> new GemUpgraderItem());
	public static final RegistryObject<Item> GEMUPGRADERTIER_3 = REGISTRY.register("gemupgradertier_3", () -> new Gemupgradertier3Item());
	public static final RegistryObject<Item> TRADE_TOKEN = REGISTRY.register("trade_token", () -> new TradeTokenItem());
	public static final RegistryObject<Item> REVIVETOTEM = REGISTRY.register("revivetotem", () -> new RevivetotemItem());
	public static final RegistryObject<Item> MYSTERIOUSGEM = REGISTRY.register("mysteriousgem", () -> new MysteriousgemItem());
	public static final RegistryObject<Item> MYSTERIUS_GEM = REGISTRY.register("mysterius_gem", () -> new MysteriusGemItem());
	public static final RegistryObject<Item> MYSTERIOS_GEM = REGISTRY.register("mysterios_gem", () -> new MysteriosGemItem());
	public static final RegistryObject<Item> MYSTEROUSGEM = REGISTRY.register("mysterousgem", () -> new MysterousgemItem());
	public static final RegistryObject<Item> MISTERIOUSGEM = REGISTRY.register("misteriousgem", () -> new MisteriousgemItem());
	public static final RegistryObject<Item> MYSTIRIOUSGEM = REGISTRY.register("mystiriousgem", () -> new MystiriousgemItem());
	public static final RegistryObject<Item> NETHERITE_GEM_SWORD = REGISTRY.register("netherite_gem_sword", () -> new NetheriteGemSwordItem());
	public static final RegistryObject<Item> SCULKARMOR_HELMET = REGISTRY.register("sculkarmor_helmet", () -> new SculkarmorItem.Helmet());
	public static final RegistryObject<Item> SCULKARMOR_CHESTPLATE = REGISTRY.register("sculkarmor_chestplate", () -> new SculkarmorItem.Chestplate());
	public static final RegistryObject<Item> SCULKARMOR_LEGGINGS = REGISTRY.register("sculkarmor_leggings", () -> new SculkarmorItem.Leggings());
	public static final RegistryObject<Item> SCULKARMOR_BOOTS = REGISTRY.register("sculkarmor_boots", () -> new SculkarmorItem.Boots());
	public static final RegistryObject<Item> FIRELAUNCHER = REGISTRY.register("firelauncher", () -> new FirelauncherItem());
	public static final RegistryObject<Item> FIRE_GEM_2 = REGISTRY.register("fire_gem_2", () -> new FireGem2Item());
	public static final RegistryObject<Item> STRENGHTGEM_2 = REGISTRY.register("strenghtgem_2", () -> new Strenghtgem2Item());
	public static final RegistryObject<Item> EARTH_DART = REGISTRY.register("earth_dart", () -> new EarthDartItem());
	public static final RegistryObject<Item> EARTH_BOW = REGISTRY.register("earth_bow", () -> new EarthBowItem());
	public static final RegistryObject<Item> EARTH_GEM_2 = REGISTRY.register("earth_gem_2", () -> new EarthGem2Item());
	public static final RegistryObject<Item> STRENGHT_GEM_3 = REGISTRY.register("strenght_gem_3", () -> new StrenghtGem3Item());
	public static final RegistryObject<Item> NETHGEM_2 = REGISTRY.register("nethgem_2", () -> new Nethgem2Item());
	public static final RegistryObject<Item> LIFEGEM_2 = REGISTRY.register("lifegem_2", () -> new Lifegem2Item());
	public static final RegistryObject<Item> REVIVE_BEACON = block(GemsFabricModModBlocks.REVIVE_BEACON);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
