import org.apache.commons.collections4.map.PredicatedMap;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.map.ListOrderedMap;

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

        ListOrderedMap<String, String> listOrderedMap = new ListOrderedMap<>();
        listOrderedMap.put("first", "apple");
        listOrderedMap.put("second", "banana");

        System.out.println("ListOrderedMap size: " + listOrderedMap.size());

        /* write */ predicatedMap.put("key", 42);

        for (Map.Entry<String, String> entry : listOrderedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("alpha", 10);
        anotherMap.put("beta", 20);
        anotherMap.put("gamma", 30);

        for (Map.Entry<String, Integer> entry : anotherMap.entrySet()) {
            predicatedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println("PredicatedMap size: " + predicatedMap.size());

        /* read */ int value = predicatedMap.get("key");
        System.out.println("Value from predicatedMap: " + value);

        for (Map.Entry<String, Integer> entry : predicatedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}