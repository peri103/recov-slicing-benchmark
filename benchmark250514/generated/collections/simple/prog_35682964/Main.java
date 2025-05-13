import org.apache.commons.collections4.map.PredicatedMap;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> keyPredicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return object instanceof String;
            }
        };

        Predicate<Object> valuePredicate = new Predicate<Object>() {
            @Override
            public boolean evaluate(Object object) {
                return object instanceof Integer;
            }
        };

        Map<String, Integer> baseMap = new HashMap<>();
        PredicatedMap<String, Integer> predicatedMap = PredicatedMap.predicatedMap(baseMap, keyPredicate, valuePredicate);

        /* write */ predicatedMap.put("key", 42);
        /* read */ int value = predicatedMap.get("key");
        System.out.println(value);
    }
}