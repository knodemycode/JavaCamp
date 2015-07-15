package trampolinemod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TrampolineBlock extends Block {
	private static final String name = "TrampolineBlock";
	
	public TrampolineBlock(){
		super(Material.rock);
		GameRegistry.registerBlock(this, name);
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public String getName(){
	return name;
	}
	
	
	public void onFallenUpon(World world, BlockPos bp,  Entity entity, float f){
		entity.moveEntity(entity.serverPosX, entity.serverPosY +3, entity.serverPosZ);
		//to make him bounce, add a number to entity.serverPosY
	}
}
	

