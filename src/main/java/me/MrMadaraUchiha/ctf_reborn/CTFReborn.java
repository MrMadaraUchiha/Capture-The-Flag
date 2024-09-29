package me.MrMadaraUchiha.ctf_reborn;

import me.MrMadaraUchiha.ctf_reborn.commands.TestDebug;
import me.MrMadaraUchiha.ctf_reborn.listeners.GeneralListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class CTFReborn extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getServer().getPluginManager().registerEvents(new GeneralListeners(), this);
        Bukkit.getConsoleSender().sendMessage("teste");
        Bukkit.getPluginCommand("test").setExecutor(new TestDebug());
    }

    @Override
    public void onDisable() {

    }
}