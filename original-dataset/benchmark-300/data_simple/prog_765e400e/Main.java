import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        /* write */ queue.offer(42);
        /* read */ Integer value = queue.poll();
        System.out.println(value);
    }
}