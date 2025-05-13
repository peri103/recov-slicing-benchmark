import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        // Initialize a concrete implementation of ForwardingMultimap
        Multimap<String, String> multimap = ArrayListMultimap.create();
        ForwardingMultimap<String, String> forwardingMultimap = new ForwardingMultimap<String, String>() {
            @Override
            protected Multimap<String, String> delegate() {
                return multimap;
            }
        };

        /* write */ forwardingMultimap.put("key", "value");
        /* read */ String value = forwardingMultimap.get("key").iterator().next();
        System.out.println(value);
    }
}