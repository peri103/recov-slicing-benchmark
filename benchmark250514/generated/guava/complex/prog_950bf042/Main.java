import com.google.common.collect.MutableClassToInstanceMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a MutableClassToInstanceMap and a HashMap
        MutableClassToInstanceMap<Object> map = MutableClassToInstanceMap.create();
        Map<String, Integer> hashMap = new HashMap<>();

        // Put some values in the hashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Process the hashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in hashMap: " + sum);

        // Use the MutableClassToInstanceMap
        /* write */ map.putInstance(String.class, "Hello, World!");
        
        // More operations
        StringBuilder sb = new StringBuilder();
        sb.append("Computation result: ").append(sum).append(" - ");
        sb.append("Additional text.");

        // Manipulate the StringBuilder
        sb.reverse();
        System.out.println(sb.toString());

        // Retrieve the value from the map
        /* read */ String value = map.getInstance(String.class);
        System.out.println(value);

        // Further operations with StringBuilder
        sb.reverse();
        sb.append(" Finalized.");
        System.out.println(sb.toString());

        // Additional computation
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 numbers: " + product);
    }
}