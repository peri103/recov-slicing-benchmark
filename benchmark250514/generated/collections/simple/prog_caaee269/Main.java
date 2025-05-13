import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiValuedMap
        MultiValuedMap<String, Integer> map = new HashSetValuedHashMap<>();

        // Use the write method to put a value into the map
        /* write */ map.put("key", 42);

        // Use the read method to get the value from the map
        /* read */ Integer value = map.get("key").iterator().next();

        // Print the value to ensure it's read correctly
        System.out.println(value);
    }
}