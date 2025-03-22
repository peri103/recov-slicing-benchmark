import java.util.Deque;
import java.util.LinkedList;

public class DequeOperations {
    private Deque<Integer> deque = new LinkedList<>();

    public void addElement(int element) {
        /* write */ deque.addLast(element);
    }

    public int getLastElement() {
        /* read */ return deque.getLast();
    }

    public void displayDeque() {
        for (Integer num : deque) {
            System.out.println("Deque element: " + num);
        }
    }

    public void performAdditionalOperations() {
        deque.pollFirst(); // Remove first element
        deque.offerFirst(21); // Add element at the beginning
    }
}
