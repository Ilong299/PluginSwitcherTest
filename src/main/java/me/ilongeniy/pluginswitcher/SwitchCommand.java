package me.ilongeniy.pluginswitcher;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class SwitchCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(args.length==0){sender.sendMessage("Using: "+ s + " <Plugin name>"); return true;};
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aIs it enabled before &c" + String.valueOf(Bukkit.getPluginManager().getPlugin(args[0]).isEnabled())));
        if(s.equalsIgnoreCase("ep")) {
            Bukkit.getPluginManager().enablePlugin(Bukkit.getPluginManager().getPlugin(args[0]));
        };
        if(s.equalsIgnoreCase("dp")) {
            Bukkit.getPluginManager().disablePlugin(Bukkit.getPluginManager().getPlugin(args[0]));
        };
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&aIs it enabled after &c" + String.valueOf(Bukkit.getPluginManager().getPlugin(args[0]).isEnabled())));
        return true;
    }
}
