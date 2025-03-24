import java.util.Deque;
import java.util.LinkedList;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> stringList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        stringList.add("Hello");
        stringList.add("World");

        /* write */ deque.addFirst(1);

        // Processing the ArrayList
        for (int num : list) {
            System.out.println("ArrayList element: " + num);
        }

        // Processing the LinkedList
        for (String str : stringList) {
            System.out.println("LinkedList element: " + str);
        }

        // Adding more elements to the Deque
        deque.addLast(2);
        deque.addLast(3);

        /* read */ int value = deque.getFirst();
        System.out.println("Deque first element: " + value);

        // Printing the entire Deque
        System.out.println("Deque elements: " + deque);
    }
}