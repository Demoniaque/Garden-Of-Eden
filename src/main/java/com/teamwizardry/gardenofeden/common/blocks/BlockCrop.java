package com.teamwizardry.gardenofeden.common.blocks;

import com.teamwizardry.gardenofeden.ModItems;
import com.teamwizardry.gardenofeden.api.GOEConstants;
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

public class BlockCrop extends BlockModCrops {

	public BlockCrop() {
		super("crop");
	}

	@Override
	public float getGrowthChance(@NotNull Block blockIn, @NotNull World worldIn, @NotNull BlockPos pos) {
		return super.getGrowthChance(blockIn, worldIn, pos);
	}

	@Override
	public boolean canUseBonemeal(@NotNull World worldIn, @NotNull Random rand, @NotNull BlockPos pos, @NotNull IBlockState state) {
		return false;
	}

	@Override
	public void getDrops(@NotNull NonNullList<ItemStack> drops, @NotNull IBlockAccess world, @NotNull BlockPos pos, @NotNull IBlockState state, int fortune) {
		int age = getAge(state);

		if (age >= getMaxAge()) {
			drops.add(this.getSeed());
			drops.add(this.getDefaultCrop());
		} else {
			drops.add(this.getSeed());
		}
	}

	@NotNull
	@Override
	public ItemStack getDefaultCrop() {
		return null;
	}

	@NotNull
	@Override
	public ItemStack getSeed() {
		return null;
	}
}
