import org.apache.commons.lang3.builder.CompareToBuilder;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Initialize CompareToBuilder
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        
        // Initialize an ArrayList with integers
        ArrayList<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 5, 3, 8, 1, 2);
        
        // Sort the numbers using a custom comparator
        Collections.sort(numbers, (a, b) -> {
            CompareToBuilder builder = new CompareToBuilder();
            builder.append(a, b);
            return builder.toComparison();
        });
        
        // Print sorted numbers
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // Add more numbers to the list
        numbers.add(6);
        numbers.add(4);
        
        // Sort again using CompareToBuilder
        Collections.sort(numbers, (a, b) -> {
            CompareToBuilder builder = new CompareToBuilder();
            builder.append(a, b);
            return builder.toComparison();
        });

        // Print sorted numbers again
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        
        // Perform some comparison using CompareToBuilder
        /* write */ compareToBuilder.append(1, 1);
        
        // Additional logic involving comparison
        int result = new CompareToBuilder().append(3, 5).toComparison();
        System.out.println("Comparison result of 3 and 5: " + result);
        
        // Some complex logic before reading the comparison result
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Read the comparison result
        /* read */ int comparisonResult = compareToBuilder.toComparison();
        System.out.println("Comparison result: " + comparisonResult);
        
        // More complex operations
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        System.out.println("Product of numbers: " + product);
    }
}