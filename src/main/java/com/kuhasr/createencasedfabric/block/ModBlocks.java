package com.kuhasr.createencasedfabric.block;

import com.kuhasr.createencasedfabric.CreateReEncasedMod;

import com.simibubi.create.content.decoration.encasing.CasingBlock;
import com.simibubi.create.content.kinetics.gearbox.GearboxBlock;

import com.simibubi.create.content.kinetics.gearbox.VerticalGearboxItem;
import com.simibubi.create.content.kinetics.press.MechanicalPressBlock;
import com.simibubi.create.content.kinetics.simpleRelays.ShaftBlock;
import com.simibubi.create.content.logistics.depot.DepotBlock;

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
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	// Shafts
	public static final Block ACACIA_SHAFT = registerBlock("acacia_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));

	public static final Block BAMBOO_SHAFT = registerBlock("bamboo_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));

	public static final Block BIRCH_SHAFT = registerBlock("birch_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));

	public static final Block CHERRY_SHAFT = registerBlock("cherry_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));

	public static final Block CRIMSON_SHAFT = registerBlock("crimson_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));

	public static final Block DARK_OAK_SHAFT = registerBlock("dark_oak_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));

	public static final Block GLASS_SHAFT = registerBlock("glass_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));

	public static final Block JUNGLE_SHAFT = registerBlock("jungle_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));

	public static final Block MANGROVE_SHAFT = registerBlock("mangrove_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));

	public static final Block OAK_SHAFT = registerBlock("oak_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block SPRUCE_SHAFT = registerBlock("spruce_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));

	public static final Block WARPED_SHAFT = registerBlock("warped_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));

	public static final Block BRASS_SHAFT = registerBlock("brass_shaft",
			new ShaftBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));


	// Andesite Encased Shafts
	public static final Block ANDESITE_ENCASED_ACACIA_SHAFT = registerBlock("andesite_encased_acacia_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_PLANKS)));

	public static final Block ANDESITE_ENCASED_BAMBOO_SHAFT = registerBlock("andesite_encased_bamboo_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.BAMBOO_PLANKS)));

	public static final Block ANDESITE_ENCASED_BIRCH_SHAFT = registerBlock("andesite_encased_birch_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_PLANKS)));

	public static final Block ANDESITE_ENCASED_CHERRY_SHAFT = registerBlock("andesite_encased_cherry_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_PLANKS)));

	public static final Block ANDESITE_ENCASED_CRIMSON_SHAFT = registerBlock("andesite_encased_crimson_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.CRIMSON_PLANKS)));

	public static final Block ANDESITE_ENCASED_DARK_OAK_SHAFT = registerBlock("andesite_encased_dark_oak_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS)));

	public static final Block ANDESITE_ENCASED_GLASS_SHAFT = registerBlock("andesite_encased_glass_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.GLASS)));

	public static final Block ANDESITE_ENCASED_JUNGLE_SHAFT = registerBlock("andesite_encased_jungle_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS)));

	public static final Block ANDESITE_ENCASED_MANGROVE_SHAFT = registerBlock("andesite_encased_mangrove_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_PLANKS)));

	public static final Block ANDESITE_ENCASED_OAK_SHAFT = registerBlock("andesite_encased_oak_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block ANDESITE_ENCASED_SPRUCE_SHAFT = registerBlock("andesite_encased_spruce_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_PLANKS)));

	public static final Block ANDESITE_ENCASED_WARPED_SHAFT = registerBlock("andesite_encased_warped_shaft",
			new CasingBlock(FabricBlockSettings.copyOf(Blocks.WARPED_PLANKS)));

	// Presses
	public static final Block BRASS_PRESS = registerBlock("brass_press",
			new MechanicalPressBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block COPPER_PRESS = registerBlock("copper_press",
			new MechanicalPressBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block CREATIVE_PRESS = registerBlock("creative_press",
			new MechanicalPressBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block INDUSTRIAL_IRON_PRESS = registerBlock("industrial_iron_press",
			new MechanicalPressBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block RAILWAY_PRESS = registerBlock("railway_press",
			new MechanicalPressBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	// Depots
	public static final Block BRASS_DEPOT = registerBlock("brass_depot",
			new DepotBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block INDUSTRIAL_IRON_DEPOT = registerBlock("industrial_iron_depot",
			new DepotBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block COPPER_DEPOT = registerBlock("copper_depot",
			new DepotBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block RAILWAY_DEPOT = registerBlock("railway_depot",
			new DepotBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block CREATIVE_DEPOT = registerBlock("creative_depot",
			new DepotBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	// Gearboxes
	public static final Block BRASS_GEARBOX = registerBlock("brass_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block COPPER_GEARBOX = registerBlock("copper_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block INDUSTRIAL_IRON_GEARBOX = registerBlock("industrial_iron_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block RAILWAY_GEARBOX = registerBlock("railway_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block CREATIVE_GEARBOX = registerBlock("creative_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	// Vertical Gearboxes
	public static final Block VERTICAL_BRASS_GEARBOX = registerBlock("vertical_brass_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block VERTICAL_COPPER_GEARBOX = registerBlock("vertical_copper_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block VERTICAL_INDUSTRIAL_IRON_GEARBOX = registerBlock("vertical_industrial_iron_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block VERTICAL_RAILWAY_GEARBOX = registerBlock("vertical_railway_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

	public static final Block VERTICAL_CREATIVE_GEARBOX = registerBlock("vertical_creative_gearbox",
			new GearboxBlock(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));



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
