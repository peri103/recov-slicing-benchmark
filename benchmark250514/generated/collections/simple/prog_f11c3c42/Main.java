import org.apache.commons.collections4.map.ReferenceMap;
import org.apache.commons.collections4.map.AbstractReferenceMap.ReferenceStrength;

public class Main {
    public static void main(String[] args) {
        // Create a ReferenceMap with weak keys and strong values
        ReferenceMap<String, Integer> map = new ReferenceMap<>(ReferenceStrength.WEAK, ReferenceStrength.HARD);

        // Use the put method to write a value to the map
        /* write */ map.put("key", 42);

        // Use the get method to read the value from the map
        /* read */ Integer value = map.get("key");

        // Print the value to verify it was read correctly
        System.out.println(value);
    }
}