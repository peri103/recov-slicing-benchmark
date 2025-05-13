import com.google.common.collect.HashBiMap;
import com.google.common.collect.BiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashBiMap and a HashMap
        HashBiMap<String, Integer> map = HashBiMap.create();
        Map<String, String> stringMap = new HashMap<>();
        
        // Insert some values into the HashMap
        stringMap.put("name", "John");
        stringMap.put("city", "New York");
        
        // Perform some complex operations on the HashMap
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Initialize another BiMap
        BiMap<Integer, String> biMap = HashBiMap.create();
        biMap.put(1, "one");
        biMap.put(2, "two");
        biMap.put(3, "three");
        
        // Perform operations on the BiMap
        String word = biMap.inverse().get("one");
        System.out.println("Inverse lookup: " + word);
        
        // Write to the original HashBiMap
        /* write */ map.put("key", 42);
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Read from the original HashBiMap
        /* read */ Integer value = map.get("key");
        
        // Print the value read from HashBiMap
        System.out.println("Value for 'key': " + value);
        
        // Perform more operations on the BiMap
        biMap.put(4, "four");
        for (Map.Entry<Integer, String> entry : biMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Manipulate the stringMap further
        stringMap.put("country", "USA");
        System.out.println("Updated Map: " + stringMap);
    }
}