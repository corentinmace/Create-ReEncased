package com.kuhasr.createencasedfabric;

import com.kuhasr.createencasedfabric.block.ModBlocks;
import com.kuhasr.createencasedfabric.item.ModItemGroups;
import com.kuhasr.createencasedfabric.item.ModItems;
import com.simibubi.create.Create;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateReEncasedMod implements ModInitializer {
	public static final String ID = "createencasedfabric";
	public static final String NAME = "Create: ReEncased Mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

	@Override
	public void onInitialize() {
		LOGGER.info("Create addon mod [{}] is loading alongside Create [{}]!", NAME, Create.VERSION);
		LOGGER.info(EnvExecutor.unsafeRunForDist(
				() -> () -> "{} is accessing Porting Lib from the client!",
				() -> () -> "{} is accessing Porting Lib from the server!"
		), NAME);

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
	}
}
