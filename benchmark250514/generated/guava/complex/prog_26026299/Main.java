import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize the HashMultimap
        HashMultimap<String, Integer> multimap = HashMultimap.create();
        
        // Initialize a HashMap for unrelated operations
        Map<String, String> map = new HashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");
        
        // Perform some operations on the HashMap
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Add elements to the multimap
        multimap.put("key1", 10);
        multimap.put("key2", 20);
        
        // Perform some operations on the multimap
        for (String key : multimap.keySet()) {
            Collection<Integer> values = multimap.get(key);
            for (Integer value : values) {
                System.out.println("Multimap Key: " + key + ", Value: " + value);
            }
        }
        
        // Add the original write operation
        /* write */ multimap.put("key", 42);
        
        // More operations with unrelated data structures
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);
        
        // Add more elements to the multimap
        multimap.put("key3", 30);
        multimap.put("key4", 40);
        
        // Perform complex operations on the multimap
        for (String key : multimap.keySet()) {
            Collection<Integer> values = multimap.get(key);
            int total = 0;
            for (Integer value : values) {
                total += value;
            }
            System.out.println("Total for key " + key + ": " + total);
        }
        
        // Original read operation
        /* read */ Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println("Original key value: " + value);
        }
    }
}