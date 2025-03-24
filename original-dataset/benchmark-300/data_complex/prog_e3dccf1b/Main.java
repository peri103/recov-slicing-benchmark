import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        try {
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            BlockingQueue<String> stringQueue = new LinkedBlockingQueue<>();
            
            // Additional code to make the program more complex
            stringQueue.put("Hello");
            stringQueue.put("World");
            
            // Some unrelated operations
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += i;
            }
            System.out.println("Sum of first 10 numbers: " + sum);
            
            /* write */ queue.put(42);
            
            // More unrelated operations
            String firstString = stringQueue.take();
            String secondString = stringQueue.take();
            System.out.println("Concatenated strings: " + firstString + " " + secondString);
            
            // Simulate some delay
            TimeUnit.SECONDS.sleep(1);
            
            /* read */ int value = queue.take();
            System.out.println("Value from queue: " + value);
            
            // Final unrelated operations
            BlockingQueue<Double> doubleQueue = new LinkedBlockingQueue<>();
            doubleQueue.put(3.14);
            doubleQueue.put(2.71);
            System.out.println("First double: " + doubleQueue.take());
            System.out.println("Second double: " + doubleQueue.take());
            
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}