
package net.mcreator.life.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.life.procedures.InfectionEffectExpiresProcedure;

public class InfectionMobEffect extends MobEffect {
	public InfectionMobEffect() {
		super(MobEffectCategory.NEUTRAL, -14657251);
	}

	@Override
	public String getDescriptionId() {
		return "effect.life.infection";
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		InfectionEffectExpiresProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
