import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = HashMultimap.create();
        ForwardingMultimap<String, Integer> forwardingMultimap = new ForwardingMultimap<String, Integer>() {
            @Override
            protected Multimap<String, Integer> delegate() {
                return multimap;
            }
        };

        /* write */ forwardingMultimap.put("key", 42);
        /* read */ Integer value = forwardingMultimap.get("key").iterator().next();
        System.out.println(value);
    }
}