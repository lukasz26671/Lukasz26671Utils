package io.github.lukasz26671.item;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemObsidianArmorGalaxy extends ItemArmor {

	public ItemObsidianArmorGalaxy(ArmorMaterial armourMaterial, int renderIndex, int armourType) {
		super(armourMaterial, renderIndex, armourType);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		
		if (this.armorType == 2) {
			return "obsidian_tools:textures/models/armor/obsidiangalaxy.png";
		}
		return "obsidian_tools:textures/models/armor/obsidianarmorgalaxy.png";

	}
}
