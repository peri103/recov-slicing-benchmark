import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.TransformedMultiValuedMap;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a LinkedMap to use as the base map for the TransformedMultiValuedMap
        LinkedMap<String, Integer> baseMap = new LinkedMap<>();
        
        // Create a TransformedMultiValuedMap without any transformation
        MultiValuedMap<String, Integer> multiValuedMap = TransformedMultiValuedMap.transformedMap(baseMap, null, null);
        
        /* write */ multiValuedMap.put("key", 42);

        // Unrelated code to make the program more complex
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "Alice");
        simpleMap.put("occupation", "Engineer");

        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Additional MultiValuedMap operations
        multiValuedMap.put("key", 100);
        multiValuedMap.put("anotherKey", 200);
        
        // Iterate over the keys and values in the MultiValuedMap
        for (String key : multiValuedMap.keySet()) {
            Collection<Integer> values = multiValuedMap.get(key);
            System.out.println("Values for key " + key + ": " + values);
        }

        // More unrelated code
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 5: " + sum);

        /* read */ Collection<Integer> values = multiValuedMap.get("key");
        
        // Print the values to ensure the read method reads the value written by the write method
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}