import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Multiset<String> multiset = HashMultiset.create();
        Map<String, Integer> itemMap = new HashMap<>();
        
        // Adding items to the map
        itemMap.put("banana", 2);
        itemMap.put("orange", 5);
        itemMap.put("apple", 1);
        
        // Adding items from the map to the multiset
        for (Map.Entry<String, Integer> entry : itemMap.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                multiset.add(entry.getKey());
            }
        }
        
        // Performing some calculations
        int totalItems = 0;
        for (String item : itemMap.keySet()) {
            totalItems += multiset.count(item);
        }
        
        System.out.println("Total items in multiset: " + totalItems);
        
        // Adding more items to the multiset
        multiset.add("grape", 3);
        
        // Performing operations on the multiset
        int uniqueItems = multiset.elementSet().size();
        System.out.println("Unique items in multiset: " + uniqueItems);
        
        // Original write operation
        /* write */ multiset.add("apple");
        
        // Further operations
        for (String item : multiset.elementSet()) {
            System.out.println(item + " count: " + multiset.count(item));
        }
        
        // Original read operation
        /* read */ int count = multiset.count("apple");
        System.out.println("Count of apples after write: " + count);
        
        // Additional logic
        itemMap.put("mango", 4);
        multiset.add("mango", itemMap.get("mango"));
        
        for (String item : itemMap.keySet()) {
            System.out.println(item + " expected count: " + itemMap.get(item));
        }
        
        for (String item : multiset.elementSet()) {
            System.out.println(item + " actual count: " + multiset.count(item));
        }
    }
}