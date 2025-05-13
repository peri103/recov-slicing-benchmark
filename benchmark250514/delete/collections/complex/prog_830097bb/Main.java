import org.apache.commons.collections4.map.AbstractSortedMap;
import org.apache.commons.collections4.map.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractSortedMap<String, Integer> map = new TreeMap<>();
        /* write */ map.put("key", 42);
        
        // Additional complex operations
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("name", "Alice");
        simpleMap.put("city", "Wonderland");
        
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        
        AbstractSortedMap<String, Integer> anotherMap = new TreeMap<>();
        anotherMap.put("a", 1);
        anotherMap.put("b", 2);
        
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // More operations before reading the value
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        /* read */ int value = map.get("key");
        System.out.println(value);
    }
}