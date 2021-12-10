package lordpipe.logjackfix;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * Plugin to patch Logj4 remote execution vulnerability CVE-2021-44228
 *
 * @author Copyright (c) lordpipe. Licensed GPLv3
 */
public class LogJackFix extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new EventListener(this), this);
    }
}
