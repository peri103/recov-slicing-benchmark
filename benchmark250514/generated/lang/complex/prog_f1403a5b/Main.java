import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize the StrBuilder with some content
        StrBuilder strBuilder = new StrBuilder("Hello, World!");

        // Use the deleteAll method to remove all occurrences of a substring
        /* write */ strBuilder.deleteAll("World");

        // Add some complex operations with unrelated code
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }

        System.out.println("Sum of numbers: " + sum);

        // More operations
        StrBuilder anotherStrBuilder = new StrBuilder("Java Programming");
        anotherStrBuilder.append(" is fun!");
        String extractedString = anotherStrBuilder.substring(5, 16);
        System.out.println("Extracted String: " + extractedString);

        // More list operations
        List<String> strings = new ArrayList<>();
        strings.add("Apple");
        strings.add("Banana");
        strings.add("Cherry");

        for (String fruit : strings) {
            System.out.println("Fruit: " + fruit);
        }

        // Use the toString method to read the content of the StrBuilder
        /* read */ String result = strBuilder.toString();

        // Print the result to verify the operations
        System.out.println("Modified StrBuilder: " + result);
    }
}