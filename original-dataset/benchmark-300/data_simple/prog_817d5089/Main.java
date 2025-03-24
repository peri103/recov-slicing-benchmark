import java.util.concurrent.ConcurrentLinkedDeque;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        /* write */ deque.addLast("Hello, World!");
        /* read */ String value = deque.peekLast();
        System.out.println(value);
    }
}