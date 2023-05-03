
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.bloodcrystal.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class BloodCrystalModTabs {
	public static CreativeModeTab TAB_CRYSTALS_MOD_TAB;

	public static void load() {
		TAB_CRYSTALS_MOD_TAB = new CreativeModeTab("tabcrystals_mod_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(BloodCrystalModItems.BLOOD_CRYSTAL.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
