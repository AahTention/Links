package fr.formicida.liens.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import fr.formicida.liens.Liens;

public class CommandForum implements CommandExecutor {
	
	private Liens main;

	public CommandForum(Liens liens) {
		this.main = liens;
	}

	@Override
	public boolean onCommand(CommandSender p, Command cmd, String msg, String[] args) {
		p.sendMessage(main.getConfig().getString("forum.message"));
		return false;
	}

}
