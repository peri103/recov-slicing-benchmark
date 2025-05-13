import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder with some content
        StrBuilder strBuilder = new StrBuilder("Hello World");

        // Perform the write operation: delete character at index 5 (space)
        /* write */ strBuilder.deleteCharAt(5);

        // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");

        // Perform some operations on the ArrayList
        list.remove(1); // Remove the second element
        list.add("Fourth"); // Add a new element

        // Manipulate the StrBuilder further
        strBuilder.append(" from Java");
        strBuilder.insert(0, "Welcome to ");
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 9: " + sum);

        // Perform the read operation: convert the StrBuilder to a String
        /* read */ String result = strBuilder.toString();

        // Print the result to verify the operations
        System.out.println(result);

        // Print the elements of the ArrayList to verify its state
        for (String item : list) {
            System.out.println(item);
        }
    }
}