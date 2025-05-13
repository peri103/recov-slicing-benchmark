import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.map.PredicatedMap;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Define a predicate that allows all keys and values
        Predicate<Object> keyPredicate = obj -> true;
        Predicate<Object> valuePredicate = obj -> true;

        // Create a PredicatedMap with the predicates
        HashMap<Object, Object> baseMap = new HashMap<>();
        PredicatedMap<Object, Object> map = PredicatedMap.predicatedMap(baseMap, keyPredicate, valuePredicate);

        // Write a value into the map
        /* write */ map.put("key", "value");

        // Read the value from the map
        /* read */ Object value = map.get("key");

        // Print the read value
        System.out.println(value);
    }
}