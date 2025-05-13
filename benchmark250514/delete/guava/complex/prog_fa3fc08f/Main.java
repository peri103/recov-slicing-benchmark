import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import com.google.common.collect.ContiguousSet;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Initialize a DiscreteDomain for integers
        DiscreteDomain<Integer> integerDomain = DiscreteDomain.integers();
        
        // Create a range of integers from 1 to 10
        Range<Integer> range = Range.closed(1, 10);
        
        // Create a ContiguousSet using the range and the integer domain
        ContiguousSet<Integer> intSet = ContiguousSet.create(range, integerDomain);

        // Use the 'of' method to get a DiscreteDomain instance
        /* write */ DiscreteDomain<Integer> domain = DiscreteDomain.of(integerDomain);
        
        // Create a list to hold the values from the ContiguousSet
        List<Integer> numberList = new ArrayList<>(intSet);

        // Perform some operations on the list
        for (int i = 0; i < numberList.size(); i++) {
            numberList.set(i, numberList.get(i) * 2);
        }
        
        // Print the modified list
        System.out.println("Modified List: " + numberList);

        // Find the previous value of a number using the domain
        int numberToCheck = 5;
        /* read */ int previousValue = domain.previous(numberToCheck);

        // Print the result
        System.out.println("Previous value of " + numberToCheck + " is: " + previousValue);

        // Additional operation: sum all elements in the list
        int sum = 0;
        for (int num : numberList) {
            sum += num;
        }
        
        // Print the sum
        System.out.println("Sum of all elements: " + sum);
    }
}