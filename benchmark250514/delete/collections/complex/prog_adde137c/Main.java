import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new MultiValueMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Use the modifiable map to perform the write operation
        /* write */ modifiableMap.put("key", "value");

        // Additional complex operations
        Map<String, Integer> counterMap = new HashMap<>();
        counterMap.put("count", 0);

        for (int i = 0; i < 10; i++) {
            counterMap.put("count", counterMap.get("count") + 1);
        }

        // Another MultiValuedMap operation
        MultiValuedMap<String, Integer> numberMap = new MultiValueMap<>();
        for (int i = 0; i < 5; i++) {
            numberMap.put("numbers", i);
        }

        // Perform some calculations
        int sum = 0;
        for (Integer number : numberMap.get("numbers")) {
            sum += number;
        }

        // Output the result of the calculations
        System.out.println("Sum of numbers: " + sum);

        // Read the value using the unmodifiable map
        /* read */ String value = unmodifiableMap.get("key").iterator().next();

        // Print the value
        System.out.println("Read value: " + value);

        // Output the final count
        System.out.println("Final count: " + counterMap.get("count"));
    }
}