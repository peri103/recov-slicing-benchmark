import org.apache.commons.collections4.map.AbstractReferenceMap;
import org.apache.commons.collections4.map.ReferenceMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a ReferenceMap instance
        AbstractReferenceMap<Integer, String> map = new ReferenceMap<>();

        // Use the write method to put a key-value pair into the map
        /* write */ map.put(1, "Hello World");

        // Use the read method to get the value associated with the key
        /* read */ String value = map.get(1);

        // Print the value retrieved
        System.out.println(value);
    }
}