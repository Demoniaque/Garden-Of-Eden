package com.teamwizardry.gardenofeden.api;

public class GOEConstants {

	public static final String[] FRUITS = new String[]{"mango", "cherry", "kiwi", "pear", "pineapple", "strawberry", "banana", "peach", "lemon"};
	public static final String[] VEGETABLES = new String[]{"lettuce", "artichoke"};

	public static final String[] SEEDS = new String[FRUITS.length];

	static {
		for (int i = 0; i < FRUITS.length; i++) {
			SEEDS[i] = "seed_" + FRUITS[i];
		}
	}
}
