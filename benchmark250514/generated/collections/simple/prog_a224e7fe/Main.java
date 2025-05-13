import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap with weak keys and weak values
        AbstractReferenceMap<String, Integer> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.WEAK, AbstractReferenceMap.ReferenceStrength.WEAK);
        
        // Write a value into the map
        /* write */ map.put("key", 42);
        
        // Read the value from the map
        /* read */ Integer value = map.get("key");
        
        // Print the value
        System.out.println(value);
    }
}