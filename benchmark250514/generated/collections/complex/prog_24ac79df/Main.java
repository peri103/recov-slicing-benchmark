import org.apache.commons.collections4.map.AbstractHashedMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.list.TreeList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashedMap<String, Integer> map = new HashedMap<>();
        TreeList<String> treeList = new TreeList<>();
        HashMap<String, String> simpleMap = new HashMap<>();

        // Adding elements to treeList
        treeList.add("First");
        treeList.add("Second");
        treeList.add("Third");

        // Adding elements to simpleMap
        simpleMap.put("A", "Apple");
        simpleMap.put("B", "Banana");

        // Perform operations on treeList
        for (String element : treeList) {
            System.out.println("TreeList Element: " + element);
        }

        // Perform operations on simpleMap
        for (String key : simpleMap.keySet()) {
            System.out.println("SimpleMap Key: " + key + ", Value: " + simpleMap.get(key));
        }

        /* write */ map.put("key", 42);

        // Perform additional operations on map
        map.put("anotherKey", 100);
        map.put("yetAnotherKey", 200);

        // Perform some calculations
        int sum = 0;
        for (String key : map.keySet()) {
            sum += map.get(key);
        }
        System.out.println("Sum of all values in map: " + sum);

        /* read */ Integer value = map.get("key");
        System.out.println(value);

        // Additional operations after the read
        map.put("newKey", 300);
        System.out.println("Value for 'newKey': " + map.get("newKey"));
    }
}