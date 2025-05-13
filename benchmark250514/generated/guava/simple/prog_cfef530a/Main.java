import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        // Using ImmutableSetMultimap to store key-value pairs
        /* write */ ImmutableSetMultimap<String, Integer> multimap = ImmutableSetMultimap.of("key1", 1, "key2", 2, "key1", 3);
        
        // Reading values associated with a key
        /* read */ ImmutableSet<Integer> values = multimap.get("key1");
        
        // Printing the values to ensure the read method works correctly
        System.out.println(values);
    }
}