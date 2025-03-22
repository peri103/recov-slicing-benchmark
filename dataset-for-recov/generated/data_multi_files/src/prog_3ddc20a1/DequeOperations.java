import java.util.concurrent.LinkedBlockingDeque;

public class DequeOperations {
    private LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addElement(int element) {
        /* write */ deque.addLast(element);
    }

    public int removeLastElement() throws InterruptedException {
        return deque.takeLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }
}
