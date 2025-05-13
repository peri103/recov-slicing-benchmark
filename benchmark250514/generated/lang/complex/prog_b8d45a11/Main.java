import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original StrBuilder operation
        StrBuilder strBuilder = new StrBuilder("Hello World!");

        // Additional complex logic
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        StrBuilder anotherStrBuilder = new StrBuilder("Java Programming");
        anotherStrBuilder.append(" is fun!");
        System.out.println("Another StrBuilder: " + anotherStrBuilder.toString());

        // Original write operation
        /* write */ strBuilder.deleteFirst('H');

        // More complex operations
        StrBuilder combinedBuilder = new StrBuilder();
        combinedBuilder.append(anotherStrBuilder);
        combinedBuilder.append(" Let's code more.");
        System.out.println("Combined StrBuilder: " + combinedBuilder.toString());

        // Original read operation
        /* read */ String result = strBuilder.toString();
        System.out.println("Original StrBuilder after deletion: " + result);

        // Further operations
        int product = 1;
        for (int num : numbers) {
            product *= num + 1; // To avoid multiplying by zero
        }
        System.out.println("Product of numbers: " + product);
    }
}