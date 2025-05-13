import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying map that will be wrapped by UnmodifiableMultiValuedMap
        MultiValuedMap<String, String> baseMap = new ArrayListValuedHashMap<>();
        
        // Wrap the base map with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(baseMap);
        
        // Since UnmodifiableMultiValuedMap does not allow direct modification, we modify the base map
        /* write */ baseMap.put("key", "value");
        
        // Additional code to increase complexity
        MultiValuedMap<String, Integer> anotherMap = new ArrayListValuedHashMap<>();
        anotherMap.put("numbers", 1);
        anotherMap.put("numbers", 2);
        anotherMap.put("numbers", 3);
        
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("one", 1);
        simpleMap.put("two", 2);
        simpleMap.put("three", 3);
        
        for (String key : simpleMap.keySet()) {
            int value = simpleMap.get(key);
            System.out.println("SimpleMap - Key: " + key + ", Value: " + value);
        }
        
        for (String key : anotherMap.keySet()) {
            for (Integer num : anotherMap.get(key)) {
                System.out.println("AnotherMap - Key: " + key + ", Value: " + num);
            }
        }
        
        // Read the value using the UnmodifiableMultiValuedMap
        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        
        // Print the value to confirm it matches what was written
        System.out.println("UnmodifiableMap - Key: 'key', Value: " + value);
        
        // More complex operations
        for (int i = 0; i < 5; i++) {
            baseMap.put("loopKey", "loopValue" + i);
        }
        
        System.out.println("Iterating over loopKey values:");
        for (String val : unmodifiableMap.get("loopKey")) {
            System.out.println(val);
        }
    }
}