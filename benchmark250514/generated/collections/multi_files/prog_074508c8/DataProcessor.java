import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.HashMap;
import java.util.HashSet;

public class DataProcessor {
    private HashSetValuedHashMap<String, String> map2 = new HashSetValuedHashMap<>();
    private HashMap<String, Integer> simpleMap = new HashMap<>();
    private HashSet<Integer> set = new HashSet<>();

    public void process() {
        map2.put("key2", "value2");
        map2.put("key3", "value3");

        simpleMap.put("simpleKey1", 100);
        simpleMap.put("simpleKey2", 200);

        set.add(10);
        set.add(20);

        for (String key : map2.keySet()) {
            System.out.println("Map2 key: " + key + ", value: " + map2.get(key));
        }

        for (Integer value : simpleMap.values()) {
            System.out.println("SimpleMap value: " + value);
        }

        for (Integer num : set) {
            System.out.println("Set contains: " + num);
        }
    }
}
