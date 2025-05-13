import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.multimap.ArrayListValuedHashMap;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> keyPredicate = key -> key instanceof String;
        Predicate<Object> valuePredicate = value -> value instanceof Integer;
        
        PredicatedMultiValuedMap<String, Integer> map = new PredicatedMultiValuedMap<>(
            new ArrayListValuedHashMap<>(),
            keyPredicate,
            valuePredicate
        );
        
        /* write */ map.put("key", 42);
        /* read */ Integer value = map.get("key").iterator().next();
        System.out.println(value);
    }
}