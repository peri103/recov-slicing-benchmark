import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder
        StrBuilder strBuilder = new StrBuilder();
        
        // Initialize ArrayList and HashMap
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        // Populate ArrayList with some numbers
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        // Populate HashMap with some key-value pairs
        for (int i = 0; i < 5; i++) {
            map.put("key" + i, i * 10);
        }

        // Perform operations with ArrayList
        for (int num : numbers) {
            strBuilder.append(num).append(" ");
        }

        // Perform operations with HashMap
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Add a separator using StrBuilder
        /* write */ strBuilder.appendSeparator(", ", "first");

        // Further operations with ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Number at index " + i + ": " + numbers.get(i));
        }

        // Further operations with HashMap
        for (String key : map.keySet()) {
            System.out.println("Processing " + key);
        }

        // Convert StrBuilder to String
        /* read */ String result = strBuilder.toString();
        System.out.println("StrBuilder result: " + result);

        // Additional operations with ArrayList
        numbers.add(100);
        numbers.add(200);
        for (int num : numbers) {
            System.out.println("Updated number: " + num);
        }
    }
}