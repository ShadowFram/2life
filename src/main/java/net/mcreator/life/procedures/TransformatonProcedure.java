package net.mcreator.life.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.life.network.LifeModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class TransformatonProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity());
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player) {
			if ((entity.getCapability(LifeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LifeModVariables.PlayerVariables())).Zombie == false) {
				{
					boolean _setval = true;
					entity.getCapability(LifeModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.Zombie = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				ZSkinProcedure.execute(entity);
			}
		}
	}
}
