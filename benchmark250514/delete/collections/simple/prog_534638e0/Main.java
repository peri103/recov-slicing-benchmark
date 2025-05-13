import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Perform write operation on the modifiable map
        modifiableMap.put("key", 42); // This line is executed only once

        // Perform read operation on the unmodifiable map
        Collection<Integer> values = map.get("key"); // This line is executed only once

        // Output the result
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}