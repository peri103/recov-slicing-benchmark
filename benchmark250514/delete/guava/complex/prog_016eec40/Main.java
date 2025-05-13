import com.google.common.collect.DiscreteDomain;
import com.google.common.collect.Range;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DiscreteDomain<Integer> domain = DiscreteDomain.integers();
        Range<Integer> range = Range.closed(1, 10);
        ArrayList<Integer> list = new ArrayList<>();

        // Populate the list with values from the range using DiscreteDomain
        for (int i = range.lowerEndpoint(); i <= range.upperEndpoint(); i++) {
            list.add(domain.next(i));
        }

        // Perform some operations on the list
        int sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        System.out.println("Sum of values in the list: " + sum);

        // Use the original write-read pair
        /* write */ Integer value = domain.of(5);
        int multiplier = 2;
        int result = value * multiplier;
        System.out.println("Result after multiplication: " + result);

        // More operations on the list
        list.add(result);
        list.removeIf(num -> num % 2 == 0);
        System.out.println("List after removing even numbers: " + list);

        // Use the original read method
        /* read */ Integer nextValue = domain.next(value);
        System.out.println("Next value after original write-read: " + nextValue);

        // Additional complex logic
        int max = Integer.MIN_VALUE;
        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Maximum value in the list: " + max);
    }
}