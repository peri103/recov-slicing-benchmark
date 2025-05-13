import com.google.common.collect.ListMultimap;
import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        // Initialize the ListMultimap
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();

        // Write a value into the multimap
        /* write */ multimap.put("key", 42);

        // Read the value from the multimap
        /* read */ Integer value = multimap.get("key").get(0);

        // Print the value to verify
        System.out.println(value);
    }
}