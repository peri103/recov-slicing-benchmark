import java.util.concurrent.SynchronousQueue;

public class Main {
    public static void main(String[] args) {
        SynchronousQueue<Integer> queue = new SynchronousQueue<>();
        new Thread(() -> {
            try {
                /* write */ queue.put(42);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        try {
            /* read */ int value = queue.take();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}