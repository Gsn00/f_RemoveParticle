package com.feraapis.removeparticle.reflection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraftforge.client.IClientCommand;

public class RemoveParticle extends CommandBase implements IClientCommand
{
	public String getName()
	{
		return "removeparticle";
	}

	public String getUsage(ICommandSender sender)
	{
		return "/removeparticle";
	}

	public List<String> getAliases()
	{
		List<String> aliases = new ArrayList<>();
		aliases.add("/removeparticle");
		return aliases;
	}

	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		ParticleReflection.removeParticles();
	}

	@Override
	public boolean allowUsageWithoutPrefix(ICommandSender sender, String message)
	{
		return false;
	}
	
	@Override
	public int getRequiredPermissionLevel()
	{
		return 0;
	}
}
