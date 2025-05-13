import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListMultimap<String, Integer> multimap = ArrayListMultimap.create();
        Map<String, String> map = new HashMap<>();
        map.put("greeting", "Hello, World!");

        // Additional write operation using HashMap
        map.put("farewell", "Goodbye!");

        // Perform some unrelated operations
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        /* write */ multimap.put("key", 42);

        // More complex operations
        List<String> keys = multimap.keys().asList();
        for (String key : keys) {
            System.out.println("Multimap contains key: " + key);
        }

        // Retrieve value from HashMap
        String greeting = map.get("greeting");
        System.out.println(greeting);

        /* read */ List<Integer> values = multimap.get("key");
        System.out.println(values.get(0));

        // Further operations
        map.put("question", "How are you?");
        String question = map.get("question");
        System.out.println(question);

        // Iterating over HashMap
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}