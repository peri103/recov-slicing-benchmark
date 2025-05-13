import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize multimap and hashmap
        Multimap<String, String> multimap = ArrayListMultimap.create();
        Map<String, Integer> hashmap = new HashMap<>();
        
        // Put values into hashmap
        hashmap.put("one", 1);
        hashmap.put("two", 2);
        hashmap.put("three", 3);
        
        // Perform operations on hashmap
        for (String key : hashmap.keySet()) {
            System.out.println("Hashmap key: " + key + ", value: " + hashmap.get(key));
        }
        
        // Write to multimap
        /* write */ multimap.put("key", "value");
        
        // Additional multimap operations
        multimap.put("key", "anotherValue");
        multimap.put("anotherKey", "newValue");
        
        // Read from multimap
        /* read */ String value = multimap.get("key").iterator().next();
        
        System.out.println("Multimap read value: " + value);
        
        // Further operations on multimap
        for (String key : multimap.keySet()) {
            System.out.println("Multimap key: " + key + ", values: " + multimap.get(key));
        }
        
        // Perform calculations
        int sum = 0;
        for (Integer num : hashmap.values()) {
            sum += num;
        }
        System.out.println("Sum of hashmap values: " + sum);
        
        // Conditional logic
        if (multimap.containsKey("anotherKey")) {
            System.out.println("Multimap contains 'anotherKey'");
        }
    }
}