import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap to use for initialization
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap the modifiable map with an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Write operation (executed only once)
        modifiableMap.put("key", "value"); // Use the modifiable map to add entries

        // Insert unrelated code to make the program more complex
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("a", 1);
        simpleMap.put("b", 2);
        simpleMap.put("c", 3);

        int sum = 0;
        for (String key : simpleMap.keySet()) {
            sum += simpleMap.get(key);
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        // Further operations on modifiableMap
        modifiableMap.put("key", "additional value");
        modifiableMap.put("anotherKey", "another value");

        // Read operation (executed only once)
        String value = map.get("key").iterator().next(); // Get the value associated with the key
        
        System.out.println(value);

        // Additional logic to manipulate the modifiableMap
        int count = 0;
        for (String key : modifiableMap.keySet()) {
            count += modifiableMap.get(key).size();
        }
        System.out.println("Total number of values in modifiableMap: " + count);
    }
}