import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an instance of a concrete subclass of ForwardingList
        MyForwardingList<Integer> list = new MyForwardingList<>(new ArrayList<>());

        // Additional data structures and operations
        MyForwardingList<String> stringList = new MyForwardingList<>(new ArrayList<>());
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> additionalNumbers = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            additionalNumbers.add(i * 10);
        }

        // Perform unrelated operations
        for (String str : stringList) {
            System.out.println(str);
        }

        /* write */ list.add(42);

        // More complex operations
        int sum = 0;
        for (int num : additionalNumbers) {
            sum += num;
        }
        System.out.println("Sum of additional numbers: " + sum);

        // Operations with MyForwardingList
        MyForwardingList<Double> doubleList = new MyForwardingList<>(new ArrayList<>());
        doubleList.add(3.14);
        doubleList.add(2.71);

        for (Double d : doubleList) {
            System.out.println("Double value: " + d);
        }

        // More complex logic
        int max = Integer.MIN_VALUE;
        for (int num : additionalNumbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max of additional numbers: " + max);

        /* read */ int value = list.get(0);
        System.out.println("Read value: " + value);

        // Further operations
        MyForwardingList<Character> charList = new MyForwardingList<>(new ArrayList<>());
        charList.add('A');
        charList.add('B');
        charList.add('C');

        for (Character ch : charList) {
            System.out.println("Character: " + ch);
        }
    }
}

// Concrete subclass of ForwardingList
class MyForwardingList<E> extends ForwardingList<E> {
    private final List<E> delegate;

    public MyForwardingList(List<E> delegate) {
        this.delegate = delegate;
    }

    @Override
    protected List<E> delegate() {
        return delegate;
    }
}