import org.apache.commons.collections4.multimap.PredicatedMultiValuedMap;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;
import org.apache.commons.collections4.MultiValuedMap;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> keyPredicate = TruePredicate.truePredicate();
        Predicate<Object> valuePredicate = TruePredicate.truePredicate();
        MultiValuedMap<String, Integer> map = new HashedMap<>();
        PredicatedMultiValuedMap<String, Integer> predicatedMap = new PredicatedMultiValuedMap<>(map, keyPredicate, valuePredicate);

        /* write */ predicatedMap.put("key", 42);
        /* read */ Integer value = predicatedMap.get("key").iterator().next();
        System.out.println(value);
    }
}