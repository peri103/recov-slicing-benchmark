import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable map
        Map<String, String> modifiableMap = new HashMap<>();
        
        // Wrap it with an UnmodifiableMap
        UnmodifiableMap<String, String> unmodifiableMap = UnmodifiableMap.unmodifiableMap(modifiableMap);

        // Additional map operations
        Map<Integer, String> anotherMap = new HashMap<>();
        anotherMap.put(1, "One");
        anotherMap.put(2, "Two");
        
        // Working with an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        
        // Perform some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Insert an element into the original map
        /* write */ modifiableMap.put("key", "value");
        
        // More complex operations
        for (Map.Entry<Integer, String> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        // Read the value from the unmodifiable map
        /* read */ String value = unmodifiableMap.get("key");
        
        System.out.println("Read value: " + value);
        
        // Additional list operations
        list.add("Cherry");
        list.remove("Banana");
        
        for (String fruit : list) {
            System.out.println("Fruit: " + fruit);
        }
    }
}