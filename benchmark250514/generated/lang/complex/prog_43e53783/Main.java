import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder with a string
        StrBuilder strBuilder = new StrBuilder("Hello World");

        // Additional complexity: Using an ArrayList and sorting it
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        System.out.println("Shuffled numbers: " + numbers);
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers);

        // Perform the reverse operation on StrBuilder
        /* write */ strBuilder.reverse();

        // Additional complexity: Manipulating strings using StrBuilder
        StrBuilder anotherStrBuilder = new StrBuilder("Complex Program");
        anotherStrBuilder.append(" with Java");
        anotherStrBuilder.insert(0, "This is a ");
        System.out.println(anotherStrBuilder.toString());

        // Further complexity: Using mathematical operations
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Read the reversed string from StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println("Reversed string: " + result);

        // Additional complexity: More String manipulations
        StrBuilder finalStrBuilder = new StrBuilder();
        finalStrBuilder.append("The final result is: ");
        finalStrBuilder.append(result);
        System.out.println(finalStrBuilder.toString());
    }
}