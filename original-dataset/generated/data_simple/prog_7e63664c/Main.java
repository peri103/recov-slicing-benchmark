import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    public static void main(String[] args) {
        LinkedBlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        try {
            /* write */ deque.addLast(42);
            /* read */ int value = deque.takeLast();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}