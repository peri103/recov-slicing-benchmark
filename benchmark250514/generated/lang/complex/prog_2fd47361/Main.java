import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder();
        strBuilder.append("Hello, World!");
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }
        
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        String greeting = strBuilder.toString();
        System.out.println("Original greeting: " + greeting);
        
        /* write */ strBuilder.deleteAll("World");
        
        String modifiedGreeting = strBuilder.toString();
        
        ArrayList<String> greetingsList = new ArrayList<>();
        greetingsList.add(greeting);
        greetingsList.add(modifiedGreeting);
        
        for (String greet : greetingsList) {
            System.out.println("Greeting: " + greet);
        }
        
        int product = 1;
        for (int num : numbers) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
        
        /* read */ String result = strBuilder.toString();
        System.out.println("Modified greeting: " + result);
    }
}