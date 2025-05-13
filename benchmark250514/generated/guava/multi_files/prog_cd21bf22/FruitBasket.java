import java.util.HashMap;
import java.util.Map;

public class FruitBasket {
    private Map<String, Integer> fruitBasket = new HashMap<>();
    private FruitInventory inventory = new FruitInventory();

    public void addFruit(String fruit, int quantity) {
        fruitBasket.put(fruit, quantity);
        for (int i = 0; i < quantity; i++) {
            inventory.addFruit(fruit);
        }
    }

    public int getFruitCount(String fruit) {
        return inventory.countFruit(fruit);
    }

    public Map<String, Integer> getFruitSummary() {
        Map<String, Integer> summary = new HashMap<>();
        for (String fruit : fruitBasket.keySet()) {
            summary.put(fruit, inventory.countFruit(fruit));
        }
        return summary;
    }
}
