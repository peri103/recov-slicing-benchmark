import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.map.HashedMap;

import java.util.Collection;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Define predicates for the keys and values
        Predicate<String> keyPredicate = key -> key != null;
        Predicate<Integer> valuePredicate = value -> value >= 0;

        // Create a PredicatedMultiValuedMap
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
                new ArrayListValuedHashMap<>(),
                keyPredicate,
                valuePredicate
        );

        // Write to the map
        /* write */ map.put("key1", 100);

        // Create another map with a different predicate setup
        Predicate<String> keyPredicate2 = key -> key.length() > 2;
        Predicate<String> valuePredicate2 = value -> value.startsWith("A");

        Map<String, String> baseMap = new HashedMap<>();
        Map<String, String> predicatedMap = PredicatedMap.predicatedMap(baseMap, keyPredicate2, valuePredicate2);

        // Add entries to the predicated map
        predicatedMap.put("key2", "Apple");
        predicatedMap.put("key3", "Avocado");

        // Perform operations on the predicated map
        for (Map.Entry<String, String> entry : predicatedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Perform some operations on the original map
        map.put("key2", 200);
        map.put("key3", 300);

        // Some unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);

        // Read from the original map
        /* read */ Integer value = map.get("key1").iterator().next();

        // Output the value
        System.out.println("Value for 'key1': " + value);

        // Additional operations
        Collection<Integer> values = map.get("key2");
        for (Integer val : values) {
            System.out.println("Value for 'key2': " + val);
        }
    }
}