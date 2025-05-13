import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Original write-read pair
        StrBuilder strBuilder = new StrBuilder("Hello, World!");
        /* write */ strBuilder.substring(0, 5); // Doesn't modify the original StrBuilder

        // Additional code to increase complexity
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 2);
        }

        StrBuilder additionalStrBuilder = new StrBuilder();
        for (Integer number : numbers) {
            additionalStrBuilder.append(number).append(", ");
        }

        String additionalResult = additionalStrBuilder.toString();
        System.out.println("Numbers: " + additionalResult);

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        // More unrelated operations
        StrBuilder anotherStrBuilder = new StrBuilder("Complexity is the key!");
        String anotherSubstring = anotherStrBuilder.substring(0, 9);
        System.out.println("Another substring: " + anotherSubstring);

        int maxNumber = numbers.stream().max(Integer::compare).get();
        System.out.println("Max number: " + maxNumber);

        // Original read operation
        /* read */ String result = strBuilder.toString();
        System.out.println(result);
    }
}