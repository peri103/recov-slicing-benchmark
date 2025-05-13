import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayListValuedHashMap
        ArrayListValuedHashMap<String, Integer> map = new ArrayListValuedHashMap<>();

        // Use the write method to insert a value into the map
        /* write */ map.put("key", 42);

        // Use the read method to retrieve the value associated with the key
        /* read */ Integer value = map.get("key").iterator().next();

        // Print the retrieved value
        System.out.println(value);
    }
}