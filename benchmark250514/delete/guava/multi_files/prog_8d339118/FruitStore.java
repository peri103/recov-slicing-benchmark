import java.util.HashMap;
import java.util.Map;

public class FruitStore {
    private Map<String, Integer> inventory = new HashMap<>();

    public void addInventory(String fruit, int quantity) {
        inventory.put(fruit, quantity);
    }

    public Map<String, Integer> getInventory() {
        return inventory;
    }
}
