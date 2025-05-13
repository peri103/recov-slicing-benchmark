import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;

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

        // Use the read method
        /* read */ Integer value = forwardingMultimap.get("key").iterator().next();

        // Print the value to ensure the read method works correctly
        System.out.println(value);
    }
}