import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a ForwardingMultimap instance using ArrayListMultimap as the delegate
        ForwardingMultimap<String, String> map = new ForwardingMultimap<String, String>() {
            private final Multimap<String, String> delegate = ArrayListMultimap.create();

            @Override
            protected Multimap<String, String> delegate() {
                return delegate;
            }
        };

        // Use the put method to add a key-value pair to the map
        /* write */ map.put("key1", "value1");

        // Adding more complexity to the program
        Map<String, Integer> simpleMap = new HashMap<>();
        simpleMap.put("A", 1);
        simpleMap.put("B", 2);
        simpleMap.put("C", 3);

        int sum = 0;
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        Multimap<String, Integer> complexMap = ArrayListMultimap.create();
        complexMap.put("X", 10);
        complexMap.put("X", 20);
        complexMap.put("Y", 30);

        int total = 0;
        for (String key : complexMap.keySet()) {
            for (Integer value : complexMap.get(key)) {
                total += value;
            }
        }
        System.out.println("Total of values in complexMap: " + total);

        // Use the get method to retrieve the value associated with the key
        /* read */ String value = map.get("key1").iterator().next();
        System.out.println(value);

        // Additional operations
        Multimap<String, String> anotherMap = ArrayListMultimap.create();
        anotherMap.put("Z", "alpha");
        anotherMap.put("Z", "beta");

        for (String key : anotherMap.keySet()) {
            System.out.println("Values for key " + key + ": " + anotherMap.get(key));
        }
    }
}