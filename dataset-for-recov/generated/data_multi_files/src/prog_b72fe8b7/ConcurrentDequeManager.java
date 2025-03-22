import java.util.concurrent.ConcurrentLinkedDeque;

public class ConcurrentDequeManager {
    private ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public void addFirstElement(int element) {
        /* write */ deque.addFirst(element);
    }

    public Integer peekFirstElement() {
        return deque.peekFirst();
    }

    public void addLastElement(int element) {
        deque.addLast(element);
    }

    public void printAllElements() {
        System.out.println("All elements in deque:");
        for (Integer elem : deque) {
            System.out.println(elem);
        }
    }
}
