import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        
        // Some unrelated operations
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Operations on StrBuilder
        strBuilder.append("Hello");
        strBuilder.append(" World");
        
        // More complex operations
        for (Integer number : numbers) {
            strBuilder.append(" ").append(number);
        }

        /* write */ strBuilder.setLength(5);

        // Perform operations on numbers list
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        
        // Print sum
        System.out.println("Sum of numbers: " + sum);
        
        // Additional manipulation on StrBuilder
        strBuilder.append("!");
        strBuilder.insert(0, "Start: ");
        
        // Final read operation
        /* read */ String value = strBuilder.toString();
        System.out.println(value);
    }
}