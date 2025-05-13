import org.apache.commons.collections4.multimap.AbstractMultiValuedMap;
import org.apache.commons.collections4.MultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        MultiValuedMap<String, Integer> map = new ArrayListValuedHashMap<>();
        MultiValuedMap<String, String> stringMap = new ArrayListValuedHashMap<>();
        Set<String> uniqueKeys = new HashSet<>();

        /* write */ map.put("key", 42);
        
        stringMap.put("name", "Alice");
        stringMap.put("name", "Bob");
        stringMap.put("city", "New York");

        for (String key : stringMap.keySet()) {
            uniqueKeys.add(key);
        }

        System.out.println("Unique keys in stringMap: " + uniqueKeys);

        for (String key : uniqueKeys) {
            System.out.println("Values for key '" + key + "': " + stringMap.get(key));
        }

        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println("Value from map: " + value);

        MultiValuedMap<String, Integer> anotherMap = new ArrayListValuedHashMap<>();
        anotherMap.put("numbers", 10);
        anotherMap.put("numbers", 20);
        anotherMap.put("numbers", 30);

        for (Integer num : anotherMap.get("numbers")) {
            System.out.println("Number from anotherMap: " + num);
        }
    }
}