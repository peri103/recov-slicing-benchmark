import com.google.common.collect.ImmutableSortedMap;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create an ImmutableSortedMap using the builder
        ImmutableSortedMap.Builder<String, Integer> builder = ImmutableSortedMap.naturalOrder();

        /* write */ builder.put("key1", 100);

        // Build the ImmutableSortedMap
        ImmutableSortedMap<String, Integer> map = builder.build();

        // Additional unrelated code to increase complexity
        Map<String, String> simpleMap = new HashMap<>();
        simpleMap.put("a", "apple");
        simpleMap.put("b", "banana");
        simpleMap.put("c", "cherry");

        ImmutableList<String> fruits = ImmutableList.of("apple", "banana", "cherry", "date");
        for (String fruit : fruits) {
            if (simpleMap.containsValue(fruit)) {
                System.out.println("Found fruit in simpleMap: " + fruit);
            }
        }

        // More code to use similar API pairs
        ImmutableSortedMap.Builder<Integer, String> anotherBuilder = ImmutableSortedMap.naturalOrder();
        anotherBuilder.put(1, "one");
        anotherBuilder.put(2, "two");
        anotherBuilder.put(3, "three");
        ImmutableSortedMap<Integer, String> numberMap = anotherBuilder.build();

        for (Integer key : numberMap.keySet()) {
            System.out.println("Number map key: " + key + ", value: " + numberMap.get(key));
        }

        /* read */ Integer value = map.get("key1");

        System.out.println("Value from original map: " + value);

        // Further unrelated code to increase complexity
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i * i;
        }
        System.out.println("Sum of squares: " + sum);

        for (String key : simpleMap.keySet()) {
            System.out.println("Simple map key: " + key + ", value: " + simpleMap.get(key));
        }
    }
}