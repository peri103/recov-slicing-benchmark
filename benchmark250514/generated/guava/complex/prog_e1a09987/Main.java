import com.google.common.collect.ForwardingSortedMap;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        ForwardingSortedMap<String, Integer> forwardingSortedMap = new ForwardingSortedMap<String, Integer>() {
            @Override
            protected SortedMap<String, Integer> delegate() {
                return sortedMap;
            }
        };

        Map<String, String> anotherMap = new HashMap<>();
        anotherMap.put("A", "Apple");
        anotherMap.put("B", "Banana");
        anotherMap.put("C", "Cherry");

        for (Map.Entry<String, String> entry : anotherMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        /* write */ forwardingSortedMap.put("key", 100);

        anotherMap.put("D", "Date");
        anotherMap.remove("B");

        for (String key : anotherMap.keySet()) {
            System.out.println("Fruit: " + anotherMap.get(key));
        }

        Integer sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* read */ Integer value = forwardingSortedMap.get("key");
        System.out.println("Value from ForwardingSortedMap: " + value);

        double factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}