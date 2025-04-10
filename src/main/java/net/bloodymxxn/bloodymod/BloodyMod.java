package net.bloodymxxn.bloodymod;

import net.bloodymxxn.bloodymod.block.ModBlocks;
import net.bloodymxxn.bloodymod.item.ModItemGroups;
import net.fabricmc.api.ModInitializer;

import net.bloodymxxn.bloodymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BloodyMod implements ModInitializer {
	public static final String MOD_ID = "bloodymod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}