import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a transformer that does not change the value (identity transformation)
        Transformer<String, String> transformer = new Transformer<String, String>() {
            @Override
            public String transform(String input) {
                return input;
            }
        };

        // Create the underlying map
        MultiValuedMap<String, String> originalMap = new ArrayListValuedHashMap<>();

        // Create the transformed map
        TransformedMultiValuedMap<String, String> transformedMap = TransformedMultiValuedMap.transformedMap(originalMap, transformer, transformer);

        // Use the write method
        /* write */ transformedMap.put("key", "value");

        // Create a regular map and perform some operations
        Map<String, Integer> regularMap = new HashMap<>();
        regularMap.put("one", 1);
        regularMap.put("two", 2);
        regularMap.put("three", 3);

        // Perform some computations
        int sum = 0;
        for (Integer value : regularMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in regularMap: " + sum);

        // Perform additional operations on transformedMap
        transformedMap.put("anotherKey", "anotherValue");
        transformedMap.put("key", "anotherValue");
        
        // Access the transformedMap using read method
        /* read */ String value = transformedMap.get("key").iterator().next();
        
        // Output the value
        System.out.println("Value from transformedMap: " + value);

        // Perform operations on the regular map
        regularMap.put("four", 4);
        regularMap.remove("two");

        // Output the contents of the regular map
        System.out.println("Contents of regularMap:");
        for (Map.Entry<String, Integer> entry : regularMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}