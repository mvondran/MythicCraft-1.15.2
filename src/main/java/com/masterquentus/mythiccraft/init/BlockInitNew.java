package com.masterquentus.mythiccraft.init;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.objects.BelladonnaCropBlock;
import com.masterquentus.mythiccraft.objects.GarlicCropBlock;
import com.masterquentus.mythiccraft.objects.HerbalismCropBlock;
import com.masterquentus.mythiccraft.objects.MandrakeCropBlock;
import com.masterquentus.mythiccraft.objects.NightShadeCrop;
import com.masterquentus.mythiccraft.objects.VervainCropBlock;
import com.masterquentus.mythiccraft.objects.WolfsCropBlock;
import com.masterquentus.mythiccraft.objects.WormwoodCrop;
import com.masterquentus.mythiccraft.objects.blocks.BloodOakBarrelBlock;
import com.masterquentus.mythiccraft.objects.blocks.ModDoor;
import com.masterquentus.mythiccraft.objects.blocks.ModSaplingBlock;
import com.masterquentus.mythiccraft.objects.blocks.ModWoodButtonBlock;
import com.masterquentus.mythiccraft.objects.blocks.ModWoodPressurePlateBlock;
import com.masterquentus.mythiccraft.world.feature.BloodOakTree;
import com.masterquentus.mythiccraft.world.feature.SilverWoodTree;
import com.masterquentus.mythiccraft.world.feature.WhiteOakTree;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInitNew {

	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS,
			MythicCraft.MOD_ID);

	// Trees
	public static final RegistryObject<Block> bloodoak_planks = BLOCKS.register("bloodoak_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> bloodoak_log = BLOCKS.register("bloodoak_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> bloodoak_leaves = BLOCKS.register("bloodoak_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> bloodoak_sapling = BLOCKS.register("bloodoak_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> whiteoak_planks = BLOCKS.register("whiteoak_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> whiteoak_log = BLOCKS.register("whiteoak_log",
			() -> new LogBlock(MaterialColor.WHITE_TERRACOTTA, Block.Properties.from(Blocks.DARK_OAK_LOG)));
	public static final RegistryObject<Block> whiteoak_leaves = BLOCKS.register("whiteoak_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.DARK_OAK_LEAVES)));
	public static final RegistryObject<Block> whiteoak_sapling = BLOCKS.register("whiteoak_sapling",
			() -> new ModSaplingBlock(() -> new WhiteOakTree(), Block.Properties.from(Blocks.DARK_OAK_SAPLING)));
	public static final RegistryObject<Block> silverwood_planks = BLOCKS.register("silverwood_planks",
			() -> new Block(Block.Properties.from(Blocks.BIRCH_PLANKS)));
	public static final RegistryObject<Block> silverwood_log = BLOCKS.register("silverwood_log",
			() -> new LogBlock(MaterialColor.WHITE_TERRACOTTA, Block.Properties.from(Blocks.BIRCH_LOG)));
	public static final RegistryObject<Block> silverwood_leaves = BLOCKS.register("silverwood_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.BIRCH_LEAVES)));
	public static final RegistryObject<Block> silverwood_sapling = BLOCKS.register("silverwood_sapling",
			() -> new ModSaplingBlock(() -> new SilverWoodTree(), Block.Properties.from(Blocks.BIRCH_SAPLING)));
	public static final RegistryObject<Block> witchwood_planks = BLOCKS.register("witchwood_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> witchwood_log = BLOCKS.register("witchwood_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> witchwood_leaves = BLOCKS.register("witchwood_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> witchwood_sapling = BLOCKS.register("witchwood_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> alder_planks = BLOCKS.register("alder_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> alder_log = BLOCKS.register("alder_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> alder_leaves = BLOCKS.register("alder_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> alder_sapling = BLOCKS.register("alder_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> hawthorn_planks = BLOCKS.register("hawthorn_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> hawthorn_log = BLOCKS.register("hawthorn_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> hawthorn_leaves = BLOCKS.register("hawthorn_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> hawthorn_sapling = BLOCKS.register("hawthorn_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> rowan_planks = BLOCKS.register("rowan_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> rowan_log = BLOCKS.register("rowan_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> rowan_leaves = BLOCKS.register("rowan_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> rowan_sapling = BLOCKS.register("rowan_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> willow_planks = BLOCKS.register("willow_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> willow_log = BLOCKS.register("willow_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> willow_leaves = BLOCKS.register("willow_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> willow_sapling = BLOCKS.register("willow_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> beech_planks = BLOCKS.register("beech_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> beech_log = BLOCKS.register("beech_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> beech_leaves = BLOCKS.register("beech_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> beech_sapling = BLOCKS.register("beech_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> ash_planks = BLOCKS.register("ash_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> ash_log = BLOCKS.register("ash_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> ash_leaves = BLOCKS.register("ash_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> ash_sapling = BLOCKS.register("ash_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> blackthorn_planks = BLOCKS.register("blackthorn_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> blackthorn_log = BLOCKS.register("blackthorn_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> blackthorn_leaves = BLOCKS.register("blackthorn_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> blackthorn_sapling = BLOCKS.register("blackthorn_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> cedar_planks = BLOCKS.register("cedar_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> cedar_log = BLOCKS.register("cedar_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> cedar_leaves = BLOCKS.register("cedar_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> cedar_sapling = BLOCKS.register("cedar_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> elder_planks = BLOCKS.register("elder_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> elder_log = BLOCKS.register("elder_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> elder_leaves = BLOCKS.register("elder_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> elder_sapling = BLOCKS.register("elder_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> juniper_planks = BLOCKS.register("juniper_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> juniper_log = BLOCKS.register("juniper_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> juniper_leaves = BLOCKS.register("juniper_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> juniper_sapling = BLOCKS.register("juniper_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> witchhazel_planks = BLOCKS.register("witchhazel_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> witchhazel_log = BLOCKS.register("witchhazel_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> witchhazel_leaves = BLOCKS.register("witchhazel_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> witchhazel_sapling = BLOCKS.register("witchhazel_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> yew_planks = BLOCKS.register("yew_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> yew_log = BLOCKS.register("yew_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> yew_leaves = BLOCKS.register("yew_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> yew_sapling = BLOCKS.register("yew_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> infested_planks = BLOCKS.register("infested_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> infested_log = BLOCKS.register("infested_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> infested_leaves = BLOCKS.register("infested_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> infested_sapling = BLOCKS.register("infested_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));
	public static final RegistryObject<Block> charred_planks = BLOCKS.register("charred_planks",
			() -> new Block(Block.Properties.from(Blocks.ACACIA_PLANKS)));
	public static final RegistryObject<Block> charred_log = BLOCKS.register("charred_log",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.ACACIA_LOG)));
	public static final RegistryObject<Block> charred_leaves = BLOCKS.register("charred_leaves",
			() -> new LeavesBlock(Block.Properties.from(Blocks.ACACIA_LEAVES)));
	public static final RegistryObject<Block> charred_sapling = BLOCKS.register("charred_sapling",
			() -> new ModSaplingBlock(() -> new BloodOakTree(), Block.Properties.from(Blocks.ACACIA_SAPLING)));

	// Blocks
	public static final RegistryObject<Block> bloodoak_stairs = BLOCKS.register("bloodoak_stairs",
			() -> new StairsBlock(() -> BlockInitNew.bloodoak_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.RED)));
	public static final RegistryObject<Block> bloodoak_fence = BLOCKS.register("bloodoak_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED)));
	public static final RegistryObject<Block> bloodoak_button = BLOCKS.register("bloodoak_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.RED)));
	public static final RegistryObject<Block> bloodoak_barrel = BLOCKS.register("bloodoak_barrel",
			() -> new BloodOakBarrelBlock(Block.Properties.from(Blocks.BARREL)));
	public static final RegistryObject<Block> bloodoak_pressureplate = BLOCKS.register("bloodoak_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.RED)));
	public static final RegistryObject<Block> bloodoak_slab = BLOCKS.register("bloodoak_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.bloodoak_planks.get())));
	public static final RegistryObject<Block> bloodoak_door = BLOCKS.register("bloodoak_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> bloodoak_fence_gate = BLOCKS.register("bloodoak_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> whiteoak_stairs = BLOCKS.register("whiteoak_stairs",
			() -> new StairsBlock(() -> BlockInitNew.whiteoak_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> whiteoak_fence = BLOCKS.register("whiteoak_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> whiteoak_button = BLOCKS.register("whiteoak_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> whiteoak_pressureplate = BLOCKS.register("whiteoak_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> whiteoak_slab = BLOCKS.register("whiteoak_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.whiteoak_planks.get())));
	public static final RegistryObject<Block> whiteoak_door = BLOCKS.register("whiteoak_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> whiteoak_fence_gate = BLOCKS.register("whiteoak_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> silverwood_stairs = BLOCKS.register("silverwood_stairs",
			() -> new StairsBlock(() -> BlockInitNew.silverwood_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.BLUE)));
	public static final RegistryObject<Block> silverwood_fence = BLOCKS.register("silverwood_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.BLUE)));
	public static final RegistryObject<Block> silverwood_button = BLOCKS.register("silverwood_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.BLUE)));
	public static final RegistryObject<Block> silverwood_pressureplate = BLOCKS.register("silverwood_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.BLUE)));
	public static final RegistryObject<Block> silverwood_slab = BLOCKS.register("silverwood_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.silverwood_planks.get())));
	public static final RegistryObject<Block> silverwood_door = BLOCKS.register("silverwood_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> silverwood_fence_gate = BLOCKS.register("silverwood_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> witchwood_stairs = BLOCKS.register("witchwood_stairs",
			() -> new StairsBlock(() -> BlockInitNew.witchwood_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.BLUE)));
	public static final RegistryObject<Block> witchwood_fence = BLOCKS.register("witchwood_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.BLUE)));
	public static final RegistryObject<Block> witchwood_button = BLOCKS.register("witchwood_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.BLUE)));
	public static final RegistryObject<Block> witchwood_pressureplate = BLOCKS.register("witchwood_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.BLUE)));
	public static final RegistryObject<Block> witchwood_slab = BLOCKS.register("witchwood_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.witchwood_planks.get())));
	public static final RegistryObject<Block> witchwood_door = BLOCKS.register("witchwood_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> witchwood_fence_gate = BLOCKS.register("witchwood_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> alder_stairs = BLOCKS.register("alder_stairs",
			() -> new StairsBlock(() -> BlockInitNew.alder_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> alder_fence = BLOCKS.register("alder_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> alder_button = BLOCKS.register("alder_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> alder_pressureplate = BLOCKS.register("alder_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> alder_slab = BLOCKS.register("alder_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.alder_planks.get())));
	public static final RegistryObject<Block> alder_door = BLOCKS.register("alder_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> alder_fence_gate = BLOCKS.register("alder_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> hawthorn_stairs = BLOCKS.register("hawthorn_stairs",
			() -> new StairsBlock(() -> BlockInitNew.hawthorn_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> hawthorn_fence = BLOCKS.register("hawthorn_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> hawthorn_button = BLOCKS.register("hawthorn_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> hawthorn_pressureplate = BLOCKS.register("hawthorn_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> hawthorn_slab = BLOCKS.register("hawthorn_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.hawthorn_planks.get())));
	public static final RegistryObject<Block> hawthorn_door = BLOCKS.register("hawthorn_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> hawthorn_fence_gate = BLOCKS.register("hawthorn_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> rowan_stairs = BLOCKS.register("rowan_stairs",
			() -> new StairsBlock(() -> BlockInitNew.rowan_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> rowan_fence = BLOCKS.register("rowan_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> rowan_button = BLOCKS.register("rowan_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> rowan_pressureplate = BLOCKS.register("rowan_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> rowan_slab = BLOCKS.register("rowan_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.rowan_planks.get())));
	public static final RegistryObject<Block> rowan_door = BLOCKS.register("rowan_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> rowan_fence_gate = BLOCKS.register("rowan_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> willow_stairs = BLOCKS.register("willow_stairs",
			() -> new StairsBlock(() -> BlockInitNew.willow_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> willow_fence = BLOCKS.register("willow_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> willow_button = BLOCKS.register("willow_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> willow_pressureplate = BLOCKS.register("willow_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> willow_slab = BLOCKS.register("willow_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.willow_planks.get())));
	public static final RegistryObject<Block> willow_door = BLOCKS.register("willow_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> willow_fence_gate = BLOCKS.register("willow_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> beech_stairs = BLOCKS.register("beech_stairs",
			() -> new StairsBlock(() -> BlockInitNew.beech_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> beech_fence = BLOCKS.register("beech_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> beech_button = BLOCKS.register("beech_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> beech_pressureplate = BLOCKS.register("beech_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> beech_slab = BLOCKS.register("beech_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.beech_planks.get())));
	public static final RegistryObject<Block> beech_door = BLOCKS.register("beech_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> beech_fence_gate = BLOCKS.register("beech_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> ash_stairs = BLOCKS.register("ash_stairs",
			() -> new StairsBlock(() -> BlockInitNew.ash_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> ash_fence = BLOCKS.register("ash_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> ash_button = BLOCKS.register("ash_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> ash_pressureplate = BLOCKS.register("ash_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> ash_slab = BLOCKS.register("ash_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.ash_planks.get())));
	public static final RegistryObject<Block> ash_door = BLOCKS.register("ash_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> ash_fence_gate = BLOCKS.register("ash_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> blackthorn_stairs = BLOCKS.register("blackthorn_stairs",
			() -> new StairsBlock(() -> BlockInitNew.blackthorn_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> blackthorn_fence = BLOCKS.register("blackthorn_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> blackthorn_button = BLOCKS.register("blackthorn_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> blackthorn_pressureplate = BLOCKS.register("blackthorn_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.GREEN)));
	public static final RegistryObject<Block> blackthorn_slab = BLOCKS.register("blackthorn_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.blackthorn_planks.get())));
	public static final RegistryObject<Block> blackthorn_door = BLOCKS.register("blackthorn_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> blackthorn_fence_gate = BLOCKS.register("blackthorn_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> cedar_stairs = BLOCKS.register("cedar_stairs",
			() -> new StairsBlock(() -> BlockInitNew.cedar_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA)));
	public static final RegistryObject<Block> cedar_fence = BLOCKS.register("cedar_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA)));
	public static final RegistryObject<Block> cedar_button = BLOCKS.register("cedar_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA)));
	public static final RegistryObject<Block> cedar_pressureplate = BLOCKS.register("cedar_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.BROWN_TERRACOTTA)));
	public static final RegistryObject<Block> cedar_slab = BLOCKS.register("cedar_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.cedar_planks.get())));
	public static final RegistryObject<Block> cedar_door = BLOCKS.register("cedar_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> cedar_fence_gate = BLOCKS.register("cedar_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> elder_stairs = BLOCKS.register("elder_stairs",
			() -> new StairsBlock(() -> BlockInitNew.elder_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> elder_fence = BLOCKS.register("elder_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> elder_button = BLOCKS.register("elder_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> elder_pressureplate = BLOCKS.register("elder_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> elder_slab = BLOCKS.register("elder_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.elder_planks.get())));
	public static final RegistryObject<Block> elder_door = BLOCKS.register("elder_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> elder_fence_gate = BLOCKS.register("elder_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> juniper_stairs = BLOCKS.register("juniper_stairs",
			() -> new StairsBlock(() -> BlockInitNew.juniper_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> juniper_fence = BLOCKS.register("juniper_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> juniper_button = BLOCKS.register("juniper_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> juniper_pressureplate = BLOCKS.register("juniper_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.BROWN)));
	public static final RegistryObject<Block> juniper_slab = BLOCKS.register("juniper_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.juniper_planks.get())));
	public static final RegistryObject<Block> juniper_door = BLOCKS.register("juniper_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> juniper_fence_gate = BLOCKS.register("juniper_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> witchhazel_stairs = BLOCKS.register("witchhazel_stairs",
			() -> new StairsBlock(() -> BlockInitNew.witchhazel_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> witchhazel_fence = BLOCKS.register("witchhazel_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> witchhazel_button = BLOCKS.register("witchhazel_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> witchhazel_pressureplate = BLOCKS.register("witchhazel_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> witchhazel_slab = BLOCKS.register("witchhazel_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.witchhazel_planks.get())));
	public static final RegistryObject<Block> witchhazel_door = BLOCKS.register("witchhazel_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> witchhazel_fence_gate = BLOCKS.register("witchhazel_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> yew_stairs = BLOCKS.register("yew_stairs",
			() -> new StairsBlock(() -> BlockInitNew.yew_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> yew_fence = BLOCKS.register("yew_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> yew_button = BLOCKS.register("yew_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> yew_pressureplate = BLOCKS.register("yew_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> yew_slab = BLOCKS.register("yew_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.yew_planks.get())));
	public static final RegistryObject<Block> yew_door = BLOCKS.register("yew_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> yew_fence_gate = BLOCKS.register("yew_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> infested_stairs = BLOCKS.register("infested_stairs",
			() -> new StairsBlock(() -> BlockInitNew.infested_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> infested_fence = BLOCKS.register("infested_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> infested_button = BLOCKS.register("infested_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> infested_pressureplate = BLOCKS.register("infested_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.WHITE_TERRACOTTA)));
	public static final RegistryObject<Block> infested_slab = BLOCKS.register("infested_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.whiteoak_planks.get())));
	public static final RegistryObject<Block> infested_door = BLOCKS.register("infested_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> infested_fence_gate = BLOCKS.register("infested_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<Block> charred_stairs = BLOCKS.register("charred_stairs",
			() -> new StairsBlock(() -> BlockInitNew.charred_planks.get().getDefaultState(),
					Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> charred_fence = BLOCKS.register("charred_fence",
			() -> new FenceBlock(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> charred_button = BLOCKS.register("charred_button",
			() -> new ModWoodButtonBlock(Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> charred_pressureplate = BLOCKS.register("charred_pressureplate",
			() -> new ModWoodPressurePlateBlock(Sensitivity.EVERYTHING,
					Block.Properties.create(Material.WOOD, MaterialColor.ORANGE_TERRACOTTA)));
	public static final RegistryObject<Block> charred_slab = BLOCKS.register("charred_slab",
			() -> new SlabBlock(Block.Properties.from(BlockInitNew.charred_planks.get())));
	public static final RegistryObject<Block> charred_door = BLOCKS.register("charred_door",
			() -> new ModDoor(Block.Properties.from(Blocks.OAK_DOOR)));
	public static final RegistryObject<FenceGateBlock> charred_fence_gate = BLOCKS.register("charred_fence_gate",
			() -> new FenceGateBlock(Block.Properties.from(Blocks.OAK_FENCE_GATE)));
	public static final RegistryObject<WallBlock> blackstone_wall = BLOCKS.register("blackstone_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> blackstonecobble_wall = BLOCKS.register("blackstonecobble_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> blackstonebricks_wall = BLOCKS.register("blackstonebricks_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> blackstonepolished_wall = BLOCKS.register("blackstonepolished_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> blackstonechisealed_wall = BLOCKS.register("blackstonechisealed_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> blackstonecracked_wall = BLOCKS.register("blackstonecracked_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> mysticstone_wall = BLOCKS.register("mysticstone_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> mysticstonecobble_wall = BLOCKS.register("mysticstonecobble_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> mysticstonebricks_wall = BLOCKS.register("mysticstonebricks_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> mysticstonepolished_wall = BLOCKS.register("mysticstonepolished_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> mysticstonechisealed_wall = BLOCKS
			.register("mysticstonechisealed_wall", () -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> mysticstonecracked_wall = BLOCKS.register("mysticstonecracked_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> pearlstone_wall = BLOCKS.register("pearlstone_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> pearlstonecobble_wall = BLOCKS.register("pearlstonecobble_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> pearlstonebricks_wall = BLOCKS.register("pearlstonebricks_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> pearlstonepolished_wall = BLOCKS.register("pearlstonepolished_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> pearlstonechisealed_wall = BLOCKS.register("pearlstonechisealed_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<WallBlock> pearlstonecracked_wall = BLOCKS.register("pearlstonecracked_wall",
			() -> new WallBlock(Block.Properties.from(Blocks.ANDESITE_WALL)));
	public static final RegistryObject<Block> blood_lantern = BLOCKS.register("blood_lantern",
			() -> new LogBlock(MaterialColor.RED, Block.Properties.from(Blocks.LANTERN)));
	//public static final RegistryObject<Block> witches_oven = BLOCKS.register("witches_oven",() -> new WitchesOven(Block.Properties.from(Blocks.FURNACE)));

	// Crops
	public static final RegistryObject<Block> vervain_crop = BLOCKS.register("vervain_crop",
			() -> new VervainCropBlock(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> wolfsbane_crop = BLOCKS.register("wolfsbane_crop",
			() -> new WolfsCropBlock(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> garlic_crop = BLOCKS.register("garlic_crop",
			() -> new GarlicCropBlock(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> belladonna_crop = BLOCKS.register("belladonna_crop",
			() -> new BelladonnaCropBlock(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> mandrake_crop = BLOCKS.register("mandrake_crop",
			() -> new MandrakeCropBlock(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> herbalism_crop = BLOCKS.register("herbalism_crop",
			() -> new HerbalismCropBlock(Block.Properties.from(Blocks.WHEAT)));
	public static final RegistryObject<Block> wormwood_crop = BLOCKS.register("wormwood_crop",
			() -> new WormwoodCrop(Block.Properties.from(Blocks.CARROTS)));
	public static final RegistryObject<Block> nightshade_crop = BLOCKS.register("nightshade_crop",
			() -> new NightShadeCrop(Block.Properties.from(Blocks.WHEAT)));

}