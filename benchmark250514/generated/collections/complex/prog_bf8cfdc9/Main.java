import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Create a PassiveExpiringMap with expiration time set to 1 minute
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.MINUTES.toMillis(1));
        
        /* write */ map.put("key", "value");
        
        // Create a HashMap and add some entries
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Perform some operations on the HashMap
        int sum = 0;
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            sum += entry.getValue();
        }
        System.out.println("Sum of values in HashMap: " + sum);
        
        // Add more entries to the PassiveExpiringMap
        map.put("anotherKey", "anotherValue");
        map.put("yetAnotherKey", "yetAnotherValue");
        
        // Perform some unrelated logic
        int factorial = 1;
        int number = 5; // Factorial of 5
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
        
        // Retrieve the original value from the PassiveExpiringMap
        /* read */ String value = map.get("key");
        
        System.out.println(value);
        
        // Perform more operations on the HashMap
        if (hashMap.containsKey("two")) {
            hashMap.put("two", hashMap.get("two") + 3);
        }
        
        // Output the updated value
        System.out.println("Updated value for 'two': " + hashMap.get("two"));
    }
}