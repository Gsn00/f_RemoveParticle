package com.feraapis.removeparticle.reflection;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.*;
import java.util.Map;

import com.pixelmonmod.pixelmon.entities.pixelmon.particleEffects.ParticleEffects;
import com.pixelmonmod.pixelmon.enums.EnumSpecies;

import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;

public class ParticleReflection
{
	@SuppressWarnings("unchecked")
	public static void removeParticles()
	{
		try
		{
			Field field = (Field) ParticleEffects.class.getDeclaredField("map");
			field.setAccessible(true);
			Map<EnumSpecies, ParticleEffects> map = (Map<EnumSpecies, ParticleEffects>) field.get(null);
			map.clear();
			//Need to put something inside the map because if it's null it will add the Pokemons again.
			map.put(EnumSpecies.Weezing, null);
		} catch (Throwable e)
		{
			StringWriter stringWriter = new StringWriter();
			PrintWriter printWriter = new PrintWriter(stringWriter);
			e.printStackTrace(printWriter);
			Minecraft.getMinecraft().player.sendMessage(new TextComponentString(stringWriter.toString()));
		}
	}
}
