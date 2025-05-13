import org.apache.commons.collections4.map.DefaultedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the DefaultedMap with a default value
        DefaultedMap<Integer, String> defaultedMap = new DefaultedMap<>("Default Value");
        
        // Initialize a HashMap to store additional data
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Write a key-value pair into the DefaultedMap
        /* write */ defaultedMap.put(1, "Hello World");
        
        // Add multiple entries to the HashMap
        for (int i = 0; i < 5; i++) {
            hashMap.put(i, "Value " + i);
        }
        
        // Perform some operations on the HashMap
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("HashMap Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Use the DefaultedMap to retrieve a value
        /* read */ String value = defaultedMap.get(1);
        
        // Print the read value from DefaultedMap
        System.out.println("DefaultedMap Read Value: " + value);
        
        // Perform additional operations on DefaultedMap
        defaultedMap.put(2, "Another Value");
        for (int i = 1; i <= 2; i++) {
            System.out.println("DefaultedMap Key: " + i + ", Value: " + defaultedMap.get(i));
        }
        
        // Demonstrate using DefaultedMap with a missing key
        System.out.println("DefaultedMap Key: 3, Value: " + defaultedMap.get(3)); // Should print default value
    }
}