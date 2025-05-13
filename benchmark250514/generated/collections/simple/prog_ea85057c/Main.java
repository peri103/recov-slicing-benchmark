import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap with reference type for both keys and values
        AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.HARD, AbstractReferenceMap.ReferenceStrength.HARD);
        
        // Use the write method to put a value into the map
        /* write */ map.put("key", 42);
        
        // Use the read method to get the value from the map
        /* read */ Integer value = map.get("key");
        
        // Print the value to ensure the write and read operations were successful
        System.out.println(value);
    }
}