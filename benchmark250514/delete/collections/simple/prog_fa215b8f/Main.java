import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap first
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Use the modifiable map to perform write operations
        modifiableMap.put("key", "value"); // /* write */

        // Read from the unmodifiable map
        Collection<String> values = unmodifiableMap.get("key"); // /* read */
        
        // Output the value
        for (String value : values) {
            System.out.println(value);
        }
    }
}