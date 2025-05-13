import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.map.DualHashBidiMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using a concrete implementation
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();

        // Write a value into the map
        /* write */ map.put("key1", 123);

        // Read the value from the map
        /* read */ Integer value = map.get("key1");

        // Output the value
        System.out.println(value);
    }
}