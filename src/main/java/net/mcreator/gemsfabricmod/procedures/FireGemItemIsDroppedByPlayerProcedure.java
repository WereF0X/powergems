package net.mcreator.gemsfabricmod.procedures;

import net.minecraft.world.entity.Entity;

public class FireGemItemIsDroppedByPlayerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (!entity.level().isClientSide())
			entity.discard();
	}
}
