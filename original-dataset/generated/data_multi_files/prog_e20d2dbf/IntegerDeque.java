import java.util.Deque;
import java.util.LinkedList;

public class IntegerDeque {
    private Deque<Integer> deque = new LinkedList<>();

    public void addFirst(int value) {
        /* write */ deque.addFirst(value);
    }

    public int getFirst() {
        return deque.getFirst();
    }

    public void addLast(int value) {
        deque.addLast(value);
    }

    public int sum() {
        int sum = 0;
        for (Integer num : deque) {
            sum += num;
        }
        return sum;
    }
}
