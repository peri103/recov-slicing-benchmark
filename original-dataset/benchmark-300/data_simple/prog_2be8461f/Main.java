import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        /* write */ deque.addFirst(42);
        /* read */ int value = deque.getFirst();
        System.out.println(value);
    }
}