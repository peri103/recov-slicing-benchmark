import com.google.common.collect.ForwardingSortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        ForwardingSortedMap<String, Integer> map = new ForwardingSortedMap<String, Integer>() {
            private final TreeMap<String, Integer> delegate = new TreeMap<>();

            @Override
            protected TreeMap<String, Integer> delegate() {
                return delegate;
            }
        };

        /* write */ map.put("key", 42);

        // Additional unrelated code
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("hello", "world");
        stringMap.put("foo", "bar");

        for (Map.Entry<String, String> entry : stringMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Additional similar api pair usage
        ForwardingSortedMap<String, Double> anotherMap = new ForwardingSortedMap<String, Double>() {
            private final TreeMap<String, Double> delegate = new TreeMap<>();

            @Override
            protected TreeMap<String, Double> delegate() {
                return delegate;
            }
        };

        anotherMap.put("pi", 3.14159);
        anotherMap.put("e", 2.71828);

        Double piValue = anotherMap.get("pi");
        System.out.println("Value of pi: " + piValue);

        // More unrelated code
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

        /* read */ Integer value = map.get("key");
        System.out.println(value);

        // Additional computations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 natural numbers: " + sum);
    }
}