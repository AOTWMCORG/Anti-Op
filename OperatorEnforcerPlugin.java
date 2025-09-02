package com.example.operatorenforcer;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class OperatorEnforcerPlugin extends JavaPlugin implements Listener {

    private List<String> allowedOps;
    private String kickMessage;

    @Override
    public void onEnable() {
        saveDefaultConfig(); // create config.yml if missing
        loadConfig();

        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("OperatorEnforcerPlugin enabled!");
    }

    private void loadConfig() {
        allowedOps = getConfig().getStringList("allowed-ops");
        kickMessage = getConfig().getString("kick-message");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        if (player.isOp()) {
            boolean allowed = allowedOps.stream()
                    .anyMatch(name -> name.equalsIgnoreCase(player.getName()));

            if (!allowed) {
                // Warn console
                getLogger().warning("Player " + player.getName() + " is OP but not on the allowed list! if this is by mistake. Update Config.yml under resources folder");

                // Kick player
                player.kickPlayer(kickMessage);

                // Remove OP status
                player.setOp(false);
            }
        }
    }
}
