package com.lfn.simplecommandsplus;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class dayCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if(player.hasPermission("simplecommands.day")) {
				
				player.sendMessage(Messages.day_success());
				player.getWorld().setTime(1000);
				
			} else {
				player.sendMessage(Messages.insufficient_permission());
			}
			
			
			
		}
		
		
		return false;
	}

}
