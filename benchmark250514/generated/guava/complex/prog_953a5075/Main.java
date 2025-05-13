import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the ForwardingMultimap with an ArrayListMultimap
        ForwardingMultimap<String, Integer> multimap = new ForwardingMultimap<String, Integer>() {
            private final Multimap<String, Integer> delegate = ArrayListMultimap.create();

            @Override
            protected Multimap<String, Integer> delegate() {
                return delegate;
            }
        };

        // Use the write method to add a value
        /* write */ multimap.put("key", 42);

        // Additional unrelated code
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("numbers", List.of(1, 2, 3, 4, 5));
        
        int sum = 0;
        for (int num : map.get("numbers")) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More complex operations
        Multimap<String, String> stringMultimap = ArrayListMultimap.create();
        stringMultimap.put("fruit", "apple");
        stringMultimap.put("fruit", "banana");
        stringMultimap.put("fruit", "cherry");

        for (String fruit : stringMultimap.get("fruit")) {
            System.out.println("Fruit: " + fruit);
        }

        // Use the read method to retrieve the value
        /* read */ Integer value = multimap.get("key").iterator().next();

        // Print the value
        System.out.println("Read value: " + value);

        // Further complexity with calculations
        int product = 1;
        for (int num : map.get("numbers")) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }
}