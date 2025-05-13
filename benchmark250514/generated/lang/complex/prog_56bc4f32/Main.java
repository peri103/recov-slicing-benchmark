import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Insert numbers into the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        // Perform some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Use the StrBuilder to create a message
        String message = "The sum of the numbers is: " + sum;
        /* write */ strBuilder.insert(0, "Hello, World!");
        
        // Further operations
        strBuilder.append(" Additional Message: ");
        strBuilder.append(message);
        
        // Perform some calculations
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        
        // Print results
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        
        // Finally read from StrBuilder and print
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
        
        // Additional logic
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 3);
        }
        
        // Print updated numbers
        for (int num : numbers) {
            System.out.println("Updated number: " + num);
        }
    }
}