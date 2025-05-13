import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Initialize a StrBuilder with some text
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        
        // Initialize an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        // Perform some operations on the ArrayList
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        
        // Print the sum of numbers
        System.out.println("Sum of numbers: " + sum);
        
        // Initialize a HashMap and populate it with key-value pairs
        HashMap<String, String> map = new HashMap<>();
        map.put("firstName", "John");
        map.put("lastName", "Doe");
        
        // Access and print a value from the HashMap
        String firstName = map.get("firstName");
        System.out.println("First Name: " + firstName);
        
        // Modify the StrBuilder by deleting a portion of the string
        /* write */ strBuilder.delete(0, 7); // Deletes "Hello, "
        
        // More complex operations with StrBuilder
        strBuilder.append(" Welcome to the universe.");
        strBuilder.insert(0, "Greetings! ");
        
        // Perform some additional operations on the ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
        
        // Print the modified numbers
        System.out.println("Modified Numbers: " + numbers);
        
        // Convert the StrBuilder to a string and print it
        /* read */ String result = strBuilder.toString();
        System.out.println(result); // Outputs "Greetings! World! Welcome to the universe."
    }
}