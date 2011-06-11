package me.regenvanwalbeek.extendedcommandline;

import org.bukkit.event.player.PlayerListener;

/**
 * A listener for server commands
 * 
 * @author W. Regen Van Walbeek
 * 
 */
public class ServerCommandListener extends PlayerListener {

	/**
	 * A reference to the main plugin which is listening
	 */
	public static ExtendedCommandLine plugin;
	
	public ServerCommandListener(ExtendedCommandLine commandLine){
		this.plugin = commandLine;
	}
	
	
}
