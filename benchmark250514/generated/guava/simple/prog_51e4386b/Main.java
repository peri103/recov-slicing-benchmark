import com.google.common.collect.ListMultimap;
import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ListMultimap instance
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();

        // Write a value to the multimap
        /* write */ multimap.put("key1", 42);

        // Read the value from the multimap
        /* read */ Integer value = multimap.get("key1").get(0);

        // Print the read value
        System.out.println(value);
    }
}