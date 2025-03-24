import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        /* write */ deque.addFirst(42);
        /* read */ int value = deque.takeFirst();
        System.out.println(value);
    }
}