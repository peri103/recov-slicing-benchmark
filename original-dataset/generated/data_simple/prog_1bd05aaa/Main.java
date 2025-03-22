import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    public static void main(String[] args) {
        // Initialize the ArrayBlockingQueue with a capacity of 10
        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
        
        try {
            // Write a value to the queue
            /* write */ queue.put(42);
            
            // Read the value from the queue
            /* read */ int value = queue.take();
            
            // Print the value to ensure it is the one written
            System.out.println(value);
        } catch (InterruptedException e) {
            // Handle the exception if the thread is interrupted
            e.printStackTrace();
        }
    }
}