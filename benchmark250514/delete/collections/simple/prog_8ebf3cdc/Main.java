import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying map that will be wrapped by UnmodifiableMultiValuedMap
        MultiValuedMap<String, String> baseMap = new ArrayListValuedHashMap<>();
        
        // Wrap the base map with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = new UnmodifiableMultiValuedMap<>(baseMap);
        
        // Since UnmodifiableMultiValuedMap does not allow direct modification, we modify the base map
        /* write */ baseMap.put("key", "value");
        
        // Read the value using the UnmodifiableMultiValuedMap
        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        
        // Print the value to confirm it matches what was written
        System.out.println(value);
    }
}