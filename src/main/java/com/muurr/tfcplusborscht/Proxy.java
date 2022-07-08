package com.muurr.tfcplusborscht;

import com.dunk.tfc.CommonProxy;
import com.dunk.tfc.Core.FluidBaseTFC;
import com.dunk.tfc.api.TFCFluids;
import com.dunk.tfc.api.TFCItems;
import com.muurr.tfcplusborscht.compatibility.CompatItemSetup;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

public class Proxy {
	public void registerItems()
	{
		GameRegistry.registerItem(ItemSetup.chickenbouillon, ItemSetup.chickenbouillon.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.chickenbouillonbowl, ItemSetup.chickenbouillonbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.meatbouillon, ItemSetup.meatbouillon.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.meatbouillonbowl, ItemSetup.meatbouillonbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.fishbouillon, ItemSetup.fishbouillon.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.fishbouillonbowl, ItemSetup.fishbouillonbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.mushroombouillon, ItemSetup.mushroombouillon.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.mushroombouillonbowl, ItemSetup.mushroombouillonbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.bonebouillon, ItemSetup.bonebouillon.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.bonebouillonbowl, ItemSetup.bonebouillonbowl.getUnlocalizedName());
		
		GameRegistry.registerItem(ItemSetup.chickensoup, ItemSetup.chickensoup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.chickensoupbowl, ItemSetup.chickensoupbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.potatosoup, ItemSetup.potatosoup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.potatosoupbowl, ItemSetup.potatosoupbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.cabbagesoup, ItemSetup.cabbagesoup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.cabbagesoupbowl, ItemSetup.cabbagesoupbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.borscht, ItemSetup.borscht.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.borschtbowl, ItemSetup.borschtbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.fishsoup, ItemSetup.fishsoup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.fishsoupbowl, ItemSetup.fishsoupbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.mushroomsoup, ItemSetup.mushroomsoup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.mushroomsoupbowl, ItemSetup.mushroomsoupbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.peasantsoup, ItemSetup.peasantsoup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.peasantsoupbowl, ItemSetup.peasantsoupbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.okroshka, ItemSetup.okroshka.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.okroshkabowl, ItemSetup.okroshkabowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.cheesesoup, ItemSetup.cheesesoup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.cheesesoupbowl, ItemSetup.cheesesoupbowl.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.milksoup, ItemSetup.milksoup.getUnlocalizedName());
		GameRegistry.registerItem(ItemSetup.milksoupbowl, ItemSetup.milksoupbowl.getUnlocalizedName());
		
		if(Loader.isModLoaded("tfcpluskvass"))
			GameRegistry.registerItem(CompatItemSetup.kvassokroshka, CompatItemSetup.kvassokroshka.getUnlocalizedName());
			GameRegistry.registerItem(CompatItemSetup.kvassokroshkabowl, CompatItemSetup.kvassokroshkabowl.getUnlocalizedName());
			GameRegistry.registerItem(CompatItemSetup.zhur, CompatItemSetup.zhur.getUnlocalizedName());
			GameRegistry.registerItem(CompatItemSetup.zhurbowl, CompatItemSetup.zhurbowl.getUnlocalizedName());
	}
	public void registerFluids()
	{
		//Bouillons
		FluidRegistry.registerFluid(ItemSetup.CHICKENBOUILLON);
		setupFluidDrinks(ItemSetup.CHICKENBOUILLON, 1000, ItemSetup.chickenbouillon, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.CHICKENBOUILLON, 500, ItemSetup.chickenbouillonbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.MEATBOUILLON);
		setupFluidDrinks(ItemSetup.MEATBOUILLON, 1000, ItemSetup.meatbouillon, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.MEATBOUILLON, 500, ItemSetup.meatbouillonbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.FISHBOUILLON);
		setupFluidDrinks(ItemSetup.FISHBOUILLON, 1000, ItemSetup.fishbouillon, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.FISHBOUILLON, 500, ItemSetup.fishbouillonbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.MUSHROOMBOUILLON);
		setupFluidDrinks(ItemSetup.MUSHROOMBOUILLON, 1000, ItemSetup.mushroombouillon, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.MUSHROOMBOUILLON, 500, ItemSetup.mushroombouillonbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.BONEBOUILLON);
		setupFluidDrinks(ItemSetup.BONEBOUILLON, 1000, ItemSetup.bonebouillon, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.BONEBOUILLON, 500, ItemSetup.bonebouillonbowl, 0, TFCItems.potteryBowl, 1);

		//Soups
		FluidRegistry.registerFluid(ItemSetup.CHICKENSOUP);
		setupFluidDrinks(ItemSetup.CHICKENSOUP, 1000, ItemSetup.chickensoup, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.CHICKENSOUP, 500, ItemSetup.chickensoupbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.POTATOSOUP);
		setupFluidDrinks(ItemSetup.POTATOSOUP, 1000, ItemSetup.potatosoup, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.POTATOSOUP, 500, ItemSetup.potatosoupbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.CABBAGESOUP);
		setupFluidDrinks(ItemSetup.CABBAGESOUP, 1000, ItemSetup.cabbagesoup, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.CABBAGESOUP, 500, ItemSetup.cabbagesoupbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.BORSCHT);
		setupFluidDrinks(ItemSetup.BORSCHT, 1000, ItemSetup.borscht, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.BORSCHT, 500, ItemSetup.borschtbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.FISHSOUP);
		setupFluidDrinks(ItemSetup.FISHSOUP, 1000, ItemSetup.fishsoup, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.FISHSOUP, 500, ItemSetup.fishsoupbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.MUSHROOMSOUP);
		setupFluidDrinks(ItemSetup.MUSHROOMSOUP, 1000, ItemSetup.mushroomsoup, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.MUSHROOMSOUP, 500, ItemSetup.mushroomsoupbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.PEASANTSOUP);
		setupFluidDrinks(ItemSetup.PEASANTSOUP, 1000, ItemSetup.peasantsoup, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.PEASANTSOUP, 500, ItemSetup.peasantsoupbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.OKROSHKA);
		setupFluidDrinks(ItemSetup.OKROSHKA, 1000, ItemSetup.okroshka, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.OKROSHKA, 500, ItemSetup.okroshkabowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.CHEESESOUP);
		setupFluidDrinks(ItemSetup.CHEESESOUP, 1000, ItemSetup.cheesesoup, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.CHEESESOUP, 500, ItemSetup.cheesesoupbowl, 0, TFCItems.potteryBowl, 1);
		FluidRegistry.registerFluid(ItemSetup.MILKSOUP);
		setupFluidDrinks(ItemSetup.MILKSOUP, 1000, ItemSetup.milksoup, TFCItems.glassBottle);
		setupFluidDrinks(ItemSetup.MILKSOUP, 500, ItemSetup.milksoupbowl, 0, TFCItems.potteryBowl, 1);
		
		//Compat
		if(Loader.isModLoaded("tfcpluskvass"))
			FluidRegistry.registerFluid(CompatItemSetup.KVASSOKROSHKA);
			setupFluidDrinks(CompatItemSetup.KVASSOKROSHKA, 1000, CompatItemSetup.kvassokroshka, TFCItems.glassBottle);
			setupFluidDrinks(CompatItemSetup.KVASSOKROSHKA, 500, CompatItemSetup.kvassokroshkabowl, 0, TFCItems.potteryBowl, 1);
			FluidRegistry.registerFluid(CompatItemSetup.ZHUR);
			setupFluidDrinks(CompatItemSetup.ZHUR, 1000, CompatItemSetup.zhur, TFCItems.glassBottle);
			setupFluidDrinks(CompatItemSetup.ZHUR, 500, CompatItemSetup.zhurbowl, 0, TFCItems.potteryBowl, 1);
	}
	
	private void registerFluidContainerHelper(Fluid fluid, int baseVolume, ItemStack baseItem, ItemStack baseContainer)
	{
		FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, baseVolume),baseItem, baseContainer);
		if(TFCItems.potteryDrinks != null && TFCItems.potteryDrinks.containsKey(baseItem.getUnlocalizedName()))
		{
			if(baseContainer != null && baseItem != null && baseContainer.getItem() == baseItem.getItem())
			{
				Item potteryVersion = TFCItems.potteryDrinks.get(baseItem.getUnlocalizedName());
				FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, baseVolume), new ItemStack(potteryVersion, 1, baseItem.getItemDamage()), new ItemStack(potteryVersion,1, baseContainer.getItemDamage()));
			}
			else if (baseContainer.getItem() == TFCItems.potteryJug)
			{
				FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, baseVolume), new ItemStack(TFCItems.potteryDrinks.get(baseItem.getUnlocalizedName()), 1, baseItem.getItemDamage()), new ItemStack(TFCItems.potteryJug,1, 1));
			}
			else
			{
				FluidContainerRegistry.registerFluidContainer(new FluidStack(fluid, baseVolume), new ItemStack(TFCItems.potteryDrinks.get(baseItem.getUnlocalizedName()), 1, baseItem.getItemDamage()), new ItemStack(TFCItems.potteryBowl,1, 1));
			}
			
		}
	}

	protected void setupFluidDrinks(Fluid fluid, int mB, Item drink, Item container)
	{
		int num = mB/50;
		registerFluidContainerHelper(fluid, /*mB - (i*50)*/50, new ItemStack(drink,1,num-1), new ItemStack(container));
		for(int i = 0; i < num-1; i++)
		{
			registerFluidContainerHelper(fluid, /*mB - (i*50)*/50, new ItemStack(drink,1,i),  new ItemStack(drink,1,i+1));
		}
	}
	
	protected void setupFluidDrinks(Fluid fluid, int mB, Item drink, int minDrinkDamage, Item container, int containerDamage)
	{
		int num = mB/50;
		registerFluidContainerHelper(fluid, /*mB - (i*50)*/50, new ItemStack(drink,1,minDrinkDamage + num-1), new ItemStack(container, 1, containerDamage));
		for(int i = 0; i < num-1; i++)
		{
			registerFluidContainerHelper(fluid, /*mB - (i*50)*/50, new ItemStack(drink,1,minDrinkDamage + i),  new ItemStack(drink,1,minDrinkDamage + i+1));
		}
	}
}
