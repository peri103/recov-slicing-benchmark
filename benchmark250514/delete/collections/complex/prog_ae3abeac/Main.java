import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.map.HashedMap;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all entries
        Predicate<Object> alwaysTruePredicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return true;
            }
        };

        // Create a PredicatedMultiValuedMap with the predicate
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
                new ArrayListValuedHashMap<>(), alwaysTruePredicate, alwaysTruePredicate);

        /* write */ map.put("key", 42);

        // Create another predicated map
        PredicatedMap<String, String> stringMap = new PredicatedMap<>(
                new HashedMap<>(), alwaysTruePredicate, alwaysTruePredicate);
        
        stringMap.put("hello", "world");
        stringMap.put("foo", "bar");

        // Perform some operations on the stringMap
        String greeting = stringMap.get("hello");
        System.out.println("Greeting: " + greeting);

        // Additional operations on the map
        map.put("anotherKey", 100);
        map.put("anotherKey", 200);

        // Iterate over the values of "anotherKey"
        Collection<Integer> values = map.get("anotherKey");
        for (Integer val : values) {
            System.out.println("Value for 'anotherKey': " + val);
        }

        // More complex operations
        int sum = 0;
        for (Integer val : map.get("anotherKey")) {
            sum += val;
        }
        System.out.println("Sum of values for 'anotherKey': " + sum);

        /* read */ Integer value = map.get("key").iterator().next();

        System.out.println("Value for 'key': " + value);

        // Perform some operations on a standard map
        HashedMap<String, Integer> standardMap = new HashedMap<>();
        standardMap.put("x", 10);
        standardMap.put("y", 20);

        int total = 0;
        for (Integer number : standardMap.values()) {
            total += number;
        }
        System.out.println("Total sum of standardMap values: " + total);
    }
}