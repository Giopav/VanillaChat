package it.giopav.vanillachat;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.regex.Pattern;

public class ChatListener implements Listener {
    @EventHandler
    public void onAsyncChatEvent(AsyncChatEvent event) {
        String messageString = PlainTextComponentSerializer.plainText().serialize(event.message());
        Component component;
        if (Pattern.matches(".*&[0-9a-f].*", messageString)) {
            component = LegacyComponentSerializer.legacyAmpersand().deserialize(messageString);
        } else {
            component = MiniMessage.miniMessage().deserialize(messageString);
        }
        event.message(component);
    }
}
