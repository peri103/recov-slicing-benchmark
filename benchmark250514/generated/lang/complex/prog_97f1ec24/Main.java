import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();

        // Adding some numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        // Adding some strings to the list
        strings.add("Alpha");
        strings.add("Beta");
        strings.add("Gamma");

        // Manipulating the StrBuilder
        strBuilder.append(" Welcome to Java programming.");
        System.out.println("Before clear: " + strBuilder.toString());

        /* write */ strBuilder.clear();

        // Perform operations on numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Perform operations on strings
        for (String str : strings) {
            System.out.println("String: " + str);
        }

        // Final operation with StrBuilder
        /* read */ String value = strBuilder.toString();
        System.out.println("After clear: " + value); // This should print an empty string

        // Additional complex logic
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 1);
        }

        for (int num : numbers) {
            System.out.println("Modified number: " + num);
        }
    }
}