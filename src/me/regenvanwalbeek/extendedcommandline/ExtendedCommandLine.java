package me.regenvanwalbeek.extendedcommandline;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * A plugin which provides users with a thorough command line
 * 
 * @author W. Regen Van Walbeek
 */
public class ExtendedCommandLine extends JavaPlugin {

	/**
	 * Logger used to write to the server console
	 */
	Logger log = Logger.getLogger("Minecraft");
	
	/**
	 * A listener for server commands TODO probably not needed...
	 */
	private final ServerCommandListener cmdListener = new ServerCommandListener(this);
	
	
	@Override
	public void onEnable() {
		PluginDescriptionFile descrip = this.getDescription();
		log.info(descrip.getName() +  " version " + descrip.getVersion() + " has been enabled!");
		
		// TODO  register any events...code to run when enabled
		
		PluginManager pm = this.getServer().getPluginManager();
		pm.registerEvent(Event.Type.SERVER_COMMAND, cmdListener, Event.Priority.Normal, this);
		
		this.getCommand("testcommand").setExecutor(new SampleCommand(this));
	}
	
	@Override
	public void onDisable() {
		log.info("Extended Command Line has been disabled");
		//TODO any disable code
	}
	/**
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		//if (cmd.g)
		return false;
		
	}**/
}
