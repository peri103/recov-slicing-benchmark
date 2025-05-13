import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, Integer> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap the modifiable map with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Since UnmodifiableMultiValuedMap does not allow direct modification,
        // we will modify the original modifiable map
        /* write */ modifiableMap.put("key", 42);
        
        // Read the value using the unmodifiable map
        /* read */ Collection<Integer> values = unmodifiableMap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}