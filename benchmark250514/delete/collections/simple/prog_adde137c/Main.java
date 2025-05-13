import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new MultiValueMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Use the modifiable map to perform the write operation
        /* write */ modifiableMap.put("key", "value");

        // Read the value using the unmodifiable map
        /* read */ String value = unmodifiableMap.get("key").iterator().next();

        // Print the value
        System.out.println(value);
    }
}