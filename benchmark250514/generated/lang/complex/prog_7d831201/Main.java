import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder with a sample text
        StrBuilder strBuilder = new StrBuilder("Hello World");

        // Initialize an ArrayList to store some values
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * i);  // Add squares of numbers
        }

        // Perform a complex operation on the ArrayList
        int sumOfSquares = 0;
        for (int num : numbers) {
            sumOfSquares += num;
        }
        System.out.println("Sum of squares: " + sumOfSquares);

        // Modify the StrBuilder content
        /* write */ strBuilder.replaceAll("World", "Java");

        // Perform another operation on the ArrayList
        int maxSquare = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > maxSquare) {
                maxSquare = num;
            }
        }
        System.out.println("Max square: " + maxSquare);

        // Extract the modified content from StrBuilder
        /* read */ String result = strBuilder.toString();
        
        // Print the result from StrBuilder
        System.out.println(result);

        // Additional unrelated logic for complexity
        ArrayList<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");

        for (String word : words) {
            System.out.println("Fruit: " + word);
        }
    }
}