import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
        /* write */ deque.addFirst(42);
        /* read */ Integer value = deque.peekFirst();
        System.out.println(value);
    }
}