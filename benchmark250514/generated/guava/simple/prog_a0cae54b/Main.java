import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.HashMultimap;
import java.util.Collection;

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

        // Write operation: put a value into the ForwardingMultimap
        /* write */ multimap.put("key1", 100);

        // Read operation: get the value from the ForwardingMultimap
        /* read */ Collection<Integer> values = multimap.get("key1");

        // Print the values retrieved
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}