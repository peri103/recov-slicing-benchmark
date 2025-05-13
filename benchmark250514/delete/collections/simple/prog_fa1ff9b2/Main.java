import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        // Create a modifiable MultiValuedMap
        MultiValuedMap<String, Integer> modifiableMap = new MultiValueMap<>();

        // Wrap it with an UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, Integer> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Since UnmodifiableMultiValuedMap does not allow direct modifications, we modify the underlying map
        modifiableMap.put("key", 42);  // /* write */

        // Read the value using the UnmodifiableMultiValuedMap
        Integer value = map.get("key").iterator().next();  // /* read */

        System.out.println(value);
    }
}