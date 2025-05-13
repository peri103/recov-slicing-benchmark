import org.apache.commons.collections4.map.AbstractOrderedMapDecorator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an instance of AbstractOrderedMapDecorator using a HashMap
        Map<String, Integer> baseMap = new HashMap<>();
        AbstractOrderedMapDecorator<String, Integer> map = new AbstractOrderedMapDecorator<String, Integer>(baseMap) {};

        /* write */ map.put("key", 42);
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}