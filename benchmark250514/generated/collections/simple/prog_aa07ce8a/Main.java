import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class Main {
    public static void main(String[] args) {
        // Create a PredicatedMap with TruePredicate for both keys and values to allow any key-value pair
        Predicate<Object> truePredicate = TruePredicate.truePredicate();
        PredicatedMap<Object, Object> map = PredicatedMap.predicatedMap(new java.util.HashMap<>(), truePredicate, truePredicate);
        
        /* write */ map.put("key1", "value1");
        /* read */ Object value = map.get("key1");
        System.out.println(value);
    }
}