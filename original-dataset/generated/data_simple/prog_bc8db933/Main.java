import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();
        /* write */ deque.addLast(42);
        /* read */ Integer value = deque.peekLast();
        System.out.println(value);
    }
}