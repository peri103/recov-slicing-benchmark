import com.google.common.collect.ArrayListMultimap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayListMultimap
        ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        
        // Write a value to the multimap
        /* write */ multimap.put("key1", 100);
        
        // Read the value from the multimap
        /* read */ List<Integer> values = multimap.get("key1");
        
        // Print the value to verify it was read correctly
        System.out.println(values.get(0));
    }
}