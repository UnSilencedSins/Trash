package trashcan.trash;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class TrashInv extends HartInventory {
    @Override
    public Inventory getInventory() {
        Inventory inv = Bukkit.createInventory(this, 27, "Trash Can");

        return inv;
    }
}
