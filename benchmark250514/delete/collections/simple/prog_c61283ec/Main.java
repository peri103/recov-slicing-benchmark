import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new MultiValueMap<>();
        
        // Wrap it in an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Since UnmodifiableMultiValuedMap does not allow direct modification, we use the modifiable map to write
        /* write */ modifiableMap.put("key", "value");
        
        // Read from the UnmodifiableMultiValuedMap
        /* read */ String value = map.get("key").iterator().next();
        
        // Print the read value
        System.out.println(value);
    }
}