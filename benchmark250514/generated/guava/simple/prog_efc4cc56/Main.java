import com.google.common.collect.ForwardingMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an anonymous class extending ForwardingMap to use the put and get methods.
        ForwardingMap<String, Integer> map = new ForwardingMap<String, Integer>() {
            private final Map<String, Integer> delegate = new HashMap<>();

            @Override
            protected Map<String, Integer> delegate() {
                return delegate;
            }
        };

        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}