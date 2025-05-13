import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize predicates for PredicatedMultiValuedMap
        Predicate<Object> keyPredicate = key -> key instanceof String;
        Predicate<Object> valuePredicate = value -> value instanceof Integer;
        
        // Create a PredicatedMultiValuedMap with String keys and Integer values
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(),
            keyPredicate,
            valuePredicate
        );

        // Initialize a regular HashMap
        Map<String, String> regularMap = new HashMap<>();
        regularMap.put("A", "Apple");
        regularMap.put("B", "Banana");

        // Perform some operations on the regular HashMap
        for (Map.Entry<String, String> entry : regularMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Write a value to the PredicatedMultiValuedMap
        /* write */ map.put("key", 42);

        // Perform additional operations on the PredicatedMultiValuedMap
        map.put("anotherKey", 100);
        map.put("key", 50);

        // Manipulate the data in the PredicatedMultiValuedMap
        for (String key : map.keySet()) {
            System.out.println("Values for key '" + key + "': " + map.get(key));
        }

        // Read the value from the PredicatedMultiValuedMap
        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println("Read value: " + value);

        // Perform some additional unrelated operations
        int sum = 0;
        for (Integer val : map.get("key")) {
            sum += val;
        }
        System.out.println("Sum of values for 'key': " + sum);

        // Further manipulation of unrelated data
        int product = 1;
        for (Integer val : map.get("anotherKey")) {
            product *= val;
        }
        System.out.println("Product of values for 'anotherKey': " + product);
    }
}