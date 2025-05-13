import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map
        AbstractHashedMap<String, Integer> map = new HashedMap<>();

        // Write to the map
        /* write */ map.put("key", 100);

        // Read from the map
        /* read */ Integer value = map.get("key");

        // Output the value
        System.out.println(value);
    }
}