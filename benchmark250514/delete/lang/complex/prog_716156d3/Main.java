import org.apache.commons.lang3.text.StrBuilder;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World!");
        StrBuilder strBuilder2 = new StrBuilder("Goodbye World!");
        
        // Additional operations on strBuilder2
        strBuilder2.append(" Have a nice day!");
        System.out.println("Length of strBuilder2: " + strBuilder2.length());

        // Random operations
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println("Random number: " + randomNumber);

        // Some arithmetic operations
        int a = 5;
        int b = 10;
        int sum = a + b;
        System.out.println("Sum of a and b: " + sum);

        /* write */ StrBuilder substringBuilder = strBuilder.substring(0, 5);

        // More operations on strBuilder
        strBuilder.append(" How are you?");
        System.out.println("Length of strBuilder: " + strBuilder.length());
        
        // Conditional logic
        if (sum > randomNumber) {
            System.out.println("Sum is greater than the random number.");
        } else {
            System.out.println("Random number is greater than or equal to the sum.");
        }

        /* read */ String value = substringBuilder.toString();
        System.out.println(value);

        // Looping logic
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}