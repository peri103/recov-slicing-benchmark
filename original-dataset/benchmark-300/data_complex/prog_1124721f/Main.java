import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Initialize the DelayQueue
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        
        // Create a list to store some unrelated data
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i * 10);
        }
        
        // Print the list
        System.out.println("Numbers list:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // Add a delayed element to the queue
        DelayedElement element = new DelayedElement(2000); // 2 seconds delay
        /* write */ queue.put(element);
        
        // Simulate some unrelated processing
        System.out.println("Processing some unrelated tasks...");
        Thread.sleep(1000); // Sleep for 1 second
        
        // Perform some operations on the numbers list
        List<Integer> doubledNumbers = new ArrayList<>();
        for (int num : numbers) {
            doubledNumbers.add(num * 2);
        }
        
        // Print the doubled numbers
        System.out.println("Doubled numbers:");
        for (int num : doubledNumbers) {
            System.out.println(num);
        }
        
        // Take the element from the queue
        /* read */ DelayedElement takenElement = queue.take();
        System.out.println("Element taken from queue: " + takenElement);
        
        // Perform some final operations
        System.out.println("Final operations...");
        int sum = 0;
        for (int num : doubledNumbers) {
            sum += num;
        }
        System.out.println("Sum of doubled numbers: " + sum);
    }

    static class DelayedElement implements Delayed {
        private final long delayTime;
        private final long startTime;

        public DelayedElement(long delayTime) {
            this.delayTime = delayTime;
            this.startTime = System.currentTimeMillis();
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            return unit.convert(delayTime - elapsedTime, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed o) {
            return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
        }

        @Override
        public String toString() {
            return "DelayedElement{" +
                    "delayTime=" + delayTime +
                    ", startTime=" + startTime +
                    '}';
        }
    }
}