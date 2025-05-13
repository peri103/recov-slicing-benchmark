import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder and ArrayList
        StrBuilder strBuilder = new StrBuilder("Initial String");
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }

        // Perform operations on ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Clear the StrBuilder
        /* write */ strBuilder.clear();

        // Perform operations on ArrayList
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);

        // Convert StrBuilder to String
        /* read */ String result = strBuilder.toString();
        System.out.println("Result after clear: '" + result + "'");

        // Additional operations using StrBuilder
        strBuilder.append("New Content");
        strBuilder.append(", and more.");
        System.out.println("Updated StrBuilder: " + strBuilder.toString());
    }
}