import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        try {
            LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            /* write */ queue.put(1);
            /* read */ int value = queue.take();
            System.out.println(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}