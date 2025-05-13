import java.util.HashMap;
import java.util.HashSet;

public class FruitInventory {
    private HashMap<String, Integer> inventory = new HashMap<>();
    private HashSet<String> fruitSet = new HashSet<>();

    public void addToInventory(String fruit, int count) {
        inventory.put(fruit, count);
        fruitSet.add(fruit);
    }

    public boolean hasFruit(String fruit) {
        return fruitSet.contains(fruit);
    }

    public int getTotalFruits() {
        int total = 0;
        for (Integer count : inventory.values()) {
            total += count;
        }
        return total;
    }

    public void mergeWithBag(FruitBag bag) {
        for (String fruit : fruitSet) {
            if (bag.getFruitCount(fruit) > 0) {
                inventory.put(fruit, inventory.getOrDefault(fruit, 0) + bag.getFruitCount(fruit));
            }
        }
    }
}
