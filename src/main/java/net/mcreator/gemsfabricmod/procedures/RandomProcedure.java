package net.mcreator.gemsfabricmod.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.gemsfabricmod.init.GemsFabricModModItems;

public class RandomProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.5) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GemsFabricModModItems.MYSTERIOUSGEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (Math.random() <= 100) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(GemsFabricModModItems.FIRE_GEM.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
	}
}
