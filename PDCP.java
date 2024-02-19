
import org.bukkit.NamespacedKey;
import org.bukkit.entity.Player;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;

public class PDCP {
    Player player;
    public PDCP(Player player) {
        this.player = player;
    }

    private PersistentDataContainer container() {
        return player.getPersistentDataContainer();
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
    }

    // integers
    public void setInt(String name, int var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.INTEGER,
                var
        );
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
    }

    // doubles
    public void setDouble(String name, double var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.DOUBLE,
                var
        );
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
    }

    // longs
    public void setLong(String name, long var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.LONG,
                var
        );
    }

    public boolean hasLong(String name) {
        return container().has(
                NamespacedKey.fromString(name),
                PersistentDataType.LONG
        );
    }

    public double getLong(String name) {
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
    }

    // floats
    public void setFloat(String name, float var) {
        container().set(
                NamespacedKey.fromString(name),
                PersistentDataType.FLOAT,
                var
        );
    }

    public boolean hasFloat(String name) {
        return container().has(
                NamespacedKey.fromString(name),
                PersistentDataType.FLOAT
        );
    }

    public double getFloat(String name) {
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
    }
}
