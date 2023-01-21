
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodcrystal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bloodcrystal.item.BloodCrystalItem;
import net.mcreator.bloodcrystal.BloodCrystalMod;

public class BloodCrystalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BloodCrystalMod.MODID);
	public static final RegistryObject<Item> BLOOD_CRYSTAL = REGISTRY.register("blood_crystal", () -> new BloodCrystalItem());
}
