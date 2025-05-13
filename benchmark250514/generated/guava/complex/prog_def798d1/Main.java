import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = LinkedHashMultimap.create();
        Map<String, String> simpleMap = new HashMap<>();
        
        // Initialize and populate the simpleMap
        simpleMap.put("first", "apple");
        simpleMap.put("second", "banana");
        simpleMap.put("third", "cherry");
        
        // Iterate over the simpleMap and print keys and values
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        /* write */ multimap.put("key", 42);
        
        // Perform some operations with multimap
        multimap.put("key", 84);
        multimap.put("anotherKey", 21);
        
        // Calculate the sum of all values associated with "key"
        int sum = 0;
        for (Integer num : multimap.get("key")) {
            sum += num;
        }
        System.out.println("Sum of values for 'key': " + sum);
        
        // Retrieve and print all keys in the multimap
        Set<String> keys = multimap.keySet();
        System.out.println("Keys in multimap: " + keys);
        
        // More unrelated operations
        int totalValues = 0;
        for (String key : keys) {
            totalValues += multimap.get(key).size();
        }
        System.out.println("Total number of values in multimap: " + totalValues);
        
        /* read */ Integer value = multimap.get("key").iterator().next();
        System.out.println("First value for 'key': " + value);
        
        // Additional logic to demonstrate complexity
        int maxValue = Integer.MIN_VALUE;
        for (String key : multimap.keySet()) {
            for (Integer num : multimap.get(key)) {
                if (num > maxValue) {
                    maxValue = num;
                }
            }
        }
        System.out.println("Maximum value in multimap: " + maxValue);
    }
}