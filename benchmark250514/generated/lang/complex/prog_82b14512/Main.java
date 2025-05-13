import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder with a string
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        
        // Create an ArrayList and add some elements
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        
        // Perform operations on the ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        
        // Extract a substring from the StrBuilder
        /* write */ String subStr = strBuilder.substring(0, 5);
        
        // Perform some unrelated operations
        numbers.add(sum);
        numbers.remove(0);
        
        // Update the StrBuilder with the substring
        strBuilder.clear().append(subStr);
        
        // More operations on ArrayList
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, numbers.get(i) * 2);
        }
        
        // Read the updated value from StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
        
        // Print the modified ArrayList
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}