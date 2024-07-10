
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.life.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.life.LifeMod;

public class LifeModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, LifeMod.MODID);
	public static final RegistryObject<Potion> ARROW = REGISTRY.register("arrow", () -> new Potion(new MobEffectInstance(LifeModMobEffects.INFECTION.get(), 200, 0, false, false)));
}
