package vulzed.bashcmds;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MyPluginCommandExecutor implements CommandExecutor {
    private final BashCMDS plugin;

    public MyPluginCommandExecutor(BashCMDS plugin) {
        this.plugin = plugin; // Store the plugin in situations where you need it.
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            // do something
        } else {
            sender.sendMessage("You must be a player!");
            return false;
        }
        // do something
        return false;
    }
}

