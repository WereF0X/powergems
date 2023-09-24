package net.mcreator.gemsfabricmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.gemsfabricmod.init.GemsFabricModModItems;

public class DespawnProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (GemsFabricModModItems.FIRELAUNCHER.get() == GemsFabricModModItems.FIRELAUNCHER.get()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (itemstack.getItem() == GemsFabricModModItems.FIRELAUNCHER.get()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (itemstack.getItem() == GemsFabricModModItems.NETHERITE_GEM_SWORD.get()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (itemstack.getItem() == GemsFabricModModItems.EARTH_BOW.get()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (itemstack.getItem() == GemsFabricModModItems.EARTH_DART.get()) {
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (itemstack.getItem() == GemsFabricModModItems.FIRELAUNCHER.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(GemsFabricModModItems.FIRELAUNCHER.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == GemsFabricModModItems.NETHERITE_GEM_SWORD.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(GemsFabricModModItems.NETHERITE_GEM_SWORD.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == GemsFabricModModItems.EARTH_DART.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(GemsFabricModModItems.EARTH_DART.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 64, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == GemsFabricModModItems.EARTH_BOW.get()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(GemsFabricModModItems.EARTH_BOW.get());
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.BOW) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.BOW);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.CROSSBOW) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.CROSSBOW);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.ARROW) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.ARROW);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 64, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.ELYTRA) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.ELYTRA);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.NETHERITE_HELMET) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.NETHERITE_HELMET);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.NETHERITE_CHESTPLATE) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.NETHERITE_CHESTPLATE);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.NETHERITE_LEGGINGS) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.NETHERITE_LEGGINGS);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.NETHERITE_BOOTS) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.NETHERITE_BOOTS);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Items.END_CRYSTAL) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Items.END_CRYSTAL);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 64, _player.inventoryMenu.getCraftSlots());
			}
		}
		if (itemstack.getItem() == Blocks.RESPAWN_ANCHOR.asItem()) {
			if (entity instanceof Player _player) {
				ItemStack _stktoremove = new ItemStack(Blocks.RESPAWN_ANCHOR);
				_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 64, _player.inventoryMenu.getCraftSlots());
			}
		}
	}
}
