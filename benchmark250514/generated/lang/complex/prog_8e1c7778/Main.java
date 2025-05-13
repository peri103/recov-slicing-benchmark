import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder with some content
        StrBuilder strBuilder = new StrBuilder("Hello World!");

        // Use the write method to delete a part of the string
        /* write */ strBuilder.delete(5, 11);

        // Initialize an ArrayList for additional complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        // Perform some operations on the ArrayList
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // More complex operations with StrBuilder
        StrBuilder anotherStrBuilder = new StrBuilder("Java Programming");
        anotherStrBuilder.append(" is fun!");
        anotherStrBuilder.replace(5, 16, "Coding");

        // Use the read method to get the current state of the original string
        /* read */ String result = strBuilder.toString();

        // Print the result
        System.out.println(result);

        // Print the modified string from another StrBuilder
        System.out.println(anotherStrBuilder.toString());

        // Additional logic for complexity
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of first 5 natural numbers: " + product);
    }
}