import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a base map
        Map<String, Integer> baseMap = new HashMap<>();

        // Define predicates for keys and values
        Predicate<String> keyPredicate = TruePredicate.truePredicate();
        Predicate<Integer> valuePredicate = TruePredicate.truePredicate();

        // Create a PredicatedMap using the base map and predicates
        PredicatedMap<String, Integer> predicatedMap = PredicatedMap.predicatedMap(baseMap, keyPredicate, valuePredicate);

        /* write */ predicatedMap.put("key1", 123);
        /* read */ int value = predicatedMap.get("key1");
        System.out.println(value);
    }
}