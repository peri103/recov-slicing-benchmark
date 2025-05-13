import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap the modifiable map in an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Since UnmodifiableMultiValuedMap does not allow modification, we directly modify the original map
        modifiableMap.put("key", "value"); // /* write */
        
        // Read from the UnmodifiableMultiValuedMap
        Collection<String> values = map.get("key"); // /* read */
        
        // Print the read values
        for (String value : values) {
            System.out.println(value);
        }
    }
}