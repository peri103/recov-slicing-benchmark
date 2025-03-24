import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        try {
            SynchronousQueue<Integer> queue = new SynchronousQueue<>();
            /* write */ queue.put(42);
            /* read */ int value = queue.take();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}