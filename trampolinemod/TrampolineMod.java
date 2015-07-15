package trampolinemod;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = "TrampolineMod", version = TrampolineMod.VERSION)
public class TrampolineMod
{
	public static final String MODID = "trampolineMod";
	public static final String VERSION = "1.0";
	public static Block trampolineBlock;
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	//blocks
    	trampolineBlock = new TrampolineBlock();
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
