
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gemsfabricmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.gemsfabricmod.entity.FirelauncherEntity;
import net.mcreator.gemsfabricmod.entity.EarthBowEntity;
import net.mcreator.gemsfabricmod.GemsFabricModMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GemsFabricModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GemsFabricModMod.MODID);
	public static final RegistryObject<EntityType<FirelauncherEntity>> FIRELAUNCHER = register("projectile_firelauncher",
			EntityType.Builder.<FirelauncherEntity>of(FirelauncherEntity::new, MobCategory.MISC).setCustomClientFactory(FirelauncherEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<EarthBowEntity>> EARTH_BOW = register("projectile_earth_bow",
			EntityType.Builder.<EarthBowEntity>of(EarthBowEntity::new, MobCategory.MISC).setCustomClientFactory(EarthBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}
}
