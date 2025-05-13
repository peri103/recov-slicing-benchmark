import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("  Hello World  ");
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }

        // Performing some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // String manipulation using StrBuilder
        strBuilder.append(" - Welcome!");
        System.out.println("Before trim: " + strBuilder.toString());

        /* write */ strBuilder.trim(); // Trimming the whitespace
        System.out.println("After trim: " + strBuilder.toString());

        // More operations on the list
        int max = Integer.MIN_VALUE;
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum number: " + max);

        // Final read operation
        /* read */ String result = strBuilder.toString();
        System.out.println("Final string: " + result);

        // Additional complex operations
        StrBuilder anotherStrBuilder = new StrBuilder("Complex String Operations");
        anotherStrBuilder.insert(8, " and More");
        anotherStrBuilder.replace(0, 7, "Advanced");
        System.out.println("Modified string: " + anotherStrBuilder.toString());
    }
}