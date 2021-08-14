package me.rafael.vinagre.KomboPvP.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import me.rafael.vinagre.KomboPvP.Main;

public class Motd implements Listener {
	@EventHandler
	public void Listar(ServerListPingEvent e) {
		e.setMotd((Main.getPlugin().getConfig().getString("Motd").replace("&", "§")));

	}

}
