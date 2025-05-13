import org.apache.commons.collections4.map.AbstractSortedMapDecorator;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractSortedMapDecorator<String, Integer> map = new AbstractSortedMapDecorator<>(new TreeMap<>());
        AbstractSortedMapDecorator<String, String> map2 = new AbstractSortedMapDecorator<>(new TreeMap<>());
        Map<String, Double> map3 = new HashMap<>();
        
        map2.put("hello", "world");
        map3.put("pi", 3.14159);
        
        /* write */ map.put("key", 42);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        double piValue = map3.get("pi");
        System.out.println("Pi: " + piValue);
        
        String greeting = map2.get("hello");
        System.out.println("Greeting: " + greeting);
        
        /* read */ int value = map.get("key");
        System.out.println("Value: " + value);
        
        Map<String, Integer> map4 = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            map4.put("num" + i, i * 10);
        }
        
        for (String key : map4.keySet()) {
            System.out.println(key + ": " + map4.get(key));
        }
    }
}