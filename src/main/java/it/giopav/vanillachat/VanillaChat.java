package it.giopav.vanillachat;

import org.bukkit.plugin.java.JavaPlugin;

public final class VanillaChat extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
}
