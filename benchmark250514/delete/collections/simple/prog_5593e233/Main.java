import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap it in an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Since UnmodifiableMultiValuedMap does not allow direct modification,
        // we need to modify the underlying modifiable map
        /* write */ modifiableMap.put("key", "value");
        
        // Access the value using the unmodifiable map
        /* read */ String value = map.get("key").iterator().next();
        
        System.out.println(value);
    }
}