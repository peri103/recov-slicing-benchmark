import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, String> map = new HashSetValuedHashMap<>();
        HashMap<Integer, String> simpleMap = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();

        // Adding some initial values to simpleMap
        for (int i = 0; i < 5; i++) {
            simpleMap.put(i, "Value" + i);
        }

        // Adding initial values to list
        for (int i = 0; i < 3; i++) {
            list.add("ListValue" + i);
        }

        // Process elements in simpleMap
        for (int key : simpleMap.keySet()) {
            String value = simpleMap.get(key);
            System.out.println("SimpleMap Key: " + key + ", Value: " + value);
        }

        // Process elements in list
        for (String value : list) {
            System.out.println("List Element: " + value);
        }

        /* write */ 
        map.put("key", "value");

        // Additional logic using map
        map.put("key", "anotherValue");
        map.put("anotherKey", "value2");

        // Process elements in map
        for (String key : map.keySet()) {
            Collection<String> values = map.get(key);
            for (String value : values) {
                System.out.println("Map Key: " + key + ", Value: " + value);
            }
        }

        // Unrelated logic to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ 
        Collection<String> values = map.get("key");
        for (String value : values) {
            System.out.println("Read from map: " + value);
        }
    }
}