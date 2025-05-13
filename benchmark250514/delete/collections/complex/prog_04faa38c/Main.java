import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap
        MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Use the modifiable map to perform write operation
        /* write */ modifiableMap.put("key", 42);
        
        // Additional unrelated logic
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("Language", "Java");
        simpleMap.put("Version", "1.8");
        
        String language = simpleMap.get("Language");
        System.out.println("Programming Language: " + language);
        
        // More complex logic
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);
        
        // Perform some operations on another MultiValuedMap
        MultiValuedMap<String, String> anotherMap = new ArrayListValuedHashMap<>();
        anotherMap.put("fruit", "apple");
        anotherMap.put("fruit", "banana");
        anotherMap.put("vegetable", "carrot");
        
        System.out.println("Fruits: " + anotherMap.get("fruit"));
        
        // Read the value using the unmodifiable map
        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        
        // Output the value
        System.out.println("Value from UnmodifiableMultiValuedMap: " + value);
        
        // Even more complex logic
        for (String key : anotherMap.keySet()) {
            System.out.println(key + ": " + anotherMap.get(key));
        }
    }
}