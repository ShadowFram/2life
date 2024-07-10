package net.mcreator.life.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.life.network.LifeModVariables;

public class DayaddProcedure {
	public static void execute(LevelAccessor world) {
		LifeModVariables.WorldVariables.get(world).Days = world.dayTime() + 23000;
		LifeModVariables.WorldVariables.get(world).syncData(world);
	}
}
