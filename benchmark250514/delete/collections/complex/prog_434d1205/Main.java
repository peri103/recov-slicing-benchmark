import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.multimap.HashSetValuedHashMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Initialize the PredicatedMultiValuedMap with a TruePredicate for both key and value
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(),
            TruePredicate.INSTANCE,
            TruePredicate.INSTANCE
        );

        /* write */ map.put("key", 42);

        // Use another PredicatedMultiValuedMap to store different data
        PredicatedMultiValuedMap<String, String> map2 = new PredicatedMultiValuedMap<>(
            new HashSetValuedHashMap<>(),
            TruePredicate.INSTANCE,
            TruePredicate.INSTANCE
        );

        map2.put("fruit", "apple");
        map2.put("fruit", "banana");
        map2.put("vegetable", "carrot");

        // Some unrelated code to increase complexity
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("one", 1);
        simpleMap.put("two", 2);
        simpleMap.put("three", 3);

        for (String key : simpleMap.keySet()) {
            System.out.println("SimpleMap Key: " + key + ", Value: " + simpleMap.get(key));
        }

        // Additional operations on map2
        for (String key : map2.keySet()) {
            System.out.println("Map2 Key: " + key + ", Values: " + map2.get(key));
        }

        // Retrieve the value from the original map
        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println(value);

        // Further operations after the read
        for (Integer num : map.get("key")) {
            System.out.println("Number in map: " + num);
        }
    }
}