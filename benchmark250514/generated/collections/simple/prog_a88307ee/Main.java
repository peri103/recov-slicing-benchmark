import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap instance
        AbstractReferenceMap<Integer, String> map = new ReferenceMap<>(AbstractReferenceMap.ReferenceStrength.SOFT, AbstractReferenceMap.ReferenceStrength.SOFT);
        
        // Write operation: put a value into the map
        /* write */ map.put(1, "Hello, World!");
        
        // Read operation: get the value from the map
        /* read */ String value = map.get(1);
        
        // Output the read value
        System.out.println(value);
    }
}