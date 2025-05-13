import java.util.HashMap;
import java.util.Map;

public class FruitCounter {
    private FruitMultiset multiset;
    private Map<String, Integer> fruitCount;

    public FruitCounter(FruitMultiset multiset) {
        this.multiset = multiset;
        this.fruitCount = new HashMap<>();
    }

    public void countFruits() {
        for (String fruit : multiset.elementSet()) {
            fruitCount.put(fruit, multiset.count(fruit));
        }
    }

    public int getFruitCount(String fruit) {
        /* read */ return multiset.count(fruit);
    }

    public Map<String, Integer> getAllCounts() {
        return fruitCount;
    }
}
