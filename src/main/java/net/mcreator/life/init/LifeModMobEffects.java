
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.life.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.life.potion.InfectionMobEffect;
import net.mcreator.life.LifeMod;

public class LifeModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LifeMod.MODID);
	public static final RegistryObject<MobEffect> INFECTION = REGISTRY.register("infection", () -> new InfectionMobEffect());
}
