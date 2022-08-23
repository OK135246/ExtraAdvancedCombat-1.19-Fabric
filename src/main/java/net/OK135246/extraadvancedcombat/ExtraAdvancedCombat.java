package net.OK135246.extraadvancedcombat;

import net.OK135246.extraadvancedcombat.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExtraAdvancedCombat implements ModInitializer {
	public static final String MOD_ID = "extraadvancedcombat";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
