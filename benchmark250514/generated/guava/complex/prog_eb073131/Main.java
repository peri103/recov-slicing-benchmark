import com.google.common.collect.LinkedHashMultimap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMultimap<String, String> multimap = LinkedHashMultimap.create();
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Add some elements to the HashMap
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        // Iterate over the HashMap and print the values
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Perform some operations with the LinkedHashMultimap
        multimap.put("alpha", "first");
        multimap.put("beta", "second");

        // Add some unrelated code to make the program more complex
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of first 10 numbers: " + sum);

        /* write */ multimap.put("key", "value");

        // Perform some operations with the LinkedHashMultimap
        multimap.put("gamma", "third");
        multimap.put("delta", "fourth");

        // Iterate over the multimap and print all values for each key
        for (String key : multimap.keySet()) {
            System.out.println(key + ": " + multimap.get(key));
        }

        // More unrelated code to increase complexity
        double average = sum / 10.0;
        System.out.println("Average: " + average);

        /* read */ String value = multimap.get("key").iterator().next();
        
        System.out.println(value);

        // Perform additional operations with HashMap
        hashMap.put("four", 4);
        hashMap.put("five", 5);

        // Print updated HashMap
        System.out.println("Updated HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}