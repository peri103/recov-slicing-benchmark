import org.jfree.chart.title.TextTitle;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize TextTitle object
        TextTitle title = new TextTitle();

        // Create an ArrayList to store numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add numbers to the ArrayList
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }

        // Perform some calculations with the numbers
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Set the text for the title
        /* write */ title.setText("Hello World");

        // Create another ArrayList to store strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Programming");
        strings.add("Complexity");

        // Concatenate strings
        StringBuilder concatenated = new StringBuilder();
        for (String str : strings) {
            concatenated.append(str).append(" ");
        }
        System.out.println("Concatenated strings: " + concatenated.toString().trim());

        // Retrieve and print the text from the title
        /* read */ String value = title.getText();
        System.out.println("Title text: " + value);

        // Perform more operations with the numbers
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);

        // Print each string in uppercase
        for (String str : strings) {
            System.out.println("Uppercase: " + str.toUpperCase());
        }
    }
}