import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a ListMultimap
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        
        // Initialize a regular HashMap for additional complexity
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        
        // Add multiple values to the ListMultimap
        multimap.put("key", 42);
        multimap.put("key", 43);
        
        // Perform operations on the HashMap
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Add more complexity with a loop
        for (int i = 0; i < 5; i++) {
            multimap.put("loopKey", i);
        }
        
        // Retrieve a value from the ListMultimap
        List<Integer> values = multimap.get("loopKey");
        for (Integer val : values) {
            System.out.println("Loop value: " + val);
        }
        
        // More operations on the multimap
        multimap.put("anotherKey", 100);
        multimap.put("anotherKey", 200);
        
        // Retrieve and print values from another key
        List<Integer> anotherValues = multimap.get("anotherKey");
        for (Integer val : anotherValues) {
            System.out.println("Another value: " + val);
        }
        
        // Final retrieval of the original write-read pair
        /* read */ Integer value = multimap.get("key").get(0);
        
        // Print the value from the original write-read pair
        System.out.println("Original key value: " + value);
    }
}