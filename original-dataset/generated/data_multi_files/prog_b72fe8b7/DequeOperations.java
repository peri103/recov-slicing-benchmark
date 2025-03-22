import java.util.concurrent.ConcurrentLinkedDeque;

public class DequeOperations {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addFirstElement(int element) {
        /* write */ deque.addFirst(element);
    }

    public Integer peekFirstElement() {
        /* read */ return deque.peekFirst();
    }

    public void addMultipleElements(int[] elements) {
        for (int element : elements) {
            deque.addFirst(element);
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer num : deque) {
            sum += num;
        }
        return sum;
    }

    public void removeAllElements() {
        while (!deque.isEmpty()) {
            deque.pollLast();
        }
    }
}
