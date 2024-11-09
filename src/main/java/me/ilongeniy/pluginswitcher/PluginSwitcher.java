package me.ilongeniy.pluginswitcher;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.ilongeniy.pluginswitcher.SwtichCommand;

import java.util.ArrayList;
import java.util.List;

public final class PluginSwitcher extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("ep").setExecutor(new SwitchCommand());
        getCommand("ep").setTabCompleter(new TabCompleter() {
            @Override
            public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] strings) {
                List<String> a = new ArrayList<>();
                for (Plugin p : Bukkit.getPluginManager().getPlugins()) {
                    a.add(p.getName());};
                return a;}
        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
