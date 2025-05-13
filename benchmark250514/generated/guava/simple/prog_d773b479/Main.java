import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.ArrayListMultimap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ForwardingMultimap<String, String> multimap = new ForwardingMultimap<String, String>() {
            private final ArrayListMultimap<String, String> delegate = ArrayListMultimap.create();

            @Override
            protected ArrayListMultimap<String, String> delegate() {
                return delegate;
            }
        };

        /* write */ multimap.put("key", "value");
        /* read */ Collection<String> values = multimap.get("key");
        for (String value : values) {
            System.out.println(value);
        }
    }
}