import org.apache.commons.collections4.queue.CircularFifoQueue;

public class Main {
    public static void main(String[] args) {
        CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(10);
        /* write */ queue.add(42);
        /* read */ Integer value = queue.peek();
        System.out.println(value);
    }
}