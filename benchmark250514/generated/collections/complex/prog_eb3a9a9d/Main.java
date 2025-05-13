import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize an AbstractHashedMap
        AbstractHashedMap<String, Integer> map = new HashedMap<>();
        
        // Initialize a regular HashMap
        Map<String, String> stringMap = new HashMap<>();
        
        // Add some values to the regular HashMap
        stringMap.put("name", "Alice");
        stringMap.put("city", "Wonderland");
        
        // Perform some operations on the regular HashMap
        System.out.println("Name: " + stringMap.get("name"));
        System.out.println("City: " + stringMap.get("city"));
        
        // Initialize another AbstractHashedMap
        AbstractHashedMap<String, Double> priceMap = new HashedMap<>();
        
        // Add some values to the priceMap
        priceMap.put("apple", 1.99);
        priceMap.put("banana", 0.99);
        
        // Perform operations on the priceMap
        System.out.println("Apple price: " + priceMap.get("apple"));
        System.out.println("Banana price: " + priceMap.get("banana"));
        
        // Write to the main map
        /* write */ map.put("key", 100);
        
        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        // Manipulate the stringMap further
        stringMap.put("country", "Fantasyland");
        System.out.println("Country: " + stringMap.get("country"));
        
        // Read from the main map
        /* read */ Integer value = map.get("key");
        
        // Output the value
        System.out.println("Value from main map: " + value);
        
        // Use the priceMap again
        priceMap.put("orange", 1.49);
        System.out.println("Orange price: " + priceMap.get("orange"));
        
        // Modify some values in the priceMap
        priceMap.put("apple", 2.49);
        System.out.println("Updated Apple price: " + priceMap.get("apple"));
    }
}