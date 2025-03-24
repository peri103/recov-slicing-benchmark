import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        try {
            /* write */ queue.put(42);
            /* read */ int value = queue.take();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}