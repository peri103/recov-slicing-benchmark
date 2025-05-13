import com.google.common.collect.ForwardingSortedMap;
import com.google.common.collect.ForwardingList;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ForwardingSortedMap<String, Integer> map = new ForwardingSortedMap<String, Integer>() {
            private final TreeMap<String, Integer> delegate = new TreeMap<>();

            @Override
            protected TreeMap<String, Integer> delegate() {
                return delegate;
            }
        };

        List<String> keys = new ArrayList<>();
        keys.add("key1");
        keys.add("key2");
        keys.add("key3");

        ForwardingList<Integer> values = new ForwardingList<Integer>() {
            private final List<Integer> delegate = new ArrayList<>();

            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };

        for (int i = 0; i < keys.size(); i++) {
            values.add(i * 10);
        }

        for (int i = 0; i < keys.size(); i++) {
            map.put(keys.get(i), values.get(i));
        }

        /* write */ map.put("key", 42);

        int sum = 0;
        for (String key : keys) {
            sum += map.get(key);
        }
        System.out.println("Sum of values: " + sum);

        /* read */ int value = map.get("key");
        System.out.println("Value for 'key': " + value);

        ForwardingSortedMap<String, Double> anotherMap = new ForwardingSortedMap<String, Double>() {
            private final TreeMap<String, Double> delegate = new TreeMap<>();

            @Override
            protected TreeMap<String, Double> delegate() {
                return delegate;
            }
        };

        anotherMap.put("pi", 3.14);
        anotherMap.put("e", 2.71);
        System.out.println("Value for 'pi': " + anotherMap.get("pi"));
        System.out.println("Value for 'e': " + anotherMap.get("e"));
    }
}