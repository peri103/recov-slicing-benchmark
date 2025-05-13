import com.google.common.collect.ConcurrentHashMultiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMultiset<String> multiset = ConcurrentHashMultiset.create();
        Map<String, Integer> fruitBasket = new HashMap<>();
        
        fruitBasket.put("apple", 3);
        fruitBasket.put("banana", 2);
        fruitBasket.put("orange", 5);
        
        for (Map.Entry<String, Integer> entry : fruitBasket.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                multiset.add(entry.getKey()); // adding fruits multiple times
            }
        }
        
        int totalFruits = 0;
        for (String fruit : fruitBasket.keySet()) {
            totalFruits += multiset.count(fruit); // counting all fruits
        }
        
        /* write */ multiset.add("apple");
        
        System.out.println("Total fruits in the basket: " + totalFruits);
        
        int appleCount = multiset.count("apple"); // counting apples separately
        System.out.println("Apples in the basket: " + appleCount);
        
        /* read */ int appleSingleCount = multiset.count("apple");
        System.out.println("Single apple count: " + appleSingleCount);
        
        // Additional complex operations
        Map<String, Integer> fruitSummary = new HashMap<>();
        
        for (String fruit : fruitBasket.keySet()) {
            fruitSummary.put(fruit, multiset.count(fruit));
        }
        
        System.out.println("Fruit summary:");
        for (Map.Entry<String, Integer> entry : fruitSummary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}