import java.util.HashMap;
import java.util.Map;

public class FruitStore {
    private FruitInventory inventory = new FruitInventory();
    private Map<String, Integer> fruitInventory = new HashMap<>();

    public void stockFruit(String fruit, int quantity) {
        for (int i = 0; i < quantity; i++) {
            inventory.addFruit(fruit);
        }
        fruitInventory.put(fruit, inventory.getFruitCount(fruit));
    }

    public Map<String, Integer> getInventory() {
        return fruitInventory;
    }
}
