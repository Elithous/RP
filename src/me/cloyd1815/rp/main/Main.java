package me.cloyd1815.rp.main;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	private Plugin plugin;
	@Override
	public void onEnable() {
		setPlugin(this);
	}
	
	@Override
	public void onDisable() {
		
	}

	public Plugin getPlugin() {
		return plugin;
	}

	public void setPlugin(Plugin plugin) {
		this.plugin = plugin;
	}
}
