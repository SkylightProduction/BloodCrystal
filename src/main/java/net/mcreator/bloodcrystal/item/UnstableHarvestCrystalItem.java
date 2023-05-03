
package net.mcreator.bloodcrystal.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.bloodcrystal.procedures.UnstableHarvestCrystalProcedureProcedure;
import net.mcreator.bloodcrystal.init.BloodCrystalModTabs;

public class UnstableHarvestCrystalItem extends Item {
	public UnstableHarvestCrystalItem() {
		super(new Item.Properties().tab(BloodCrystalModTabs.TAB_CRYSTALS_MOD_TAB).stacksTo(1).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		UnstableHarvestCrystalProcedureProcedure.execute(world, x, y, z, entity);
		return ar;
	}
}
