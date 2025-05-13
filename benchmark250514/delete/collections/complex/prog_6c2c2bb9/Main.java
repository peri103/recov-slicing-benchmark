import org.apache.commons.collections4.map.UnmodifiableMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable map
        Map<String, Integer> modifiableMap = new HashMap<>();

        // Wrap the modifiable map with UnmodifiableMap
        UnmodifiableMap<String, Integer> map = UnmodifiableMap.unmodifiableMap(modifiableMap);

        // Since UnmodifiableMap does not allow direct modification,
        // we modify the underlying modifiable map directly
        modifiableMap.put("key", 42); // Equivalent to /* write */

        // Create a list and populate it with some values
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Shuffle the list to introduce complexity
        Collections.shuffle(list);

        // Print the shuffled list
        System.out.println("Shuffled list: " + list);

        // Perform some calculations on the list
        int sum = 0;
        for (int num : list) {
            sum += num;
        }
        System.out.println("Sum of list elements: " + sum);

        // Read the value using the unmodifiable map
        Integer value = map.get("key"); // Equivalent to /* read */

        // Print the value retrieved from the map
        System.out.println("Value from map: " + value);

        // Create another map and perform operations
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "world");
        stringMap.put("foo", "bar");

        // Print the entries of the string map
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Perform a simple transformation on the map values
        Map<String, String> transformedMap = new HashMap<>();
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            transformedMap.put(entry.getKey(), entry.getValue().toUpperCase());
        }

        // Print the transformed map
        System.out.println("Transformed map: " + transformedMap);
    }
}