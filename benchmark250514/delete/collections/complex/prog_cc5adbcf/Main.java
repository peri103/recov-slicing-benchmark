import org.apache.commons.collections4.map.AbstractMapDecorator;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractMapDecorator<String, Integer> map = new AbstractMapDecorator<>(new HashMap<>());
        AbstractMapDecorator<String, String> map2 = new AbstractMapDecorator<>(new HashMap<>());
        Map<String, Double> map3 = new HashMap<>();
        
        /* write */ map.put("key", 42);
        
        map2.put("name", "Alice");
        map2.put("city", "Wonderland");
        
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        map3.put("pi", 3.14);
        map3.put("e", 2.71);
        
        double sum = 0.0;
        for (Double value : map3.values()) {
            sum += value;
        }
        
        System.out.println("Sum of values in map3: " + sum);
        
        /* read */ Integer value = map.get("key");
        System.out.println(value);
        
        map.put("anotherKey", 100);
        
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        map2.put("country", "Fantasyland");
        
        if (map2.containsKey("city")) {
            System.out.println("City found: " + map2.get("city"));
        }
    }
}