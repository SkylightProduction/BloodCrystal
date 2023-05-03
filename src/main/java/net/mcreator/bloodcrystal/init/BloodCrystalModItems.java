
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodcrystal.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.bloodcrystal.item.WheatCrystalItem;
import net.mcreator.bloodcrystal.item.UnstableLuckyCrystalItem;
import net.mcreator.bloodcrystal.item.UnstableHarvestCrystalItem;
import net.mcreator.bloodcrystal.item.UnstableBloodCrystalItem;
import net.mcreator.bloodcrystal.item.LuckyCrystalItem;
import net.mcreator.bloodcrystal.item.BloodCrystalItem;
import net.mcreator.bloodcrystal.BloodCrystalMod;

public class BloodCrystalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, BloodCrystalMod.MODID);
	public static final RegistryObject<Item> BLOOD_CRYSTAL = REGISTRY.register("blood_crystal", () -> new BloodCrystalItem());
	public static final RegistryObject<Item> HARVEST_CRYSTAL = REGISTRY.register("harvest_crystal", () -> new WheatCrystalItem());
	public static final RegistryObject<Item> LUCKY_CRYSTAL = REGISTRY.register("lucky_crystal", () -> new LuckyCrystalItem());
	public static final RegistryObject<Item> UNSTABLE_BLOOD_CRYSTAL = REGISTRY.register("unstable_blood_crystal", () -> new UnstableBloodCrystalItem());
	public static final RegistryObject<Item> UNSTABLE_HARVEST_CRYSTAL = REGISTRY.register("unstable_harvest_crystal", () -> new UnstableHarvestCrystalItem());
	public static final RegistryObject<Item> UNSTABLE_LUCKY_CRYSTAL = REGISTRY.register("unstable_lucky_crystal", () -> new UnstableLuckyCrystalItem());
}
