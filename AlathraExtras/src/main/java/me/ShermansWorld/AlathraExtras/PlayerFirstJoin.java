package me.ShermansWorld.AlathraExtras;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerFirstJoin implements Listener {
	@EventHandler
	public static void commandSent(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		if (!(p.hasPlayedBefore())) {
			p.getInventory().addItem(CustomItems.tutorialBook());
		}
	}
}
