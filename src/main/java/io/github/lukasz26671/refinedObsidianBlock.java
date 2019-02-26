package io.github.lukasz26671;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class refinedObsidianBlock extends Block {

	protected refinedObsidianBlock(Material material) {
		super(material);
		this.setResistance(2000.0F);
		this.setHardness(2.0F);
		this.setHarvestLevel("pickaxe", 4);
		this.setLightLevel(0.25F);
	}
	@Override
	public Item getItemDropped(int metadata, Random rand, int fortune) {
		return ObsidianTools.itemRefinedObsidianNugget;
	}
	@Override
	public int quantityDropped(Random rand) {
		return 18 + rand.nextInt(10);
	}

}
