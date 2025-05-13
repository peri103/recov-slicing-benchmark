import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying map
        MultiValuedMap<String, Integer> underlyingMap = new MultiValueMap<>();
        
        // Create a TransformedMultiValuedMap with identity transformers (no transformation)
        TransformedMultiValuedMap<String, Integer> transformedMap = TransformedMultiValuedMap.transformingMap(
            underlyingMap, 
            input -> input, // key transformer
            input -> input  // value transformer
        );

        /* write */ transformedMap.put("key", 42);
        
        // More complex operations
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "Alice");
        simpleMap.put("age", "30");

        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        MultiValuedMap<String, String> multiValuedMap = new MultiValueMap<>();
        multiValuedMap.put("fruits", "apple");
        multiValuedMap.put("fruits", "banana");
        multiValuedMap.put("fruits", "orange");

        for (String fruit : multiValuedMap.get("fruits")) {
            System.out.println("Fruit: " + fruit);
        }

        // Additional logic
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        /* read */ Integer value = transformedMap.get("key").iterator().next();
        
        System.out.println(value);
        
        // More unrelated code
        Map<Integer, String> numberMap = new HashMap<>();
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");

        for (Map.Entry<Integer, String> entry : numberMap.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue());
        }
    }
}