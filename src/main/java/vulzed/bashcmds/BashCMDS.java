package vulzed.bashcmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class BashCMDS extends JavaPlugin {
    @Override
    public void onEnable() {
        // This will throw a NullPointerException if you don't have the command defined in your plugin.yml file!
        this.getCommand("BashCMDS").setExecutor(new MyPluginCommandExecutor(this));
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
