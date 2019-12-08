package fr.formicida.liens.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandLiens implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender p, Command cmd, String msg, String[] args) {

		if (cmd.getName().equalsIgnoreCase("liens")) {
			if(args.length == 0){
				p.sendMessage("§6╔═══════════════════════════════════╗\n" + 
						"§6║                                                                               ║\n" + 
						"§6║         §e§lBienvenue dans les informations de Liens       §6║\n" + 
						"§6║                                                                               ║\n" + 
						"§6╚═══════════════════════════════════╝\n" +
						"\n" + 
						"§9Pour des informations sur le plugin : §3§l/liens info\n" + 
						"§9Pour avoir de l'aide : §3§l/liens support");
			}

			if(args.length == 1){

				if (args[0].equalsIgnoreCase("info")) {
					p.sendMessage("§6╔═══════════════════════════════════╗\n" + 
							"§6║                                                                               ║\n" + 
							"§6║         §e§lBienvenue dans les informations de Liens       §6║\n" + 
							"§6║                                                                               ║\n" + 
							"§6╚═══════════════════════════════════╝\n" +
							"\n" + 
							"§9Développé par : §3§lFormicida\n" + 
							"§9Version : §3§l1.1.0");
				}

				if (args[0].equalsIgnoreCase("support")) {
					p.sendMessage("§6╔═══════════════════════════════════╗\n" + 
							"§6║                                                                               ║\n" + 
							"§6║         §e§lBienvenue dans les informations de Liens       §6║\n" + 
							"§6║                                                                               ║\n" + 
							"§6╚═══════════════════════════════════╝\n" +
							"\n" + 
							"§9 Serveur Discord : §3§lhttp://discord.gg/FNuHFGR\n" +
							"§9 Wiki : §3§lhttps://github.com/AahTention/Liens/wiki");
				}
			}
		}
		return false;
	}

}
