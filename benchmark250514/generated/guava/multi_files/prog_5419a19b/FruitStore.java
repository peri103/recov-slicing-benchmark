import com.google.common.collect.ImmutableMultiset;
import java.util.HashMap;
import java.util.Map;

public class FruitStore {
    private FruitInventory inventory;
    private Map<String, Integer> fruitCountMap = new HashMap<>();

    public FruitStore(FruitInventory inventory) {
        this.inventory = inventory;
    }

    public void calculateFruitCounts() {
        ImmutableMultiset<String> multiset = inventory.buildInventory();
        for (String fruit : multiset.elementSet()) {
            fruitCountMap.put(fruit, multiset.count(fruit));
        }
    }

    public int getFruitCount(String fruit) {
        return fruitCountMap.getOrDefault(fruit, 0);
    }

    public void printAllFruitCounts() {
        for (Map.Entry<String, Integer> entry : fruitCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
