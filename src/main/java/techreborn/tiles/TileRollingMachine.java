package techreborn.tiles;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import ic2.api.energy.prefab.BasicSink;
import ic2.api.tile.IWrenchable;
import techreborn.api.CentrifugeRecipie;
import techreborn.api.RollingMachineRecipie;
import techreborn.api.TechRebornAPI;
import techreborn.util.Inventory;

public class TileRollingMachine extends TileMachineBase implements IWrenchable{
	
	public BasicSink energy;
    public Inventory inventory = new Inventory(10, "TileRollingMachine", 64);

    public boolean isRunning;
    public int tickTime;
    public RollingMachineRecipie currentRecipe;
    
    public int euTick = 5;
    
    public TileRollingMachine()
    {
        energy = new BasicSink(this, 100000, 1);
    }
    
    @Override
    public void updateEntity() 
    {
    	super.updateEntity();
    	energy.updateEntity();
    }

	@Override
	public boolean wrenchCanSetFacing(EntityPlayer entityPlayer, int side) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public short getFacing() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFacing(short facing) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean wrenchCanRemove(EntityPlayer entityPlayer) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public float getWrenchDropRate() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemStack getWrenchDrop(EntityPlayer entityPlayer) {
		// TODO Auto-generated method stub
		return null;
	}

}
