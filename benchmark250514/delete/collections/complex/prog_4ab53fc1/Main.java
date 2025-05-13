import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(map);

        // Additional code to make the program more complex
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");

        // Perform operations on simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        /* write */ map.put("key1", 10);

        // More operations on the MultiValuedMap
        map.put("key2", 20);
        map.put("key2", 30);

        // Iterate over values associated with "key2"
        for (Integer value : map.get("key2")) {
            System.out.println("Value for key2: " + value);
        }

        // Perform some calculations
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        System.out.println("Sum of all values: " + sum);

        /* read */ Integer value = unmodifiableMap.get("key1").iterator().next();
        System.out.println(value);

        // Further operations, like removing entries
        map.remove("key2", 20);

        // Print remaining values for "key2"
        for (Integer remainingValue : map.get("key2")) {
            System.out.println("Remaining value for key2: " + remainingValue);
        }
    }
}