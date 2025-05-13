import org.apache.commons.collections4.multimap.TreeValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the TreeValuedHashMap
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();

        // Write a value into the map
        /* write */ map.put("key1", 42);

        // Read the value back from the map
        /* read */ Integer value = map.get("key1").iterator().next();

        // Print the value to verify correctness
        System.out.println(value);
    }
}