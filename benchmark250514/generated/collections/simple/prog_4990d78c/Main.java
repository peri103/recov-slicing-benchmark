import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using HashedMap which is a concrete implementation of AbstractHashedMap
        AbstractHashedMap<String, Integer> map = new HashedMap<>();

        // Write a value into the map
        /* write */ map.put("key", 42);

        // Read the value from the map
        /* read */ int value = map.get("key");

        // Print the value to ensure it was correctly written and read
        System.out.println(value);
    }
}