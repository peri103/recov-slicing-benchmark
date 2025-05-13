import com.google.common.collect.ForwardingList;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        List<Integer> backingList = new ArrayList<>();
        ForwardingList<Integer> forwardingList = new ForwardingList<Integer>() {
            @Override
            protected List<Integer> delegate() {
                return backingList;
            }
        };

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(100);
        linkedList.add(200);

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("LinkedList element: " + linkedList.get(i));
        }

        /* write */ forwardingList.add(42);

        List<Integer> anotherBackingList = new ArrayList<>();
        ForwardingList<Integer> anotherForwardingList = new ForwardingList<Integer>() {
            @Override
            protected List<Integer> delegate() {
                return anotherBackingList;
            }
        };

        for (int i = 0; i < 5; i++) {
            anotherForwardingList.add(i * 10);
        }

        for (int i = 0; i < anotherForwardingList.size(); i++) {
            System.out.println("Another ForwardingList element: " + anotherForwardingList.get(i));
        }

        /* read */ int value = forwardingList.get(0);

        System.out.println("Value from ForwardingList: " + value);

        List<Integer> combinedList = new ArrayList<>(forwardingList);
        combinedList.addAll(linkedList);
        combinedList.addAll(anotherForwardingList);

        for (int element : combinedList) {
            System.out.println("Combined List element: " + element);
        }
    }
}