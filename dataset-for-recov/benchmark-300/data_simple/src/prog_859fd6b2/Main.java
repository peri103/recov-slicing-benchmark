import java.util.concurrent.LinkedTransferQueue;

public class Main {
    public static void main(String[] args) {
        LinkedTransferQueue<Integer> queue = new LinkedTransferQueue<>();
        /* write */ queue.put(1);
        /* read */ int value = queue.take();
        System.out.println(value);
    }
}