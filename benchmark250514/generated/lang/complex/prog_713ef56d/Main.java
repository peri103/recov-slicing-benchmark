import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Populate the list with some numbers
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Perform some operations on the list
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);

        // Manipulate the StrBuilder object
        /* write */ strBuilder.replace(7, 12, "Java");
        
        // More operations on the list
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum number: " + max);

        // Perform some string operations
        StrBuilder anotherStrBuilder = new StrBuilder("Initial Text");
        anotherStrBuilder.append(" - Appended Text");
        String finalString = anotherStrBuilder.toString();
        System.out.println(finalString);

        // Read the manipulated string from the original StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println("Final result: " + result);
    }
}