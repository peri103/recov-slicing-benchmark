import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        HashMap<String, Integer> simpleMap = new HashMap<>();
        HashSet<Integer> numberSet = new HashSet<>();

        // Adding elements to simpleMap
        simpleMap.put("one", 1);
        simpleMap.put("two", 2);

        // Adding elements to numberSet
        numberSet.add(10);
        numberSet.add(20);

        // Manipulating simpleMap
        for (String key : simpleMap.keySet()) {
            numberSet.add(simpleMap.get(key));
        }

        // Adding elements to map
        map.put("key", 42);
        map.put("key", 43);

        // More operations on numberSet
        int sum = 0;
        for (Integer num : numberSet) {
            sum += num;
        }
        System.out.println("Sum of numberSet: " + sum);

        // Accessing the elements from map
        Collection<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println("Value from map: " + value);
        }

        // Final operations
        if (simpleMap.containsKey("one")) {
            System.out.println("simpleMap contains key 'one'");
        }
    }
}