import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ForwardingMultimap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ForwardingMultimap<String, Integer> multimap = new ForwardingMultimap<String, Integer>() {
            private final ArrayListMultimap<String, Integer> delegate = ArrayListMultimap.create();

            @Override
            protected ArrayListMultimap<String, Integer> delegate() {
                return delegate;
            }
        };

        /* write */ multimap.put("key", 42);
        /* read */ Collection<Integer> values = multimap.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }
    }
}