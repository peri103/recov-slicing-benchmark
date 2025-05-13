import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the multi-valued map
        AbstractMultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        
        // Write a value to the map
        /* write */ map.put("key", 42);
        
        // Read the value from the map
        /* read */ Integer value = map.get("key").iterator().next();
        
        // Print the value
        System.out.println(value);
    }
}