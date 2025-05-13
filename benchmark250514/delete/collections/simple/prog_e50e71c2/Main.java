import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a modifiable MultiValuedMap
        MultiValuedMap<String, String> modifiableMap = new ArrayListValuedHashMap<>();

        // Wrap it with UnmodifiableMultiValuedMap
        UnmodifiableMultiValuedMap<String, String> map = new UnmodifiableMultiValuedMap<>(modifiableMap);

        // Since UnmodifiableMultiValuedMap does not allow modifications directly,
        // we will modify the underlying modifiable map.
        modifiableMap.put("key", "value"); // This is effectively the write operation

        // Now read from the UnmodifiableMultiValuedMap
        /* read */ System.out.println(map.get("key"));
    }
}