import com.google.common.collect.ForwardingMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an anonymous subclass of ForwardingMap to use the write and read methods
        ForwardingMap<String, String> map = new ForwardingMap<String, String>() {
            private final Map<String, String> delegate = new HashMap<>();

            @Override
            protected Map<String, String> delegate() {
                return delegate;
            }
        };

        /* write */ map.put("key", "value");
        /* read */ String value = map.get("key");
        System.out.println(value);
    }
}