import java.util.HashMap;
import java.util.Map;

public class Store {
    private String name;
    private FruitInventory inventory = new FruitInventory();
    private Map<String, Integer> additionalStock = new HashMap<>();

    public Store(String name) {
        this.name = name;
    }

    public void stockFruit(String fruit, int quantity) {
        for (int i = 0; i < quantity; i++) {
            inventory.addFruit(fruit);
        }
    }

    public void addAdditionalStock(String fruit, int quantity) {
        additionalStock.put(fruit, additionalStock.getOrDefault(fruit, 0) + quantity);
    }

    public int getFruitCount(String fruit) {
        return inventory.getFruitCount(fruit);
    }

    public int getAdditionalStock(String fruit) {
        return additionalStock.getOrDefault(fruit, 0);
    }
}
