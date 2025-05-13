import org.apache.commons.lang3.text.StrBuilder;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        StrBuilder strBuilder2 = new StrBuilder("Java Programming");
        
        /* write */ strBuilder.delete(5, 11);
        
        // Performing operations on strBuilder2
        strBuilder2.append(" is fun!");
        strBuilder2.insert(0, "Learning ");
        
        // Manipulating arrays
        int[] numbers = {5, 10, 15, 20};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // More operations on strBuilder2
        strBuilder2.replace(0, 8, "Mastering");
        System.out.println(strBuilder2.toString());
        
        // Using a loop for demonstration
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteration: " + i);
        }

        // Complex string manipulation
        String[] words = {"Hello", "World", "from", "Java"};
        StrBuilder strBuilder3 = new StrBuilder();
        for (String word : words) {
            strBuilder3.append(word).append(" ");
        }
        System.out.println(strBuilder3.toString().trim());
        
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}