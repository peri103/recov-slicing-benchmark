import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Original map and unmodifiable wrapper
        MultiValuedMap<String, Integer> originalMap = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> map = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(originalMap);

        // Additional map operations
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        simpleMap.put("C", "Cherry");

        // Iterate over the simple map and print entries
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Perform some calculations
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 natural numbers: " + sum);

        // Write operation on the original multi-valued map
        /* write */ originalMap.put("key", 42); // The write operation should be done on the original map

        // More complex operations
        Set<String> keys = simpleMap.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        // Perform a task with a loop
        for (int i = 0; i < 3; i++) {
            System.out.println("Loop iteration: " + i);
        }

        // Read operation from the unmodifiable multi-valued map
        /* read */ Integer value = map.get("key").iterator().next(); // Retrieve the value from the unmodifiable map
        System.out.println("Read value from multi-valued map: " + value);

        // Additional logic to manipulate data
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("One", 1);
        numberMap.put("Two", 2);
        numberMap.put("Three", 3);

        // Print values from the number map
        for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}