import com.google.common.collect.ForwardingMap;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> backingMap = new HashMap<>();
        ForwardingMap<String, Integer> map = new ForwardingMap<String, Integer>() {
            @Override
            protected Map<String, Integer> delegate() {
                return backingMap;
            }
        };
        
        List<String> keys = new ArrayList<>();
        keys.add("key");
        keys.add("anotherKey");
        
        /* write */ map.put("key", 42);
        
        map.put("anotherKey", 84);
        
        int sum = 0;
        for (String key : keys) {
            sum += map.get(key);
        }
        
        System.out.println("Sum of values: " + sum);
        
        List<Integer> values = new ArrayList<>();
        values.add(map.get("anotherKey"));
        
        int product = 1;
        for (Integer val : values) {
            product *= val;
        }
        
        System.out.println("Product of values: " + product);
        
        /* read */ int value = map.get("key");
        System.out.println("Read value: " + value);
        
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("thirdKey", 126);
        
        int total = 0;
        for (String key : anotherMap.keySet()) {
            total += anotherMap.get(key);
        }
        
        System.out.println("Total from anotherMap: " + total);
    }
}