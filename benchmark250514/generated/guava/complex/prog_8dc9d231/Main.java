import com.google.common.collect.ForwardingMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.HashMultimap;

public class Main {
    public static void main(String[] args) {
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        ForwardingMultimap<String, Integer> forwardingMultimap = new ForwardingMultimap<String, Integer>() {
            @Override
            protected Multimap<String, Integer> delegate() {
                return multimap;
            }
        };

        Multimap<String, String> anotherMultimap = HashMultimap.create();
        anotherMultimap.put("keyA", "valueA");
        anotherMultimap.put("keyB", "valueB");

        /* write */ forwardingMultimap.put("key1", 42);

        for (String key : anotherMultimap.keySet()) {
            System.out.println("AnotherMultimap key: " + key + " values: " + anotherMultimap.get(key));
        }

        int sum = 0;
        for (Integer number : forwardingMultimap.get("key1")) {
            sum += number;
        }

        Multimap<String, Double> doubleMultimap = HashMultimap.create();
        doubleMultimap.put("doubleKey", 3.14);
        doubleMultimap.put("doubleKey", 2.71);

        for (Double value : doubleMultimap.get("doubleKey")) {
            System.out.println("Double value: " + value);
        }

        /* read */ Integer value = forwardingMultimap.get("key1").iterator().next();
        System.out.println("Read value: " + value);

        Multimap<String, Boolean> booleanMultimap = HashMultimap.create();
        booleanMultimap.put("boolKey", true);
        booleanMultimap.put("boolKey", false);

        for (Boolean bool : booleanMultimap.get("boolKey")) {
            System.out.println("Boolean value: " + bool);
        }
    }
}