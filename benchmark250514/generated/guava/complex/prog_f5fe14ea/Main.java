import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> delegate = new ArrayList<>();
        ForwardingList<Integer> forwardingList = new ForwardingList<Integer>() {
            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };
        
        // Initialize another ForwardingList
        List<String> stringDelegate = new ArrayList<>();
        ForwardingList<String> stringForwardingList = new ForwardingList<String>() {
            @Override
            protected List<String> delegate() {
                return stringDelegate;
            }
        };

        // Add elements to stringForwardingList
        stringForwardingList.add("Hello");
        stringForwardingList.add("World");

        // Print elements from stringForwardingList
        for (int i = 0; i < stringForwardingList.size(); i++) {
            System.out.println(stringForwardingList.get(i));
        }

        // Perform operations on the integer list
        /* write */ forwardingList.add(42);
        
        // Perform some calculations
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of first 5 numbers: " + sum);

        // Add more elements to forwardingList
        forwardingList.add(100);
        forwardingList.add(200);

        // Retrieve and print elements from forwardingList
        for (int i = 0; i < forwardingList.size(); i++) {
            System.out.println("Element at index " + i + ": " + forwardingList.get(i));
        }

        // Perform some more operations
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of first 3 numbers: " + product);

        // Finally, read the original value
        /* read */ int value = forwardingList.get(0);
        System.out.println("Read value: " + value);
    }
}