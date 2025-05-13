import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.UnmodifiableMultiValuedMap;
import org.apache.commons.collections4.map.MultiValueMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a MultiValuedMap and wrap it with UnmodifiableMultiValuedMap
        MultiValuedMap<String, Integer> multiValuedMap = new MultiValueMap<>();
        UnmodifiableMultiValuedMap<String, Integer> unmodifiableMap = new UnmodifiableMultiValuedMap<>(multiValuedMap);

        // Insert a value into the map
        /* write */ multiValuedMap.put("key", 42);

        // Read the value from the map
        /* read */ Integer value = unmodifiableMap.get("key").iterator().next();
        System.out.println(value);
    }
}