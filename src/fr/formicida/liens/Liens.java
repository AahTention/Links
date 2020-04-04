package fr.formicida.liens;

import fr.formicida.liens.commands.CommandDiscord;
import fr.formicida.liens.commands.CommandForum;
import fr.formicida.liens.commands.CommandLiens;
import fr.formicida.liens.commands.CommandReglement;
import fr.formicida.liens.commands.CommandSite;
import fr.formicida.liens.commands.CommandTeamSpeak;
import fr.formicida.liens.commands.CommandTwitter;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Liens extends JavaPlugin {
	
  public static PluginManager pm = Bukkit.getPluginManager();
	
  public void onEnable() {
    saveDefaultConfig();
    System.out.println("Demarrage de liens ... 100%");
    getCommand("discord").setExecutor((CommandExecutor)new CommandDiscord(this));
    getCommand("site").setExecutor((CommandExecutor)new CommandSite(this));
    getCommand("reglement").setExecutor((CommandExecutor)new CommandReglement(this));
    getCommand("teamspeak").setExecutor((CommandExecutor)new CommandTeamSpeak(this));
    getCommand("forum").setExecutor((CommandExecutor)new CommandForum(this));
    getCommand("twitter").setExecutor((CommandExecutor)new CommandTwitter(this));
    getCommand("liens").setExecutor((CommandExecutor)new CommandLiens());
  }
  
  public void onDisable() {
    System.out.println("Extinction de liens ... 100%");
  }
}