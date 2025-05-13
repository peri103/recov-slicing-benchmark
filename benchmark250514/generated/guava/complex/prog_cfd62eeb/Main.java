import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.HashMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
        HashMultimap<String, Integer> anotherMultimap = HashMultimap.create();
        Map<String, Integer> map = new HashMap<>();

        /* write */ multimap.put("key", "value");

        anotherMultimap.put("alpha", 100);
        anotherMultimap.put("beta", 200);

        map.put("one", 1);
        map.put("two", 2);

        for (String key : anotherMultimap.keySet()) {
            for (Integer val : anotherMultimap.get(key)) {
                System.out.println("Key: " + key + ", Value: " + val);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Map Key: " + entry.getKey() + ", Map Value: " + entry.getValue());
        }

        /* read */ String value = multimap.get("key").iterator().next();
        System.out.println(value);

        HashMultimap<String, String> stringMultimap = HashMultimap.create();
        stringMultimap.put("hello", "world");
        stringMultimap.put("java", "programming");

        for (String strKey : stringMultimap.keySet()) {
            for (String strVal : stringMultimap.get(strKey)) {
                System.out.println("String Key: " + strKey + ", String Value: " + strVal);
            }
        }
    }
}