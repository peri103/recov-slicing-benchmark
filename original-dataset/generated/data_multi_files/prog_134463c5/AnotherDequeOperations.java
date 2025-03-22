import java.util.Deque;
import java.util.LinkedList;

public class AnotherDequeOperations {
    private Deque<Integer> anotherDeque = new LinkedList<>();

    public void addElements() {
        for (int i = 0; i < 5; i++) {
            anotherDeque.addLast(i * 10);
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (Integer num : anotherDeque) {
            sum += num;
        }
        return sum;
    }

    public void clearDeque() {
        anotherDeque.clear();
    }
}
