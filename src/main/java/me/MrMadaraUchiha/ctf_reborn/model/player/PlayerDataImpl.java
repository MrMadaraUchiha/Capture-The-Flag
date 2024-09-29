package me.MrMadaraUchiha.ctf_reborn.model.player;

import me.MrMadaraUchiha.ctf_reborn.api.classes.IClass;
import me.MrMadaraUchiha.ctf_reborn.api.player.IPlayerData;
import me.MrMadaraUchiha.ctf_reborn.managers.PlayerDataManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.UUID;

public class PlayerDataImpl implements IPlayerData {

    private final UUID uuid;

    private IClass playerClass;

    public PlayerDataImpl(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public UUID getPlayerUUID() {
        return uuid;
    }

    @Override
    public Player getBukkitPlayer() {
        return Bukkit.getPlayer(uuid);
    }

    @Override
    public void setClass(IClass playerClass) {
        this.playerClass = playerClass;

        playerClass.resetPlayerStats(this);
    }

    @Override
    public IClass getPlayerClass() {
        return playerClass;
    }

    public static IPlayerData fromBukkitPlayer(@NotNull Player player) {
        IPlayerData data = PlayerDataManager.getPlayerData(player.getUniqueId());
        if (Objects.isNull(data)) throw new NullPointerException("Player not found.");

        return data;
    }
}
