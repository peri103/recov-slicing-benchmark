import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiValuedMap using ArrayListValuedHashMap which extends AbstractMultiValuedMap
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        
        // Write a value into the map
        /* write */ map.put("key", 42);
        
        // Read the value from the map
        /* read */ Integer value = map.get("key").iterator().next();
        
        // Print the value to ensure it was read correctly
        System.out.println(value);
    }
}