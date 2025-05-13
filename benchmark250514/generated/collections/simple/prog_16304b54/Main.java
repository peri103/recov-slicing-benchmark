import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap it with an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> unmodifiableMap = UnmodifiableMultiValuedMap.unmodifiableMultiValuedMap(modifiableMap);
        
        // Since UnmodifiableMultiValuedMap does not allow direct modifications, we modify the underlying map
        /* write */ modifiableMap.put("key", "value");
        
        // Now read from the unmodifiable map
        /* read */ String value = unmodifiableMap.get("key").iterator().next();
        
        System.out.println(value);
    }
}