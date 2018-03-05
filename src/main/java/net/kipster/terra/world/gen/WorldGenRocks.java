package net.kipster.terra.world.gen;

import java.util.Random;

import net.kipster.terra.Config;
import net.kipster.terra.init.BlockInit;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkGeneratorEnd;
import net.minecraft.world.gen.ChunkGeneratorHell;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;


public class WorldGenRocks implements IWorldGenerator 
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{	
		switch(world.provider.getDimension()) {
		case 0://Overworld
			for(int i = 0; i < Config.anthracitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(90), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.BASALT_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.bituminousPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(100), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.BLACKDIORITE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.lignitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(60), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.CHALK_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.peatPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(70), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.BLUESCHIST_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.hematitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(96), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.GABBRO_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.magnetitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(72), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.LIMESTONE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.limonitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(64), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.GNEISS_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.goethitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(253), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.GREENSCHIST_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.ankeritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(69), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.IMPERIALQUARTZITE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
		  	}
			
			for(int i = 0; i < Config.bandedPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(725), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.KIMBERLITE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
		    }
			
			for(int i = 0; i < Config.taconitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(49), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.MARBLE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.MIGMATITE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.PINKQUARTZITE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.PUMICE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.REDQUARTZITE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.RHYOLITE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.SLATE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.SCORIA_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.SOAPSTONE_STONE.getDefaultState(), 25, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			
			break;
			
			
		case-1://Nether
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ALIKITE.getDefaultState(), 32, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.TRIGLICITE.getDefaultState(), 32, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(71), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.KRUNDALTITE.getDefaultState(), 32, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
			}
		}
	}
}