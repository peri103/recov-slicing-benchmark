import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, Integer> map = new MultiKeyMap<>();
        Map<String, String> simpleMap = new HashMap<>();
        
        // Adding some entries to a simple map
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        simpleMap.put("C", "Cherry");
        
        // Printing entries from the simple map
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Using the MultiKeyMap
        map.put("key1", "key2", 42);
        
        // Adding more entries to the MultiKeyMap
        map.put("key3", "key4", 84);
        map.put("key5", "key6", 126);
        
        // Performing some operations with the MultiKeyMap
        Integer value1 = map.get("key3", "key4");
        Integer value2 = map.get("key5", "key6");
        
        // Calculating the sum of retrieved values
        int sum = value1 + value2;
        System.out.println("Sum of values: " + sum);
        
        // More unrelated operations
        int counter = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                counter += i;
            }
        }
        System.out.println("Counter value: " + counter);
        
        // Finally reading the original value from MultiKeyMap
        /* read */ Integer value = map.get("key1", "key2");
        System.out.println(value);
        
        // Additional operations
        int product = value * sum;
        System.out.println("Product of value and sum: " + product);
    }
}