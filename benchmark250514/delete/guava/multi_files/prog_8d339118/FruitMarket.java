import java.util.HashMap;
import java.util.Map;

public class FruitMarket {
    private Map<String, Integer> fruitCount = new HashMap<>();
    private FruitInventory inventory = new FruitInventory();

    public void addFruitToMarket(String fruit) {
        inventory.addFruit(fruit);
        fruitCount.put(fruit, inventory.getFruitCount(fruit));
    }

    public void printMarketSummary() {
        System.out.println("Market Summary:");
        for (Map.Entry<String, Integer> entry : fruitCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public int getTotalFruits() {
        int total = 0;
        for (int count : fruitCount.values()) {
            total += count;
        }
        return total;
    }

    public void removeFruitFromMarket(String fruit) {
        inventory.removeFruit(fruit);
        fruitCount.put(fruit, inventory.getFruitCount(fruit));
    }

    public FruitInventory getInventory() {
        return inventory;
    }
}
