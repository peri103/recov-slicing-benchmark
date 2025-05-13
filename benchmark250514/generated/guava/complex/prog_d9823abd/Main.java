import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ForwardingList<Integer> list = new ForwardingList<Integer>() {
            private final List<Integer> delegate = new ArrayList<>();

            @Override
            protected List<Integer> delegate() {
                return delegate;
            }
        };

        LinkedList<Integer> linkedList = new LinkedList<>();
        List<Integer> anotherList = new ArrayList<>();
        
        // Adding elements to anotherList
        for (int i = 0; i < 5; i++) {
            anotherList.add(i * 10);
        }

        // Adding elements to linkedList
        for (int i = 5; i < 10; i++) {
            linkedList.add(i * 10);
        }

        // Processing anotherList
        for (int i = 0; i < anotherList.size(); i++) {
            System.out.println("AnotherList element: " + anotherList.get(i));
        }

        /* write */ list.add(42);

        // Processing linkedList
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        // Some additional logic
        int sum = 0;
        for (int num : anotherList) {
            sum += num;
        }
        System.out.println("Sum of anotherList: " + sum);

        /* read */ int value = list.get(0);
        System.out.println("Value from ForwardingList: " + value);

        // Further processing
        int product = 1;
        for (int num : linkedList) {
            product *= num == 0 ? 1 : num; // Avoid multiplying by zero
        }
        System.out.println("Product of linkedList: " + product);
    }
}