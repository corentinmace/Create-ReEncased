package com.kuhasr.createencasedfabric.item;

import com.kuhasr.createencasedfabric.CreateReEncasedMod;

import com.kuhasr.createencasedfabric.block.ModBlocks;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
	public static final ItemGroup REENCASED_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(CreateReEncasedMod.ID, "createencasedfabric"),
			FabricItemGroup.builder().displayName(Text.translatable("itemGroup.createencasedfabric"))
					.icon(() -> new ItemStack(ModItems.CHORIUM_INGOT)).entries((displayContext, entries) -> {
						// ITEMS
						entries.add(ModItems.CHORIUM_INGOT);

						// BLOCKS
						entries.add(ModBlocks.CREATIVE_CASING);

						// Shafts
						entries.add(ModBlocks.ACACIA_SHAFT);
						entries.add(ModBlocks.BAMBOO_SHAFT);
						entries.add(ModBlocks.BIRCH_SHAFT);
						entries.add(ModBlocks.CHERRY_SHAFT);
						entries.add(ModBlocks.CRIMSON_SHAFT);
						entries.add(ModBlocks.DARK_OAK_SHAFT);
						entries.add(ModBlocks.GLASS_SHAFT);
						entries.add(ModBlocks.JUNGLE_SHAFT);
						entries.add(ModBlocks.MANGROVE_SHAFT);
						entries.add(ModBlocks.OAK_SHAFT);
						entries.add(ModBlocks.SPRUCE_SHAFT);
						entries.add(ModBlocks.WARPED_SHAFT);
						entries.add(ModBlocks.BRASS_SHAFT);


						// Andesite Encased Shafts
						entries.add(ModBlocks.ANDESITE_ENCASED_ACACIA_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_BAMBOO_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_BIRCH_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_CHERRY_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_CRIMSON_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_DARK_OAK_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_GLASS_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_JUNGLE_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_MANGROVE_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_OAK_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_SPRUCE_SHAFT);
						entries.add(ModBlocks.ANDESITE_ENCASED_WARPED_SHAFT);

						// Presses
						entries.add(ModBlocks.BRASS_PRESS);
						entries.add(ModBlocks.COPPER_PRESS);
						entries.add(ModBlocks.CREATIVE_PRESS);
						entries.add(ModBlocks.INDUSTRIAL_IRON_PRESS);
						entries.add(ModBlocks.RAILWAY_PRESS);

						// Depots
						entries.add(ModBlocks.BRASS_DEPOT);
						entries.add(ModBlocks.INDUSTRIAL_IRON_DEPOT);
						entries.add(ModBlocks.COPPER_DEPOT);
						entries.add(ModBlocks.RAILWAY_DEPOT);
						entries.add(ModBlocks.CREATIVE_DEPOT);

						// Gearboxes
						entries.add(ModBlocks.BRASS_GEARBOX);
						entries.add(ModBlocks.COPPER_GEARBOX);
						entries.add(ModBlocks.INDUSTRIAL_IRON_GEARBOX);
						entries.add(ModBlocks.RAILWAY_GEARBOX);
						entries.add(ModBlocks.CREATIVE_GEARBOX);

						// Vertical Gearboxes
						entries.add(ModBlocks.VERTICAL_BRASS_GEARBOX);
						entries.add(ModBlocks.VERTICAL_COPPER_GEARBOX);
						entries.add(ModBlocks.VERTICAL_INDUSTRIAL_IRON_GEARBOX);
						entries.add(ModBlocks.VERTICAL_RAILWAY_GEARBOX);
						entries.add(ModBlocks.VERTICAL_CREATIVE_GEARBOX);


					}).build());

	public static void registerItemGroups() {
		CreateReEncasedMod.LOGGER.info("Registering Item Groups for Mod " + CreateReEncasedMod.ID);
	}


}
