import com.google.common.collect.ForwardingMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> baseMap = new HashMap<>();
        ForwardingMap<String, Integer> map = new ForwardingMap<String, Integer>() {
            @Override
            protected Map<String, Integer> delegate() {
                return baseMap;
            }
        };

        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}