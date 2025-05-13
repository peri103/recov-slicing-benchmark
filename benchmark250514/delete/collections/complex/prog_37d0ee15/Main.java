import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();
        Map<String, String> simpleMap = new HashMap<>();
        
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");
        
        for (Map.Entry<String, String> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        
        /* write */ map.put("key", 42);
        
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        
        System.out.println("Sum of numbers from 0 to 9 is: " + sum);
        
        Map<Integer, String> reverseMap = map.inverseBidiMap();
        reverseMap.put(100, "one hundred");
        
        Integer value = map.get("key");
        /* read */ System.out.println(value);
        
        for (Map.Entry<Integer, String> entry : reverseMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        map.put("newKey", 99);
        String strValue = reverseMap.get(99);
        System.out.println("Retrieved from reverse map: " + strValue);
    }
}