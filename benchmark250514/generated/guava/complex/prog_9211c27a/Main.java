import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        Map<String, Integer> simpleMap = new HashMap<>();

        // Adding some complexity with a simple map
        simpleMap.put("One", 1);
        simpleMap.put("Two", 2);
        simpleMap.put("Three", 3);

        // Iterating over the simple map
        for (Map.Entry<String, Integer> entry : simpleMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Perform some operations before the write
        int sum = 0;
        for (Integer value : simpleMap.values()) {
            sum += value;
        }
        System.out.println("Sum of values in simpleMap: " + sum);

        // Original write operation
        /* write */ map.putInstance(String.class, "Hello World");

        // More operations after the write
        simpleMap.put("Four", 4);
        System.out.println("Updated simpleMap: " + simpleMap);

        // Perform complex calculations
        double average = (double) sum / simpleMap.size();
        System.out.println("Average of values in simpleMap: " + average);

        // Original read operation
        /* read */ String value = map.getInstance(String.class);
        
        // Print the value read from the map
        System.out.println("Value from ClassToInstanceMap: " + value);

        // Additional operations after reading
        simpleMap.put("Five", 5);
        System.out.println("Final simpleMap: " + simpleMap);
    }
}