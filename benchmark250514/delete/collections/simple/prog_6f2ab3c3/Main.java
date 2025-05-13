import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap to use for initialization
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();
        
        // Wrap the modifiable map with an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);
        
        // Write operation (executed only once)
        modifiableMap.put("key", "value"); // Use the modifiable map to add entries
        
        // Read operation (executed only once)
        String value = map.get("key").iterator().next(); // Get the value associated with the key
        
        System.out.println(value);
    }
}