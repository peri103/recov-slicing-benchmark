import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a transformer that does nothing
        Transformer<Object, Object> transformer = new Transformer<Object, Object>() {
            @Override
            public Object transform(Object input) {
                return input;
            }
        };

        // Initialize the MultiValuedMap
        MultiValuedMap<String, Integer> originalMap = new ArrayListValuedHashMap<>();
        MultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformedMap(originalMap, transformer, transformer);

        // Write a value to the map
        /* write */ transformedMap.put("key", 42);

        // Create a LazyMap with a transformer that doubles the input
        Map<String, Integer> lazyMap = LazyMap.lazyMap(new HashMap<>(), new Transformer<Integer, Integer>() {
            @Override
            public Integer transform(Integer input) {
                return input * 2;
            }
        });

        // Add values to LazyMap
        lazyMap.put("a", 10);
        lazyMap.put("b", 20);

        // Access and print LazyMap values
        System.out.println("LazyMap a: " + lazyMap.get("a")); // Should print 10
        System.out.println("LazyMap c (non-existing, transformed): " + lazyMap.get("c")); // Should print 0 * 2 = 0

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 integers: " + sum);

        // Read the value from the map
        /* read */ Integer value = transformedMap.get("key").iterator().next();

        // Print the value
        System.out.println(value);

        // Additional operations on transformedMap
        transformedMap.put("key", 84);
        transformedMap.put("anotherKey", 100);

        for (String key : transformedMap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + transformedMap.get(key));
        }
    }
}