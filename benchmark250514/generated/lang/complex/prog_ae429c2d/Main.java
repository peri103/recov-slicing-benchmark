import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder with leading and trailing spaces
        StrBuilder strBuilder = new StrBuilder("   Hello, World!   ");
        
        // Initialize a list and a map
        ArrayList<Integer> numbers = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        // Add some numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }

        // Add some key-value pairs to the map
        map.put("one", "1");
        map.put("two", "2");

        // Perform the trim operation on StrBuilder
        /* write */ strBuilder.trim();

        // Process the list
        for (Integer number : numbers) {
            System.out.println("Number: " + number);
        }

        // Access the map and print values
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Convert the trimmed StrBuilder to string
        /* read */ String value = strBuilder.toString();
        
        // Print the trimmed string
        System.out.println("Trimmed value: " + value);

        // Further processing with the list
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}