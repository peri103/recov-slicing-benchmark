import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap it with an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(modifiableMap);
        
        // Create a regular HashMap to demonstrate additional complexity
        Map<String, Integer> regularMap = new HashMap<>();
        regularMap.put("one", 1);
        regularMap.put("two", 2);
        regularMap.put("three", 3);
        
        // Iterate over the regular map and print values
        Set<String> keys = regularMap.keySet();
        for (String key : keys) {
            System.out.println("Regular Map Key: " + key + ", Value: " + regularMap.get(key));
        }
        
        // Modify the underlying modifiable map
        /* write */ modifiableMap.put("key", "value");
        
        // Perform some operations on the modifiable map
        modifiableMap.put("anotherKey", "anotherValue");
        modifiableMap.put("key", "additionalValue");
        
        // Iterate over the modifiable map and print values
        for (String key : modifiableMap.keySet()) {
            for (String value : modifiableMap.get(key)) {
                System.out.println("Modifiable Map Key: " + key + ", Value: " + value);
            }
        }
        
        // Now read from the unmodifiable map
        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        
        System.out.println("Unmodifiable Map Read Value: " + value);
        
        // Perform additional operations to increase complexity
        int sum = 0;
        for (Integer val : regularMap.values()) {
            sum += val;
        }
        System.out.println("Sum of Regular Map Values: " + sum);
        
        // Add more entries to the regular map
        regularMap.put("four", 4);
        regularMap.put("five", 5);
        
        // Print updated regular map values
        for (String key : regularMap.keySet()) {
            System.out.println("Updated Regular Map Key: " + key + ", Value: " + regularMap.get(key));
        }
    }
}