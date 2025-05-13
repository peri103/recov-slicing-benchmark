import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.Set;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        HashSetValuedHashMap<String, Integer> map = new HashSetValuedHashMap<>();
        ArrayListValuedHashMap<String, String> anotherMap = new ArrayListValuedHashMap<>();

        // Adding values to anotherMap
        anotherMap.put("fruit", "apple");
        anotherMap.put("fruit", "banana");
        anotherMap.put("vegetable", "carrot");

        // Processing data in anotherMap
        Set<String> fruits = anotherMap.get("fruit");
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        /* write */ map.put("key", 42);

        // Perform some unrelated calculations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Adding more values to map
        map.put("key", 100);
        map.put("key", 200);

        // More complex operations
        for (int i = 0; i < 5; i++) {
            map.put("key" + i, i * 10);
        }

        // Retrieve values from map
        /* read */ Set<Integer> values = map.get("key");
        for (Integer value : values) {
            System.out.println(value);
        }

        // Further processing with map
        Set<Integer> allValues = map.get("key3");
        for (Integer val : allValues) {
            System.out.println("Value from key3: " + val);
        }
    }
}