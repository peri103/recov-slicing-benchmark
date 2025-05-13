import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        
        // Perform operations on strBuilder
        strBuilder.append("!");
        strBuilder.insert(0, "Say: ");
        strBuilder.replaceFirst("Hello", "Hi");
        
        // Create an ArrayList and perform operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        // Manipulate the list
        numbers.remove(0);
        numbers.add(5, 42);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Original write-read pair
        /* write */ strBuilder.deleteCharAt(5); // Removes the space between "Say:" and "Hi"
        
        // Do more operations
        strBuilder.reverse();
        strBuilder.append(" Reversed");
        
        // Perform some unrelated operations
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 5: " + product);
        
        // Original read
        /* read */ String result = strBuilder.toString();
        System.out.println(result); // Outputs: !desreveR :yaSih
        
        // Additional operations
        if (result.contains("Reversed")) {
            System.out.println("The string contains 'Reversed'");
        }
        
        // Final manipulation of the list
        numbers.clear();
        numbers.add(100);
        numbers.add(200);
        System.out.println("Final list: " + numbers);
    }
}