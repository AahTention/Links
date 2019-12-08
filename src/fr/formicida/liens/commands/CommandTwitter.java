package fr.formicida.liens.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import fr.formicida.liens.Liens;

public class CommandTwitter implements CommandExecutor {

	private Liens main;

	public CommandTwitter(Liens liens) {
		this.main = liens;
	}

	@Override
	public boolean onCommand(CommandSender p, Command cmd, String msg, String[] args) {
		p.sendMessage(main.getConfig().getString("twitter.message"));
		return false;
	}

}
