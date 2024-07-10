package net.mcreator.life.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.BlockPos;

import net.mcreator.life.network.LifeModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ZombieEffectProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.level(), event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(LifeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LifeModVariables.PlayerVariables())).Zombie == true) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, 600, 0, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 600, 1, false, false));
			if (LifeModVariables.WorldVariables.get(world).Days >= 7 && world.canSeeSkyFromBelowWater(BlockPos.containing(x, y, z)) && !entity.isInWaterRainOrBubble() && world.dayTime() > 0 && world.dayTime() < 18000) {
				entity.setSecondsOnFire(3);
			}
			if (LifeModVariables.WorldVariables.get(world).Days >= 17 && (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MobEffects.HUNGER) ? _livEnt.getEffect(MobEffects.HUNGER).getAmplifier() : 0) >= 0
					&& (entity.getCapability(LifeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LifeModVariables.PlayerVariables())).Zombie == true) {
				if (entity instanceof LivingEntity _entity)
					_entity.removeEffect(MobEffects.HUNGER);
			}
		}
	}
}
