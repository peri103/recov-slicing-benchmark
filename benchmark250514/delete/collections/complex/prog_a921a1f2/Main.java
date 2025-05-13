import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap the modifiable map with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Initialize a regular HashMap
        Map<String, String> regularMap = new HashMap<>();
        regularMap.put("greeting", "Hello, World!");
        
        // Perform some operations on regularMap
        String greeting = regularMap.get("greeting");
        System.out.println(greeting);
        
        // Add more elements to the regular map
        regularMap.put("farewell", "Goodbye!");
        regularMap.put("question", "How are you?");
        
        // Iterate over the regular map
        for (Map.Entry<String, String> entry : regularMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Modify the original modifiable map
        /* write */ modifiableMap.put("key", 42);
        
        // Add some more elements to modifiableMap
        modifiableMap.put("key", 43);
        modifiableMap.put("anotherKey", 100);
        
        // Perform calculations using values from modifiableMap
        int sum = 0;
        for (Integer value : modifiableMap.get("key")) {
            sum += value;
        }
        System.out.println("Sum of values for 'key': " + sum);
        
        // Read the value using the unmodifiable map
        /* read */ Collection<Integer> values = unmodifiableMap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
        
        // Add complexity with conditional logic
        if (sum > 50) {
            System.out.println("Sum is greater than 50.");
        } else {
            System.out.println("Sum is 50 or less.");
        }
        
        // Use a loop with modifiableMap
        for (String key : modifiableMap.keySet()) {
            System.out.println("Values for " + key + ": " + modifiableMap.get(key));
        }
    }
}