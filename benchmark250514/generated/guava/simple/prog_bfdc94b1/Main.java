import com.google.common.collect.ForwardingSortedMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ForwardingSortedMap<String, Integer> map = new ForwardingSortedMap<String, Integer>() {
            private final SortedMap<String, Integer> delegate = new TreeMap<>();

            @Override
            protected SortedMap<String, Integer> delegate() {
                return delegate;
            }
        };

        /* write */ map.put("key", 123);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}