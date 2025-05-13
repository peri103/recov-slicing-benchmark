import com.google.common.collect.LinkedHashMultimap;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Initialize the LinkedHashMultimap
        LinkedHashMultimap<String, Integer> multimap = LinkedHashMultimap.create();

        // Use the write method to add a key-value pair
        /* write */ multimap.put("key1", 100);

        // Use the read method to get the value associated with the key
        /* read */ Set<Integer> values = multimap.get("key1");

        // Print the values to verify the correct value is read
        System.out.println(values);
    }
}