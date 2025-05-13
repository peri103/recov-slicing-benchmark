import com.google.common.collect.ClassToInstanceMap;
import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ImmutableMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Original ClassToInstanceMap usage
        ClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        /* write */ map.putInstance(Integer.class, 42);

        // Additional unrelated code to make the program more complex
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("key1", "value1");
        stringMap.put("key2", "value2");

        ImmutableMap<String, String> immutableStringMap = ImmutableMap.copyOf(stringMap);
        System.out.println("Immutable Map: " + immutableStringMap);

        // Simulating additional operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        // More map operations
        Map<String, Integer> numberMap = new HashMap<>();
        numberMap.put("one", 1);
        numberMap.put("two", 2);
        numberMap.put("three", 3);

        for (Map.Entry<String, Integer> entry : numberMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Reading from the original ClassToInstanceMap
        /* read */ Integer value = map.getInstance(Integer.class);
        System.out.println(value);

        // Additional unrelated logic
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}