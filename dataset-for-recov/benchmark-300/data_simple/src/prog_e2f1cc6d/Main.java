import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
        /* write */ queue.put(1);
        /* read */ int value = queue.take();
        System.out.println(value);
    }
}