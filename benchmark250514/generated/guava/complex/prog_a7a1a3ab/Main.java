import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of a ForwardingMultimap using ArrayListMultimap as the delegate
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        ForwardingMultimap<String, Integer> forwardingMultimap = new ForwardingMultimap<String, Integer>() {
            @Override
            protected Multimap<String, Integer> delegate() {
                return multimap;
            }
        };

        // Use the write method
        /* write */ forwardingMultimap.put("key", 42);

        // Additional complex logic
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("alpha", 1);
        hashMap.put("beta", 2);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("HashMap Entry: " + entry.getKey() + " = " + entry.getValue());
        }

        // Perform some operations on the multimap
        forwardingMultimap.put("key", 43);
        forwardingMultimap.put("gamma", 44);

        // More complex logic
        int sum = 0;
        for (Integer value : forwardingMultimap.get("key")) {
            sum += value;
        }
        System.out.println("Sum of values for 'key': " + sum);

        // Use the read method
        /* read */ Integer value = forwardingMultimap.get("key").iterator().next();

        // Print the value to ensure the read method works correctly
        System.out.println("Read value: " + value);

        // Additional multimap operations
        forwardingMultimap.put("delta", 45);
        System.out.println("Values for 'gamma': " + forwardingMultimap.get("gamma"));
    }
}