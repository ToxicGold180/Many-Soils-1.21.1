package net.toxicgold180.many_soils;

import net.fabricmc.api.ModInitializer;

import net.toxicgold180.many_soils.block.ModBlocks;
import net.toxicgold180.many_soils.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ManySoils implements ModInitializer {
	public static final String MOD_ID = "many_soils";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}