import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap first
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Additional complex logic
        Map<String, Integer> countMap = new HashMap<>();
        countMap.put("key", 1);
        countMap.put("anotherKey", 2);

        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            System.out.println("Processing entry: " + entry.getKey() + " with value: " + entry.getValue());
        }

        // Use the modifiable map to perform write operations
        modifiableMap.put("key", "value"); // /* write */

        // More complex logic
        for (int i = 0; i < 5; i++) {
            modifiableMap.put("key" + i, "value" + i);
        }

        // Some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // Read from the unmodifiable map
        Collection<String> values = unmodifiableMap.get("key"); // /* read */
        
        // Output the values
        for (String value : values) {
            System.out.println(value);
        }

        // Additional operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}