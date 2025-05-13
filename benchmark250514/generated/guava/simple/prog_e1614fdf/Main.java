import com.google.common.collect.ImmutableSetMultimap;
import com.google.common.collect.ImmutableSet;

public class Main {
    public static void main(String[] args) {
        // Write operation
        /* write */ ImmutableSetMultimap<String, Integer> multimap = ImmutableSetMultimap.of("key", 1);

        // Read operation
        /* read */ ImmutableSet<Integer> values = multimap.get("key");
        
        // Output the values
        System.out.println(values);
    }
}