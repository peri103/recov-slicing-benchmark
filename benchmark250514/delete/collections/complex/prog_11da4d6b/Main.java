import org.apache.commons.collections4.map.MultiValueMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiValueMap<String, Integer> map = new MultiValueMap<>();
        MultiValueMap<String, String> map2 = new MultiValueMap<>();
        Map<String, Double> map3 = new HashMap<>();

        /* write */ map.put("key", 42);
        map2.put("anotherKey", "value");
        map3.put("thirdKey", 3.14);

        // Perform some operations with map2 and map3
        String map2Value = map2.get("anotherKey").iterator().next();
        Double map3Value = map3.get("thirdKey");

        // Complex operations using map2 and map3
        if (map2Value.equals("value")) {
            map3.put("thirdKey", map3Value * 2);
        }

        for (int i = 0; i < 5; i++) {
            map.put("key" + i, i * 10);
        }

        // Retrieve and print values from map3
        for (String key : map3.keySet()) {
            System.out.println("Map3 Key: " + key + ", Value: " + map3.get(key));
        }

        // More operations with map2
        map2.put("anotherKey", "newValue");
        String updatedMap2Value = map2.get("anotherKey").iterator().next();
        System.out.println("Updated map2 value: " + updatedMap2Value);

        // Final read operation
        /* read */ Integer value = (Integer) map.get("key").iterator().next();
        System.out.println(value);
    }
}