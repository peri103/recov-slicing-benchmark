import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("   Hello World!   ");
        
        // Additional operations on StrBuilder
        strBuilder.append(" Welcome to the complex program.");
        strBuilder.insert(0, "Message: ");
        
        // Using another class to demonstrate complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        
        // Print sum of numbers
        System.out.println("Sum of numbers: " + sum);

        /* write */ strBuilder.trim();

        // More operations after trim
        strBuilder.replaceFirst("Message: ", "Trimmed Message: ");
        strBuilder.append(" Have a great day!");

        // Perform operations on ArrayList
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Java");
        strings.add("Python");
        strings.add("C++");

        for (String lang : strings) {
            System.out.println("Programming Language: " + lang);
        }

        // Final read operation
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}