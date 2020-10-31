package com.masterquentus.mythiccraft.init;

import com.masterquentus.mythiccraft.MythicCraft;
import com.masterquentus.mythiccraft.world.biomes.CharredForestBiome;
import com.masterquentus.mythiccraft.world.biomes.MysiticMedowsBiome;
import com.masterquentus.mythiccraft.world.biomes.VampireBiome;

import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biome.RainType;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
	public static final DeferredRegister<Biome> Biomes = new DeferredRegister<>(ForgeRegistries.BIOMES,
			MythicCraft.MOD_ID);

	public static final RegistryObject<Biome> VAMPIREBIOME = Biomes.register("vampire_biome",
			() -> new VampireBiome(new Biome.Builder().precipitation(RainType.RAIN).scale(0.5F).temperature(0.5F)
					.waterColor(4849664).waterFogColor(3145728)
					.surfaceBuilder(SurfaceBuilder.MOUNTAIN,
							new SurfaceBuilderConfig(BlockInit.ash_block.getDefaultState(),
									BlockInit.blackstone.getDefaultState(), Blocks.CLAY.getDefaultState()))
					.category(Category.FOREST).downfall(1.5F).depth(0.12F).parent(null)));
	public static final RegistryObject<Biome> MISTICMEDDOWSBIOME = Biomes.register("misticmedows_biome",
			() -> new MysiticMedowsBiome(new Biome.Builder().precipitation(RainType.RAIN).scale(0.5F).temperature(0.5F)
					.waterColor(1822207).waterFogColor(1828351)
					.surfaceBuilder(SurfaceBuilder.MOUNTAIN,
							new SurfaceBuilderConfig(Blocks.GRASS.getDefaultState(),
									BlockInit.mysticstone.getDefaultState(), Blocks.CLAY.getDefaultState()))
					.category(Category.FOREST).downfall(1.5F).depth(0.12F).parent(null)));
	public static final RegistryObject<Biome> CHARREDFORESTBIOME = Biomes.register("charredforest_biome",
			() -> new CharredForestBiome(new Biome.Builder().precipitation(RainType.NONE).scale(5.5F).temperature(5.5F)
					.waterColor(3351).waterFogColor(3361)
					.surfaceBuilder(SurfaceBuilder.DEFAULT,
							new SurfaceBuilderConfig(BlockInit.ash_block.getDefaultState(),
									BlockInit.blackstone_cobble.getDefaultState(), Blocks.GRAVEL.getDefaultState()))
					.category(Category.FOREST).downfall(1.5F).depth(0.12F).parent(null)));
	public static final RegistryObject<Biome> INFESTEDFORESTBIOME = Biomes.register("infestedforest_biome",
			() -> new CharredForestBiome(new Biome.Builder().precipitation(RainType.RAIN).scale(0.5F).temperature(0.5F)
					.waterColor(3545143).waterFogColor(4069431)
					.surfaceBuilder(SurfaceBuilder.DEFAULT,
							new SurfaceBuilderConfig(Blocks.GRASS_BLOCK.getDefaultState(),
									Blocks.STONE.getDefaultState(), Blocks.GRAVEL.getDefaultState()))
					.category(Category.FOREST).downfall(1.5F).depth(0.12F).parent(null)));

	public static void registerBiomes() {
		registerBiome(VAMPIREBIOME.get(), Type.DEAD, Type.DENSE);
		registerBiome(MISTICMEDDOWSBIOME.get(), Type.MAGICAL, Type.DENSE);
		registerBiome(CHARREDFORESTBIOME.get(), Type.FOREST, Type.DENSE);
		registerBiome(INFESTEDFORESTBIOME.get(), Type.MAGICAL, Type.DENSE);
	}

	private static void registerBiome(Biome biome, Type... types) {
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(biome, 10));
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addSpawnBiome(biome);
	}
}
