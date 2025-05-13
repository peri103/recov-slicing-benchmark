import com.google.common.collect.ForwardingMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a concrete implementation of ForwardingMap
        ForwardingMap<String, Integer> map = new ForwardingMap<String, Integer>() {
            private final Map<String, Integer> delegate = new HashMap<>();

            @Override
            protected Map<String, Integer> delegate() {
                return delegate;
            }
        };

        // Use the write method to add an element to the map
        /* write */ map.put("key", 42);

        // Use the read method to retrieve the element from the map
        /* read */ Integer value = map.get("key");

        // Print the value to ensure it was correctly read
        System.out.println(value);
    }
}