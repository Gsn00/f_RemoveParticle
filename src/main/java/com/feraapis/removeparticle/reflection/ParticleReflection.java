package com.feraapis.removeparticle.reflection;

import java.lang.reflect.*;
import java.util.Map;

import com.pixelmonmod.pixelmon.entities.pixelmon.particleEffects.ParticleEffects;
import com.pixelmonmod.pixelmon.enums.EnumSpecies;

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
			map.remove(EnumSpecies.Charmander);
		} catch (Throwable e)
		{
			e.printStackTrace();
		}
	}
}
