import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        /* write */ queue.put(42);
        /* read */ int value = queue.take();
        System.out.println(value);
    }
}