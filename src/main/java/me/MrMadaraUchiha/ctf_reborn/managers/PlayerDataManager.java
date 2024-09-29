package me.MrMadaraUchiha.ctf_reborn.managers;

import me.MrMadaraUchiha.ctf_reborn.api.player.IPlayerData;
import me.MrMadaraUchiha.ctf_reborn.model.player.PlayerDataImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;

public class PlayerDataManager {

    private static final LinkedHashMap<UUID, IPlayerData> playersCache = new LinkedHashMap<>();

    @Nullable
    public static IPlayerData getPlayerData(UUID uuid) {
        // TODO: read possible database data

        return playersCache.getOrDefault(uuid, null);
    }

    @Nullable
    public static IPlayerData getOfflinePlayerData(UUID uuid) {
        IPlayerData cachePlayer = getPlayerData(uuid);

        if (Objects.isNull(cachePlayer)) cachePlayer = loadPlayerData(uuid);

        return cachePlayer;
    }

    @SuppressWarnings("ConstantConditions")
    @Nullable
    public static IPlayerData loadPlayerData(UUID uuid) {
        IPlayerData data = new PlayerDataImpl(uuid);

        playersCache.put(uuid, data);

        return data;
    }

    @NotNull
    public static IPlayerData createPlayerData(UUID uuid) {
        return new PlayerDataImpl(uuid);

        // TODO: Insert possible default data
    }
}
