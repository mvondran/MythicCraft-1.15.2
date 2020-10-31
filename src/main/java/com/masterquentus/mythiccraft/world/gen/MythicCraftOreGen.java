package com.masterquentus.mythiccraft.world.gen;

import com.masterquentus.mythiccraft.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class MythicCraftOreGen {
	@SuppressWarnings("rawtypes")
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
				ConfiguredPlacement customConfig = Placement.COUNT_RANGE.configure(new CountRangeConfig(9, 23, 5, 25));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.vampric_ore.getDefaultState(), 4)).withPlacement(customConfig));
				ConfiguredPlacement customConfig1 = Placement.COUNT_RANGE.configure(new CountRangeConfig(9, 23, 3, 25));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.moonstone_ore.getDefaultState(), 3)).withPlacement(customConfig1));
				ConfiguredPlacement customConfig2 = Placement.COUNT_RANGE.configure(new CountRangeConfig(9, 23, 3, 25));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.silver_ore.getDefaultState(), 3)).withPlacement(customConfig2));
				ConfiguredPlacement customConfig3 = Placement.COUNT_RANGE.configure(new CountRangeConfig(5, 1, 3, 12));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.mythicdiamond_ore.getDefaultState(), 4)).withPlacement(customConfig3));
				ConfiguredPlacement customConfig4 = Placement.COUNT_RANGE.configure(new CountRangeConfig(9, 23, 5, 25));
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.dragonheart_ore.getDefaultState(), 4)).withPlacement(customConfig4));
			}
		}
	}
