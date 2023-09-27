
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemsfabricmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.gemsfabricmod.potion.NetheriteresMobEffect;
import net.mcreator.gemsfabricmod.potion.HeadacheMobEffect;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

public class GemsFabricModModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, GemsFabricModMod.MODID);
	public static final RegistryObject<MobEffect> HEADACHE = REGISTRY.register("headache", () -> new HeadacheMobEffect());
	public static final RegistryObject<MobEffect> NETHERITERES = REGISTRY.register("netheriteres", () -> new NetheriteresMobEffect());
}
