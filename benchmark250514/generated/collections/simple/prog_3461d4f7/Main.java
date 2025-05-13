import org.apache.commons.collections4.multimap.HashSetValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the HashSetValuedHashMap
        HashSetValuedHashMap<String, String> map = new HashSetValuedHashMap<>();

        // Write operation: put a key-value pair into the map
        /* write */ map.put("key1", "value1");

        // Read operation: retrieve the value associated with the key
        /* read */ java.util.Set<String> values = map.get("key1");

        // Print the value to verify correctness
        System.out.println(values);
    }
}