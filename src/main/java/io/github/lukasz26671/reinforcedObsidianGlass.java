package io.github.lukasz26671;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class reinforcedObsidianGlass extends Block {

	
	protected reinforcedObsidianGlass(Material material) {
		super(material);
		this.setResistance(4000.0F);
		this.setHardness(3.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.29F);
		this.setStepSound(this.soundTypeGlass);
		this.setLightOpacity(1);
	}
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return ObsidianTools.glassChunk;
		
	}
	@Override
	public int quantityDropped(Random rand) {
		return 1 + rand.nextInt(5);
	}
	
	  
	@Override
	public boolean isOpaqueCube() {
		return false;
	}

}
