import java.util.Deque;
import java.util.LinkedList;

public class DequeWrapper {
    private Deque<Integer> deque = new LinkedList<>();

    public void addValue(int value) {
        /* write */ deque.addFirst(value);
    }

    public int getFirstValue() {
        /* read */ return deque.getFirst();
    }

    public void addMultipleValues(int... values) {
        for (int value : values) {
            deque.addLast(value);
        }
    }

    public void printAndClearDeque() {
        while (!deque.isEmpty()) {
            System.out.println("Deque item: " + deque.removeLast());
        }
    }
}
