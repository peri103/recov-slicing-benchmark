import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        // Adding elements to the ArrayList
        for (int i = 0; i < 5; i++) {
            list.add(i * 10);
        }

        // Adding elements to the LinkedList
        linkedList.add("Hello");
        linkedList.add("World");

        // Performing operations on the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("ArrayList element: " + list.get(i));
        }

        // Performing operations on the LinkedList
        for (String str : linkedList) {
            System.out.println("LinkedList element: " + str);
        }

        /* write */ deque.addFirst(42);

        // Adding more elements to the deque
        deque.addLast(100);
        deque.addLast(200);

        // Performing operations on the deque
        for (Integer num : deque) {
            System.out.println("Deque element: " + num);
        }

        /* read */ Integer value = deque.peekFirst();
        System.out.println("Peeked value from deque: " + value);

        // Adding more elements to the ArrayList
        list.add(50);
        list.add(60);

        // Performing final operations on the ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Final ArrayList element: " + list.get(i));
        }
    }
}