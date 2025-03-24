import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {
        PriorityBlockingQueue<Integer> queue = new PriorityBlockingQueue<>();
        /* write */ queue.offer(10);
        /* read */ Integer value = queue.poll();
        System.out.println(value);
    }
}