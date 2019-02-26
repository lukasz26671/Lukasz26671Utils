package io.github.lukasz26671;

import java.util.Random;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import io.github.lukasz26671.item.ItemObsidianArmorGalaxy;
import io.github.lukasz26671.item.ItemObsidianAxe;
import io.github.lukasz26671.item.ItemObsidianBoots;
import io.github.lukasz26671.item.ItemObsidianChestplate;
import io.github.lukasz26671.item.ItemObsidianHelmet;
import io.github.lukasz26671.item.ItemObsidianKatana;
import io.github.lukasz26671.item.ItemObsidianLeggings;
import io.github.lukasz26671.item.ItemObsidianPickaxe;
import io.github.lukasz26671.item.ItemObsidianShovel;
import io.github.lukasz26671.item.ItemObsidianSword;
import io.github.lukasz26671.item.ItemRefinedObsidianArmor;
import io.github.lukasz26671.item.ItemRefinedObsidianArmorGalaxy;
import io.github.lukasz26671.item.ItemRefinedObsidianAxe;
import io.github.lukasz26671.item.ItemRefinedObsidianKatana;
import io.github.lukasz26671.item.ItemRefinedObsidianPickaxe;
import io.github.lukasz26671.item.ItemRefinedObsidianShovel;
import io.github.lukasz26671.item.ItemRefinedObsidianSword;
import io.github.lukasz26671.item.ItemUpgradedObsidianPickaxe;
import io.github.lukasz26671.item.ItemUpgradedRefinedObsidianPickaxe;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.world.BlockEvent;

@Mod(modid = "Lukasz26671_Utils", name = "Lukasz26671 Utils", version = "1.1")
public class ObsidianTools {

	public static Item itemObsidianIngot;
	public static Item itemObsidianNugget;

	public static Item itemRefinedObsidianIngot;
	public static Item itemRefinedObsidianNugget;

	public static Item obsidianPickaxe;
	public static Item obsidianAxe;
	public static Item obsidianShovel;
	public static Item obsidianSword;
	public static Item obsidianKatana;
	public static Item upgradedObsidianPickaxe;

	public static Item glassChunk;
	public static Item obsidianKatanaBlade;
	public static Item refinedObsidianKatanaBlade;

	public static Item refinedObsidianPickaxe;
	public static Item refinedObsidianAxe;
	public static Item refinedObsidianShovel;
	public static Item refinedObsidianSword;
	public static Item refinedObsidianKatana;
	public static Item upgradedRefinedObsidianPickaxe;

	public static Item obsidianHelmet;
	public static Item obsidianChestplate;
	public static Item obsidianLeggings;
	public static Item obsidianBoots;

	public static Item blankarmor;
	
	public static Item obsidianHelmetGalaxy;
	public static Item obsidianChestplateGalaxy;
	public static Item obsidianLeggingsGalaxy;
	public static Item obsidianBootsGalaxy;

	public static Item refinedObsidianHelmet;
	public static Item refinedObsidianChestplate;
	public static Item refinedObsidianLeggings;
	public static Item refinedObsidianBoots;

	public static Item refinedObsidianHelmetGalaxy;
	public static Item refinedObsidianChestplateGalaxy;
	public static Item refinedObsidianLeggingsGalaxy;
	public static Item refinedObsidianBootsGalaxy;
	
	public static Item diamondKatana;

	public static Block refinedObsidianBlock;
	public static Block reinforcedObsidianGlass;
	
	

	public static final Item.ToolMaterial obsidianToolMaterial = EnumHelper.addToolMaterial("obsidianToolMaterial", 4,
			2500, 12.5F, 4.5F, 80);
	public static final Item.ToolMaterial obsidianUpgradedToolMaterial = EnumHelper
			.addToolMaterial("obsidianUpgradedToolMaterial", 5, 3500, 15F, 5F, 40);
	public static final Item.ToolMaterial refinedObsidianToolMaterial = EnumHelper
			.addToolMaterial("obsidianToolMaterial", 5, 5000, 19.0F, 6.2F, 20);
	public static final Item.ToolMaterial refinedObsidianUpgradedToolMaterial = EnumHelper
			.addToolMaterial("obsidianUpgradedToolMaterial", 6, 6000, 25F, 7F, 10);

	public static final ItemArmor.ArmorMaterial obsidianArmorMaterial = EnumHelper
			.addArmorMaterial("obsidianArmorMaterial", 4500, new int[] { 3, 8, 5, 3 }, 60);
	public static final ItemArmor.ArmorMaterial refinedObsidianArmorMaterial = EnumHelper
			.addArmorMaterial("refinedObsidianArmorMaterial", 6500, new int[] { 3, 8, 5, 4 }, 30);
	
	public static final Item.ToolMaterial diamondToolMaterial = EnumHelper.addToolMaterial("diamondToolMaterial", 3,
			1500, 9F, 3.5F, 80);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// Item/block init and registering
		// Config handling

		itemObsidianIngot = new ItemObsidianIngot().setUnlocalizedName("ItemObsidianIngot")
				.setTextureName("obsidian_tools:itemobsidianingot").setCreativeTab(tabLukaszItems);
		itemObsidianNugget = new ItemObsidianNugget().setUnlocalizedName("ItemObsidianNugget")
				.setTextureName("obsidian_tools:itemobsidiannugget").setCreativeTab(tabLukaszItems);
		itemRefinedObsidianIngot = new ItemRefinedObsidianIngot().setUnlocalizedName("ItemRefinedObsidianIngot")
				.setTextureName("obsidian_tools:itemrefinedobsidianingot").setCreativeTab(tabLukaszItems);
		itemRefinedObsidianNugget = new ItemRefinedObsidianNugget().setUnlocalizedName("ItemRefinedObsidianNugget")
				.setTextureName("obsidian_tools:itemrefinedobsidiannugget").setCreativeTab(tabLukaszItems);

		obsidianPickaxe = new ItemObsidianPickaxe(obsidianToolMaterial).setUnlocalizedName("ItemObsidianPickaxe")
				.setTextureName("obsidian_tools:toolobsidianpickaxe").setCreativeTab(tabObsidianTools);
		;
		obsidianAxe = new ItemObsidianAxe(obsidianToolMaterial).setUnlocalizedName("ItemObsidianAxe")
				.setTextureName("obsidian_tools:toolobsidianaxe").setCreativeTab(tabObsidianTools);
		obsidianShovel = new ItemObsidianShovel(obsidianToolMaterial).setUnlocalizedName("ItemObsidianShovel")
				.setTextureName("obsidian_tools:toolobsidianshovel").setCreativeTab(tabObsidianTools);
		obsidianSword = new ItemObsidianSword(obsidianToolMaterial).setUnlocalizedName("ItemObsidianSword")
				.setTextureName("obsidian_tools:toolobsidiansword").setCreativeTab(tabObsidianTools);
		obsidianKatana = new ItemObsidianKatana(obsidianUpgradedToolMaterial).setUnlocalizedName("ItemObsidianKatana")
				.setTextureName("obsidian_tools:toolobsidiankatana").setCreativeTab(tabObsidianTools);
		upgradedObsidianPickaxe = new ItemUpgradedObsidianPickaxe(obsidianUpgradedToolMaterial)
				.setUnlocalizedName("ItemUpgradedObsidianPickaxe")
				.setTextureName("obsidian_tools:toolupgradedobsidianpickaxe").setCreativeTab(tabObsidianTools);

		refinedObsidianPickaxe = new ItemRefinedObsidianPickaxe(refinedObsidianToolMaterial)
				.setUnlocalizedName("ItemRefinedObsidianPickaxe")
				.setTextureName("obsidian_tools:toolrefinedobsidianpickaxe").setCreativeTab(tabObsidianTools);
		;
		refinedObsidianAxe = new ItemRefinedObsidianAxe(refinedObsidianToolMaterial)
				.setUnlocalizedName("ItemRefinedObsidianAxe").setTextureName("obsidian_tools:toolrefinedobsidianaxe")
				.setCreativeTab(tabObsidianTools);
		refinedObsidianShovel = new ItemRefinedObsidianShovel(refinedObsidianToolMaterial)
				.setUnlocalizedName("ItemRefinedObsidianShovel")
				.setTextureName("obsidian_tools:toolrefinedobsidianshovel").setCreativeTab(tabObsidianTools);
		refinedObsidianSword = new ItemRefinedObsidianSword(refinedObsidianToolMaterial)
				.setUnlocalizedName("ItemRefinedObsidianSword")
				.setTextureName("obsidian_tools:toolrefinedobsidiansword").setCreativeTab(tabObsidianTools);
		refinedObsidianKatana = new ItemRefinedObsidianKatana(refinedObsidianUpgradedToolMaterial)
				.setUnlocalizedName("ItemRefinedObsidianKatana")
				.setTextureName("obsidian_tools:toolrefinedobsidiankatana").setCreativeTab(tabObsidianTools);
		upgradedRefinedObsidianPickaxe = new ItemUpgradedRefinedObsidianPickaxe(refinedObsidianUpgradedToolMaterial)
				.setUnlocalizedName("ItemUpgradedRefinedObsidianPickaxe")
				.setTextureName("obsidian_tools:toolupgradedrefinedobsidianpickaxe").setCreativeTab(tabObsidianTools);

		obsidianHelmet = new ItemObsidianHelmet(obsidianArmorMaterial, 0, 0).setUnlocalizedName("ItemObsidianHelmet")
				.setTextureName("obsidian_tools:armorobsidianhelmet").setCreativeTab(tabObsidianArmor);
		obsidianChestplate = new ItemObsidianChestplate(obsidianArmorMaterial, 0, 1)
				.setUnlocalizedName("ItemObsidianChestplate").setTextureName("obsidian_tools:armorobsidianchestplate")
				.setCreativeTab(tabObsidianArmor);
		obsidianLeggings = new ItemObsidianLeggings(obsidianArmorMaterial, 0, 2)
				.setUnlocalizedName("ItemObsidianLeggings").setTextureName("obsidian_tools:armorobsidianleggings")
				.setCreativeTab(tabObsidianArmor);
		obsidianBoots = new ItemObsidianBoots(obsidianArmorMaterial, 0, 3).setUnlocalizedName("ItemObsidianBoots")
				.setTextureName("obsidian_tools:armorobsidianboots").setCreativeTab(tabObsidianArmor);

		obsidianHelmetGalaxy = new ItemObsidianArmorGalaxy(obsidianArmorMaterial, 0, 0)
				.setUnlocalizedName("ItemObsidianHelmetGalaxy").setTextureName("obsidian_tools:helmetgalaxy")
				.setCreativeTab(tabObsidianArmor);
		obsidianChestplateGalaxy = new ItemObsidianArmorGalaxy(obsidianArmorMaterial, 0, 1)
				.setUnlocalizedName("ItemObsidianChestplateGalaxy")
				.setTextureName("obsidian_tools:chestplategalaxy").setCreativeTab(tabObsidianArmor);
		obsidianLeggingsGalaxy = new ItemObsidianArmorGalaxy(obsidianArmorMaterial, 0, 2)
				.setUnlocalizedName("ItemObsidianLeggingsGalaxy").setTextureName("obsidian_tools:leggingsgalaxy")
				.setCreativeTab(tabObsidianArmor);
		obsidianBootsGalaxy = new ItemObsidianArmorGalaxy(obsidianArmorMaterial, 0, 3)
				.setUnlocalizedName("ItemObsidianBootsGalaxy").setTextureName("obsidian_tools:bootsgalaxy")
				.setCreativeTab(tabObsidianArmor);

		refinedObsidianHelmet = new ItemRefinedObsidianArmor(refinedObsidianArmorMaterial, 0, 0)
				.setUnlocalizedName("ItemRefinedObsidianHelmet")
				.setTextureName("obsidian_tools:armorrefinedobsidianhelmet").setCreativeTab(tabObsidianArmor);
		refinedObsidianChestplate = new ItemRefinedObsidianArmor(refinedObsidianArmorMaterial, 0, 1)
				.setUnlocalizedName("ItemRefinedObsidianChestplate")
				.setTextureName("obsidian_tools:armorrefinedobsidianchestplate").setCreativeTab(tabObsidianArmor);
		refinedObsidianLeggings = new ItemRefinedObsidianArmor(refinedObsidianArmorMaterial, 0, 2)
				.setUnlocalizedName("ItemRefinedObsidianLeggings")
				.setTextureName("obsidian_tools:armorrefinedobsidianleggings").setCreativeTab(tabObsidianArmor);
		refinedObsidianBoots = new ItemRefinedObsidianArmor(refinedObsidianArmorMaterial, 0, 3)
				.setUnlocalizedName("ItemRefinedObsidianBoots")
				.setTextureName("obsidian_tools:armorrefinedobsidianboots").setCreativeTab(tabObsidianArmor);
		
		refinedObsidianHelmetGalaxy = new ItemRefinedObsidianArmorGalaxy(refinedObsidianArmorMaterial, 0, 0)
				.setUnlocalizedName("ItemRefinedObsidianHelmetGalaxy")
				.setTextureName("obsidian_tools:helmetrefinedgalaxy").setCreativeTab(tabObsidianArmor);
		refinedObsidianChestplateGalaxy = new ItemRefinedObsidianArmorGalaxy(refinedObsidianArmorMaterial, 0, 1)
				.setUnlocalizedName("ItemRefinedObsidianChestplateGalaxy")
				.setTextureName("obsidian_tools:chestplaterefinedgalaxy").setCreativeTab(tabObsidianArmor);
		refinedObsidianLeggingsGalaxy = new ItemRefinedObsidianArmorGalaxy(refinedObsidianArmorMaterial, 0, 2)
				.setUnlocalizedName("ItemRefinedObsidianLeggingsGalaxy")
				.setTextureName("obsidian_tools:leggingsrefinedgalaxy").setCreativeTab(tabObsidianArmor);
		refinedObsidianBootsGalaxy = new ItemRefinedObsidianArmorGalaxy(refinedObsidianArmorMaterial, 0, 3)
				.setUnlocalizedName("ItemRefinedObsidianBootsGalaxy")
				.setTextureName("obsidian_tools:bootsrefinedgalaxy").setCreativeTab(tabObsidianArmor);

		refinedObsidianBlock = new refinedObsidianBlock(Material.rock).setBlockName("refinedObsidianBlock")
				.setBlockTextureName("obsidian_tools:refinedobsidianblock").setCreativeTab(tabLukaszBlocks);
		reinforcedObsidianGlass = new reinforcedObsidianGlass(Material.glass).setBlockName("reinforcedObsidianGlass")
				.setBlockTextureName("obsidian_tools:reinforcedglass").setCreativeTab(tabLukaszBlocks);

		glassChunk = new Item().setUnlocalizedName("glassChunk").setCreativeTab(tabLukaszItems)
				.setTextureName("obsidian_tools:glasschunk");

		obsidianKatanaBlade = new Item().setUnlocalizedName("obsidianKatanaBlade").setCreativeTab(tabLukaszItems)
				.setTextureName("obsidian_tools:obsKatanaBlade");

		refinedObsidianKatanaBlade = new Item().setUnlocalizedName("refinedObsidianKatanaBlade")
				.setCreativeTab(tabLukaszItems).setTextureName("obsidian_tools:refObsKatanaBlade");

		diamondKatana = new ItemRefinedObsidianKatana(diamondToolMaterial)
				.setUnlocalizedName("ItemDiamondKatana")
				.setTextureName("obsidian_tools:Diamond_Katana").setCreativeTab(tabObsidianTools);
			
		// ITEMS
		GameRegistry.registerItem(itemObsidianIngot, itemObsidianIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemObsidianNugget, itemObsidianNugget.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRefinedObsidianIngot, itemRefinedObsidianIngot.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(itemRefinedObsidianNugget,
				itemRefinedObsidianNugget.getUnlocalizedName().substring(5));

		// TOOLS
		GameRegistry.registerItem(obsidianSword, obsidianSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianPickaxe, obsidianPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianShovel, obsidianShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianAxe, obsidianAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianKatana, obsidianKatana.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(upgradedObsidianPickaxe, upgradedObsidianPickaxe.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(refinedObsidianSword, refinedObsidianSword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianPickaxe, refinedObsidianPickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianShovel, refinedObsidianShovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianAxe, refinedObsidianAxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianKatana, refinedObsidianKatana.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(upgradedRefinedObsidianPickaxe,
				upgradedRefinedObsidianPickaxe.getUnlocalizedName().substring(5));

		GameRegistry.registerBlock(refinedObsidianBlock, refinedObsidianBlock.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(reinforcedObsidianGlass, reinforcedObsidianGlass.getUnlocalizedName().substring(5));

		// ARMOR
		GameRegistry.registerItem(obsidianHelmet, obsidianHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianChestplate, obsidianChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianLeggings, obsidianLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianBoots, obsidianBoots.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(obsidianHelmetGalaxy, obsidianHelmetGalaxy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianChestplateGalaxy, obsidianChestplateGalaxy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianLeggingsGalaxy, obsidianLeggingsGalaxy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianBootsGalaxy, obsidianBootsGalaxy.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(refinedObsidianHelmet, refinedObsidianHelmet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianChestplate,
				refinedObsidianChestplate.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianLeggings, refinedObsidianLeggings.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianBoots, refinedObsidianBoots.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(refinedObsidianHelmetGalaxy,
				refinedObsidianHelmetGalaxy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianChestplateGalaxy,
				refinedObsidianChestplateGalaxy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianLeggingsGalaxy,
				refinedObsidianLeggingsGalaxy.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianBootsGalaxy,
				refinedObsidianBootsGalaxy.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(glassChunk, glassChunk.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(obsidianKatanaBlade, obsidianKatanaBlade.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(refinedObsidianKatanaBlade, refinedObsidianKatanaBlade.getUnlocalizedName().substring(5));
		
		GameRegistry.registerItem(diamondKatana,
				diamondKatana.getUnlocalizedName().substring(5));
	}

	@EventHandler
	public void Init(FMLInitializationEvent event) {
		// Proxy, TileEntity, entity, gui and packet Registering

		GameRegistry.addRecipe(new ItemStack(itemObsidianIngot, 4), new Object[] { "O", 'O', Blocks.obsidian });
		GameRegistry.addRecipe(new ItemStack(itemObsidianIngot),
				new Object[] { "NNN", "NNN", "NNN", 'N', itemObsidianNugget });
		GameRegistry.addRecipe(new ItemStack(itemObsidianNugget, 9), new Object[] { "I", 'I', itemObsidianIngot });

		GameRegistry.addRecipe(new ItemStack(Blocks.obsidian, 1),
				new Object[] { "III", "III", "III", 'I', itemObsidianIngot });

		GameRegistry.addRecipe(new ItemStack(obsidianPickaxe, 1),
				new Object[] { "ooo", " s ", " s ", 'o', itemObsidianIngot, 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obsidianAxe, 1),
				new Object[] { "oo", "os", " s", 'o', itemObsidianIngot, 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obsidianShovel, 1),
				new Object[] { "o", "s", "s", 'o', itemObsidianIngot, 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(obsidianSword, 1),
				new Object[] { "o", "o", "s", 'o', itemObsidianIngot, 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(upgradedObsidianPickaxe, 1), new Object[] { "nn", "np", " i", 'p',
				obsidianPickaxe, 'i', Items.iron_ingot, 'n', itemObsidianNugget });

		GameRegistry.addRecipe(new ItemStack(refinedObsidianPickaxe, 1),
				new Object[] { "ooo", " s ", " s ", 'o', itemRefinedObsidianIngot, 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(refinedObsidianAxe, 1),
				new Object[] { "oo", "os", " s", 'o', itemRefinedObsidianIngot, 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(refinedObsidianShovel, 1),
				new Object[] { "o", "s", "s", 'o', itemRefinedObsidianIngot, 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(refinedObsidianSword, 1),
				new Object[] { "o", "o", "s", 'o', itemRefinedObsidianIngot, 's', Items.stick });
		GameRegistry.addRecipe(new ItemStack(upgradedRefinedObsidianPickaxe, 1), new Object[] { "nn", "np", " i", 'p',
				refinedObsidianPickaxe, 'i', Items.diamond, 'n', itemRefinedObsidianNugget });

		GameRegistry.addRecipe(new ItemStack(itemRefinedObsidianIngot),
				new Object[] { "NNN", "NNN", "NNN", 'N', itemRefinedObsidianNugget });
		GameRegistry.addRecipe(new ItemStack(itemRefinedObsidianNugget, 9),
				new Object[] { "R", 'R', itemRefinedObsidianIngot });
		GameRegistry.addSmelting(itemObsidianIngot, new ItemStack(itemRefinedObsidianIngot), 4.2f);

		GameRegistry.addRecipe(new ItemStack(obsidianHelmet), new Object[] { "OOO", "O O", 'O', itemObsidianIngot });
		GameRegistry.addRecipe(new ItemStack(obsidianChestplate),
				new Object[] { "O O", "OOO", "OOO", 'O', itemObsidianIngot });
		GameRegistry.addRecipe(new ItemStack(obsidianLeggings),
				new Object[] { "OOO", "O O", "O O", 'O', itemObsidianIngot });
		GameRegistry.addRecipe(new ItemStack(obsidianBoots), new Object[] { "O O", "O O", 'O', itemObsidianIngot });

		GameRegistry.addRecipe(new ItemStack(refinedObsidianHelmet),
				new Object[] { "OOO", "O O", 'O', itemRefinedObsidianIngot });
		GameRegistry.addRecipe(new ItemStack(refinedObsidianChestplate),
				new Object[] { "O O", "OOO", "OOO", 'O', itemRefinedObsidianIngot });
		GameRegistry.addRecipe(new ItemStack(refinedObsidianLeggings),
				new Object[] { "OOO", "O O", "O O", 'O', itemRefinedObsidianIngot });
		GameRegistry.addRecipe(new ItemStack(refinedObsidianBoots),
				new Object[] { "O O", "O O", 'O', itemRefinedObsidianIngot });

		GameRegistry.addRecipe(new ItemStack(refinedObsidianBlock),
				new Object[] { "II", "II", 'I', itemRefinedObsidianIngot });
		GameRegistry.addRecipe(new ItemStack(itemRefinedObsidianIngot, 4),
				new Object[] { "B", 'B', refinedObsidianBlock });
		GameRegistry.addRecipe(new ItemStack(reinforcedObsidianGlass),
				new Object[] { "NNN", "NgN", "NNN", 'N', itemObsidianNugget, 'g', Blocks.glass });

		GameRegistry.addRecipe(new ItemStack(Blocks.glass), new Object[] { "CCC", "CCC", "CCC", 'C', glassChunk });
		GameRegistry.addRecipe(new ItemStack(Blocks.glass_pane), new Object[] { "CCC", 'C', glassChunk });
		GameRegistry.addRecipe(new ItemStack(Blocks.glass, 1), new Object[] { "PPP", 'P', Blocks.glass_pane });
		
		GameRegistry.addRecipe(new ItemStack(obsidianKatanaBlade), new Object[] {"  n", " n", "i", 'i', itemObsidianIngot, 'n', itemObsidianNugget});
		GameRegistry.addRecipe(new ItemStack(refinedObsidianKatanaBlade), new Object[] {"  n", " n", "i", 'i', itemRefinedObsidianIngot, 'n', itemRefinedObsidianNugget});

		GameRegistry.addRecipe(new ItemStack(diamondKatana), new Object[] {"  d", " d ", "s  ", 'd', Items.diamond, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(obsidianKatana), new Object[] {"  b", " b ", "s  ", 'b', obsidianKatanaBlade, 's', Items.stick});
		GameRegistry.addRecipe(new ItemStack(refinedObsidianKatana), new Object[] {"  b", " b ", "s  ", 'b', refinedObsidianKatanaBlade, 's', Items.stick});
		
		GameRegistry.addRecipe(new ItemStack(obsidianHelmetGalaxy), new Object[] {"hb", 'h', obsidianHelmet , 'b', Items.dye});
		GameRegistry.addRecipe(new ItemStack(obsidianChestplateGalaxy), new Object[] {"hb", 'h', obsidianChestplate , 'b', Items.dye});
		GameRegistry.addRecipe(new ItemStack(obsidianLeggingsGalaxy), new Object[] {"hb", 'h', obsidianLeggings , 'b', Items.dye});
		GameRegistry.addRecipe(new ItemStack(obsidianBootsGalaxy), new Object[] {"hb", 'h', obsidianBoots , 'b', Items.dye});

		GameRegistry.addRecipe(new ItemStack(refinedObsidianHelmetGalaxy), new Object[] {"hb", 'h', refinedObsidianHelmet , 'b', Items.dye});
		GameRegistry.addRecipe(new ItemStack(refinedObsidianChestplateGalaxy), new Object[] {"hb", 'h', refinedObsidianChestplate , 'b', Items.dye});
		GameRegistry.addRecipe(new ItemStack(refinedObsidianLeggingsGalaxy), new Object[] {"hb", 'h', refinedObsidianLeggings , 'b', Items.dye});
		GameRegistry.addRecipe(new ItemStack(refinedObsidianBootsGalaxy), new Object[] {"hb", 'h', refinedObsidianBoots , 'b', Items.dye});


	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}

	CreativeTabs tabObsidianTools = new CreativeTabs("ObsidianToolsMod") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(upgradedObsidianPickaxe).getItem();

		}
	};
	CreativeTabs tabLukaszItems = new CreativeTabs("LukaszToolsItems") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(itemObsidianIngot).getItem();

		}
	};
	CreativeTabs tabObsidianArmor = new CreativeTabs("ObsidianArmorMod") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(obsidianChestplate).getItem();

		}
	};
	CreativeTabs tabLukaszBlocks = new CreativeTabs("LukaszBlocks") {

		@Override
		public Item getTabIconItem() {
			return new ItemStack(Blocks.obsidian).getItem();

		}
	};

	Random rnd = new Random();
	
	
	
}

