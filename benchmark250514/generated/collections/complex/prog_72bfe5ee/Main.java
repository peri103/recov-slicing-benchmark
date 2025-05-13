import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import org.apache.commons.collections4.MultiValuedMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        HashSetValuedHashMap<String, Integer> map2 = new HashSetValuedHashMap<>();
        HashMap<String, Integer> simpleMap = new HashMap<>();

        map2.put("anotherKey", 84);
        simpleMap.put("simpleKey", 100);

        /* write */ map.put("key", 42);
        
        MultiValuedMap<String, Integer> multiMap = new HashSetValuedHashMap<>();
        multiMap.put("multiKey1", 10);
        multiMap.put("multiKey1", 20);
        multiMap.put("multiKey2", 30);

        simpleMap.put("additionalKey", 200);

        for (String key : multiMap.keySet()) {
            System.out.println("MultiMap Key: " + key + ", Values: " + multiMap.get(key));
        }

        Integer simpleValue = simpleMap.get("simpleKey");
        System.out.println("SimpleMap Value: " + simpleValue);

        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println(value);

        for (String key : map2.keySet()) {
            System.out.println("Map2 Key: " + key + ", Values: " + map2.get(key));
        }

        simpleMap.put("anotherSimpleKey", 300);
        Integer anotherSimpleValue = simpleMap.get("anotherSimpleKey");
        System.out.println("Another SimpleMap Value: " + anotherSimpleValue);
    }
}