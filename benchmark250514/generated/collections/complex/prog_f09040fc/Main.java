import org.apache.commons.collections4.map.AbstractLinkedMap;
import org.apache.commons.collections4.map.LinkedMap;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize a LinkedMap
        LinkedMap<String, Integer> map = new LinkedMap<>();
        
        // Initialize a HashMap
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Alice");
        hashMap.put("city", "Wonderland");

        // Initialize an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Process data in ArrayList
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Write to LinkedMap
        /* write */ map.put("key", 42);

        // Perform operations on HashMap
        String name = hashMap.get("name");
        String city = hashMap.get("city");
        System.out.println("Name: " + name + ", City: " + city);

        // Perform some unrelated operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Read from LinkedMap
        /* read */ Integer value = map.get("key");
        System.out.println("Value from LinkedMap: " + value);

        // Further operations on ArrayList
        numbers.add(100);
        numbers.add(200);

        // Print updated ArrayList
        for (int num : numbers) {
            System.out.println("Updated Number: " + num);
        }
    }
}