import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        /* write */ deque.addFirst("Hello, World!");
        /* read */ String value = deque.peekFirst();
        System.out.println(value);
    }
}