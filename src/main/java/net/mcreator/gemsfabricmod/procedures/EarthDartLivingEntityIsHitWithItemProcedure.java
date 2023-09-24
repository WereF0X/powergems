package net.mcreator.gemsfabricmod.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.gemsfabricmod.init.GemsFabricModModMobEffects;

public class EarthDartLivingEntityIsHitWithItemProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(GemsFabricModModMobEffects.HEADACHE.get(), 1800, (int) 0.5));
	}
}
