import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();
        
        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            numbers.add(i);
        }
        
        // Perform operations on ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            int num = numbers.get(i);
            if (num % 2 == 0) {
                strBuilder.append(num);  // Append even numbers to StrBuilder
            } else {
                strBuilder.appendSeparator("-");  // Append separator for odd numbers
            }
        }
        
        /* write */ strBuilder.appendSeparator(",");
        
        // Perform some calculations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Output the sum
        System.out.println("Sum of numbers: " + sum);
        
        // Perform some manipulations on StrBuilder
        strBuilder.append("End");
        
        /* read */ String value = strBuilder.toString();
        System.out.println(value);
        
        // Further operations with ArrayList
        numbers.add(10);
        numbers.remove(0);
        
        // Output the final state of ArrayList
        System.out.println("Final numbers list: " + numbers);
    }
}