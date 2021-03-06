package net.kipster.terra.objects.blocks;

import net.kipster.terra.Main;
import net.kipster.terra.init.BlockInit;
import net.kipster.terra.init.ItemInit;
import net.kipster.terra.objects.blocks.item.ItemBlockVariants;
import net.kipster.terra.util.interfaces.IHasModel;
import net.minecraft.block.BlockLog;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockLogRedSpruce extends BlockLog implements IHasModel
{
	public BlockLogRedSpruce(String name, Material material) 
	{
	 super();
	 
	 setUnlocalizedName(name);
		setRegistryName(name);
		setSoundType(SoundType.WOOD);
    setDefaultState(blockState.getBaseState().withProperty(LOG_AXIS, BlockLog.EnumAxis.Y));
    setCreativeTab(Main.TERRATABPLANTS);

	BlockInit.BLOCKS.add(this);
	ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
}
    public int getItemBurnTime(ItemStack itemStack)
    {
         return 300; 
    }


@Override
public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
{
    return Blocks.LOG.getDefaultState().getMapColor(worldIn, pos);
}


@Override
public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
{
    items.add(new ItemStack(this));
}


@Override
public IBlockState getStateFromMeta(int meta)
{
    IBlockState state = this.getDefaultState();

    switch (meta & 12)
    {
        case 0:
            state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Y);
            break;
        case 4:
            state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.X);
            break;
        case 8:
            state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.Z);
            break;
        default:
            state = state.withProperty(LOG_AXIS, BlockLog.EnumAxis.NONE);
    }

    return state;
}


@Override
@SuppressWarnings("incomplete-switch")
public int getMetaFromState(IBlockState state)
{
    int meta = 0;

    switch (state.getValue(LOG_AXIS))
    {
        case X:
            meta |= 4;
            break;
        case Z:
            meta |= 8;
            break;
        case NONE:
            meta |= 12;
    }

    return meta;
}

@Override
protected BlockStateContainer createBlockState()
{
    return new BlockStateContainer(this, new IProperty[] {LOG_AXIS});
}

@Override
protected ItemStack getSilkTouchDrop(IBlockState state)
{
    return new ItemStack(Item.getItemFromBlock(this), 1);
}


@Override
public int damageDropped(IBlockState state)
{
    return 0;
}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}