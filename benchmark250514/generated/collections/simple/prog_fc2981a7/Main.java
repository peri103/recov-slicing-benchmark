import org.apache.commons.collections4.queue.CircularFifoQueue;

public class Main {
    public static void main(String[] args) {
        // Initialize the CircularFifoQueue with a capacity of 5
        CircularFifoQueue<Integer> queue = new CircularFifoQueue<>(5);
        
        /* write */ queue.add(42);
        /* read */ int value = queue.peek();
        
        System.out.println(value);
    }
}