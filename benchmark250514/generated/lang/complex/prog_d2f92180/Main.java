import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder and perform original operations
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello World");
        
        // Additional operations with StrBuilder
        strBuilder.append("!");
        strBuilder.insert(0, "Greetings ");
        
        // Work with ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Perform operations on HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        
        // Modify StrBuilder
        /* write */ strBuilder.deleteFirst("Hello");
        
        // More operations on ArrayList
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                System.out.println("Even number: " + num);
            }
        }

        // Access and print HashMap values
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        
        // Final read operation and output
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}