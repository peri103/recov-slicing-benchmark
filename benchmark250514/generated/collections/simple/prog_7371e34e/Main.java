import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a MultiValuedMap using a HashSetValuedHashMap
        MultiValuedMap<String, String> map = new HashSetValuedHashMap<>();

        // Use the write method
        /* write */ map.put("key", "value");

        // Use the read method
        /* read */ String value = map.get("key").iterator().next();

        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}