import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMultimap instance as a concrete implementation of ForwardingMultimap
        ForwardingMultimap<String, Integer> multimap = new ForwardingMultimap<String, Integer>() {
            private final HashMultimap<String, Integer> delegate = HashMultimap.create();

            @Override
            protected HashMultimap<String, Integer> delegate() {
                return delegate;
            }
        };

        // Additional Multimap operations for complexity
        Multimap<String, String> stringMultimap = HashMultimap.create();
        stringMultimap.put("fruit", "apple");
        stringMultimap.put("fruit", "banana");

        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "John");
        simpleMap.put("city", "New York");

        // Write operation: put a value into the ForwardingMultimap
        /* write */ multimap.put("key1", 100);

        // Perform operations on simpleMap
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform operations on stringMultimap
        Collection<String> fruits = stringMultimap.get("fruit");
        System.out.println("Fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Read operation: get the value from the ForwardingMultimap
        /* read */ Collection<Integer> values = multimap.get("key1");

        // Print the values retrieved
        for (Integer value : values) {
            System.out.println("Retrieved value from multimap: " + value);
        }

        // Additional logic to increase complexity
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        System.out.println("Sum of values: " + sum);
    }
}