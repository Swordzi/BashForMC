package vulzed.bashcmds;

import java.util.HashMap;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


    public class BashPlugin extends JavaPlugin {
        private final BashPlayerListener playerListener = new BashPlayerListener(this);
        private final BashBlockListener blockListener = new BashBlockListener();
        private final HashMap<Player, Boolean> debugees = new HashMap<Player, Boolean>();

        @Override
        public void onDisable() {

            getLogger().info("Goodbye world!");
        }

        @Override
        public void onEnable() {
            // TODO: Place any custom enable code here including the registration of any events

            // Register our events
            PluginManager pm = getServer().getPluginManager();
            pm.registerEvents(playerListener, this);
            pm.registerEvents(blockListener, this);

            // Register our commands
            getCommand("pos").setExecutor(new BashPos());
            getCommand("debug").setExecutor(new BashDebug(this));

            // EXAMPLE: Custom code, here we just output some info so we can check all is well
            PluginDescriptionFile pdfFile = this.getDescription();
            getLogger().info( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
        }

        public boolean isDebugging(final Player player) {
            return debugees.getOrDefault(player, false);
        }

        public void setDebugging(final Player player, final boolean value) {
            debugees.put(player, value);
        }

    }


