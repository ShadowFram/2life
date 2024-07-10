package net.mcreator.life.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.life.network.LifeModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class DayCounterProcedure {
	@SubscribeEvent
	public static void onWorldTick(TickEvent.LevelTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.level);
		}
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		LifeModVariables.WorldVariables.get(world).Days = Math.floor(world.dayTime() / 24000);
		LifeModVariables.WorldVariables.get(world).syncData(world);
	}
}
