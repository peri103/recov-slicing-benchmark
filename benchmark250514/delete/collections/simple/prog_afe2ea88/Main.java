import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        // Create a MultiValuedMap instance
        MultiValuedMap<String, Integer> multiValuedMap = new MultiValueMap<>();
        
        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(multiValuedMap);

        // Since UnmodifiableMultiValuedMap does not allow modification, we need to directly use the original map to put values
        multiValuedMap.put("key1", 100);  // /* write */

        // Read the value from the unmodifiable map
        Integer value = unmodifiableMap.get("key1").iterator().next();  // /* read */

        System.out.println(value);
    }
}