import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        /* write */ deque.addLast(42);
        /* read */ int value = deque.takeLast();
        System.out.println(value);
    }
}