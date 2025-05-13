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
        
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("first", 100);
        anotherMap.put("second", 200);
        
        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        String name = hashMap.get("name");
        System.out.println("Name: " + name);
        
        /* read */ int value = map.get("key");
        System.out.println("Read value: " + value);
        
        for (int i = 0; i < 3; i++) {
            hashMap.put("entry" + i, "Value" + i);
        }
        
        for (String key : hashMap.keySet()) {
            System.out.println(key + " -> " + hashMap.get(key));
        }
    }
}