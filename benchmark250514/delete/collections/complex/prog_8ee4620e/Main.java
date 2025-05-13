import org.apache.commons.collections4.map.AbstractBidiMapDecorator;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        BidiMap<String, Integer> bidiMap = new TreeBidiMap<>();
        AbstractBidiMapDecorator<String, Integer> decoratedMap = new AbstractBidiMapDecorator<>(bidiMap) {};
        
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("hello", "world");
        
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        /* write */ decoratedMap.put("key", 42);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 integers: " + sum);
        
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("A", 1);
        anotherMap.put("B", 2);
        
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        /* read */ int value = decoratedMap.get("key");
        
        System.out.println(value);
        
        Map<Integer, String> reverseMap = new HashMap<>();
        reverseMap.put(1, "One");
        reverseMap.put(2, "Two");
        
        for (Map.Entry<Integer, String> entry : reverseMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}