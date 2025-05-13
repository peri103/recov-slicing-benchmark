import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

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

        /* read */ Integer value = map.get("key").iterator().next();

        System.out.println(value);
    }
}