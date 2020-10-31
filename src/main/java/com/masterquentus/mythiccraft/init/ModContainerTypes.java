package com.masterquentus.mythiccraft.init;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.container.BloodOakBarrelContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

	
	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = new DeferredRegister<>(ForgeRegistries.CONTAINERS, MythicCraft.MOD_ID);
	
	public static final RegistryObject<ContainerType<BloodOakBarrelContainer>> bloodoak_barrel = CONTAINER_TYPES.register("bloodoak_barrel", () -> IForgeContainerType.create(BloodOakBarrelContainer::new));
}
