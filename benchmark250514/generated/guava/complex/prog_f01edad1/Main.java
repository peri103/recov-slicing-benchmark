import com.google.common.collect.SortedMultiset;
import com.google.common.collect.TreeMultiset;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SortedMultiset<String> multiset = TreeMultiset.create();
        
        // Additional code to make the program more complex
        Map<String, Integer> fruitMap = new HashMap<>();
        fruitMap.put("banana", 2);
        fruitMap.put("orange", 3);
        
        for (Map.Entry<String, Integer> entry : fruitMap.entrySet()) {
            multiset.add(entry.getKey(), entry.getValue());
        }
        
        Set<String> fruits = fruitMap.keySet();
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        
        /* write */ multiset.add("apple");
        
        int totalFruits = 0;
        for (String fruit : multiset.elementSet()) {
            totalFruits += multiset.count(fruit);
        }
        
        System.out.println("Total fruits in multiset: " + totalFruits);
        
        /* read */ int count = multiset.count("apple");
        System.out.println(count);
        
        // Further complexity
        for (String fruit : multiset.elementSet()) {
            System.out.println("Count of " + fruit + ": " + multiset.count(fruit));
        }
    }
}