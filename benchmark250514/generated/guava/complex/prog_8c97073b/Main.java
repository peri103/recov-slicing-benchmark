import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a Multimap
        Multimap<String, String> multimap = HashMultimap.create();
        
        // Initialize a regular HashMap for additional complexity
        Map<String, Integer> map = new HashMap<>();
        
        // Add some entries to the HashMap
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Process the HashMap entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform a write operation on the Multimap
        /* write */ multimap.put("key", "value");
        
        // Add more entries to the Multimap for complexity
        multimap.put("key", "anotherValue");
        multimap.put("anotherKey", "differentValue");
        
        // Process the Multimap entries
        for (String key : multimap.keySet()) {
            System.out.println("Multimap Key: " + key + ", Values: " + multimap.get(key));
        }
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);
        
        // Now perform the read operation on the Multimap
        /* read */ String value = multimap.get("key").iterator().next();
        
        // Output the result of the read operation
        System.out.println("Read value from Multimap: " + value);
        
        // Additional unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 integers: " + product);
    }
}