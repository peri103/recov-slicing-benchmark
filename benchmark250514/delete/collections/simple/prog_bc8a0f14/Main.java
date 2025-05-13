import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.PredicatedMap;

public class Main {
    public static void main(String[] args) {
        // Define predicates for the keys and values
        Predicate<String> keyPredicate = key -> key != null;
        Predicate<Integer> valuePredicate = value -> value >= 0;

        // Create a PredicatedMultiValuedMap
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
                new ArrayListValuedHashMap<>(),
                keyPredicate,
                valuePredicate
        );

        // Write to the map
        /* write */ map.put("key1", 100);

        // Read from the map
        /* read */ Integer value = map.get("key1").iterator().next();

        // Output the value
        System.out.println(value);
    }
}