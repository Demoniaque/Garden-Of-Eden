package com.teamwizardry.gardenofeden;

import com.teamwizardry.gardenofeden.common.items.ItemSeedStrawberry;
import com.teamwizardry.gardenofeden.common.items.ItemStrawberry;

public class ModItems {

	public static ItemSeedStrawberry SEED_STRAWBERRY;

	public static ItemStrawberry STRAWBERRY;

	public static void init() {
		SEED_STRAWBERRY = new ItemSeedStrawberry();
		STRAWBERRY = new ItemStrawberry();
	}
}
