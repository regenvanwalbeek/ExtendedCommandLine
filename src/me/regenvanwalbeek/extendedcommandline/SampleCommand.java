package me.regenvanwalbeek.extendedcommandline;

import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SampleCommand implements CommandExecutor {
	
	private final ExtendedCommandLine plugin;
	
	public SampleCommand(ExtendedCommandLine plugin){
		this.plugin = plugin;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label,
			String[] args) {
		if (args.length > 3) {
			return false;
		}
		Player player = (Player) sender;
		player.sendMessage("You ran a sample command.");
		return true;
	}

}
