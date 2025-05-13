import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ForwardingMultimap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ForwardingMultimap<String, Integer> multimap = new ForwardingMultimap<String, Integer>() {
            private final ArrayListMultimap<String, Integer> delegate = ArrayListMultimap.create();

            @Override
            protected ArrayListMultimap<String, Integer> delegate() {
                return delegate;
            }
        };

        // Another map to store additional information
        Map<String, String> infoMap = new HashMap<>();
        infoMap.put("description", "This is a test multimap");

        // Some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Adding more elements to the multimap
        multimap.put("key", 100);
        multimap.put("key", 200);
        multimap.put("anotherKey", 300);

        // Operations on infoMap
        if (infoMap.containsKey("description")) {
            System.out.println(infoMap.get("description"));
        }

        /* write */ multimap.put("key", 42);

        // More complex operations
        Map<String, Collection<Integer>> allValues = new HashMap<>();
        allValues.put("key", multimap.get("key"));
        allValues.put("anotherKey", multimap.get("anotherKey"));

        // Processing all values
        for (Map.Entry<String, Collection<Integer>> entry : allValues.entrySet()) {
            System.out.println("Values for " + entry.getKey() + ": " + entry.getValue());
        }

        /* read */ Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }

        // Further processing
        int total = 0;
        for (Integer value : values) {
            total += value;
        }
        System.out.println("Total sum of values for 'key': " + total);
    }
}