package com.kuhasr.createencasedfabric.item;

import com.kuhasr.createencasedfabric.CreateReEncasedMod;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;


public class ModItems {

	public static final Item CHORIUM_INGOT = registerItem("chorium_ingot", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));
	public static final Item PROCESSING_CHORIUM = registerItem("processing_chorium", new Item(new FabricItemSettings().rarity(Rarity.EPIC)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registries.ITEM, new Identifier(CreateReEncasedMod.ID, name), item);
	}

	public static void registerModItems() {
		CreateReEncasedMod.LOGGER.info("Registering Mod Items for " + CreateReEncasedMod.ID);

	}
}
