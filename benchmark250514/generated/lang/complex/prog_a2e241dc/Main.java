import org.apache.commons.lang3.mutable.MutableShort;
import org.apache.commons.lang3.mutable.MutableInt;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MutableShort mutableShort = new MutableShort();
        MutableInt mutableInt = new MutableInt(100);

        // Initialize a map to store some values
        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 10);
        map.put("key2", 20);

        // Perform some operations on the map
        int sum = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of map values: " + sum);

        // Use MutableInt to perform some calculations
        mutableInt.add(50);
        System.out.println("MutableInt value after addition: " + mutableInt.getValue());

        /* write */ mutableShort.setValue((short) 42);

        // More complex operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers 1 to 5: " + product);

        // Use the map to simulate some logic
        if (map.containsKey("key1")) {
            map.put("key1", map.get("key1") + 5);
        }
        System.out.println("Updated value for key1: " + map.get("key1"));

        /* read */ short value = mutableShort.getValue();
        System.out.println("MutableShort value: " + value);

        // Final operation with MutableInt
        mutableInt.subtract(30);
        System.out.println("MutableInt value after subtraction: " + mutableInt.getValue());
    }
}