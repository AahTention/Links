package fr.formicida.liens.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandLiens implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender p, Command cmd, String msg, String[] args) {
		p.sendMessage("§6╔═══════════════════════════════════╗\n" + 
				"§6║                                                                               ║\n" + 
				"§6║         §e§lBienvenue dans les informations de Liens       §6║\n" + 
				"§6║                                                                               ║\n" + 
				"§6╚═══════════════════════════════════╝\n" +
				"\n" + 
				"§9Développé par : §3§lFormicida\n" + 
				"§9Version : §3§l1.0.0");
		return false;
	}

}
