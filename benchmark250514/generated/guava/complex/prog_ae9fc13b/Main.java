import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a ForwardingList instance using an ArrayList as the delegate
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            private final List<Integer> delegate = new ArrayList<>();

            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };

        // Add some unrelated complexity
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("!");

        for (String str : stringList) {
            System.out.print(str + " ");
        }
        System.out.println();

        // Another ForwardingList to demonstrate more complexity
        ForwardingList<Double> doubleList = new ForwardingList<Double>() {
            private final List<Double> delegate = new ArrayList<>();

            @Override
            protected List<Double> delegate() {
                return delegate;
            }
        };

        doubleList.add(3.14);
        doubleList.add(2.718);
        
        double sum = 0;
        for (Double d : doubleList) {
            sum += d;
        }
        System.out.println("Sum of doubles: " + sum);

        /* write */ list.add(42); // Write a value to the list

        // More unrelated operations
        List<Character> charList = new ArrayList<>();
        charList.add('A');
        charList.add('B');
        charList.add('C');

        StringBuilder sb = new StringBuilder();
        for (Character ch : charList) {
            sb.append(ch);
        }
        System.out.println("Characters: " + sb.toString());

        /* read */ int value = list.get(0); // Read the value from the list
        System.out.println("Read integer: " + value); // Output the read value

        // Further operations
        List<Boolean> boolList = new ArrayList<>();
        boolList.add(true);
        boolList.add(false);
        boolList.add(true);

        int trueCount = 0;
        for (Boolean b : boolList) {
            if (b) {
                trueCount++;
            }
        }
        System.out.println("Number of true values: " + trueCount);
    }
}