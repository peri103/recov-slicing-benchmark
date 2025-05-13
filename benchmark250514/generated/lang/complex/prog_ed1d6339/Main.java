import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder with a string
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        
        // Additional complex logic using ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i); // Add square of numbers 0 to 9
        }

        // Perform some operations with ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of squares: " + sum);

        // Modify the StrBuilder object
        strBuilder.append(" How are you?");
        
        // More complex operations
        String greeting = "Hello";
        String name = "Alice";
        String fullGreeting = greeting + ", " + name + "!";
        
        // Use another StrBuilder for more operations
        StrBuilder anotherStrBuilder = new StrBuilder(fullGreeting);
        anotherStrBuilder.append(" Nice to meet you.");
        
        // Extract a substring (write operation)
        /* write */ String subStr = strBuilder.substring(0, 5); // Extracts "Hello"
        
        // More operations unrelated to original write-read pair
        int[] data = {1, 2, 3, 4, 5};
        for (int value : data) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Read the original StrBuilder content (read operation)
        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        // Further operations with another StrBuilder
        System.out.println(anotherStrBuilder.toString());
    }
}