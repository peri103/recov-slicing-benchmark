import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> baseList = new ArrayList<>();
        ForwardingList<Integer> forwardingList = new ForwardingList<Integer>() {
            @Override
            protected List<Integer> delegate() {
                return baseList;
            }
        };

        List<Integer> anotherList = new LinkedList<>();
        anotherList.add(5);
        anotherList.add(15);
        anotherList.add(25);

        /* write */ forwardingList.add(42);
        
        for (int i = 0; i < anotherList.size(); i++) {
            forwardingList.add(anotherList.get(i));
        }

        int sum = 0;
        for (int i = 0; i < forwardingList.size(); i++) {
            sum += forwardingList.get(i);
        }
        System.out.println("Sum of all elements: " + sum);

        int max = Integer.MIN_VALUE;
        for (int num : forwardingList) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max value: " + max);

        /* read */ int value = forwardingList.get(0);
        System.out.println("First element written: " + value);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        for (String str : stringList) {
            System.out.println("String element: " + str);
        }

        List<Double> doubleList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            doubleList.add(i * 1.5);
        }

        for (Double d : doubleList) {
            System.out.println("Double element: " + d);
        }
    }
}