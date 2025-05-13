import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // ImmutableMap.Builder is used to create an immutable map
        ImmutableMap.Builder<String, Integer> mapBuilder = ImmutableMap.builder();
        
        // Since ImmutableMap is immutable, we use the builder to add entries
        /* write */ mapBuilder.put("key", 42);
        
        // Create another immutable map using a builder
        ImmutableMap.Builder<String, String> anotherMapBuilder = ImmutableMap.builder();
        anotherMapBuilder.put("name", "Alice");
        anotherMapBuilder.put("city", "Wonderland");
        
        // Build the immutable map
        ImmutableMap<String, Integer> map = mapBuilder.build();
        
        // Build another immutable map
        ImmutableMap<String, String> anotherMap = anotherMapBuilder.build();
        
        // Create an ImmutableList from the keys of the map
        ImmutableList<String> keys = ImmutableList.copyOf(map.keySet());
        
        // Create a HashMap and populate it with values
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        
        // Perform operations on the HashMap
        if (hashMap.containsKey("one")) {
            System.out.println("HashMap contains key 'one'");
        }
        
        // Output the keys from the ImmutableMap
        for (String key : keys) {
            System.out.println("ImmutableMap key: " + key);
        }
        
        // Read the value associated with the key "key"
        /* read */ Integer value = map.get("key");
        
        // Output the value
        System.out.println("Value from ImmutableMap: " + value);
        
        // Print values from anotherMap
        for (String k : anotherMap.keySet()) {
            System.out.println("AnotherMap key: " + k + ", value: " + anotherMap.get(k));
        }
        
        // Perform a calculation and print the result
        int sum = 0;
        for (Integer val : hashMap.values()) {
            sum += val;
        }
        System.out.println("Sum of values in HashMap: " + sum);
    }
}