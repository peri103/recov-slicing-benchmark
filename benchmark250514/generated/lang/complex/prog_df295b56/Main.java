import org.apache.commons.lang3.builder.CompareToBuilder;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CompareToBuilder compareToBuilder = new CompareToBuilder();
        ArrayList<Integer> numberList = new ArrayList<>();
        
        // Populate the number list with some values
        for (int i = 0; i < 5; i++) {
            numberList.add(i * 2);
        }
        
        // Perform some operations on the number list
        int sum = 0;
        for (Integer num : numberList) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
        
        // Using another CompareToBuilder instance for different comparison
        CompareToBuilder anotherBuilder = new CompareToBuilder();
        anotherBuilder.append(20, 15);
        int anotherComparisonResult = anotherBuilder.toComparison();
        System.out.println("Another comparison result: " + anotherComparisonResult);
        
        /* write */ compareToBuilder.append(5, 10);
        
        // More operations on numberList
        numberList.add(100);
        numberList.remove(0);
        System.out.println("Modified List: " + numberList);
        
        /* read */ int comparisonResult = compareToBuilder.toComparison();
        System.out.println("Comparison result: " + comparisonResult);
        
        // Perform a final operation on numberList
        int product = 1;
        for (Integer num : numberList) {
            product *= num;
        }
        System.out.println("Product of numbers: " + product);
    }
}