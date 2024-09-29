package me.MrMadaraUchiha.ctf_reborn.listeners;

import me.MrMadaraUchiha.ctf_reborn.api.player.IPlayerData;
import me.MrMadaraUchiha.ctf_reborn.managers.PlayerDataManager;
import me.MrMadaraUchiha.ctf_reborn.model.classes.impl.WarriorClass;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class GeneralListeners implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent ev) {
        IPlayerData data = PlayerDataManager.loadPlayerData(ev.getPlayer().getUniqueId());

        if (!(ev.getPlayer().getName() == "MrMadaraUchiha")) return;

        WarriorClass warriorClass = new WarriorClass();

        data.setClass(warriorClass);
    }
}
