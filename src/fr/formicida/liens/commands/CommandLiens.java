package fr.formicida.liens.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import fr.formicida.liens.Liens;

public class CommandLiens implements CommandExecutor {
  public boolean onCommand(CommandSender p, Command cmd, String msg, String[] args) {
    if (cmd.getName().equalsIgnoreCase("liens")) {
      if (args.length == 0)
        p.sendMessage("§6Pour obtenir des informations sur le plugin, faites §e§l/liens info§6, pour obtenir une assistance, faites §e§l/liens support§6."); 
      if (args.length == 1) {
        if (args[0].equalsIgnoreCase("info"))
          p.sendMessage("§6Plugin développé par §e§lFormicida§6. Version actuelle : §e§l1.2§6.\n§6&oPlugin libre d'utilisation, mais réutilisation du code formellement interite."); 
        if (args[0].equalsIgnoreCase("support"))
          p.sendMessage("§6Pour accéder au wiki du plugin : §e§lhttps://github.com/AahTention/Liens/wiki§6, Nous n'avons actuellement plus de serveur Discord.");
        if (args[0].equalsIgnoreCase("reload"))
          p.sendMessage("§7[§a!§7]§6 Redémarrage du plugin §e§lLiens §6!");
          Liens.pm.disablePlugin(Liens.pm.getPlugin("Liens"));
          Liens.pm.enablePlugin(Liens.pm.getPlugin("Liens"));
          p.sendMessage("§7[§a!§7]§6 Redémarrage du plugin §e§lLiens §6Terminé avec succès!");
      } 
    } 
    return false;
  }
}


