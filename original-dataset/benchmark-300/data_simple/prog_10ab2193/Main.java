import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        /* write */ queue.offer(42);
        /* read */ Integer value = queue.poll();
        System.out.println(value);
    }
}