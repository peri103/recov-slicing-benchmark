import org.apache.commons.lang3.builder.CompareToBuilder;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        List<Integer> numbers = new ArrayList<>();
        
        // Add numbers to the list
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        
        // Perform some operations on the list
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Use CompareToBuilder to compare two numbers
        /* write */ compareToBuilder.append(5, 3);
        
        // More operations on the list
        int max = numbers.get(0);
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max number: " + max);
        
        // Use CompareToBuilder to get the comparison result
        /* read */ int comparisonResult = compareToBuilder.toComparison();
        
        System.out.println("Comparison result: " + comparisonResult);
        
        // Further operations on numbers
        int product = 1;
        for (int num : numbers) {
            product *= num + 1; // Avoid zero multiplication
        }
        System.out.println("Product of numbers+1: " + product);
    }
}