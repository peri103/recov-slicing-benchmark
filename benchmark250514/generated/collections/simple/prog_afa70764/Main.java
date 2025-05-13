import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the LazyMap
        LazyMap<String, Integer> lazyMap = LazyMap.lazyMap(new HashMap<>(), () -> null);

        /* write */ lazyMap.put("key1", 42);

        /* read */ Integer value = lazyMap.get("key1");

        System.out.println(value);
    }
}