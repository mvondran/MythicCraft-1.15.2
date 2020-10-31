package com.masterquentus.mythiccraft.init;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.entities.GoblinEntity;

import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

	public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = new DeferredRegister<>(ForgeRegistries.ENTITIES, MythicCraft.MOD_ID);
	
	public static final RegistryObject<EntityType<GoblinEntity>> GOBLIN_ENTITY = ENTITY_TYPES.register("goblin_entity", () -> EntityType.Builder.<GoblinEntity>create(GoblinEntity::new, EntityClassification.CREATURE).size(1.3F, 0.9F).build(new ResourceLocation(MythicCraft.MOD_ID, "goblin_entity").toString()));
}
