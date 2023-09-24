
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.gemsfabricmod.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class GemsFabricModModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.GEM_CRYSTAL.get()),

					new ItemStack(GemsFabricModModItems.MYSTERIOUSGEM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), 1, 7, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.GEM_CRYSTAL.get()),

					new ItemStack(GemsFabricModModItems.MYSTERIUS_GEM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.GEM_CRYSTAL.get()),

					new ItemStack(GemsFabricModModItems.MYSTERIOS_GEM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.GEM_CRYSTAL.get()),

					new ItemStack(GemsFabricModModItems.MYSTEROUSGEM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.GEM_CRYSTAL.get()),

					new ItemStack(GemsFabricModModItems.MISTERIOUSGEM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.FIRE_GEM.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.LIFEGEM.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.STRENGHT_GEM.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.EARTHGEMS.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.TRADE_TOKEN.get()), new ItemStack(GemsFabricModModItems.NETHERITEGEM.get()), new ItemStack(GemsFabricModModItems.SCULK_GEM.get()), 1, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.GEM_CRYSTAL.get()),

					new ItemStack(GemsFabricModModItems.MYSTIRIOUSGEM.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.FISHERMAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(GemsFabricModModItems.GEM_CRYSTAL.get(), 12), new ItemStack(Items.NETHERITE_SCRAP, 2), new ItemStack(GemsFabricModModItems.GEM_UPGRADER.get()), 10, 5, 0.05f));
		}
	}
}
