import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying MultiValuedMap
        MultiValuedMap<String, String> baseMap = new ArrayListValuedHashMap<>();
        
        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(baseMap);

        // Additional unrelated map operations
        Map<String, Integer> unrelatedMap = new HashMap<>();
        unrelatedMap.put("A", 10);
        unrelatedMap.put("B", 20);
        int sum = 0;
        for (Map.Entry<String, Integer> entry : unrelatedMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in unrelatedMap: " + sum);

        // Perform unrelated operations with baseMap
        baseMap.put("unrelatedKey", "unrelatedValue");
        System.out.println("Base map size after unrelated operation: " + baseMap.size());

        // Original write operation
        /* write */ baseMap.put("key", "value");

        // Add more unrelated operations
        MultiValuedMap<String, Integer> intMap = new ArrayListValuedHashMap<>();
        intMap.put("numbers", 1);
        intMap.put("numbers", 2);
        intMap.put("numbers", 3);
        System.out.println("Values in intMap for 'numbers': " + intMap.get("numbers"));

        // Perform operations with unrelatedMap
        unrelatedMap.put("C", 30);
        unrelatedMap.remove("A");
        System.out.println("Updated unrelatedMap: " + unrelatedMap);

        // Read the value using the UnmodifiableMultiValuedMap
        /* read */ String value = map.get("key").iterator().next();

        // Print the value
        System.out.println(value);

        // Additional unrelated operations after the read
        baseMap.put("anotherKey", "anotherValue");
        System.out.println("Base map size after additional operation: " + baseMap.size());
    }
}