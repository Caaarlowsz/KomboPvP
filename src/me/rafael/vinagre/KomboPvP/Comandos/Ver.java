package me.rafael.vinagre.KomboPvP.Comandos;

import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Ver implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if (label.equalsIgnoreCase("ver")) {
			p.sendMessage("§8Plugin feito por §czEnderX5_");
			p.sendMessage("§bCanal >> https:www.youtube.comchannelUCb1kjbiQj2B4KnRQpgeUwmQ");
			p.sendMessage("§2Se inscreva nesse canal :D");
			p.sendMessage("§6#O Melhor pl de KITPVP da net!");
			p.playSound(p.getLocation(), Sound.WOLF_HURT, 12.0F, 12.0F);

		}
		return false;
	}
}
