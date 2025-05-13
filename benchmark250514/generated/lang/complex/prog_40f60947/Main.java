import org.apache.commons.lang3.text.StrBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        StrBuilder strBuilder = new StrBuilder("Hello World");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        /* write */ strBuilder.replaceAll("World", "Java");

        // Perform some unrelated operations
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);

        StringBuilder additionalBuilder = new StringBuilder("Complexity");
        additionalBuilder.append(" Increased");

        // Perform operations with additionalBuilder
        String additionalResult = additionalBuilder.toString();
        System.out.println("Additional StringBuilder Result: " + additionalResult);

        // Use numbers in a more complex way
        ArrayList<Integer> squaredNumbers = new ArrayList<>();
        for (int num : numbers) {
            squaredNumbers.add(num * num);
        }

        System.out.println("Squared Numbers: " + squaredNumbers);

        /* read */ String result = strBuilder.toString();
        System.out.println(result);

        // Further operations with squaredNumbers
        int squaredSum = 0;
        for (int sqNum : squaredNumbers) {
            squaredSum += sqNum;
        }
        System.out.println("Sum of Squared Numbers: " + squaredSum);
    }
}