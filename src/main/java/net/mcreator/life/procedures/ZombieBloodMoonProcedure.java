package net.mcreator.life.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.life.network.LifeModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class ZombieBloodMoonProcedure {
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
		boolean sendMessage = false;
		sendMessage = false;
		if ((entity.getCapability(LifeModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new LifeModVariables.PlayerVariables())).Zombie == true && (world instanceof Level _lvl0 && _lvl0.isDay()) == false) {
			if ((LifeModVariables.WorldVariables.get(world).Days == 10) == (sendMessage == false)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 0, false, false));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a times 20 300 20");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a title {\"text\":\"\\u041a\\u0420\\u041e\\u0412\\u041e\\u041b\\u0423\\u041d\\u0418\\u0415\",\"bold\":true,\"color\":\"dark_red\"}");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a subtitle {\"text\":\"\\u0417\\u043e\\u043c\\u0431\\u0438 \\u0441\\u0442\\u0430\\u043b\\u0438 \\u0441\\u0438\\u043b\\u044c\\u043d\\u0435\\u0435!\",\"bold\":true,\"color\":\"dark_green\"}");
				sendMessage = true;
			} else if ((LifeModVariables.WorldVariables.get(world).Days == 20) == (sendMessage == false)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 0, false, false));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a times 20 300 20");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a title {\"text\":\"\\u041a\\u0420\\u041e\\u0412\\u041e\\u041b\\u0423\\u041d\\u0418\\u0415\",\"bold\":true,\"color\":\"dark_red\"}");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a subtitle {\"text\":\"\\u0417\\u043e\\u043c\\u0431\\u0438 \\u0441\\u0442\\u0430\\u043b\\u0438 \\u0441\\u0438\\u043b\\u044c\\u043d\\u0435\\u0435!\",\"bold\":true,\"color\":\"dark_green\"}");
				sendMessage = true;
			} else if ((LifeModVariables.WorldVariables.get(world).Days == 30) == (sendMessage == false)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 1, false, false));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a times 20 300 20");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a title {\"text\":\"\\u041a\\u0420\\u041e\\u0412\\u041e\\u041b\\u0423\\u041d\\u0418\\u0415\",\"bold\":true,\"color\":\"dark_red\"}");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a subtitle {\"text\":\"\\u0417\\u043e\\u043c\\u0431\\u0438 \\u0441\\u0442\\u0430\\u043b\\u0438 \\u0441\\u0438\\u043b\\u044c\\u043d\\u0435\\u0435!\",\"bold\":true,\"color\":\"dark_green\"}");
				sendMessage = true;
			} else if ((LifeModVariables.WorldVariables.get(world).Days == 40) == (sendMessage == false)) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 60, 0, false, false));
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 60, 2, false, false));
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a times 20 300 20");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a title {\"text\":\"\\u041a\\u0420\\u041e\\u0412\\u041e\\u041b\\u0423\\u041d\\u0418\\u0415\",\"bold\":true,\"color\":\"dark_red\"}");
				if (world instanceof ServerLevel _level)
					_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
							"/title @a subtitle {\"text\":\"\\u0417\\u043e\\u043c\\u0431\\u0438 \\u0441\\u0442\\u0430\\u043b\\u0438 \\u0441\\u0438\\u043b\\u044c\\u043d\\u0435\\u0435!\",\"bold\":true,\"color\":\"dark_green\"}");
				sendMessage = true;
			} else if (LifeModVariables.WorldVariables.get(world).Days == 50 && sendMessage == false) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("Message"), false);
				sendMessage = true;
			}
		}
	}
}
