package net.mcreator.life.procedures;

import net.minecraft.world.entity.Entity;

public class InfectionEffectExpiresProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		TransformatonProcedure.execute(entity);
	}
}
