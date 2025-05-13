import java.util.HashMap;
import java.util.Map;

public class FruitInventory {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addFruit(String fruit, int quantity) {
        inventory.put(fruit, quantity);
    }

    public int getTotalInventory() {
        int total = 0;
        for (int quantity : inventory.values()) {
            total += quantity;
        }
        return total;
    }

    public void removeFruit(String fruit) {
        inventory.remove(fruit);
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}