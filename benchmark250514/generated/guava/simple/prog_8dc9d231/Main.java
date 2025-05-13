import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        ForwardingMultimap<String, Integer> forwardingMultimap = new ForwardingMultimap<String, Integer>() {
            @Override
            protected Multimap<String, Integer> delegate() {
                return multimap;
            }
        };

        /* write */ forwardingMultimap.put("key1", 42);
        /* read */ Integer value = forwardingMultimap.get("key1").iterator().next();
        System.out.println(value);
    }
}