import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the underlying MultiValuedMap
        MultiValuedMap<String, String> baseMap = new ArrayListValuedHashMap<>();
        
        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(baseMap);

        // Since UnmodifiableMultiValuedMap does not allow direct modifications,
        // we need to modify the base map first before wrapping it.
        /* write */ baseMap.put("key", "value");

        // Read the value using the UnmodifiableMultiValuedMap
        /* read */ String value = map.get("key").iterator().next();

        // Print the value
        System.out.println(value);
    }
}