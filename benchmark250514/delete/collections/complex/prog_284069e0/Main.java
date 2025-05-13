import org.apache.commons.collections4.multimap.TreeValuedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TreeValuedHashMap<String, Integer> map = new TreeValuedHashMap<>();
        HashMap<String, String> anotherMap = new HashMap<>();

        anotherMap.put("A", "Apple");
        anotherMap.put("B", "Banana");
        
        /* write */ map.put("key", 42);

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }

        Set<Map.Entry<String, String>> entrySet = anotherMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        int doubleSum = sum * 2;
        System.out.println("Double of sum: " + doubleSum);

        /* read */ Integer value = map.get("key").first();
        System.out.println("Value from map: " + value);

        TreeValuedHashMap<String, Integer> anotherTreeMap = new TreeValuedHashMap<>();
        for (int i = 0; i < 5; i++) {
            anotherTreeMap.put("num" + i, i * 10);
        }

        for (String key : anotherTreeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + anotherTreeMap.get(key));
        }
    }
}