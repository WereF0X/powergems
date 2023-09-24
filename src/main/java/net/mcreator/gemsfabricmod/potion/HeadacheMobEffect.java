
package net.mcreator.gemsfabricmod.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.gemsfabricmod.procedures.HeadacheEffectStartedappliedProcedure;

public class HeadacheMobEffect extends MobEffect {
	public HeadacheMobEffect() {
		super(MobEffectCategory.HARMFUL, -13408768);
	}

	@Override
	public String getDescriptionId() {
		return "effect.gems_fabric_mod.headache";
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		HeadacheEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
