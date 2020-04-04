package fr.formicida.liens.commands;

import fr.formicida.liens.Liens;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandSite implements CommandExecutor {
  private Liens main;
  
  public CommandSite(Liens liens) {
    this.main = liens;
  }
  
  public boolean onCommand(CommandSender p, Command cmd, String msg, String[] args) {
    p.sendMessage(this.main.getConfig().getString("site.message"));
    return false;
  }
}