package me.MrMadaraUchiha.ctf_reborn.model.classes.impl;

import me.MrMadaraUchiha.ctf_reborn.api.player.IPlayerData;
import me.MrMadaraUchiha.ctf_reborn.extensions.ItensExtensions;
import me.MrMadaraUchiha.ctf_reborn.model.classes.AbstractClass;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WarriorClass extends AbstractClass {

    public WarriorClass() {

    }

    @Override
    public String getName() {
        return "Guerreiro";
    }

    @Override
    public void resetPlayerStats(IPlayerData player) {
        Player bukkitPlayer = player.getBukkitPlayer();

        bukkitPlayer.setFoodLevel(20);
        bukkitPlayer.setHealth(20.0);
        bukkitPlayer.setAllowFlight(false);
        bukkitPlayer.setSaturation(20F);
        bukkitPlayer.setWalkSpeed(0.2F);

        setPlayerInventory(player);
    }

    public void setPlayerInventory(IPlayerData player) {
        Player bukkitPlayer = player.getBukkitPlayer();

        bukkitPlayer.getInventory().clear();

        bukkitPlayer.getInventory().setItemInMainHand(ItensExtensions.createSimpleUnbreakableItem(Material.DIAMOND_SWORD));

        bukkitPlayer.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
        bukkitPlayer.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
        bukkitPlayer.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
        bukkitPlayer.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));

        bukkitPlayer.getInventory().addItem(new ItemStack(Material.COOKED_BEEF, 3));
    }
}
