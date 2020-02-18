package trashcan.trash;

import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("trash").setExecutor(new CommandsClass());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
