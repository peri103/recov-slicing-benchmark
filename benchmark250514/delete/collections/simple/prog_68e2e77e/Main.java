import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the map using a concrete implementation
        AbstractOrderedMapDecorator<String, Integer> map = new AbstractOrderedMapDecorator<>(new HashMap<>()) {};
        
        /* write */ map.put("key1", 100);
        /* read */ int value = map.get("key1");
        
        System.out.println(value);
    }
}