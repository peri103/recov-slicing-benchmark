import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;
import com.google.common.collect.HashMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Using ImmutableSetMultimap to store key-value pairs
        /* write */ ImmutableSetMultimap<String, Integer> multimap = ImmutableSetMultimap.of("key1", 1, "key2", 2, "key1", 3);
        
        // Additional unrelated code to increase complexity
        Map<String, String> map = new HashMap<>();
        map.put("Hello", "World");
        map.put("Java", "Programming");
        
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Using HashMultimap for similar operations
        Multimap<String, String> hashMultimap = HashMultimap.create();
        hashMultimap.put("fruit", "apple");
        hashMultimap.put("fruit", "banana");
        hashMultimap.put("vegetable", "carrot");
        
        System.out.println("HashMultimap contents:");
        for (String key : hashMultimap.keySet()) {
            System.out.println(key + " -> " + hashMultimap.get(key));
        }
        
        // Complex loop operation involving ImmutableSetMultimap
        int sum = 0;
        for (Integer value : multimap.values()) {
            sum += value;
        }
        System.out.println("Sum of all values in ImmutableSetMultimap: " + sum);
        
        // Reading values associated with a key
        /* read */ ImmutableSet<Integer> values = multimap.get("key1");
        
        // Printing the values to ensure the read method works correctly
        System.out.println(values);
        
        // Further operations on the HashMultimap
        hashMultimap.putAll("fruit", values);
        
        System.out.println("Updated HashMultimap contents:");
        for (String key : hashMultimap.keySet()) {
            System.out.println(key + " -> " + hashMultimap.get(key));
        }
    }
}