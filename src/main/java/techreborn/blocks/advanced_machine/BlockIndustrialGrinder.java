package techreborn.blocks.advanced_machine;

import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import reborncore.common.blocks.BlockMachineBase;
import reborncore.common.blocks.IRotationTexture;

import techreborn.Core;
import techreborn.client.EGui;
import techreborn.client.TechRebornCreativeTab;
import techreborn.tiles.multiblock.TileIndustrialGrinder;

public class BlockIndustrialGrinder extends BlockMachineBase implements IRotationTexture {

	private final String prefix = "techreborn:blocks/machine/advanced_machines/";

	public BlockIndustrialGrinder(final Material material) {
		super();
		this.setUnlocalizedName("techreborn.industrialgrinder");
		this.setCreativeTab(TechRebornCreativeTab.instance);
	}

	@Override
	public TileEntity createNewTileEntity(final World p_149915_1_, final int p_149915_2_) {
		return new TileIndustrialGrinder();
	}

	@Override
	public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer player, final int side, final float hitX,
			final float hitY, final float hitZ) {
		if (this.fillBlockWithFluid(world, new BlockPos(x, y, z), player)) {
			return true;
		}
		if (!player.isSneaking())
			player.openGui(Core.INSTANCE, EGui.INDUSTRIAL_GRINDER.ordinal(), world, x, y, z);
		return true;
	}

	@Override
	public String getFrontOff() {
		return this.prefix + "industrial_grinder_front_off";
	}

	@Override
	public String getFrontOn() {
		return this.prefix + "industrial_grinder_front_on";
	}

	@Override
	public String getSide() {
		return this.prefix + "machine_side";
	}

	@Override
	public String getTop() {
		return this.prefix + "industrial_grinder_top_off";
	}

	@Override
	public String getBottom() {
		return this.prefix + "industrial_centrifuge_bottom";
	}
}
