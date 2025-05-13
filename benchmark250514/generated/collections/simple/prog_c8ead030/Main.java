import org.apache.commons.collections4.map.PredicatedMap;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.functors.TruePredicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> keyPredicate = TruePredicate.truePredicate();
        Predicate<Object> valuePredicate = TruePredicate.truePredicate();
        
        PredicatedMap<Object, Object> map = PredicatedMap.predicatedMap(new java.util.HashMap<>(), keyPredicate, valuePredicate);
        
        /* write */ map.put("key", "value");
        
        /* read */ Object value = map.get("key");
        
        System.out.println(value);
    }
}