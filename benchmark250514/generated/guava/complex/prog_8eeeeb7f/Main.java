import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Cache<String, Integer> cache = CacheBuilder.newBuilder().build();
        HashMap<String, String> map = new HashMap<>();

        // Adding some entries to the HashMap
        map.put("A", "Apple");
        map.put("B", "Banana");
        map.put("C", "Cherry");

        // Perform some operations on the map
        if (map.containsKey("A")) {
            System.out.println("Map contains key 'A' with value: " + map.get("A"));
        }
        
        // Write to the cache
        /* write */ cache.put("key", 42);

        // More operations on the map
        map.put("D", "Date");
        System.out.println("Map size: " + map.size());

        // Complex logic using the map
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Read from the cache
        /* read */ Integer value = cache.getIfPresent("key");
        System.out.println("Value from cache: " + value);

        // Additional logic to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
    }
}