import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Use the modifiable map to perform write operations
        /* write */ modifiableMap.put("key", "value");

        // Read from the unmodifiable map
        /* read */ Collection<String> values = map.get("key");

        // Print the read values
        for (String value : values) {
            System.out.println(value);
        }
    }
}