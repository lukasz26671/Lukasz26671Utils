package io.github.lukasz26671;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent;

/**
* Created by Galaxy_2Alex on 18-Jul-16.
*/
public class BreakHandler {

    @SubscribeEvent
    public static ItemStack onBreakEvent(BlockEvent.BreakEvent event) {

        System.out.println(event.getPlayer());
       
   		if (event.block == Blocks.glass) {
   			 return (new ItemStack(ObsidianTools.glassChunk));
   		}
        
   		return null;

   	} 
}


