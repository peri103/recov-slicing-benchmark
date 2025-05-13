import org.apache.commons.collections4.map.LinkedMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedMap<String, Integer> map = new LinkedMap<>();
        HashMap<String, String> hashMap = new HashMap<>();
        
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");
        
        /* write */ map.put("key", 42);
        
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        map.put("anotherKey", 84);
        
        int sum = 0;
        for (Integer value : map.values()) {
            sum += value;
        }
        
        /* read */ Integer value = map.get("key");
        
        System.out.println("Sum of values in LinkedMap: " + sum);
        System.out.println("Value associated with 'key': " + value);
        
        LinkedMap<String, String> stringMap = new LinkedMap<>();
        stringMap.put("greeting", "Hello");
        stringMap.put("farewell", "Goodbye");
        
        for (String k : stringMap.keySet()) {
            System.out.println(k + " -> " + stringMap.get(k));
        }
    }
}