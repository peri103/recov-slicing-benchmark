import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap instance
        AbstractReferenceMap<Integer, String> map = new ReferenceMap<>();
        
        // Initialize a HashMap for additional complexity
        Map<Integer, String> hashMap = new HashMap<>();
        
        // Put some values in the HashMap
        hashMap.put(2, "Java");
        hashMap.put(3, "Programming");
        
        // Use the write method to put a key-value pair into the map
        /* write */ map.put(1, "Hello World");
        
        // Perform some operations with the HashMap
        for (int i = 2; i <= 3; i++) {
            System.out.println("HashMap value for key " + i + ": " + hashMap.get(i));
        }
        
        // Add more key-value pairs to the map
        map.put(4, "Complexity");
        map.put(5, "Increased");
        
        // Perform a check using the map
        if (map.containsKey(4)) {
            System.out.println("Map contains key 4");
        }
        
        // Use the read method to get the value associated with the key
        /* read */ String value = map.get(1);
        
        // Print the value retrieved
        System.out.println(value);
        
        // Further operations on the map
        String removedValue = map.remove(5);
        System.out.println("Removed value: " + removedValue);
        
        // Iterate over the map entries
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Map entry: " + entry.getKey() + " -> " + entry.getValue());
        }
    }
}