import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class Main {
    public static void main(String[] args) {
        // Initialize the PredicatedMultiValuedMap with a TruePredicate for both key and value
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(),
            TruePredicate.INSTANCE,
            TruePredicate.INSTANCE
        );

        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key").iterator().next();
        
        System.out.println(value);
    }
}