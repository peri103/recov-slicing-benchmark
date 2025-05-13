import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap instance
        AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);

        // Write operation: put a key-value pair into the map
        /* write */ map.put("key", 42);

        // Read operation: get the value associated with the key
        /* read */ Integer value = map.get("key");

        // Print the value to verify the operation
        System.out.println(value);
    }
}