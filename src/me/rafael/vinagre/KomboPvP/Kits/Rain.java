package me.rafael.vinagre.KomboPvP.Kits;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import me.rafael.vinagre.KomboPvP.Main;
import me.rafael.vinagre.KomboPvP.Listeners.Array;

public class Rain implements Listener, CommandExecutor {

	public boolean onCommand(CommandSender sender, Command command, String cmd, String[] args) {
		Player p = (Player) sender;
		ItemStack dima = new ItemStack(Material.STONE_SWORD);
		ItemMeta souperaa = dima.getItemMeta();
		souperaa.setDisplayName("?cEspada");
		dima.setItemMeta(souperaa);
		ItemStack sopa = new ItemStack(Material.MUSHROOM_SOUP);
		ItemMeta sopas = sopa.getItemMeta();
		sopas.setDisplayName("?6Sopa");
		sopa.setItemMeta(sopas);

		ItemStack capacete0 = new ItemStack(Material.AIR);

		ItemStack peitoral0 = new ItemStack(Material.AIR);

		ItemStack calca0 = new ItemStack(Material.AIR);

		ItemStack Bota0 = new ItemStack(Material.AIR);

		p.getInventory().setHelmet(capacete0);
		p.getInventory().setChestplate(peitoral0);
		p.getInventory().setLeggings(calca0);
		p.getInventory().setBoots(Bota0);

		if (cmd.equalsIgnoreCase("trocador")) {
			if (Array.used.contains(p.getName())) {
				p.sendMessage("?7? ?cVoce ja esta usando um kit!");
				return true;
			}
			if (!p.hasPermission("kitpvp.kit.trocador")) {
				p.sendMessage("?cVoce nao tem permissao para usar este kit !");
				return true;
			}
			Array.used.add(p.getName());
			p.sendMessage("?7? Voce escolheu o kit ?cTrocador ?7!");
			p.setGameMode(GameMode.ADVENTURE);
			p.getInventory().clear();
			Array.kit.put(p, "Trocador");
			Main.Dj.remove(p.getName());
			Main.stomper.remove(p.getName());

			Scoreboard.ScoreDoBasic.iscoriboard(p);
			p.getInventory().addItem(new ItemStack[] { dima });

			for (int i = 0; i <= 34; i++) {
				p.getInventory().addItem(new ItemStack[] { sopa });
				Main.give(p);

			}
		}
		me.rafael.vinagre.KomboPvP.Comandos.SetArena.TeleportArenaRandom(p);
		return false;
	}

	@EventHandler
	public void Tartaruga(PlayerToggleSneakEvent e) {
		Player p = e.getPlayer();
		if (((Array.kit.get(p) == "Trocador"))) {
			if (p.isSneaking()) {
				p.getInventory().setChestplate(new ItemStack(Material.AIR));
				p.getInventory().setBoots(new ItemStack(Material.AIR));
				p.getInventory().setHelmet(new ItemStack(Material.AIR));
			} else {
				p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
				p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
				p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
			}
		}
	}
}
