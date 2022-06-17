package vulzed.bashcmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class BashCMDS extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("BashCMDS has been enabled!");

    }
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("tutorial")) {
            sender.sendMessage("You used /tutorial!");
        }
        return false;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
