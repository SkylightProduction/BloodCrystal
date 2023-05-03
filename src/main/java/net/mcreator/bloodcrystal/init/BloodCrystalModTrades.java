
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.bloodcrystal.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BloodCrystalModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.WHEAT, 32), new ItemStack(Items.EMERALD, 15), new ItemStack(BloodCrystalModItems.HARVEST_CRYSTAL.get()), 5, 5, 0.05f));
		}
	}
}
