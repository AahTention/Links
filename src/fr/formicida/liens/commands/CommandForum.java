package fr.formicida.liens.commands;

import fr.formicida.liens.Liens;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class CommandForum implements CommandExecutor {
  private Liens main;
  
  public CommandForum(Liens liens) {
    this.main = liens;
  }
  
  public boolean onCommand(CommandSender p, Command cmd, String msg, String[] args) {
    p.sendMessage(this.main.getConfig().getString("forum.message"));
    return false;
  }
}