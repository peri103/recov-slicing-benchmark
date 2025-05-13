import org.apache.commons.collections4.map.MultiKeyMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MultiKeyMap<String, String> map = new MultiKeyMap<>();
        MultiKeyMap<String, Integer> map2 = new MultiKeyMap<>();
        Map<String, String> simpleMap = new HashMap<>();

        map2.put("a", "b", 100);
        map2.put("x", "y", 200);
        simpleMap.put("singleKey", "singleValue");

        /* write */ map.put("key1", "key2", "value");

        String simpleValue = simpleMap.get("singleKey");
        System.out.println("Simple Map Value: " + simpleValue);

        int sum = 0;
        for (String key1 : map2.keySet()) {
            for (String key2 : map2.get(key1).keySet()) {
                sum += map2.get(key1, key2);
            }
        }
        System.out.println("Sum of values in map2: " + sum);

        /* read */ String value = map.get("key1", "key2");
        System.out.println(value);

        MultiKeyMap<String, String> map3 = new MultiKeyMap<>();
        map3.put("alpha", "beta", "gamma");
        map3.put("delta", "epsilon", "zeta");

        String map3Value = map3.get("alpha", "beta");
        System.out.println("Value from map3: " + map3Value);

        for (String key1 : map3.keySet()) {
            for (String key2 : map3.get(key1).keySet()) {
                System.out.println("Key1: " + key1 + ", Key2: " + key2 + ", Value: " + map3.get(key1, key2));
            }
        }
    }
}