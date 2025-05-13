import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Initialize StrBuilder and perform some operations
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello World!");
        
        // Perform unrelated operations with an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        // Manipulate the ArrayList
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // More operations on StrBuilder
        strBuilder.append(" Welcome to Java Programming.");
        
        // Modify the StrBuilder
        /* write */ strBuilder.deleteAll("World");
        
        // Perform additional unrelated operations
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        
        for (String word : words) {
            System.out.println("Programming language: " + word);
        }
        
        // Final operation to read the modified StrBuilder
        /* read */ String result = strBuilder.toString();
        System.out.println("Modified String: " + result);
    }
}