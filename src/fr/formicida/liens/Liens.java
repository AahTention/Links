package fr.formicida.liens;

import org.bukkit.plugin.java.JavaPlugin;

import fr.formicida.liens.commands.CommandDiscord;
import fr.formicida.liens.commands.CommandForum;
import fr.formicida.liens.commands.CommandLiens;
import fr.formicida.liens.commands.CommandReglement;
import fr.formicida.liens.commands.CommandSite;
import fr.formicida.liens.commands.CommandTeamSpeak;
import fr.formicida.liens.commands.CommandTwitter;

public class Liens extends JavaPlugin {

	@Override
	public void onEnable() {
		saveDefaultConfig();
		System.out.println("Demarrage de liens ... 100%");
		getCommand("discord").setExecutor(new CommandDiscord(this));
		getCommand("site").setExecutor(new CommandSite(this));
		getCommand("reglement").setExecutor(new CommandReglement(this));
		getCommand("teamspeak").setExecutor(new CommandTeamSpeak(this));
		getCommand("forum").setExecutor(new CommandForum(this));
		getCommand("twitter").setExecutor(new CommandTwitter(this));
		getCommand("liens").setExecutor(new CommandLiens());
	}

	@Override
	public void onDisable() {
		System.out.println("Extinction de liens ... 100%");
	}

}
