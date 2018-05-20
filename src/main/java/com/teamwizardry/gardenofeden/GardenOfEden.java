package com.teamwizardry.gardenofeden;

import com.teamwizardry.gardenofeden.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
		modid = GardenOfEden.MOD_ID,
		name = GardenOfEden.MOD_NAME,
		version = GardenOfEden.VERSION
)
public class GardenOfEden {

	public static final String MOD_ID = "gardenofeden";
	public static final String MOD_NAME = "Garden Of Eden";
	public static final String VERSION = "1.0";
	public static final String CLIENT = "com.teamwizardry.gardenofeden.client.ClientProxy";
	public static final String SERVER = "com.teamwizardry.gardenofeden.common.CommonProxy";
	public static Logger logger;

	@SidedProxy(clientSide = CLIENT, serverSide = SERVER)
	public static CommonProxy proxy;

	/**
	 * This is the instance of your mod as created by Forge. It will never be null.
	 */
	@Mod.Instance(MOD_ID)
	public static GardenOfEden INSTANCE;

	/**
	 * This is the first initialization event. Register tile entities here.
	 * The registry events below will have fired prior to entry to this method.
	 */
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent event) {
		logger = event.getModLog();

		logger.info("bite me");
		logger.info("\uD83C\uDF51");

		proxy.preInit(event);
	}

	/**
	 * This is the second initialization event. Register custom recipes
	 */
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	/**
	 * This is the final initialization event. Register actions from other mods here
	 */
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
