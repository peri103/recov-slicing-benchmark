import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to ArrayList and LinkedList
        arrayList.add(10);
        arrayList.add(20);
        linkedList.add(30);
        linkedList.add(40);

        // Using a loop to add elements to the deque
        for (int i = 0; i < arrayList.size(); i++) {
            deque.addLast(arrayList.get(i));
        }

        // Adding an element to the front of the deque
        /* write */ deque.addFirst(42);

        // Performing operations on LinkedList
        linkedList.removeFirst();
        linkedList.addLast(50);

        // Using the peekFirst method to read the first element
        /* read */ Integer value = deque.peekFirst();
        System.out.println("First element in deque: " + value);

        // Adding more elements to the deque
        for (int i = 0; i < linkedList.size(); i++) {
            deque.addLast(linkedList.get(i));
        }

        // Printing all elements in the deque
        System.out.println("All elements in deque:");
        for (Integer element : deque) {
            System.out.println(element);
        }
    }
}