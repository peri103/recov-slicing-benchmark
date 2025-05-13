import org.apache.commons.collections4.map.AbstractDualBidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AbstractDualBidiMap<String, Integer> map = new DualHashBidiMap<>();
        HashMap<String, String> stringMap = new HashMap<>();
        
        /* write */ map.put("key", 100);
        
        stringMap.put("a", "apple");
        stringMap.put("b", "banana");
        
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("x", 1);
        anotherMap.put("y", 2);
        
        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
        int sum = 0;
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of anotherMap values: " + sum);
        
        /* read */ Integer value = map.get("key");
        System.out.println(value);
        
        DualHashBidiMap<Integer, String> reverseMap = new DualHashBidiMap<>();
        reverseMap.put(1, "one");
        reverseMap.put(2, "two");
        
        for (Integer key : reverseMap.keySet()) {
            System.out.println("ReverseMap Key: " + key + ", Value: " + reverseMap.get(key));
        }
    }
}