package me.rafael.vinagre.KomboPvP.Comandos;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import me.rafael.vinagre.KomboPvP.Main;

public class Mensagens implements Listener {

	public static String Prefix = ((Main.getPlugin().getConfig().getString("NomeServer" + "").replace("&", "�")));

	public static void start() {
		Bukkit.getScheduler().scheduleSyncRepeatingTask(Main.plugin, new Runnable() {
			String[] msg = {

					((Main.getPlugin().getConfig().getString("Msg25" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg24" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg23" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg22" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg21" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg20" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg19" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg18" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg17" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg16" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg15" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg14" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg13" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg12" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg11" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg10" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg9" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg8" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg7" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg6" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg5" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg4" + "").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg3" + "").replace("&", "�"))),

					("�6�lCanal do criador do plugin https:www.youtube.comchannelUCb1kjbiQj2B4KnRQpgeUwmQ"),
					("�3�lCanal do criador do plugin https:www.youtube.comchannelUCb1kjbiQj2B4KnRQpgeUwmQ"),

					((Main.getPlugin().getConfig().getString("Msg2").replace("&", "�"))),
					((Main.getPlugin().getConfig().getString("Msg1").replace("&", "�"))) };

			public void run() {
				Bukkit.broadcastMessage(Prefix + " " + this.msg[new java.util.Random().nextInt(this.msg.length)]);
			}
		}, 0L, 45 * 15L);
	}
}