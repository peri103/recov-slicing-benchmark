import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the MultiValuedMap
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        
        // Use the write method to put a value into the map
        /* write */ map.put("key", 100);
        
        // Use the read method to get the value from the map
        /* read */ Integer value = map.get("key").iterator().next();
        
        // Print the value to ensure it was correctly read
        System.out.println(value);
    }
}