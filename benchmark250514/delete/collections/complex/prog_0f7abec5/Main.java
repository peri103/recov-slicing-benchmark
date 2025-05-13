import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("A", "Apple");
        stringMap.put("B", "Banana");

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /* write */ map.put("key", 42);
        
        Map<Integer, String> reverseMap = new HashMap<>();
        reverseMap.put(1, "One");
        reverseMap.put(2, "Two");

        for (Map.Entry<Integer, String> entry : reverseMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        /* read */ int value = map.get("key");
        System.out.println("Value from map: " + value);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Counting: " + i);
        }

        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("X", 100);
        anotherMap.put("Y", 200);
        anotherMap.put("Z", 300);

        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}