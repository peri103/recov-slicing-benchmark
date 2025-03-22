import java.util.concurrent.LinkedBlockingDeque;

public class DequeManager {
    private LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();

    public void addElement(int element) {
        /* write */ deque.addLast(element);
    }

    public int retrieveLastElement() throws InterruptedException {
        return /* read */ deque.takeLast();
    }

    public boolean isEmpty() {
        return deque.isEmpty();
    }

    public void addMultipleElements(int[] elements) {
        for (int element : elements) {
            deque.addLast(element);
        }
    }
}
