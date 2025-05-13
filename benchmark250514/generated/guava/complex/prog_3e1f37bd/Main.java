import com.google.common.collect.MutableClassToInstanceMap;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        Map<String, Integer> additionalMap = new HashMap<>();
        additionalMap.put("One", 1);
        additionalMap.put("Two", 2);

        // Some unrelated operations
        for (Map.Entry<String, Integer> entry : additionalMap.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        ImmutableMap<String, String> immutableMap = ImmutableMap.of("Key1", "Value1", "Key2", "Value2");
        for (Map.Entry<String, String> entry : immutableMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        /* write */ map.putInstance(String.class, "Hello, world!");

        // More unrelated operations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // Adding another similar write-read pair
        MutableClassToInstanceMap<Object> anotherMap = MutableClassToInstanceMap.create();
        anotherMap.putInstance(Integer.class, 42);

        // Some more unrelated operations
        StringBuilder sb = new StringBuilder();
        sb.append("Complexity");
        sb.append(" in");
        sb.append(" Java");
        System.out.println(sb.toString());

        // Read from the additional map
        Integer intValue = anotherMap.getInstance(Integer.class);
        System.out.println("Integer value from anotherMap: " + intValue);

        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);

        // Final unrelated operations
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of 5: " + factorial);
    }
}