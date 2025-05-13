import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, Integer> map = new HashMap<>();
        
        // Additional complex logic with HashMap
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Iterating over the map and performing some operations
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        /* write */ multimap.put("key", 42);
        
        // Adding more elements to the multimap
        multimap.put("key", 43);
        multimap.put("anotherKey", 100);
        
        // Performing some operations on the multimap
        if (multimap.containsKey("key")) {
            System.out.println("Multimap contains key: 'key'");
        }
        
        // More complex logic using the multimap
        int sum = 0;
        for (Integer num : multimap.get("key")) {
            sum += num;
        }
        System.out.println("Sum of values for 'key': " + sum);
        
        /* read */ Integer value = multimap.get("key").get(0);
        
        System.out.println("Read value: " + value);
        
        // Additional operations with the map
        map.put("four", 4);
        for (String key : map.keySet()) {
            System.out.println("Map contains key: " + key);
        }
    }
}