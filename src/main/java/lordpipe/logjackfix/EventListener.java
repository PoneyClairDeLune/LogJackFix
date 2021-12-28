package lordpipe.logjackfix;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class EventListener implements Listener {
    private LogJackFix plugin;

    public EventListener(LogJackFix pl) {
        plugin = pl;
    }

    @EventHandler(ignoreCancelled = true)
    public void onAsyncPlayerChat(AsyncPlayerChatEvent event) {
        String message = event.getMessage();

        if (message.contains("${")) {
            event.setMessage(message.replaceAll("\\$\\{", "§c§l\\§r§b{§r§f"));
        }
    }
}
