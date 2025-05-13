import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder object
        StrBuilder strBuilder = new StrBuilder();
        
        // Initialize a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        
        // Append separator to the StrBuilder
        /* write */ strBuilder.appendSeparator(",");
        
        // Append elements from the list to the StrBuilder
        for (String fruit : stringList) {
            strBuilder.append(fruit);
        }

        // Perform some unrelated operations
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Convert StrBuilder to String and read the value
        /* read */ String result = strBuilder.toString();
        
        // Print the result
        System.out.println("Concatenated String: " + result);
        
        // Further process the result
        String[] fruitsArray = result.split(",");
        for (String fruit : fruitsArray) {
            System.out.println("Fruit: " + fruit);
        }
        
        // Perform more unrelated operations
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}