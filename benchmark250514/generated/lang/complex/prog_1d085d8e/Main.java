import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, Integer> wordCount = new HashMap<>();
        
        // Populate the list with numbers
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        // Populate the map with word counts
        wordCount.put("Hello", 1);
        wordCount.put("World", 1);

        // Perform some operations on the list
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform some operations on the map
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }

        // Original write operation
        /* write */ strBuilder.substring(0, 5);

        // More operations
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            builder.append(numbers.get(i)).append(" ");
        }
        System.out.println("First five numbers: " + builder.toString());

        // Original read operation
        /* read */ String value = strBuilder.toString();
        System.out.println("StrBuilder content: " + value);

        // Additional logic to manipulate the string
        String upperCaseValue = value.toUpperCase();
        System.out.println("Uppercase StrBuilder content: " + upperCaseValue);
    }
}