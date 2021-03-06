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


public class WorldGenOres implements IWorldGenerator 
{
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{	
		switch(world.provider.getDimension()) {
		case 0://Overworld
			for(int i = 0; i < Config.anthracitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(90), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLD_ANTHRACITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.bituminousPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(100), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLD_BITUMINOUS.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.lignitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(60), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLD_LIGNITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.peatPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(70), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLD_PEAT.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.hematitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(96), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_HEMATITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.magnetitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(72), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_MAGNETITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.limonitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(64), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_LIMONITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.goethitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(53), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_GOETHITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.ankeritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(69), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_ANKERITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
		  	}
			
			for(int i = 0; i < Config.bandedPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(75), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_BANDED.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
		    }
			
			for(int i = 0; i < Config.taconitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(49), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_TACONITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(81), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_SIDERITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			
			break;
			
			
		case 6://Mining Dim
			for(int i = 0; i < Config.anthracitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(90), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLD_ANTHRACITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.bituminousPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(100), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLD_BITUMINOUS.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.lignitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(60), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLD_LIGNITE.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.peatPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(70), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLD_PEAT.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.hematitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(96), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_HEMATITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.magnetitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(72), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_MAGNETITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.limonitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(64), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_LIMONITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.goethitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(53), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_GOETHITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.ankeritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(69), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_ANKERITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
		  	}
			
			for(int i = 0; i < Config.bandedPerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(75), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_BANDED.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
		    }
			
			for(int i = 0; i < Config.taconitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(49), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_TACONITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			for(int i = 0; i < Config.sideritePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(81), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.ORE_OVERWORLDI_SIDERITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE)).generate(world, random, pos);
			}
			
			
			break;
			
			
		case -1://Nether
			for(int i = 0; i < Config.danlveyitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(256), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.DANLVEYITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.kamboradoitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(256), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.KAMBORADOITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
		    }
			for(int i = 0; i < Config.magachitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(256), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.MAGACHITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.solituditePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(256), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.SOLITUDITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.meliscitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(256), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.MELISCITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
			}
			for(int i = 0; i < Config.thenalitePerChunk; i++)
			{
				BlockPos pos = new BlockPos(chunkX*16 + random.nextInt(16), random.nextInt(256), (chunkZ*16) + random.nextInt(16));
				new WorldGenMinable(BlockInit.THENALITE.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.NETHERRACK)).generate(world, random, pos);
			}
		}
	}
}