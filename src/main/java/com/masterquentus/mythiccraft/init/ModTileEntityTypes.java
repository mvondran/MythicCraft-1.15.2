package com.masterquentus.mythiccraft.init;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.tileentity.BloodOakBarrelTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = new DeferredRegister<>(
			ForgeRegistries.TILE_ENTITIES, MythicCraft.MOD_ID);

	public static final RegistryObject<TileEntityType<BloodOakBarrelTileEntity>> bloodoak_barrel = TILE_ENTITY_TYPES
			.register("bloodoak_barrel", () -> TileEntityType.Builder
					.create(BloodOakBarrelTileEntity::new, BlockInitNew.bloodoak_barrel.get()).build(null));
	
	//public static final RegistryObject<TileEntityType<WitchesOvenTileEntity>> witches_oven = TILE_ENTITY_TYPES.register("witches_oven", () -> TileEntityType.Builder.create(WitchesOvenTileEntity::new, BlockInitNew.witches_oven.get()).build(null));
}
