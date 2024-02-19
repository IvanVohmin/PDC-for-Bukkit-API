
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PDC {
    private ItemStack item;
    private ItemMeta meta;
    public PDC(ItemStack itemStack) {
        this.item = itemStack;
        this.meta = item.getItemMeta();
    }
    // strings
    private PersistentDataContainer container () {
        return meta.getPersistentDataContainer();
    }
    private void save() {
        item.setItemMeta(meta);
    }
    public boolean isEmpty() {
        return container().isEmpty();
    }
    public void setString(String name, String var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.STRING,
                var
        );
        save();
    }

    public boolean hasString(String name) {
        return container().has(
                NamespacedKey.fromString(name),
                PersistentDataType.STRING
        );
    }

    public String getString(String name) {
        return container().get(
                NamespacedKey.fromString(name),
                PersistentDataType.STRING
        );
    }

    public void removeString(String name) {
        if (hasString(name)) {
            container().remove(
                    NamespacedKey.fromString(name)
            );
        }
        save();
    }

    // integers
    public void setInt(String name, int var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.INTEGER,
                var
        );
        save();
    }

    public boolean hasInt(String name) {
        return container().has(
                NamespacedKey.fromString(name),
                PersistentDataType.INTEGER
        );
    }

    public int getInt(String name) {
        return container().get(
                NamespacedKey.fromString(name),
                PersistentDataType.INTEGER
        );
    }

    public void removeInt(String name) {
        if (hasInt(name)) {
            container().remove(
                    NamespacedKey.fromString(name)
            );
        }
        save();
    }

    // doubles
    public void setDouble(String name, double var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.DOUBLE,
                var
        );
        save();
    }

    public boolean hasDouble(String name) {
        return container().has(
                NamespacedKey.fromString(name),
                PersistentDataType.DOUBLE
        );
    }

    public double getDouble(String name) {
        return container().get(
                NamespacedKey.fromString(name),
                PersistentDataType.DOUBLE
        );
    }

    public void removeDouble(String name) {
        if (hasDouble(name)) {
            container().remove(
                    NamespacedKey.fromString(name)
            );
        }
        save();
    }

    // longs
    public void setLong(String name, long var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.LONG,
                var
        );
        save();
    }

    public boolean hasLong(String name) {
        return container().has(
                NamespacedKey.fromString(name),
                PersistentDataType.LONG
        );
    }

    public long getLong(String name) {
        return container().get(
                NamespacedKey.fromString(name),
                PersistentDataType.LONG
        );
    }

    public void removeLong(String name) {
        if (hasLong(name)) {
            container().remove(
                    NamespacedKey.fromString(name)
            );
        }
        save();
    }

    // floats
    public void setFloat(String name, float var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.FLOAT,
                var
        );
        save();
    }

    public boolean hasFloat(String name) {
        return container().has(
                NamespacedKey.fromString(name),
                PersistentDataType.FLOAT
        );
    }

    public float getFloat(String name) {
        return container().get(
                NamespacedKey.fromString(name),
                PersistentDataType.FLOAT
        );
    }

    public void removeFloat(String name) {
        if (hasFloat(name)) {
            container().remove(
                    NamespacedKey.fromString(name)
            );
        }
        save();
    }
}
