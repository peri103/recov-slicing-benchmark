import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello, World!");

        // Additional unrelated code to make the program more complex
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Additional operations on StrBuilder
        strBuilder.append(" Welcome to the complex program!");
        String initialString = strBuilder.toString();
        System.out.println("Initial String: " + initialString);

        // Original write operation
        /* write */ strBuilder.setLength(5);

        // More unrelated code
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Programming");
        words.add("Complexity");

        for (String word : words) {
            System.out.println("Word: " + word);
        }

        // Original read operation
        /* read */ String value = strBuilder.toString();
        System.out.println("Final String after setLength: " + value);

        // Additional manipulation on the StrBuilder
        strBuilder.append(" StrBuilder is fun!");
        String finalString = strBuilder.toString();
        System.out.println("Final String: " + finalString);
    }
}