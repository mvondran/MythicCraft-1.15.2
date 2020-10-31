package com.masterquentus.mythiccraft.init;

import com.masterquentus.mythiccraft.MythicCraft;

import net.minecraft.block.Block;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FluidInit {
	
	public static final ResourceLocation BLOOD_STILL_RL = new ResourceLocation(MythicCraft.MOD_ID, "blocks/blood_still");
	public static final ResourceLocation BLOOD_FLOWING_RL = new ResourceLocation(MythicCraft.MOD_ID, "blocks/blood_flowing");
	public static final ResourceLocation ECTOPLASM_STILL_RL = new ResourceLocation(MythicCraft.MOD_ID, "blocks/ectoplasm_still");
	public static final ResourceLocation ECTOPLASM_FLOWING_RL = new ResourceLocation(MythicCraft.MOD_ID, "blocks/ectoplasm_flowing");
	
	public static final ResourceLocation BLOOD_OVERLAY_RL = new ResourceLocation(MythicCraft.MOD_ID, "blocks/blood_overlay");
	public static final ResourceLocation ECTOPLASM_OVERLAY_RL = new ResourceLocation(MythicCraft.MOD_ID, "blocks/ectoplasm_overlay");
	
	public static final DeferredRegister<Fluid> FLUIDS = new DeferredRegister<>(ForgeRegistries.FLUIDS, MythicCraft.MOD_ID);
	
	public static final RegistryObject<FlowingFluid> BLOOD_FLUID = FLUIDS.register("blood_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.BLOOD_PROPERTIES));
	public static final RegistryObject<FlowingFluid> BLOOD_FLOWING = FLUIDS.register("blood_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.BLOOD_PROPERTIES));
	public static final RegistryObject<FlowingFluid> ECTOPLASM_FLUID = FLUIDS.register("ectoplasm_fluid", () -> new ForgeFlowingFluid.Source(FluidInit.ECTOPLASM_PROPERTIES));
	public static final RegistryObject<FlowingFluid> ECTOPLASM_FLOWING = FLUIDS.register("ectoplasm_flowing", () -> new ForgeFlowingFluid.Flowing(FluidInit.ECTOPLASM_PROPERTIES));
	
	public static final ForgeFlowingFluid.Properties BLOOD_PROPERTIES = new ForgeFlowingFluid.Properties(() -> BLOOD_FLUID.get(), () -> BLOOD_FLOWING.get(), FluidAttributes.builder(BLOOD_STILL_RL, BLOOD_FLOWING_RL).density(7).rarity(Rarity.UNCOMMON).sound(SoundEvents.BLOCK_HONEY_BLOCK_BREAK).overlay(BLOOD_OVERLAY_RL)).block(() -> FluidInit.BLOOD_BLOCK.get()).bucket(() -> ItemInitNew.blood_bucket.get());
	public static final ForgeFlowingFluid.Properties ECTOPLASM_PROPERTIES = new ForgeFlowingFluid.Properties(() -> ECTOPLASM_FLUID.get(), () -> ECTOPLASM_FLOWING.get(), FluidAttributes.builder(ECTOPLASM_STILL_RL, ECTOPLASM_FLOWING_RL).density(3).rarity(Rarity.UNCOMMON).sound(SoundEvents.BLOCK_BEEHIVE_DROP).overlay(ECTOPLASM_OVERLAY_RL)).block(() -> FluidInit.ECTOPLASM_BLOCK.get()).bucket(() -> ItemInitNew.ectoplasm_bucket.get());
	
	public static final RegistryObject<FlowingFluidBlock> BLOOD_BLOCK = BlockInitNew.BLOCKS.register("blood", () -> new FlowingFluidBlock(() -> FluidInit.BLOOD_FLUID.get(), Block.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));
	public static final RegistryObject<FlowingFluidBlock> ECTOPLASM_BLOCK = BlockInitNew.BLOCKS.register("ectoplasm", () -> new FlowingFluidBlock(() -> FluidInit.ECTOPLASM_FLUID.get(), Block.Properties.create(Material.WATER).doesNotBlockMovement().hardnessAndResistance(100.0f).noDrops()));
}
