import com.google.common.collect.ForwardingSortedMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ForwardingSortedMap<String, Integer> map = new ForwardingSortedMap<String, Integer>() {
            private final TreeMap<String, Integer> delegate = new TreeMap<>();

            @Override
            protected TreeMap<String, Integer> delegate() {
                return delegate;
            }
        };

        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}