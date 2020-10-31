package com.masterquentus.mythiccraft.init;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.MythicCraft.MythicCraftItemGroup;

import net.minecraft.item.BlockItem;
import net.minecraft.item.BucketItem;
//import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInitNew {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS,
			MythicCraft.MOD_ID);

	public static final RegistryObject<Item> pureglowstone_dust = ITEMS.register("pureglowstone_dust",
			() -> new Item(new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> darkglowstone_dust = ITEMS.register("darkglowstone_dust",
			() -> new Item(new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> vervain_seeds = ITEMS.register("vervain_seeds",
			() -> new BlockItem(BlockInitNew.vervain_crop.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> wolfsbane_seeds = ITEMS.register("wolfsbane_seeds",
			() -> new BlockItem(BlockInitNew.wolfsbane_crop.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> garlic_seeds = ITEMS.register("garlic_seeds",
			() -> new BlockItem(BlockInitNew.garlic_crop.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> belladnna_seeds = ITEMS.register("belladnna_seeds",
			() -> new BlockItem(BlockInitNew.belladonna_crop.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> mandrake_seeds = ITEMS.register("mandrake_seeds",
			() -> new BlockItem(BlockInitNew.mandrake_crop.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> herbalism_seeds = ITEMS.register("herbalism_seeds",
			() -> new BlockItem(BlockInitNew.herbalism_crop.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> wormwood_seeds = ITEMS.register("wormwood_seeds",
			() -> new BlockItem(BlockInitNew.wormwood_crop.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<Item> nightshade_seeds = ITEMS.register("nightshade_seeds",
			() -> new BlockItem(BlockInitNew.nightshade_crop.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance)));
	public static final RegistryObject<BucketItem> blood_bucket = ITEMS.register("blood_bucket",
			() -> new BucketItem(() -> FluidInit.BLOOD_FLUID.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance).maxStackSize(1)));
	public static final RegistryObject<BucketItem> ectoplasm_bucket = ITEMS.register("ectoplasm_bucket",
			() -> new BucketItem(() -> FluidInit.ECTOPLASM_FLUID.get(),
					new Item.Properties().group(MythicCraftItemGroup.instance).maxStackSize(1)));
}
