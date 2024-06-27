package com.kuhasr.createencasedfabric.block;

import com.kuhasr.createencasedfabric.CreateReEncasedMod;

import io.github.fabricators_of_create.porting_lib.tags.Tags;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {

	public static final Block CREATIVE_CASING = registerBlock("creative_casing",
			new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));


	private static Block registerBlock(String name, Block block) {
		registerBlockItem(name, block);
		return Registry.register(Registries.BLOCK, new Identifier(CreateReEncasedMod.ID, name), block);
	}

	private static Item registerBlockItem(String name, Block block) {
		return Registry.register(Registries.ITEM, new Identifier(CreateReEncasedMod.ID, name),
				new BlockItem(block, new FabricItemSettings()));
	}

	public static void registerModBlocks() {
		CreateReEncasedMod.LOGGER.info("Registering Mod Blocks for " + CreateReEncasedMod.ID);
	}
}
