import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that always returns true, allowing all entries
        Predicate<Object> truePredicate = new Predicate<Object>() {
            public boolean evaluate(Object o) {
                return true;
            }
        };

        // Create a PredicatedMultiValuedMap with the true predicate
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
                new ArrayListValuedHashMap<>(), truePredicate, truePredicate);

        /* write */ map.put("key", 42);

        /* read */ int value = map.get("key").iterator().next();
        System.out.println(value);
    }
}