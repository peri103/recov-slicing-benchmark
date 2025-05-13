import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding numbers to the list
        for (int i = 1; i <= 5; i++) {
            numbers.add(i * 10);
        }
        
        // Manipulating the StrBuilder
        strBuilder.append("Hello, World!");
        
        /* write */ strBuilder.setLength(10);
        
        // Performing some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Print the sum of numbers
        System.out.println("Sum of numbers: " + sum);
        
        // Further manipulation of StrBuilder
        strBuilder.append(" - Extended");
        
        // Print the content of StrBuilder
        System.out.println("StrBuilder content: " + strBuilder);
        
        /* read */ String result = strBuilder.toString();
        
        // Print the final result
        System.out.println("Final StrBuilder content: " + result);
        
        // Additional operations with numbers
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 5);
        }
        
        // Print the modified numbers
        System.out.println("Modified numbers: " + numbers);
    }
}