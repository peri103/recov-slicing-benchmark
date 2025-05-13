import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a PredicatedMap with TruePredicate to allow any key/value pairs
        Map<Object, Object> baseMap = new HashMap<>();
        Predicate<Object> keyPredicate = TruePredicate.truePredicate();
        Predicate<Object> valuePredicate = TruePredicate.truePredicate();
        PredicatedMap<Object, Object> predicatedMap = PredicatedMap.predicatedMap(baseMap, keyPredicate, valuePredicate);

        /* write */ predicatedMap.put("key", "value");

        /* read */ Object value = predicatedMap.get("key");

        System.out.println(value);
    }
}