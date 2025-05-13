import org.apache.commons.collections4.map.LazyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = LazyMap.lazyMap(new HashMap<>(), () -> "default");
        
        /* write */ map.put("key", "value");
        
        /* read */ String value = map.get("key");
        
        System.out.println(value);
    }
}