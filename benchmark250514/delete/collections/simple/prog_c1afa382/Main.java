import org.apache.commons.collections4.map.AbstractIterableMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a HashMap as AbstractIterableMap is abstract and cannot be instantiated directly
        AbstractIterableMap<String, Integer> map = new HashMap<>();
        
        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        
        System.out.println(value);
    }
}