import org.apache.commons.collections4.map.PredicatedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Object> keyPredicate = key -> key instanceof String;
        Predicate<Object> valuePredicate = value -> value instanceof Integer;

        Map<String, Integer> baseMap = new HashMap<>();
        PredicatedMap<String, Integer> predicatedMap = PredicatedMap.predicatedMap(baseMap, keyPredicate, valuePredicate);

        /* write */ predicatedMap.put("key", 42);
        /* read */ int value = predicatedMap.get("key");
        System.out.println(value);
    }
}