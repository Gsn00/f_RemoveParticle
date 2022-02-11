package com.feraapis.removeparticle;

import com.feraapis.removeparticle.reflection.RemoveParticle;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, clientSideOnly = true)
public class Main
{
    public static final String MODID = "removeparticle";
    public static final String NAME = "f_RemoveParticle";
    public static final String VERSION = "1.0.0";

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    	ClientCommandHandler.instance.registerCommand(new RemoveParticle());
    }
}
