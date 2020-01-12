package com.lfn.simplecommandsplus;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class nightCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player player = (Player) sender;
			
			if(player.hasPermission("simplecommands.night")) {
				
				player.sendMessage(Messages.night_success());
				player.getWorld().setTime(18000);
				
			} else {
				player.sendMessage(Messages.insufficient_permission());
			}
			
			
			
		}
		
		return false;
	}

}
