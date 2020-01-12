package com.lfn.simplecommandsplus;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class invisibleCmd implements CommandExecutor {

	public static List<Player> invisList = new ArrayList<>();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			
			if(player.hasPermission("simplecommands.invis")) {
				
				if(invisList.contains(player)) {
					
					for(Player p : Bukkit.getOnlinePlayers()) {
						p.showPlayer(player);
					}

					for(int i = 0; i < invisList.size(); i++) {
						player.hidePlayer(invisList.get(i));
					}
					
					player.sendMessage(Messages.invis_success());
					invisList.remove(player);
					
				} else {
					for(Player p : Bukkit.getOnlinePlayers()) {
						p.hidePlayer(player);
					}
					
					for(Player p : invisList) {
						p.showPlayer(player);
					}
					
					for(int i = 0; i < invisList.size(); i++) {
						player.showPlayer(invisList.get(i));
					}
					
					player.sendMessage(Messages.invis_success2(player));
					invisList.add(player);
				}
				
				
			} else {
				player.sendMessage(Messages.insufficient_permission());
			}
			
		}
		
		
		
		
		
		return false;
	}

}
