import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.PredicateUtils;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a base map
        HashMap<String, Integer> baseMap = new HashMap<>();

        // Create a predicated map with not-null predicates for keys and values
        PredicatedMap<String, Integer> predicatedMap = PredicatedMap.predicatedMap(baseMap, PredicateUtils.notNullPredicate(), PredicateUtils.notNullPredicate());

        /* write */ predicatedMap.put("key1", 123);

        /* read */ Integer value = predicatedMap.get("key1");
        System.out.println(value);
    }
}