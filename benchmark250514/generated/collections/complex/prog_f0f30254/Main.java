import org.apache.commons.collections4.map.PassiveExpiringMap;
import java.util.concurrent.TimeUnit;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the PassiveExpiringMap with a 1-minute expiration time for entries
        PassiveExpiringMap<String, Integer> map = new PassiveExpiringMap<>(TimeUnit.MINUTES.toMillis(1));
        
        // A regular HashMap for comparison
        HashMap<String, String> regularMap = new HashMap<>();
        regularMap.put("name", "John Doe");
        regularMap.put("occupation", "Software Engineer");
        
        // An ArrayList to store some numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Print contents of the regular HashMap
        for (String key : regularMap.keySet()) {
            System.out.println(key + ": " + regularMap.get(key));
        }
        
        // Add more elements to ArrayList
        numbers.add(100);
        numbers.add(200);
        
        // Print all numbers in the ArrayList
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }
        
        /* write */ map.put("key", 42);
        
        // Perform some calculations
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Simulate some operations on the map
        map.put("anotherKey", 84);
        map.put("yetAnotherKey", 168);
        
        // Retrieve and print value from the map
        /* read */ Integer value = map.get("key");
        System.out.println("Retrieved value from PassiveExpiringMap: " + value);
        
        // Print additional values from the map
        System.out.println("Another value: " + map.get("anotherKey"));
        System.out.println("Yet another value: " + map.get("yetAnotherKey"));
    }
}