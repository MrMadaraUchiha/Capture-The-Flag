package me.MrMadaraUchiha.ctf_reborn.extensions;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItensExtensions {

    public static ItemStack createSimplestItem(Material material) {
        return new ItemStack(material);
    }

    public static ItemStack createSimplestItem(Material material, int amount) {
        return new ItemStack(material, amount);
    }

    public static ItemStack createSimpleUnbreakableItem(Material material) {
        ItemStack item = new ItemStack(material);
        ItemMeta itemMeta = item.getItemMeta();

        itemMeta.setUnbreakable(true);

        return item;
    }

}
