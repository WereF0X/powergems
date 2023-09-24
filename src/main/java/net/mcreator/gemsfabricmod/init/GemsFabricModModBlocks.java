
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemsfabricmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.gemsfabricmod.block.ReviveBeaconBlock;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

public class GemsFabricModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GemsFabricModMod.MODID);
	public static final RegistryObject<Block> REVIVE_BEACON = REGISTRY.register("revive_beacon", () -> new ReviveBeaconBlock());
}
