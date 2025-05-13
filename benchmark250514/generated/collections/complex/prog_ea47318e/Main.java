import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a timeout of 1 hour
        PassiveExpiringMap<String, String> map = new PassiveExpiringMap<>(TimeUnit.HOURS.toMillis(1));
        
        // Additional code: Using a HashMap to store some data
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        // Iterate over the HashMap and print the values
        for (String key : hashMap.keySet()) {
            System.out.println("HashMap value for " + key + ": " + hashMap.get(key));
        }
        
        // Write a value into the PassiveExpiringMap
        /* write */ map.put("key", "value");
        
        // Perform some operations with the HashMap
        int sum = 0;
        for (Integer value : hashMap.values()) {
            sum += value;
        }
        System.out.println("Sum of HashMap values: " + sum);
        
        // Read the value from the PassiveExpiringMap
        /* read */ String value = map.get("key");
        
        // Print the read value
        System.out.println("PassiveExpiringMap value: " + value);
        
        // Additional code: Manipulate the HashMap
        hashMap.put("four", 4);
        hashMap.put("five", 5);
        
        // Print new values from the HashMap
        for (String key : hashMap.keySet()) {
            System.out.println("Updated HashMap value for " + key + ": " + hashMap.get(key));
        }
    }
}