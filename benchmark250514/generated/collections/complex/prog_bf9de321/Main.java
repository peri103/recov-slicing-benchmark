import org.apache.commons.collections4.set.ListOrderedSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        ListOrderedSet<Integer> set = ListOrderedSet.listOrderedSet(new LinkedHashSet<>());
        
        // Initialize another ListOrderedSet for demonstration
        ListOrderedSet<String> stringSet = ListOrderedSet.listOrderedSet(new LinkedHashSet<>());
        stringSet.add("Hello");
        stringSet.add("World");
        
        // Perform a series of operations on stringSet
        for (int i = 0; i < stringSet.size(); i++) {
            System.out.println("String Set Element: " + stringSet.get(i));
        }

        // Add more elements to stringSet
        stringSet.add("Apache");
        stringSet.add("Commons");
        
        // Manipulate the integer set
        for (int i = 0; i < 5; i++) {
            set.add(i * 10);
        }
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < set.size(); i++) {
            sum += set.get(i);
        }
        System.out.println("Sum of Integer Set: " + sum);
        
        /* write */ set.add(42);

        // More operations on stringSet
        stringSet.add("Collections");
        for (int i = 0; i < stringSet.size(); i++) {
            System.out.println("Updated String Set Element: " + stringSet.get(i));
        }

        // Perform some operations on the integer set
        int product = 1;
        for (int i = 0; i < set.size(); i++) {
            product *= set.get(i);
        }
        System.out.println("Product of Integer Set: " + product);

        /* read */ int value = set.get(0);
        System.out.println("Read Value: " + value);
        
        // Final operations on integer set
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < set.size(); i++) {
            if (set.get(i) > max) {
                max = set.get(i);
            }
        }
        System.out.println("Max Value in Integer Set: " + max);
    }
}