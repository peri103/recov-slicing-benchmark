import java.util.Deque;
import java.util.LinkedList;

public class StringDeque {
    private Deque<String> deque = new LinkedList<>();

    public void addFirst(String value) {
        deque.addFirst(value);
    }

    public void addLast(String value) {
        deque.addLast(value);
    }

    public void printElements() {
        for (String s : deque) {
            System.out.println("String deque element: " + s);
        }
    }
}
