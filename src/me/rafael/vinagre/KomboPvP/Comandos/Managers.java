package me.rafael.vinagre.KomboPvP.Comandos;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import Punheta.Ranks;

public class Managers implements Listener, CommandExecutor {

	@EventHandler
	public void warps(InventoryClickEvent e) {
		if ((e.getCurrentItem() != null) && (e.getCurrentItem().getItemMeta() != null)) {
			Inventory inv = e.getInventory();
			Player p = (Player) e.getWhoClicked();
			if (inv.getTitle().equals("§nInformaçoes")) {
				p.playSound(p.getLocation(), Sound.DOOR_CLOSE, 5.0F, 5.0F);
				e.setCancelled(true);

				if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Coder")) {
					p.sendMessage("§6§lPlugin criado por zEnderX5_");
					p.sendMessage("§b§lCanal >> https:www.youtube.comchannelUCb1kjbiQj2B4KnRQpgeUwmQ");
					p.sendMessage("§2§lSe inscreva la");

					p.closeInventory();

				}
				if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Dono do Server")) {
					Bukkit.dispatchCommand(p, "owner");
					p.closeInventory();
				}
				if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§4RANKS")) {
					Ranks.Abrir(p);

				}
				if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6REGRAS")) {
					Bukkit.dispatchCommand(p, "regras");
					p.closeInventory();
				}
				if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Req YTSemiYT")) {
					Bukkit.dispatchCommand(p, "youtuber");
					p.closeInventory();
				}
				if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Formulario")) {
					Bukkit.dispatchCommand(p, "aplicar");
					p.closeInventory();

				}
			}
		}
	}

	public boolean onCommand(CommandSender sender, Command cmd, String CommandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}
		Player p = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("info2")) {

			Inventory warps = Bukkit.createInventory(p, 27, "§nInformaçoes");

			ItemStack vidrol = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 13);
			ItemMeta vidrol2 = vidrol.getItemMeta();
			vidrol2.setDisplayName(" ");
			vidrol.setItemMeta(vidrol2);

			ItemStack vidroa = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
			ItemMeta vidroa2 = vidroa.getItemMeta();
			vidroa2.setDisplayName(" ");
			vidroa.setItemMeta(vidroa2);

			ItemStack fps = new ItemStack(Material.GOLD_NUGGET);
			ItemMeta fps2 = fps.getItemMeta();
			fps2.setDisplayName("§6Coder");
			List<String> lore1 = new ArrayList<>();
			lore1.add("§7Criador do plugin: §2zEnderX5_ !");
			fps2.setLore(lore1);
			fps.setItemMeta(fps2);

			ItemStack r = new ItemStack(Material.REDSTONE);
			ItemMeta r2 = r.getItemMeta();
			r2.setDisplayName("§4RANKS");
			r.setItemMeta(r2);

			ItemStack fps1 = new ItemStack(Material.SUGAR_CANE);
			ItemMeta fps21 = fps1.getItemMeta();
			fps21.setDisplayName("§6Formulario");
			List<String> lore11 = new ArrayList<>();
			lore11.add("§7Clique para ver o formulario");
			fps21.setLore(lore11);
			fps1.setItemMeta(fps21);

			ItemStack lava = new ItemStack(Material.SKULL_ITEM);
			ItemMeta lava2 = lava.getItemMeta();
			lava2.setDisplayName("§6Dono do Server");
			List<String> lore2 = new ArrayList<>();
			lore2.add("§7Clique para ver o dono do server!");
			lava2.setLore(lore2);
			lava.setItemMeta(lava2);

			ItemStack lava11 = new ItemStack(Material.DIAMOND_BLOCK);
			ItemMeta lava211 = lava11.getItemMeta();
			lava211.setDisplayName("§6Req YTSemiYT");
			List<String> lore21 = new ArrayList<>();
			lore21.add("§7Clique para ver os requisitos de yt");
			lava211.setLore(lore21);
			lava11.setItemMeta(lava211);

			ItemStack lava1 = new ItemStack(Material.BOOK);
			ItemMeta lava21 = lava1.getItemMeta();
			lava21.setDisplayName("§6REGRAS");
			List<String> lore211 = new ArrayList<>();
			lore211.add("§6Veja as regras do servidor !");
			lava21.setLore(lore211);
			lava1.setItemMeta(lava21);

			warps.setItem(0, r);
			warps.setItem(1, vidroa);
			warps.setItem(2, vidrol);
			warps.setItem(3, vidroa);
			warps.setItem(4, vidrol);
			warps.setItem(5, vidroa);
			warps.setItem(6, vidrol);
			warps.setItem(7, vidroa);
			warps.setItem(8, r);
			warps.setItem(9, fps1);
			warps.setItem(10, vidroa);
			warps.setItem(11, fps);
			warps.setItem(12, vidroa);
			warps.setItem(13, lava);
			warps.setItem(14, vidroa);
			warps.setItem(15, lava1);

			warps.setItem(16, vidroa);
			warps.setItem(17, lava11);
			warps.setItem(18, r);
			warps.setItem(19, vidroa);
			warps.setItem(20, vidrol);
			warps.setItem(21, vidroa);
			warps.setItem(22, vidrol);
			warps.setItem(23, vidroa);
			warps.setItem(24, vidrol);
			warps.setItem(25, vidroa);
			warps.setItem(26, r);

			p.openInventory(warps);
		}

		return true;
	}
}
