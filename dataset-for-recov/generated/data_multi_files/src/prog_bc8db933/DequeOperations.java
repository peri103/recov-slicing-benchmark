import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeOperations {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addElement(int element) {
        /* write */ deque.addLast(element);
    }

    public Integer peekLastElement() {
        return deque.peekLast();
    }

    public void addFirstElement(int element) {
        deque.addFirst(element);
    }

    public void printAndClearDeque() {
        while (!deque.isEmpty()) {
            System.out.println("Removed from deque: " + deque.pollFirst());
        }
    }
}
