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
					}).build());

	public static void registerItemGroups() {
		CreateReEncasedMod.LOGGER.info("Registering Item Groups for Mod " + CreateReEncasedMod.ID);
	}


}
