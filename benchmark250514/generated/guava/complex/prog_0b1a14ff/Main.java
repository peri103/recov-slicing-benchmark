import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ForwardingList<Integer> forwardingList = new ForwardingList<Integer>() {
            private final List<Integer> delegate = new ArrayList<>();

            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };

        // Initialize another list to demonstrate more complexity
        ForwardingList<String> stringList = new ForwardingList<String>() {
            private final List<String> delegate = new ArrayList<>();

            @Override
            protected List<String> delegate() {
                return delegate;
            }
        };

        // Add elements to the string list
        stringList.add("Hello");
        stringList.add("World");

        // Iterate over stringList and print each element
        for (String str : stringList) {
            System.out.println(str);
        }

        // Perform some operations before the read operation
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
        }
        System.out.println("Sum of numbers from 0 to 4: " + sum);

        /* write */ forwardingList.add(42);

        // Perform operations on another list
        ForwardingList<Double> doubleList = new ForwardingList<Double>() {
            private final List<Double> delegate = new ArrayList<>();

            @Override
            protected List<Double> delegate() {
                return delegate;
            }
        };

        doubleList.add(3.14);
        doubleList.add(2.71);

        // Calculate the average of doubleList
        double total = 0;
        for (Double d : doubleList) {
            total += d;
        }
        double average = total / doubleList.size();
        System.out.println("Average of doubleList: " + average);

        /* read */ int value = forwardingList.get(0);
        System.out.println(value);

        // Perform a final unrelated operation
        int product = 1;
        for (int i = 1; i <= 3; i++) {
            product *= i;
        }
        System.out.println("Product of numbers from 1 to 3: " + product);
    }
}