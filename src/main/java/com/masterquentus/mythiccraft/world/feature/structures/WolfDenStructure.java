package com.masterquentus.mythiccraft.world.feature.structures;

import java.util.Random;
import java.util.function.Function;

import com.masterquentus.mythiccraft.MythicCraft;
import com.mojang.datafixers.Dynamic;

import net.minecraft.util.Rotation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.util.math.MutableBoundingBox;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.feature.structure.StructureStart;
import net.minecraft.world.gen.feature.template.TemplateManager;

public class WolfDenStructure extends Structure<NoFeatureConfig> {

	public WolfDenStructure(Function<Dynamic<?>, ? extends NoFeatureConfig> config) {
		super(config);
	}

	@Override
	public boolean canBeGenerated(BiomeManager manager, ChunkGenerator<?> generator, Random rand, int chunkX, int chunkZ, Biome biome) {
		ChunkPos pos = this.getStartPositionForPosition(generator, rand, chunkX, chunkZ, 0, 0);

		if (chunkX == pos.x && chunkZ == pos.z) {
			if (generator.hasStructure(biome, this)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public IStartFactory getStartFactory() {
		return WolfDenStructure.Start::new;
	}

	@Override
	public String getStructureName() {
		return MythicCraft.MOD_ID + ":wolfden";
	}

	@Override
	protected ChunkPos getStartPositionForPosition(ChunkGenerator<?> generator, Random rand, int x, int z, int offsetX,
			int offsetZ) {
		int maxDistance = 10;
		int minDistance = 3;

		int xTemp = x + maxDistance * offsetX;
		int ztemp = z + maxDistance * offsetZ;
		int xTemp2 = xTemp < 0 ? xTemp - maxDistance + 1 : xTemp;
		int zTemp2 = ztemp < 0 ? ztemp - maxDistance + 1 : ztemp;
		int validChunkX = xTemp2 / maxDistance;
		int validChunkZ = zTemp2 / maxDistance;

		((SharedSeedRandom) rand).setLargeFeatureSeedWithSalt(generator.getSeed(), validChunkX, validChunkZ,
				this.getSeedModifier());
		validChunkX = validChunkX * maxDistance;
		validChunkZ = validChunkZ * maxDistance;
		validChunkX = validChunkX + rand.nextInt(maxDistance - minDistance);
		validChunkZ = validChunkZ + rand.nextInt(maxDistance - minDistance);

		return new ChunkPos(validChunkX, validChunkZ);
	}

	protected int getSeedModifier() {
		return 547837340;
	}

	public static class Start extends StructureStart {

		public Start(Structure<?> structure, int chunkX, int chunkZ, MutableBoundingBox boundingBox, int reference,
				long seed) {
			super(structure, chunkX, chunkZ, boundingBox, reference, seed);
		}

		@Override
		public void init(ChunkGenerator<?> generator, TemplateManager templateManagerIn, int chunkX, int chunkZ,
				Biome biomeIn) {
			Rotation rotation = Rotation.values()[this.rand.nextInt(Rotation.values().length)];

			int x = (chunkX << 4) + 7;
			int z = (chunkX << 4) + 7;
			int y = generator.getHeight(x, z, Heightmap.Type.WORLD_SURFACE_WG);
			BlockPos pos = new BlockPos(x, y, z);

			GoblinHousePieces.start(templateManagerIn, pos, rotation, this.components, this.rand);

			this.recalculateStructureSize();

			MythicCraft.LOGGER.info("We can find a wolf den at: " + pos);
		}
	}
}