import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;

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

        // Use the read method to retrieve the value
        /* read */ Integer value = multimap.get("key").iterator().next();

        // Print the value
        System.out.println(value);
    }
}