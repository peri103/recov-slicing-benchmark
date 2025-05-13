import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding numbers to the list
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 10);
        }
        
        // Manipulating the list
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) + 5);
        }
        
        /* write */ strBuilder.append("Hello, World!");
        
        // Further manipulation of the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // Using another StrBuilder instance for additional operations
        StrBuilder anotherStrBuilder = new StrBuilder();
        anotherStrBuilder.append("The sum is: ").append(sum);
        System.out.println(anotherStrBuilder.toString());
        
        // Read the original string from strBuilder
        /* read */ String value = strBuilder.toString();
        System.out.println(value);
    }
}