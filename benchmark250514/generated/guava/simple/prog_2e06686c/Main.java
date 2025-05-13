import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayListMultimap instance
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();

        // Use the write method to put a value into the multimap
        /* write */ multimap.put("key", 42);

        // Use the read method to retrieve the value from the multimap
        /* read */ Integer value = multimap.get("key").get(0);

        // Print the retrieved value to ensure correctness
        System.out.println(value);
    }
}