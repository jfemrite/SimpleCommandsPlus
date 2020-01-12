package com.lfn.simplecommandsplus;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Messages {
	
	public static String insufficient_permission() {
		
		String rawMessage = Main.config.getString("insufficient-permission");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String error_message1() {
		
		String rawMessage = Main.config.getString("error-message1");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String error_message2() {
		
		String rawMessage = Main.config.getString("error-message2");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String error_message3() {
		
		String rawMessage = Main.config.getString("error-message3");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	

	public static String gmc_success() {
		
		String rawMessage = Main.config.getString("gmc.success");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String gmc_success2(Player player) {
		
		String rawMessage = Main.config.getString("gmc.success");
		if(rawMessage.contains("{player}")) {
			rawMessage.replace("{player}", player.getName());
		}
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String gms_success() {
		
		String rawMessage = Main.config.getString("gms.success");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String gms_success2(Player player) {
		
		String rawMessage = Main.config.getString("gms.success");
		if(rawMessage.contains("{player}")) {
			rawMessage.replace("{player}", player.getName());
		}
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String gmsp_success() {
		
		String rawMessage = Main.config.getString("gmsp.success");
		
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String gmsp_success2(Player player) {
		
		String rawMessage = Main.config.getString("gmsp.success");
		if(rawMessage.contains("{player}")) {
			rawMessage.replace("{player}", player.getName());
		}
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String gma_success() {
		
		String rawMessage = Main.config.getString("gma.success");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String gma_success2(Player player) {
		
		String rawMessage = Main.config.getString("gma.success");
		if(rawMessage.contains("{player}")) {
			rawMessage.replace("{player}", player.getName());
		}
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String day_success() {
		
		String rawMessage = Main.config.getString("day.success");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String night_success() {
		
		String rawMessage = Main.config.getString("night.success");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String invis_success() {
		
		String rawMessage = Main.config.getString("invis.success");
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
	public static String invis_success2(Player player) {
		
		String rawMessage = Main.config.getString("invis.success2");
		if(rawMessage.contains("{player}")) {
			rawMessage.replace("{player}", player.getName());
		}
		String message = ChatColor.translateAlternateColorCodes('&', rawMessage);
		
		return message;
	}
	
}
