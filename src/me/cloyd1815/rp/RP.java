package me.cloyd1815.rp;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class RP extends JavaPlugin {
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
	
	@Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidGenerator();
    }
}
