import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        // Create a ForwardingMultimap instance using ArrayListMultimap as the delegate
        ForwardingMultimap<String, String> map = new ForwardingMultimap<String, String>() {
            private final Multimap<String, String> delegate = ArrayListMultimap.create();

            @Override
            protected Multimap<String, String> delegate() {
                return delegate;
            }
        };

        // Use the put method to add a key-value pair to the map
        /* write */ map.put("key1", "value1");

        // Use the get method to retrieve the value associated with the key
        /* read */ String value = map.get("key1").iterator().next();
        System.out.println(value);
    }
}