import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, String> multiValuedMap = new MultiValueMap<>();
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(multiValuedMap);

        // Additional map usage
        Map<String, Integer> additionalMap = new HashMap<>();
        additionalMap.put("additionalKey", 42);
        additionalMap.put("anotherKey", 84);

        // Iterate over additionalMap
        for (Map.Entry<String, Integer> entry : additionalMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Original write operation
        /* write */ multiValuedMap.put("key", "value");

        // Perform some operations before reading
        multiValuedMap.put("anotherKey", "anotherValue");
        multiValuedMap.put("key", "secondValue");
        
        // Use additionalMap again
        int additionalValue = additionalMap.get("additionalKey");
        System.out.println("Retrieved from additionalMap: " + additionalValue);

        // Original read operation
        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        System.out.println(value);

        // Further operations on multiValuedMap
        System.out.println("All values for 'key': " + unmodifiableMap.get("key"));
        System.out.println("All values for 'anotherKey': " + unmodifiableMap.get("anotherKey"));
    }
}