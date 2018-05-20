package com.teamwizardry.gardenofeden;

import com.teamwizardry.gardenofeden.common.blocks.BlockCropBellPepper;
import com.teamwizardry.gardenofeden.common.blocks.BlockCropStrawberry;
import com.teamwizardry.gardenofeden.common.blocks.BlockCropTomato;

public class ModBlocks {

	public static BlockCropTomato CROP_TOMATO;
	public static BlockCropBellPepper CROP_BELLPEPPER;
	public static BlockCropStrawberry CROP_STRAWBERRY;

	public static void init() {

		CROP_TOMATO = new BlockCropTomato();
		CROP_BELLPEPPER = new BlockCropBellPepper();
		CROP_STRAWBERRY = new BlockCropStrawberry();
	}
}
