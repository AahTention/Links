package fr.formicida.liens.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import fr.formicida.liens.Liens;

public class CommandReglement implements CommandExecutor {
	
	private Liens main;

	public CommandReglement(Liens liens) {
		this.main = liens;
	}

	@Override
	public boolean onCommand(CommandSender p, Command cmd, String msg, String[] args) {
		p.sendMessage(main.getConfig().getString("reglement.message"));
		return false;
	}

}