package com.teamwizardry.gardenofeden.common.blocks;

import com.teamwizardry.gardenofeden.ModItems;
import com.teamwizardry.gardenofeden.api.RandUtil;
import com.teamwizardry.librarianlib.features.base.block.BlockModCrops;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class BlockCropBellPepper extends BlockModCrops {

	public BlockCropBellPepper() {
		super("crop_bellpepper");
	}

	@Override
	public float getGrowthChance(@NotNull Block blockIn, @NotNull World worldIn, @NotNull BlockPos pos) {
		return super.getGrowthChance(blockIn, worldIn, pos);
	}

	@Override
	public boolean canUseBonemeal(@NotNull World worldIn, @NotNull Random rand, @NotNull BlockPos pos, @NotNull IBlockState state) {
		return false;
	}

	@Nullable
	@Override
	public Void createItemForm() {
		return super.createItemForm();
	}

	@Override
	public void getDrops(@NotNull NonNullList<ItemStack> drops, @NotNull IBlockAccess world, @NotNull BlockPos pos, @NotNull IBlockState state, int fortune) {
		int age = getAge(state);

		if (age >= getMaxAge()) {
			drops.add(new ItemStack(this.getSeed(), RandUtil.nextInt(1, 3)));
			drops.add(new ItemStack(this.getCrop(), RandUtil.nextInt(1, 5)));
		} else {
			drops.add(new ItemStack(this.getSeed()));
		}
	}

	@NotNull
	@Override
	public Item getSeed() {
		return ModItems.SEED_BELLPEPPER;
	}

	@NotNull
	@Override
	public Item getCrop() {
		return ModItems.BELLPEPPER;
	}
}
