import java.util.HashMap;
import java.util.Map;

public class FruitManager {
    private FruitBag fruitBag = new FruitBag();
    private Map<String, Integer> initialFruits = new HashMap<>();

    public FruitManager() {
        initialFruits.put("banana", 5);
        initialFruits.put("orange", 3);
        addInitialFruits();
    }

    private void addInitialFruits() {
        for (Map.Entry<String, Integer> entry : initialFruits.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                fruitBag.addFruit(entry.getKey());
            }
        }
    }

    public void addApple() {
        fruitBag.addFruit("apple");
    }

    public int getAppleCount() {
        return fruitBag.getFruitCount("apple");
    }

    public void displayFruitCounts() {
        for (String fruit : initialFruits.keySet()) {
            System.out.println(fruit + ": " + fruitBag.getFruitCount(fruit));
        }
    }
}
