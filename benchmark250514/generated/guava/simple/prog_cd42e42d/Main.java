import com.google.common.collect.ForwardingMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> delegate = new HashMap<>();
        ForwardingMap<String, Integer> map = new ForwardingMap<String, Integer>() {
            @Override
            protected Map<String, Integer> delegate() {
                return delegate;
            }
        };
        
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key");
        System.out.println(value);
    }
}