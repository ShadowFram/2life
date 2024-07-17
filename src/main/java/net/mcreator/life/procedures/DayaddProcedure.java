package net.mcreator.life.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.life.network.LifeModVariables;

public class DayaddProcedure {
	public static void execute(LevelAccessor world) {
		LifeModVariables.MapVariables.get(world).Days = world.dayTime() + 23000;
		LifeModVariables.MapVariables.get(world).syncData(world);
	}
}
