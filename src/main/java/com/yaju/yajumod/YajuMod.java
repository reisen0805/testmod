package com.yaju.yajumod;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = YajuMod.MOD_ID, 
name = YajuMod.MOD_NAME, 
version = YajuMod.MOD_VERSION, 
dependencies = YajuMod.MOD_DEPENDENCIES,
acceptedMinecraftVersions = YajuMod.MOD_ACCEPTED_MC_VERSIONS,
useMetadata = true)
public class YajuMod
{
    public static final String MOD_ID = "yajumod";
    public static final String MOD_NAME = "yajumod";
    public static final String MOD_VERSION = "0.0.1";
    public static final String MOD_DEPENDENCIES = "required-after:Forge@[1.8-11.14.0.1239,)";
    public static final String MOD_ACCEPTED_MC_VERSIONS = "[1.8,1.8.9]";
    public static Block yajublock;


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        yajublock  = new YajuBlock();
        GameRegistry.registerBlock(yajublock, YajuItemBlock.class, "yajublock");

        if (event.getSide().isClient())
        {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(yajublock), 0, new ModelResourceLocation(MOD_ID + ":" + "yajublock", "inventory"));
        }
    }
}
