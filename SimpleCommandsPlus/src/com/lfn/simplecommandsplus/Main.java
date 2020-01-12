package com.lfn.simplecommandsplus;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	PermissionAttachment attachment;
	HashMap<UUID, PermissionAttachment> map = new HashMap<>();
	public static FileConfiguration config;
	
	@Override
	public void onEnable() {
		
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
			
		config = this.getConfig();
				
		getCommand("day").setExecutor(new dayCmd());
		getCommand("night").setExecutor(new nightCmd());
		getCommand("invis").setExecutor(new invisibleCmd());
		
		Bukkit.getPluginManager().registerEvents(this, this);
		
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		if(!map.containsKey(e.getPlayer().getUniqueId())) {
			attachment = e.getPlayer().addAttachment(this);
			map.put(e.getPlayer().getUniqueId(), attachment);
		}
		
		for( Player p : invisibleCmd.invisList ) {
			e.getPlayer().hidePlayer(p);
		}
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
				
			if(cmd.getName().equalsIgnoreCase("gmc")) {
				
				if(args.length == 0 && player.hasPermission("simplecommands.gmc")) {
					if(player.getGameMode().equals(GameMode.CREATIVE)) {
						player.sendMessage(Messages.error_message1());
						return false;
					} else {
						player.setGameMode(GameMode.CREATIVE);
						player.sendMessage(Messages.gmc_success());
					}

				} else if(args.length > 0 && player.hasPermission("simplecommands.gmc.give")) {
					
					if(Bukkit.getPlayer(args[0]) != null) {
						Player p = Bukkit.getPlayer(args[0]);
						if(player.getDisplayName().equals(p.getDisplayName())) {
							player.sendMessage(Messages.insufficient_permission());
							return false;
						}
						if(p.getGameMode().equals(GameMode.CREATIVE)) {
							player.sendMessage(Messages.error_message2());
							return false;
						}
						p.sendMessage(Messages.gmc_success());
						p.setGameMode(GameMode.CREATIVE);
						player.sendMessage(Messages.gmc_success2(player));
					} else {
						player.sendMessage(Messages.error_message3());
					}
					
				}
				
				return false;
			}
					
				
			if(cmd.getName().equalsIgnoreCase("gms")) {
				if(args.length == 0 && player.hasPermission("simplecommands.gms")) {
					if(player.getGameMode().equals(GameMode.SURVIVAL)) {
						player.sendMessage(Messages.error_message1());
						return false;
					} else {
						player.setGameMode(GameMode.SURVIVAL);
						player.sendMessage(Messages.gms_success());
					}

				} else if(args.length > 0 && player.hasPermission("simplecommands.gms.give")) {
					
					if(Bukkit.getPlayer(args[0]) != null) {
						Player p = Bukkit.getPlayer(args[0]);
						if(player.getDisplayName().equals(p.getDisplayName())) {
							player.sendMessage(Messages.insufficient_permission());
							return false;
						}
						if(p.getGameMode().equals(GameMode.SURVIVAL)) {
							player.sendMessage(Messages.error_message2());
							return false;
						}
						p.sendMessage(Messages.gms_success());
						p.setGameMode(GameMode.SURVIVAL);
						player.sendMessage(Messages.gms_success2(player));
					} else {
						player.sendMessage(Messages.error_message3());
					}
					
				}
				
				return false;
			} 
					
			if(cmd.getName().equalsIgnoreCase("gma")) {
				if(args.length == 0 && player.hasPermission("simplecommands.gma")) {
					if(player.getGameMode().equals(GameMode.ADVENTURE)) {
						player.sendMessage(Messages.error_message1());
						return false;
					} else {
						player.setGameMode(GameMode.SURVIVAL);
						player.sendMessage(Messages.gma_success());
					}

				} else if(args.length > 0 && player.hasPermission("simplecommands.gma.give")) {
					
					if(Bukkit.getPlayer(args[0]) != null) {
						Player p = Bukkit.getPlayer(args[0]);
						if(player.getDisplayName().equals(p.getDisplayName())) {
							player.sendMessage(Messages.insufficient_permission());
							return false;
						}
						if(p.getGameMode().equals(GameMode.ADVENTURE)) {
							player.sendMessage(Messages.error_message2());
							return false;
						}
						p.sendMessage(Messages.gma_success());
						p.setGameMode(GameMode.ADVENTURE);
						player.sendMessage(Messages.gma_success2(player));
					} else {
						player.sendMessage(Messages.error_message3());
					}
					
				}
				return false;
			}
				
			if(cmd.getName().equalsIgnoreCase("gmsp")) {
				if(args.length == 0 && player.hasPermission("simplecommands.gmsp")) {
					if(player.getGameMode().equals(GameMode.SPECTATOR)) {
						player.sendMessage(Messages.error_message1());
						return false;
					} else {
						player.setGameMode(GameMode.SPECTATOR);
						player.sendMessage(Messages.gmsp_success());
					}

				} else if(args.length > 0 && player.hasPermission("simplecommands.gmsp.give")) {
					
					if(Bukkit.getPlayer(args[0]) != null) {
						Player p = Bukkit.getPlayer(args[0]);
						if(player.getDisplayName().equals(p.getDisplayName())) {
							player.sendMessage(Messages.insufficient_permission());
							return false;
						}
						if(p.getGameMode().equals(GameMode.SPECTATOR)) {
							player.sendMessage(Messages.error_message2());
							return false;
						}
						p.sendMessage(Messages.gmsp_success());
						p.setGameMode(GameMode.SPECTATOR);
						player.sendMessage(Messages.gmsp_success2(player));
					} else {
						player.sendMessage(Messages.error_message3());
					}
					
				}
				return false;	
			}
				
		}
		
		
		return false;
	}
	
	/*
	 * gmc
	 * simplecommands.gmc
	 * 
	 * gmsp
	 * simplecommands.gmsp
	 * 
	 * gms
	 * simplecommands.gms
	 * 
	 * gma
	 * simplecommands.gma
	 * 
	 * day
	 * simplecommands.day
	 * 
	 * night
	 * simplecommands.night
	 * 
	 * invis
	 * simplecommands.invis
	 */
	
}
