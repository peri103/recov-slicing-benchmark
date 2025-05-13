import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap
        MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Use the modifiable map to perform write operation
        /* write */ modifiableMap.put("key", 42);
        
        // Read the value using the unmodifiable map
        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        
        // Output the value
        System.out.println(value);
    }
}