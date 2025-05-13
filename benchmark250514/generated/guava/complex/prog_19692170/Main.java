import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;
import java.util.Collection;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the ForwardingMultimap using ArrayListMultimap
        ForwardingMultimap<String, String> multimap = new ForwardingMultimap<String, String>() {
            private final ArrayListMultimap<String, String> delegate = ArrayListMultimap.create();

            @Override
            protected ArrayListMultimap<String, String> delegate() {
                return delegate;
            }
        };

        // Initialize another multimap using HashMultimap
        ForwardingMultimap<String, Integer> multimap2 = new ForwardingMultimap<String, Integer>() {
            private final HashMultimap<String, Integer> delegate = HashMultimap.create();

            @Override
            protected HashMultimap<String, Integer> delegate() {
                return delegate;
            }
        };

        // Use multimap2 to store some values
        multimap2.put("numbers", 1);
        multimap2.put("numbers", 2);
        multimap2.put("numbers", 3);

        // Iterate over multimap2 values and print them
        Collection<Integer> numberValues = multimap2.get("numbers");
        for (Integer number : numberValues) {
            System.out.println("Number: " + number);
        }

        /* write */
        multimap.put("key", "value");

        // Add some unrelated complex operations
        Map<String, Collection<Integer>> mapView = multimap2.asMap();
        for (Map.Entry<String, Collection<Integer>> entry : mapView.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue());
        }

        // Perform operations on multimap to make it more complex
        multimap.put("anotherKey", "anotherValue");
        multimap.put("key", "anotherValue");

        // More complex operations
        if (multimap.containsKey("anotherKey")) {
            System.out.println("Multimap contains 'anotherKey'");
        }

        /* read */
        Collection<String> values = multimap.get("key");
        System.out.println(values);

        // Additional complex operations
        if (multimap.containsEntry("key", "value")) {
            System.out.println("'key' contains 'value'");
        }

        // Print all keys and values from multimap
        for (String key : multimap.keySet()) {
            System.out.println("Key: " + key + ", Values: " + multimap.get(key));
        }
    }
}