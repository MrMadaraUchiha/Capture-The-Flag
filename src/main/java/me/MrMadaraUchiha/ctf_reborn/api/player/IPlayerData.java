package me.MrMadaraUchiha.ctf_reborn.api.player;

import me.MrMadaraUchiha.ctf_reborn.api.classes.IClass;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface IPlayerData {

    UUID getPlayerUUID();

    Player getBukkitPlayer();

    void setClass(IClass playerClass);

    IClass getPlayerClass();
}
